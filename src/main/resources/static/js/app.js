var app = angular.module('SPA',['ui.router']);
app.config(['$stateProvider','$httpProvider',function($stateProvider,$httpProvider){

    $stateProvider
    .state('add',{
    url:"/add",
    templateUrl:'/add',
    controller: 'addCtrl'})

    .state('list',{
        url:"/list",
        templateUrl:'/list',
        resolve : {
        texts : function($http){
          return $http.get("/sort");
        }
        },
        controller: 'listCtrl'
        });

}]);
app.run(['$rootScope','$state','$stateParams','$location','$window' ,function ($rootScope,$state,$stateParams,$location,$window) {
                $state.go('list');
            }]);