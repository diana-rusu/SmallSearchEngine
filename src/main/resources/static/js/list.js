app.controller('listCtrl',['$scope','$state','$http','texts','textService', function($scope,$state,$http,texts,textService){

$scope.texts = texts.data;

$scope.searchText=null;
$scope.filterTitle = function(){
var url=null;
if($scope.searchText.length==0){
url="/sort";
}
else{
url='/name/'+$scope.searchText;
}
$http.get(url).then(function(data){

$scope.texts = data.data;
},function(data){
alert("we have an error here");
});
};

$scope.edit= function(text){
textService.setText(text);
$state.go("add");
}


}]);