app.controller('listCtrl',['$scope','$http','texts', function($scope,$http,texts){

$scope.texts = texts.data;

console.log(texts.data);

}]);