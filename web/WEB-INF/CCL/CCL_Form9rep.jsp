<%-- 
    Document   : CCL_Form9rep
    Created on : 29 Nov, 2017, 15:21:56 PM
    Author     : Rajat
--%>

<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form name="cwcHomeSelectForm" id="cwcHomeSelectForm" action="CCLForm9rep" method="POST" target="_blank">
            
            <h6 style="text-align: center">FORM 9<br/>
[Rules 11(7)]<br/>
PERSONAL BOND BY CHILD<br/></h6>
<table>
    
    <tr><td>Select Child Profile ID: </td><td>     <s:select id="child"  theme="simple" list="foundchildrenlist" name="pendEnqPdf" listKey="id" listValue="profileId+'-->'+firstName"/></td> </tr> 

        <!--input type="hidden" id="foundchildprofile" name="foundchildprofileid"/-->

</select><%--s:select name="homeId" id="homeId" theme="simple" list="homeMasters" headerValue="--- Please Select ---" headerKey="-1"></s:select--%></td></tr>
<tr><td colspan="2" style="text-align: center"><br/><input style="text-align: center" type="submit" value="<s:text name="global.button.cwcProceed"/>"/></td></tr>
</table>
</s:form>
            
            <br/>
            <div style="text-align: center">
                <a href="images_Forms/Form9.pdf" target="_blank">Click for Template</a>
            </div>    
            
            
        </body>
</html>