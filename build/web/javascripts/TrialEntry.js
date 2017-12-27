/* 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
$(function(){ //annonomous function runs at the time the document is ready START
    console.log('ready');
    
    var TrialEntry = {
             
             formProperties:{
                 form:$('#te_form'),
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



TrialEntry.init();

/*-----Canvas draw code here-----------*/

$('#pieReportButton').on('click',function(){
    
    //alert('clcked');
    $('#report-div').show(500);
    drawPieChart();
});

$('#barReportButton').on('click',function(){
    
    //alert('clcked');
    $('#report-div').show(500);
    drawBarChart();
});

$('#referTrial').on('click',function(e){
    //alert('clicked');
    $('#trial_history_table').css({'visibility': 'visible'});
    e.preventDefault();
});

$('#socialInvestigation').on('click',function(e){
    window.open('PER_temp.html','Social Investigation Report','scrollbars=yes,toolbar=no,menubar=no,status=no,height=500,width=1000');
    e.prevantdefault();
});



$('.close').on('click',function(){
    
    //alert('clcked');
    $('#report-div').hide(500);
    //drawPieChart();
});

$('input[name=bail]').on('change',function(){
    
   if($(this).val()==='yes')
       {   
           $('#tablediv').slideDown(500);
           //alert('hi');
           $('#bailOptionsTr').css({'visibility':'visible'});
           $('#orderIssuedTr').css({'visibility':'hidden'});
           $('#finalOrderTr').css({'visibility':'hidden'});
       }
       else if($(this).val()==='no')
           {   
               $('#tablediv').slideDown(500);
               $('#orderIssuedTr').css({'visibility':'visible'});
               $('#bailOptionsTr').css({'visibility':'hidden'});
               $('#finalOrderTr').css({'visibility':'hidden'});
              
           }
});

$('input[name=orderIssued]').on('change',function(){
    
   if($(this).val()==='Final Order')
       {
           //alert('hi');
           $('#finalOrderTr').css({'visibility':'visible'});
           //$('#orderIssuedTr').css({'visibility':'hidden'});
       }
       else 
           {
              
               $('#finalOrderTr').css({'visibility':'hidden'});
              
           }
});


function drawPieChart(){
    
    var pieData = 
			 [
				{ 
				    label: 'Serious Offence(30)',
				    x:1.8,
				    y:5,  
					value: 30,
					color:"#F38630"
				},
				{label:'Minor Offence(50)',
				    x:1.5,
				    y:2,
					value : 50,
					color : "#E0E4CC"
				},
				{label:'Petty Offence(100)',
				    x:8,
				    y:2, 
					value : 100,
					color : "#69D2E7"
				}
			
			]
			
		

	var myPie = new Chart(document.getElementById("canvas").getContext("2d")).Pie(pieData);

    
};


function drawBarChart(){
    
    var barChartData = {
			labels : ["P.S 1","P.S 2","P.S 3","P.S 4","P.S 5","P.S 6","P.S 7"],
			datasets : [
				/*{
					fillColor : "rgba(220,220,220,0.5)",
					strokeColor : "rgba(220,220,220,1)",
					data : [65,59,90,81,56,55,40]
				}
				,*/
				{
					fillColor : "rgba(151,187,205,0.5)",
					strokeColor : "rgba(151,187,205,1)",
					data : [28,48,40,19,96,27,82]
				}
			]
			
		}

	var myLine = new Chart(document.getElementById("canvas").getContext("2d")).Bar(barChartData);
	
    
}



}); //annonomous function runs at the time the document is ready END




