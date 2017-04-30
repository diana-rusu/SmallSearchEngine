app.controller('addCtrl',['$scope','$state','$http','textService', function ($scope, $state,$http,textService) {

$scope.text=textService.getText();

$scope.saveText = function(size){
if($scope.text.id==null){
$scope.text.id= Date.now();
}
else{
textService.setText({title:null,content:null,id:null});
}
$http.post('/text',$scope.text).then(
function(data){
$state.go("list");
},function(data){
alert("error");
$state.go("list");
}
);
};
}]);