<%-- 
    Document   : CWC_Meetings30
    Created on : 15 Sep, 2017, 11:18:04 AM
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
     var cur=1;
    $('#dialog30').on("click", function() {
        $('<div>').dialog({
            modal: true,
            open: function ()
            {
                $(this).load('DCPU_Meetings30Formde').css('background-color','#ccffff');  
            },
            
             buttons: {
                1: function()
                {
                cur++;
                $(this).load('DCPU_Meetings30Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                2: function()
                {
                cur++;
                $(this).load('DCPU_Meetings30_2Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },   
                3: function()
                {
                cur--;
                $(this).load('DCPU_Meetings30_3Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                4: function()
                {
                cur++;
                $(this).load('DCPU_Meetings30_4Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                },
                5: function()
                {
                cur--;
                $(this).load('DCPU_Meetings30_5Formde',{'profile_id':$('select#child').find('option:selected').val()}).css('background-color','#ccffff');
                }
               
            },
            height: 800,
            width: 1100,
            title: 'Form 30'
        });
    });
    });
    </script>
    </head>
     <body>
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="CWC_Meetings30rep" method="POST" target="_blank">
            <h6 style="text-align: center">FORM 30<br/>            
[Rule 23(9)]<br/>
HOME STUDY REPORT FOR PROSPECTIVE FOSTER PARENTS</h6>
<table>
    
    


<table>
    
    <tr><td>Select Child Profile ID: </td><td>     <s:select id="child"  theme="simple"  list="foundlist" name="pendEnqPdf"/></td> </tr> 

        <!--input type="hidden" id="foundchildprofile" name="foundchildprofileid"/-->

</select><%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
<tr><td colspan="2" style="text-align: center"><br/><input style="text-align: center" id="dialog30" type="button" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>
            
            <br/>
            <div style="text-align: center">
                <a href="images_Forms/Form30.pdf" target="_blank">Click for Template</a>
            </div>    
            
            
        </body>
</html>

