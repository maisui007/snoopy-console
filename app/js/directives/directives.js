(function(angular){
    'use strict';
    angular.module('snoopyConsole').directive('snoopyMain',function(){
        return {
            restrict: 'EA',
            //template : '<h1>自定义指令!</h1>'
            templateUrl:'app/templates/login.html'
        }
    });
})(angular);