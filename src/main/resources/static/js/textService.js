app.service('textService',function(){

var text = { title:null, content:null, id: null};

var setText = function(text){
this.text=text;
};

var getText = function(){
return this.text;
};

return {
  setText : setText,
  getText : getText
};

});