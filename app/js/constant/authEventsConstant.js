(function(angular){
    'use strict';
    angular.module('snoopyConsole').constant('AUTH_EVENTS', {//用户登录状态:
        loginSuccess: 'auth-login-success',
        loginFailed: 'auth-login-failed',
        logoutSuccess: 'auth-logout-success',
        sessionTimeout: 'auth-session-timeout',
        notAuthenticated: 'auth-not-authenticated',
        notAuthorized: 'auth-not-authorized'
    })
})(angular);