<%-- 
    Document   : CWC_Meetings26
    Created on : 15 Sep, 2017, 11:16:57 AM
    Author     : suresh
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

            $(document).ready(function () {
                $('#dialog33').on("click", function () {
                    $('<div>').dialog({
                        modal: true,
                        open: function ()
                        {
                            $(this).load('CWC_Meetings33Formde', {'profile_id': $('select#child').find('option:selected').val()}).css('background-color', '#ccffff');
                        },
                        height: 700,
                        width: 1100,
                        title: 'Form 33'
                    });
                });
            });
        </script>
    </head>
    <body>
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="CWC_Meetings33rep" method="POST" target="_blank">
            <h6 style="text-align: center">FORM 33<br/>            
                [Rule 23(16)]<br/>
                UNDERTAKING BY THE FOSTER FAMILY/GROUP FOSTER CARE ORGANIZATION</h6>
            <table>

                <tr><td>Select Child Profile ID: </td><td>     <s:select id="child"  theme="simple"  list="foundlist" name="pendEnqPdf"/></td> </tr> 

                <!--input type="hidden" id="foundchildprofile" name="foundchildprofileid"/-->

            </select><%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
    <tr><td colspan="2" style="text-align: center"><br/><input style="text-align: center" id="dialog33" type="button" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>

<br/>
<div style="text-align: center">
    <a href="images_Forms/Form33.pdf" target="_blank">Click for Template</a>
</div>    


</body>
</html>

