/*
 * AmurJs handler - expression which evaluates to a function to be invoked.
 */
/* defer, schedule, tokenize, clone as needed */ function($invocation) {
	$invocation.started = new Date();
	try {
		return (function(handlerparams) {
			try {
				// Handler code
			} catch (e) {
				this.$handleError(e);
			}
			
		}).callOrApply(this.$createContext([$invocation]), $invocation.args or list of $invocation.data.paramName);
	} finally {
		$invocation.finished = new Date();
	}
}.bind(this.$component)

function () {
	for (var i in this.$inputs) {
		this.$inputs[i].start();
	}
}

function () {
	for (var o in this.$outputs) {
		this.$outputs[o].stop();
	}
}