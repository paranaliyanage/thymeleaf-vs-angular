'use strict';

angular.module('angularApp').config(function($stateProvider){
    $stateProvider.state('message', {
        'parent': 'home',
        'url': 'message',
        'views': {
            'content@': {
                templateUrl: 'views/message/message.html',
                'controller': 'messageController'
            }
        }
    });
});
