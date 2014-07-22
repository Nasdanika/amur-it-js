(function (definition) {
    // Turn off strict mode for this function so we can assign to global.$COMPONENT_NAME$
    /* jshint strict: false */

    // This file will function properly as a <script> tag, or a module
    // using CommonJS and NodeJS or RequireJS module formats.  In
    // Common/Node/RequireJS, the module exports the flow factory function and when
    // executed as a simple <script>, it creates a $FLOW_NAME$ global instead.

    // Montage Require
    if (typeof bootstrap === "function") {
        bootstrap("promise", definition);

    // CommonJS
    } else if (typeof exports === "object") {
        module.exports = definition();

    // RequireJS
    } else if (typeof define === "function" && define.amd) {
        define(["q"], function($promiseProvider) {
        	return definition.bind(undefined, $promiseProvider); 
        });

    // SES (Secure EcmaScript)
    } else if (typeof ses !== "undefined") {
        if (!ses.ok()) {
            return;
        } else {
            ses.make$COMPONENT_NAME$ = definition;
        }

    // <script>
    } else {
        $COMPONENT_NAME$ = definition();
    }

})($COMPONENT_FACTORY$);