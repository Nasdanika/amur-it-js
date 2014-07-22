require([ 
          "q", 
          "flows/SimpleFlowTests",
          "flows/ErrorHandling/ErrorHandlingTests",
          "flows/ActivityTests",
          "flows/ReferenceTests",
          "flows/TransitionsTests",
          "flows/TokenizeCloneTests",
          "flows/EventTests",
          "flows/JoinTests",
          "flows/ForkJoinTests"
        ], 
        function($promiseProvider) {
	
	module("Set up");

	asyncTest("Promises test", function() {
		expect(2);
		
		ok($promiseProvider, "Promise provider is present!");
		
		var p33 = $promiseProvider(33);
		
		p33.then(function(val) {
			ok(val==33, "Promise is fulfilled!");
			start();
		}).done();
		
	});

	asyncTest("Deferred test", function() {
		expect(1);
		
		var deferred = $promiseProvider.defer();
		
		deferred.promise.then(function(val) {
			ok(val==55, "Deferred promise is fulfilled!");
			start();
		}).done();
		
		deferred.resolve(55);
		
	});
	
	for (var i=1; i<arguments.length; ++i) {
		arguments[i]();
	}
	
	QUnit.load();
	QUnit.start();
});
