/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){ //annonomous function runs at the time the document is ready START
    console.log('ready');
    
    var FirstReferralReport = {
             
             formProperties:{
                 form:$('#frr_form'),
                 save_url:'Save-JJB-Form',//'Save-JJB-First-Refferal',
                 //view_url:'View-Juvenile-FirstReffalReport',
                 view_url:'View-Form-Data',
                 update_url:'Update-JJB-Form',//'Update-JJB-First-Refferal',
                 //delete_url:'Delete-JJB-First-Refferal' 
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



FirstReferralReport.init();





}); //annonomous function runs at the time the document is ready END




