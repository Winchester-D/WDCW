/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){ //annonomous function runs at the time the document is ready START
    console.log('ready');
    
    var SafeCustody = {
             
             formProperties:{
                 form:$('#sce_form'),
                 save_url:'Save-JJB-Form',               
                 view_url:'View-Form-Data',
                 update_url:'Update-JJB-Form',                
                 delete_url:'Delete-JJB-Form'           
                 
             },
           
             init:function(){
                 //this.formProperties.formId = $(this.formProperties.formId);
                 
                 console.log('initalized ...');
                 CommonFormActivity.init(this.formProperties);
                 //console.log(this);
             },
             
             dispalyParams:function(){
               console.log(this.formProperties.form);  
             }
        
            };



SafeCustody.init();





}); //annonomous function runs at the time the document is ready END




