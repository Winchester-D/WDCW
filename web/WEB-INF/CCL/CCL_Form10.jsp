<%-- 
    Document   : CCL_10
    Created on : 15 Sep, 2017, 11:19:14 AM
    Author     : Rajat
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
    $('#dialog10').on("click", function() {
        $('<div>').dialog({
            modal: true,
            open: function ()
            {
                $(this).load('CCL_Form10de',{'profile_id':$('select#child').find('option:selected').val()});
                $(this).parent().css('background-color','white');
            },
            buttons: 
            {
                1: function()
                { $(this).load('CCL_Form10de'); },
                2: function()
                { $(this).load('CCL_Form10_1de');}
            },         
            height: 800,
            width: 1100,
            title: 'Form 10'
        });
    });
    });
    </script>
    </head>
     <body>
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="CCLForm10rep" method="POST" target="_blank">
            <h6 style="text-align: center">FORM 10<br/>            
[Rules 11(9) and 64 (3) (xiii)]<br/>
PERIODIC REPORT BY PROBATION OFFICER WHEN A CHILD IS RELEASED ON PROBATION</h6>
<table>
    
    <tr><td>Select Child Profile ID: </td><td>     <s:select id="child"  theme="simple"  list="foundlist" name="pendEnqPdf"/></td> </tr> 

        <!--input type="hidden" id="foundchildprofile" name="foundchildprofileid"/-->

</select><%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
<tr><td colspan="2" style="text-align: center"><br/><input style="text-align: center" id="dialog10" type="button" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>
            
            <br/>
            <div style="text-align: center">
                <a href="images_Forms/Form10.pdf" target="_blank">Click for Template</a>
            </div>            
        </body>
</html>

