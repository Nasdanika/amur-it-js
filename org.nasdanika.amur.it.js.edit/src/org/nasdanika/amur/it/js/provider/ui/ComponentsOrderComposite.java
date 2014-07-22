package org.nasdanika.amur.it.js.provider.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.gef.dnd.SimpleObjectTransfer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

import org.nasdanika.amur.Component;
import org.nasdanika.amur.Connection;


class ComponentsOrderComposite extends org.eclipse.swt.widgets.Composite {

	static final SimpleObjectTransfer SIMPLE_OBJECT_TRANSFER = new SimpleObjectTransfer() {
		
		@Override
		protected String[] getTypeNames() {
			return new String[] {TYPE_NAME};
		}
		
		@Override
		protected int[] getTypeIds() {
			return new int[] {TYPEID};
		}
	};

	static final String TYPE_NAME = "Tree items transfer" + System.currentTimeMillis() + ":" + SIMPLE_OBJECT_TRANSFER.hashCode();
	static final int TYPEID = SimpleObjectTransfer.registerType(TYPE_NAME);	
	
	private Tree componentsTree;
	
	public ComponentsOrderComposite(
			org.eclipse.swt.widgets.Composite parent, 
			int style,
			EList<Component> sortedComponents, 
			List<Component> allComponents,
			final AdapterFactory adapterFactory, 
			boolean inboundConnections) {
		super(parent, style);
		FillLayout thisLayout = new FillLayout(org.eclipse.swt.SWT.HORIZONTAL);
		this.setLayout(thisLayout);
		componentsTree = new Tree(this, SWT.BORDER);
		
		Transfer[] types = new Transfer[] {SIMPLE_OBJECT_TRANSFER};
		int operations = DND.DROP_MOVE | DND.DROP_COPY | DND.DROP_LINK;
		
		final DragSource source = new DragSource (componentsTree, operations);
		source.setTransfer(types);
		final TreeItem[] dragSourceItem = new TreeItem[1];
		source.addDragListener (new DragSourceListener () {
			public void dragStart(DragSourceEvent event) {
				TreeItem[] selection = componentsTree.getSelection();
				if (selection.length > 0 && selection[0].getItemCount() == 0) {
					event.doit = true;
					dragSourceItem[0] = selection[0];
				} else {
					event.doit = false;
				}
			};
			public void dragSetData (DragSourceEvent event) {
				event.data = new Object[] {dragSourceItem[0].getText(), dragSourceItem[0].getImage(), dragSourceItem[0].getData()};
			}
			public void dragFinished(DragSourceEvent event) {
				if (event.detail == DND.DROP_MOVE)
					dragSourceItem[0].dispose();
					dragSourceItem[0] = null;
			}
		});

		DropTarget target = new DropTarget(componentsTree, operations);
		target.setTransfer(types);
		target.addDropListener (new DropTargetAdapter() {
			public void dragOver(DropTargetEvent event) {
				event.feedback = DND.FEEDBACK_EXPAND | DND.FEEDBACK_SCROLL;
				if (event.item != null) {
					TreeItem item = (TreeItem)event.item;
					Point pt = getDisplay().map(null, componentsTree, event.x, event.y);
					Rectangle bounds = item.getBounds();
					if (pt.y < bounds.y + bounds.height/2) {
						event.feedback |= DND.FEEDBACK_INSERT_BEFORE;
					} else {
						event.feedback |= DND.FEEDBACK_INSERT_AFTER;
					}
				}
			}
			public void drop(DropTargetEvent event) {
				if (event.data == null) {
					event.detail = DND.DROP_NONE;
					return;
				}
				Object[] eventData = (Object[]) event.data;
				if (event.item == null) {
					TreeItem item = new TreeItem(componentsTree, SWT.NONE);
					item.setText((String) eventData[0]);
					item.setImage((Image) eventData[1]);
					item.setData(eventData[2]);
				} else {
					TreeItem item = (TreeItem)event.item;
					Point pt = getDisplay().map(null, componentsTree, event.x, event.y);
					Rectangle bounds = item.getBounds();
					TreeItem parent = item.getParentItem();
					if (parent != null) {
						TreeItem[] items = parent.getItems();
						int index = 0;
						for (int i = 0; i < items.length; i++) {
							if (items[i] == item) {
								index = i;
								break;
							}
						}
						if (pt.y < bounds.y + bounds.height/2) {
							TreeItem newItem = new TreeItem(componentsTree, SWT.NONE, index);
							newItem.setText((String) eventData[0]);
							newItem.setImage((Image) eventData[1]);
							newItem.setData(eventData[2]);
						} else {
							TreeItem newItem = new TreeItem(componentsTree, SWT.NONE);
							newItem.setText((String) eventData[0]);
							newItem.setImage((Image) eventData[1]);
							newItem.setData(eventData[2]);
						}
						
					} else {
						TreeItem[] items = componentsTree.getItems();
						int index = 0;
						for (int i = 0; i < items.length; i++) {
							if (items[i] == item) {
								index = i;
								break;
							}
						}
						if (pt.y < bounds.y + bounds.height/2) {
							TreeItem newItem = new TreeItem(componentsTree, SWT.NONE, index);
							newItem.setText((String) eventData[0]);
							newItem.setImage((Image) eventData[1]);
							newItem.setData(eventData[2]);
						} else {
							TreeItem newItem = new TreeItem(componentsTree, SWT.NONE, index+1);
							newItem.setText((String) eventData[0]);
							newItem.setImage((Image) eventData[1]);
							newItem.setData(eventData[2]);
						} 
					}
				}
			}
		});
		
		List<Component> components = sortComponents(sortedComponents, allComponents); 
		
		for (Component comp: components) {
			TreeItem iItem = new TreeItem(componentsTree, 0);
			iItem.setData(comp);
			
			IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(comp, IItemLabelProvider.class);
			if (labelProvider==null) {
				iItem.setText(comp.getClass().toString());						
			} else {
				String text = labelProvider.getText(comp); 
				if (comp instanceof Connection) {
					EObject sourceOrTarget = inboundConnections ? ((Connection) comp).getSource() : ((Connection) comp).getTarget();
					IItemLabelProvider stLabelProvider = (IItemLabelProvider) adapterFactory.adapt(sourceOrTarget, IItemLabelProvider.class);
					if (stLabelProvider!=null) {
						text+=(inboundConnections ? " from " : " to ")+stLabelProvider.getText(sourceOrTarget);
					}
				}
				
				iItem.setText(text);
				iItem.setImage(ExtendedImageRegistry.getInstance().getImage(labelProvider.getImage(comp)));
			}										
		}
		
		this.layout();
	}

	public EList<Component> getValue() {
		EList<Component> ret = new BasicEList<Component>();
		for (TreeItem ti: componentsTree.getItems()) {
			ret.add((Component) ti.getData());
		}
		return ret;
	}
		
	public static List<Component> sortComponents(List<Component> sortedComponents, List<Component> allComponents) {
		List<Component> ret = new ArrayList<>(sortedComponents);
		List<Component> unsorted = new ArrayList<>(allComponents);
		unsorted.removeAll(sortedComponents);
		ret.addAll(unsorted);
		return ret;
	}

}
