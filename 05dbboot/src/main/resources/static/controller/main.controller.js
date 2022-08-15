 sap.ui.define([
 "sap/ui/core/mvc/Controller",
 "jquery.sap.global",
 "krn/Util/Services",
 "sap/m/MessageBox"],
 function(Controller,jQuery,Serv, message){
 return Controller.extend("krn.controller.main",{
onInit:function(){
 var model = new sap.ui.model.json.JSONModel();
    model.setData({
    "postpayload":{
    "companyName": "",
        "contactName": "",
        "lastName": "",
        "website": "",
        "email": "",
        "status": ""
        }, "Vendor":{}
    });
    sap.ui.getCore().setModel(model);
},
onsave:function()
{
var omodel = sap.ui.getCore().getModel();
  debugger;
    var payload = omodel.getProperty("/postpayload");
    Serv.callservice("/Vendor","POST", payload).then(function(data){
    
    message.confirm("success");
    
    
    }).catch(function( ){
    
    message.error("Error");
    
    });
    
},
 FunctionP:function(){
  var that = this;
  Serv.callservice("/newVendor","GET",{ }).then(function(data){
  
  var otable = that.getView().byId("tid");
  debugger;
   var omodel = sap.ui.getCore().getModel();
   debugger;
   omodel.setProperty("/Vendor",data._embedded.Vendor);
   // sap.ui.getCore().setModel(omodel);
   otable.bindRows("/Vendor");
    console.log(data); 
    
  }).catch(function(){
  
   });
   
 //alert("todo:we will call our microservice to");
 // jQuery.ajax("/newVendor",{
    //  type:'GET',
    // success:function(data) {
     
   
  //                },
 //error:function(errr){
 //
 //}
 //});

 }
 });
 });	