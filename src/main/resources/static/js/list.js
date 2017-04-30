app.controller('listCtrl',['$scope','$state','$http','texts','textService', function($scope,$state,$http,texts,textService){

$scope.texts = texts.data;

console.log(texts.data);

$scope.edit= function(text){
textService.setText(text);
$state.go("add");
}


}]);