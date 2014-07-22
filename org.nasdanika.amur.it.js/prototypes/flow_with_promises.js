$ajsFlow = {
		
		$doStart : function() {
			if (!this.startPromise) {
				pathToNonGuardInput.$start(/* stop promise argument? */).then(function(input) { this.$outputs.id.$target=input; });
				this.startPromise = $promiseProvider.all([pathToNonGuardInput.$start(/* stop promise argument? */)]).then(function(inputs) {
					this.$outputs.id.$target=inputs[0];
				}).then(this.$start());
			}
			return this.startPromise;
		}
		
		propertyNode : {
			
		}
		
		inputGetPort : {
			inputs : {
				
			},
			
			outputs : {
				
			}
			
		},
		
		inputSetPort : {
			inputs : {
				
			},
			
			outputs : {
				
			}
			
		}
		
		activity : {
			inputs : {
				
			},
			
			outputs : {
				
			},
			
			start : {
				
			}
			
		},
		
		outputPort : {
									
			inputs : {
				
				from_activity : {
					// returns a promise which returns handler after start if executed, if any.
					start : function() {
						/* Stop promise is used to construct stop promise of the consumer */
						this.stopPromise = $promiseProvider.promise(function(resolve, reject, notify) {
							/* Stop is used to initiate stop of a given input */
							this.stop = function() {
								notify("Stopping - Input ");
								resolve();
							};
						}.bind(this));
												
						this.handler = function($invocation) {
							// do something
						}.bind(this.$component);
						
						// no start - return handler - no promises
						return this; // To be mounted as 
						
						
						// if has start then
						if (!this.$component.$startPromise) {
							this.$component.$startPromise = $promiseProvider.promise(function(resolve, reject, notify) {
								try {
									resolve(this.$start());
								} catch (e) {
									reject(e);
								}
							}.bind(this.$component));
						}
						
						return $component.$startPromise.then(function() {
							// return handler.
						}.bind(this));
					},
					
					stop : function () {
						// if no component stop then nothing to do.
					}
					
				},
				
				from_set_input_port : {
					start : function() {
						// return handler which sets facade property
					}
				}
			}
		}
		
		// No terminal
}