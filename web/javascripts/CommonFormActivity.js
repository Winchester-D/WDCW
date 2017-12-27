/* 
 * This java script file will be performing the common actions of the forms such as
 * 1) Submiting form to an specific action.
 * 2) Displaying the message after the request is sent.
 * 3) resetting the form fields after form submitted successfully.
 * 4) populating a form based on id selected.
 * 5) gathering the list of profiles based on a specific search criteria
 */

var CommonFormActivity = {
    
     formOptions:{
        form:'The form object' ,
        save_url :'The url to be called while saving the formdata',
        view_url :'The url to be called while fetching object from DB',
        update_url :'The url to be called while updating object from DB',
        delete_url :'The url to be called while deleting object from DB',
        successMessage:'Success',
        errorMessage:'Error',
        juvenileListTemplate:$('#juvenile_list_template').html(),  
        searchResultList:$('ul.search_result_list'),
        buttonPanel:$('#buttonPanel'),
        searchForm:$('#search-div #searchForm'),
        styleChanger:$('#styleChanger')
    },
    
    init:function(config){
        //this function will be initializing the CommonFormActivity With
        //the current form specific details.
        this.formOptions.form = config.form;
        this.formOptions.save_url=config.save_url;
        this.formOptions.view_url=config.view_url;
        this.formOptions.update_url=config.update_url;
        this.formOptions.delete_url=config.delete_url;
        
        this.bindEvents();
        this.setUpTemplates();
        searchForm.init();
        
    },
    
    //reset function resets any given form and accespts form Id as a parameter
    reset:function(form){
        console.log('log message - inside CommonFormActivity reset function');
        form.get(0).reset();
        console.log('log message - form resetted successfully');
        
    },
    
    formOperation:function(){
      
      console.log($('#mode:checked').val());
        if($('#mode:checked').val() === 'add')
                   {
                       console.log('add button clicked ');
                       CommonFormActivity.save();
                   }
                   
                   else if($('#mode:checked').val() === 'modify')
                   {
                       console.log('modify Button clicked');
                       CommonFormActivity.update();
                   }
                   
                   else if($('#mode:checked').val() === 'delete')
                   {
                       console.log('delete Button clicked');
                       CommonFormActivity.deleteForm();
                   }
      
    },
    
    searchOperation:function(e){
        $.post('View-Juvenile-List',$(this).serialize(),function(results){

              console.log('results =='+results);
              
              if(results[0])
               {
                CommonFormActivity.formOptions.searchResultList.empty()
                                                                      .append(CommonFormActivity.formOptions.juvenileListTemplate(results));  
               }
              else{
                CommonFormActivity.formOptions.searchResultList.empty()
                                                               .append("<li>No Results Found</li>");
               }
              
              });


              e.preventDefault();             
      
    },
    
    //saveOrUpdate functions save or update the form data to database using ajax call
    
    save:function(){
                
        $.ajax({
      url:this.formOptions.save_url,
      type:'POST',
      data:this.formOptions.form.serialize(),
      dataType:'json',
      success:function(result){
        
        if(result === 'CASE NUMBER case004 already exists. Please change the CASE NUMBER.')
            {
                
            }
        else
            {
                 //think about it later
                //CommonFormActivity.listUpdater([{caseNo:$('#caseNo').val(),childName:$('#childName').val()}]);
            }
            
        //console.log(CommonFormActivity.formOptions.successMessage);
        alert(result);
        //listUpdater({'caseNo'}})
        
      },
      error:function(result){
          
          //console.log(CommonFormActivity.formOptions.errorMessage);
          alert(result);
      }
    }) ;
        
    },
    
    update:function(){
      
      $.ajax({
          url:this.formOptions.update_url,
          type:'POST',
          data:this.formOptions.form.serialize(),
          dataType:'json',
          success:function(result){              
              alert(result);
          },
          error:function(result){
              alert(reult);
          }
      });
      
      
    },
    
    deleteForm:function(){
      var self = CommonFormActivity;
      $.ajax({
          url:this.formOptions.delete_url,
          type:'POST',
          //data:{caseNo:$('#caseNo').val()},
          data:{sno:$('#sn').val(),
                formName:self.formOptions.form.attr('id')
                },
          dataType:'json',
          success:function(result){              
              alert(result);
          },
          error:function(result){
              alert(result);
          }
      });
      
    },
    
  
    
    displayJuvenileInfo:function(){
    
    var self = CommonFormActivity;
console.log(this);
          $.ajax({
          url:self.formOptions.view_url,
          type:'POST',
          //data:{caseNo:$(this).data('juvenile_id')},
          data:{sno:$(this).data('juvenile_id'),
                formName:self.formOptions.form.attr('id')
                },
          dataType:'json',
          success:function(result){
            console.log(result);
          //self.populatePERForm(self.config.perForm,result);
            self.populateFormData(self.formOptions.form,result);
                            }

                 });
  },
  
  populateFormData:function(frm,data){
     console.log(frm +'---'+ data);
    $.each(data, function(key, value){  
    var $ctrl = $('[name='+key+']', frm);
    console.log($ctrl);  
    switch($ctrl.attr("type"))  
    {  
        case "text" :   
        case "hidden":  
        case "textarea":
        $ctrl.val(value);   
        break;   
        case "radio" : case "checkbox":
        $ctrl.attr("checked",value);  
        break;  
    }  
    }); 
  },
    
   listUpdater:function(juvenile){
       //console.log('---'+CommonFormActivity.formOptions.juvenileListTemplate([{caseNo:'007',childName:'xyz'}]));
       CommonFormActivity.formOptions.searchResultList.prepend(CommonFormActivity.formOptions.juvenileListTemplate(juvenile));
       //$(".search_result_list li").scrollTop();
       $(".search_result_list li").first()
                                  .css({
                                      'background-color':'#C5F790',                                      
                                      'font-weight': 'bold'
                                  })
                                  .focus();
                                  
                                  //future work to write a code which will scroll the ist up
   } ,
   
   changeStyle:function(e){
       
       var $this = $(this);
       //alert('changeStyle called ...'+$this.val());
       
       if($this.val() !== $('link').attr('href')){
           $('link').remove();
           $.ajax({
            type: "GET",
            url: $this.val(),
            success:function(result){
            
                    $('<link rel="stylesheet" type="text/css" href="'+$this.val()+'" />').appendTo("head");
              
            }
            });
           
           /*
            $('link').remove();
           
           $("<link/>", {
                   rel: "stylesheet",
                   type: "text/css",
                   href: $this.val()
                }).appendTo("head");
           */     
                
       }
       
   },
    
    bindEvents:function(){    
    this.formOptions.searchResultList.on('click','li',this.displayJuvenileInfo);
    this.formOptions.buttonPanel.on('click',this.formOperation);
    this.formOptions.searchForm.on('submit',this.searchOperation);
    this.formOptions.styleChanger.on('change',this.changeStyle);
  
  },
    
    
    setUpTemplates:function(){
   this.formOptions.juvenileListTemplate = Handlebars.compile(this.formOptions.juvenileListTemplate);
  },
    
    modeListHighLighter:function(selectedListItem){
        var selectedLi = $(selectedListItem).parent();              
             var unselectedLis = selectedLi.siblings('li');             
             for(i=0;i<unselectedLis.length;i++)
                 {
                     var usl = $(unselectedLis[i]);
                   if(usl.hasClass('highlight')){
                       usl.toggleClass('highlight');
                   }
                 }
             selectedLi.toggleClass('highlight');
    }  
    
};

