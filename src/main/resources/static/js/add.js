app.controller('addCtrl',['$scope','$state','$http', function ($scope, $state,$http) {
$scope.text= { title:null, content:null, id: null};

$scope.saveText = function(size){
$scope.text.id= Date.now();
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