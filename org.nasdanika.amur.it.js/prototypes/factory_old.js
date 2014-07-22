<%@ jet 
	package="org.nasdanika.amur.it.js.gen.renderers" 
	imports="org.nasdanika.amur.it.js.* org.nasdanika.amur.it.js.impl.* java.util.*" 
	class="TopLevelFlowRenderer" 
	skeleton="Renderer.skeleton"		
%>

// TODO - modularity support - factory function - AMD && CommonJS styles.

// Flow "class"
function <%=context.get("flow.name")%>() {

	var $ajsFlow = {
		<%=context.get("flow.body")%>,
		
		// Log function - first argument is level, then go logging args.
		$log : function() {
 			if (this.facade 
                && this.facade.logger 
                && typeof(this.facade.logger[arguments[0]]) == "function") {
				this.facade.logger[arguments[0]].apply(this.facade.logger, Array.prototype.slice.call(arguments, 1));
			} else {
				// Very basic logging
                for (var i = 1; i<arguments.length; ++i) {
				    console.log("["+arguments[0].toUpperCase()+"] "+arguments[i]);
                }
			}
		}
	};	
	
	$ajsFlow.$trace = $ajsFlow.$log.bind($ajsFlow, "trace");
	$ajsFlow.$debug = $ajsFlow.$log.bind($ajsFlow, "debug");
	$ajsFlow.$info = $ajsFlow.$log.bind($ajsFlow, "info");
	$ajsFlow.$warn = $ajsFlow.$log.bind($ajsFlow, "warn");
	$ajsFlow.$error = $ajsFlow.$log.bind($ajsFlow, "error");
	$ajsFlow.$fatal = $ajsFlow.$log.bind($ajsFlow, "fatal");
	
	<% /* Flow configuration */ %>
	<% for (Object conf: (Collection) context.get("flow.conf")) { %>
		<%=conf%>
	<% } %>

	var $ajsFacade = { 
		
		$ajsIntervals : [],
		$ajsTimeouts : [],		
	
		<% if (context.containsKey("flow.clone")) { %>
			$clone : <%=context.get("flow.clone")%>,
		<% } else { %>
			$clone : function $clone(obj, deep) {
				if (deep) {
					return jQuery.extend(true, {}, obj);
				}
				return jQuery.extend({}, obj);	
			},
		<% } %>
		
		<% if (context.containsKey("flow.schedule")) { %>
			$schedule : <%=context.get("flow.schedule")%>,
		<% } else { %>
			// Returns a function which is a scheduled version of the argument function.
			$schedule : function $schedule(func, period, isInterval) {
				return function scheduled() {
                    var args = arguments;
                    if (isInterval) {
						var intervalKey = setInterval(function $scheduled() { return func.apply(null, args) }, period);
						this.$ajsIntervals.push(intervalKey);
						return intervalKey;
					} else {
						var timeoutKey = setInterval(function $scheduled() { return func.apply(null, args) }, period);
						this.$ajsTimeouts.push(timeoutKey);
						return timeoutKey;
					}
				}  			  	
			}, 
		<% } %>
		 
		<% if (context.containsKey("flow.filter")) { %>
			$filter : <%=context.get("flow.filter")%>,
		<% } else { %>
			// Returns a function which is invoked only if condition is satisfied.
			// target and condition functions shall take the same arguments.
			$filter : function $filter(target, condition) {
				return function filtered() {
					if (condition.apply(null, arguments)) {
						return target.apply(null, arguments);
					}
				}  			  	
			}, 
		<% } %>
		 
		<% if (context.containsKey("flow.tokenize")) { %>
			$tokenize : <%=context.get("flow.tokenize")%>,
		<% } else { %>
			/*
				Returns a function which wraps the target function and tokenizes and clones arguments
				args - arguments
				tokens - boolean array - tokenize or not a given arg.
				clone - string array - "NONE", "DEEP", or "SHALLOW"
				target - function to invoke with tokenized and cloned arguments.
			*/
			$tokenize : function $tokenize(target, tokens, clone) {			
				function tokenize(idx, tokenizedArgs) {
					if (idx == args.length) {
						var clonedArgs = [];
						for (var i = 0; i<clonedArgs.length; ++i) {
							switch (clone[i]) {
								case "None": 
									clonedArgs[i] = tokenizedArgs[i];
									break;
								case "Shallow":
									clonedArgs[i] = this.$clone(tokenizedArgs[i], false);
									break;
								case "Deep":
									clonedArgs[i] = this.$clone(tokenizedArgs[i], true);
									break;
								
							};
						}
						return target.apply(this, clonedArgs);
					} else {
						if (tokens[idx]) {
							// TODO - tokenization.
						}
						return tokenize(idx+1, tokenizedArgs);
					}
				};
				
				return function tokenized() {
					return tokenize(0, arguments);
				};
			}, 
		<% } %>
		
		<% if (context.containsKey("flow.handleError")) { %>
			$handleError : <%=context.get("flow.handleError")%>,
		<% } else { %>
			$handleError : function $handleError(invocation, e) {
				throw e;
			},
		<% } %>
		
		start : function start() {			
			this.$ajsTimeouts = [];
			this.$ajsIntervals = [];
			$ajsFlow.start(this);
		},
		
		stop : function stop() {
			for (var i = 0; i<this.$ajsTimeouts.length; ++i) {
				clearTimeout(this.$ajsTimeouts[i]);
			}
			for (var i = 0; i<this.$ajsIntervals.length; ++i) {
				clearInterval(this.$ajsIntervals[i]);
			}
			$ajsFlow.stop(this);
		}
	};
					
	return $ajsFacade;
};
	
