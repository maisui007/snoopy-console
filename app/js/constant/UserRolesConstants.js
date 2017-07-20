(function(angular){
    'use strict';
    angular.module('snoopyConsole').constant('USER_ROLES', {
        ////用户权限
            all: '*',
            admin: 'admin',
            editor: 'editor',
            guest: 'guest'
        })
})(angular);