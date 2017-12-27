<%-- 
    Document   : CWC_Meetings
    Created on : Jul 9, 2011, 3:25:23 PM
    Author     : Ramu Parupalli
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <script type="text/javascript">
            
         /*function validate()
            {
               var $dialog = $('<div></div>')
		.html('This dialog will show every time!')
		.dialog({
			autoOpen: false,
                        height: 110,
			width: 250,
                        modal: true,
			title: 'ERROR'.fontcolor('#FF0000'),
                        buttons: {
				Ok: function() {
					$dialog.dialog('close');
                                    }
			}
		});
                
                     if($("#homeId").val()==-1)
                        {
                            $dialog.html("Sorry! Please Select home");
                            $dialog.parent().addClass( "ui-state-error" );
                            $dialog.dialog('open');
                            return false;
                        }
                       
            }*/     
       
        <jsp:include page="../../javascripts/CWC_Meetings_Validation.jsp"></jsp:include>
        </script>
        
        <script>
            
                 function myfunction() {
                               var $select = $('#child');
                               $.ajax({
                                   url: 'getReportFoundChild1',
                                   dataType: 'json',

                                    success: function (data) {
                                       
                               //alert(data[Object.keys(data)[0]]);
                           for (var i = 0; i < Object.keys(data).length; i++) {

            
                                    if(i === 0){
                                    var option = document.createElement("option");
                                           option.text = "-- please select --";
                                           $select.append(option);
                                        
                                        
                                    }
                                    var option = document.createElement("option");
                                  
                                           option.text = data[Object.keys(data)[i]];
                                           option.value =  data[Object.keys(data)[i]];
                                           $select.append(option);
                                    }
                                },
                                   error: function (error) {
                                      alert(error);
                                   }
                               });


           }
           
           function myreport(val){
               
               var str = val.value;
               
               document.getElementById("foundchildprofile").value = str;
               document.getElementById("foundchildrep").value = str;
               
               var temp = document.getElementById("foundchildprofile").value;
            //   alert(temp);
           }
           
        </script>
        </head>
        <body >
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="CW-CWCMeetings-setHome" method="POST">
<table>
    
    <tr> <td>Select Child Profile ID: </td><td> <s:select id="child"   list="foundchildrenlist"  listKey="profileId" listValue="profileId+'-->'+firstName+'-->'+status" headerKey="select" headerValue="Profile Id-->First Name-->Status" onchange="myreport(this)" theme="simple"/> </td></td><td><span style="padding-left:20px"></span></td>
              </tr><tr> 
               <td></td><td><span style="padding-left:20px"></span></td>
             </tr>
        <input type="hidden" id="foundchildprofile" name="foundchildprofileid"/>
<%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
        <tr><td style="text-align: center" colspan="2"><input type="submit" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>
            
            <form action="CWC_Meetings17rep" target="_blank" style="text-align: center">   <input type="hidden" id="foundchildrep" name="found_child"/><s:submit style="text-align: center"  value="Generate Form17" theme="simple"/></form>
            <!--input style="text-align: center" type="submit" value="Generate Case Monitoring Sheet"/-->
        </body>
    </html>