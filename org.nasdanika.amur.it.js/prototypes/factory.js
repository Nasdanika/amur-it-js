/*
 * Creates a flow instance
 * Wrap in define()/require() as needed
 * @param $flowFacade - facade which provides flow outputs and other configuration
 * and to which flow inputs are bound when flow is startd.
 * @param $onFlowStart - this function is invoked when flow is fully started. It receives a
 * single argument - configured $flowFacade.
 *  
 *  All flow-related ('special') variables start with $ to avoid clash with user-defined variables.
 */
function Flow($facade, $onStart) {
	
	if (!$facade) {
		$facade = {};
	}
	
	$defer = $facade.defer || function $defer(f, bindTo) {
	    return function() {
	        setTimeout(0, f.apply(bindTo, arguments));
	    }
	};

	
	// Define functions such as schedule, tokenize/clone, createInvocation, handleError, createSynapse/intercept, ...
	// take from the facade if available, use default implementations if not
		
	// Flow components
	var $ajsFlow = {};
	
	$facade.$stop = $ajsFlow.$children.$terminal.$onStop.bind($ajsFlow.$children.$terminal);

	// Start flow.
	if (!$ajsFlow.$start($onStart)) { // this condition only if onStart() is defined.
		$ajsFlow.$onStart($onStart);
	}
	
}