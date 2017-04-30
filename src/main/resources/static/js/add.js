app.controller('addCtrl',['$scope','$state','$http', function ($scope, $state,$http) {
$scope.text= { title:null, content:null}

$scope.saveText = function(size){
$http.post('/add',$scope.text).then(
function(data){
state.go("list");
},function(data){
alert("error");
$state.go("list");
}
);
};
}]);