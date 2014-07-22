/*
 * Handler activator is a function which creates a new invocation, 
 * marshals parameters into it and then invokes handler function passing
 * the invocation.
 */

function($parentInvocations, formal parameters) {
	var $invocation = {
		handlerId : "some id",
		created : new Date(),
		parents : {
			// TODO - populate from context 
		},
		children : [],
		data : {
			// TODO - populate from arguments.
		},
		args : arguments // If function has no formal parameters.
	};
	for (var pi in $parentInvocations) {
		$parentInvocations[pi].children.push($invocation);
	}
	return (function($invocation) {
		// Handler function - generate.
	})($invocation);
	
} // TODO - bind to parent invocations hash.