//search for activity

var searchForm = { // an object of contact form START

   container : $('#search-div'),

   config : {
    effect : 'toggle' ,//'slideToggle',
        speed : 'slow' //500
   },


  
  init:function(config){ //similer to constructor in oop
     
    buttonPanel = $('#buttonPanel'); 

    $.extend(this.config,config); // over writing the defult object to custom config object at creation
    //console.log('this value inside init '+this);

         
         $('.left-menu #mode')           
           .on('change',function(){
               
               /* GUL Class Togg*/
               CommonFormActivity.modeListHighLighter(this);
            //if add attach the button at the bottom for add action
            if(this.value === 'add')
            {             
             buttonPanel
                        .empty()
                        .append("<button title='Click this button to save the form you have just filled up right side.'>Add Record</button>");                        
            }
            //else show the search window 
            else if(this.value === 'view'){
              buttonPanel
                        .empty(); 
                        
                        searchForm.show();
            }
            else if(this.value === 'modify'){
              buttonPanel
                        .empty()
                        .append("<button title='Click this button to update changes you perfomed in the record right side.'>Modify Record</button>");               
                        
                        searchForm.show();
            }
            else if(this.value === 'delete'){
              buttonPanel
                        .empty()
                        .append("<button title='Click this button to delete the current record present at right side.'>Delete Record</button>");               
                        
                        searchForm.show();
            }
            
           });

           console.log('search form initialized');
           
  },

  show:function(){
      
        var cf = searchForm , 
            container=cf.container ,
            config = cf.config;
         
         if( container.is(':hidden') ){ //cheaking whether the container is already visible or not

         container[config.effect](config.speed);
         cf.close.call(container);
          
         }
         
  },

  close:function(){
    //console.log('this value inside close '+this);
    //console.log('$(this) value inside close with '+contactForm.container);
           var $this = $(this);

           if( this.find('span.close').length ) return;
           $('<span class=close>X</span>')
           .prependTo(this)
           .on('click',function(){
            console.log('this value inside close click event '+this);
            $this[searchForm.config.effect](searchForm.config.speed);
           })

  }

  
}; //search form ends
