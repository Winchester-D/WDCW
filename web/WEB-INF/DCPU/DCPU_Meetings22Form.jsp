<%-- 
    Document   : DCPU_Meetings22
    Created on : 13 Sep, 2017, 11:22:40 AM
    Author     : Shashank 
    Modified   : Rajat 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
        
 $(document).ready(function() {
    $('#dialog22').on("click", function() {
        $('<div>').dialog({
            modal: true,
            open: function ()
            {
                $(this).load('DCPU_Meetings22Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
 
            },   
                  buttons: {
                1: function()
                {
                
                $(this).load('DCPU_Meetings22Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                2: function()
                {
               
                $(this).load('DCPU_Meetings22_2Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },   
                3: function()
                {
                
                $(this).load('DCPU_Meetings22_3Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                4: function()
                {
               
                $(this).load('DCPU_Meetings22_4Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                5: function()
                {
                
                $(this).load('DCPU_Meetings22_5Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                6: function()
                {
               
                $(this).load('DCPU_Meetings22_6Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                7: function()
                {
             
                $(this).load('DCPU_Meetings22_7Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                }
            },
           height: 700,
           width: 1200,
           title: 'Form 22'
        });
    });
    });
    </script>
    </head>
     <body>
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="DCPU_Meetings22rep" method="POST" target="_blank">
            <h6 style="text-align: center">FORM 22<br/>            
[Rule 19(8)]<br/>
SOCIAL INVESTIGATION REPORT FOR CHILD IN NEED OF CARE AND PROTECTION</h6>
<table>
<table>
    
    <tr><td>Select Child Profile ID: </td><td>     <s:select id="child"  theme="simple"  list="foundlist" name="pendEnqPdf"/></td> </tr> 

        <!--input type="hidden" id="foundchildprofile" name="foundchildprofileid"/-->

</select><%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
<tr><td colspan="2" style="text-align: center"><br/><input style="text-align: center" id="dialog22" type="button" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>
            
            <br/>
            <div style="text-align: center">
                <a href="images_Forms/Form22.pdf" target="_blank">Click for Template</a>
            </div>    
            
            
        </body>
</html>
