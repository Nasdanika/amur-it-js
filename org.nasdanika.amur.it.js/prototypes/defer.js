function $defer(f, bindTo) {
    return function() {
        setTimeout(0, f.apply(bindTo, arguments));
    }
}
