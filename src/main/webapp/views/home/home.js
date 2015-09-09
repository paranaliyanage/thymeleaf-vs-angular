'use strict';

angular.module('angularApp', ['ui.router'])
    .config(function($stateProvider, $urlRouterProvider){
        $urlRouterProvider.otherwise('/');
        $stateProvider.state('home', {
            url: '/',
            views: {
                'navbar@': {
                    templateUrl: 'views/fragments/header.html'
                },
                'footer@': {
                    templateUrl: 'views/fragments/footer.html'
                }
            }
        })
    });
