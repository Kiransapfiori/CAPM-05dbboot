sap.ui.define([ "jquery.sap.global"],
 function(jQuery){
 return {
 callservice:function(sUrl,sMethod,oPayload){
 
 return new Promise(function(resolve, reject ){
 switch (sMethod.toUpperCase()){	
   case "GET":
  jQuery.ajax(sUrl,{
      type:'GET',
     success:function(data) {
     resolve(data); 
                  },
 error:function(errr){
 reject(errr);
 }
 });
   break;
   case "POST":
   debugger;
    jQuery.ajax(sUrl,{
      type:'POST',
      contentType:'application/json',
      data:JSON.stringify(oPayload),
     success:function(data) {
     resolve(data); 
                  },
 error:function(errr){
 reject(errr);
 }
 });
   
   break;
 }
 
 } );
 } 
 }
 
 });