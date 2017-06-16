angular.module('app')
    .config(function ($routeProvider, $httpProvider) {
        $routeProvider
            .when('/list', {
                templateUrl: 'app/books/list/list.html',
                controller: 'ListController',
                controllerAs: 'listCtrl'
            })
            .when('/details/:id', {
                templateUrl: 'app/books/details/details.html',
                controller: 'DetailsController',
                controllerAs: 'detailsCtrl'
            })
            .when('/new', {
                templateUrl: 'app/books/new/new.html',
                controller: 'NewController',
                controllerAs: 'newCtrl'
            })
            .when('/login', {
                templateUrl: 'app/auth/login.html',
                controller: 'AuthenticationController',
                controllerAs: 'authController'
            })
            .when('/rlist', {
                templateUrl: 'app/rent/rlist.html',
                controller: 'RListController',
                controllerAs: 'rlistCtrl'
            })
            .when('/rdetails', {
                templateUrl: 'app/details/rlist.html',
                controller: 'RDetailsController',
                controllerAs: 'rdetailsCtrl'
            })
            .when('/rnew', {
                templateUrl: 'app/rent/rnew.html',
                controller: 'NRentController',
                controllerAs: 'rnewCtrl'
            })

            .otherwise({
                redirectTo: '/list'
            });
        $httpProvider.defaults.headers.common["X-Requested-With"] = 'XMLHttpRequest';
        console.log('config complete')
    });
console.log('after config set');