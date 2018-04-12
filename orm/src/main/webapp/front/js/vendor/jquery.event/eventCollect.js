/**
 * Event
 * 实现了观察者模式
 *
 */

var Event = function (sender) {
    this._sender = sender;
    this._listeners = [];

}
//事件原方法
Event.prototype = {
    attach: function(listener) {
        this._listeners.push(listener);
    },
    notify: function(args) {
        var index;

        for (index = 0; index < this._listeners.length; index++) {
            this._listeners[index](this._sender, args);
        }
    }
}
