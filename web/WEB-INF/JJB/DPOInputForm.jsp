<%-- 
    Document   : DPOInputForm
    Created on : 20 Nov, 2014, 10:08:20 AM
    Author     : suresh
--%>

<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head><title>DPO Input Form</title></head>
    <body>
         <s:form name="DpoIpForm" action="JJB-DPO-SIROrder" id="DpoIpForm" theme="css_xhtml">
             <s:hidden name="formName" value="DpoIpForm"/>
             <TABLE WIDTH=575 BORDER=1 CELLPADDING=2 CELLSPACING=0>   
<!--table border="1"-->
<caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>DPO INPUT FORM</p>
</caption>
 </table>
             <table>
                 <tr>
                     <td>Select FIR and Accused for DPO Intimation</td>
                     <td><s:select name="selAccId" list="accList" headerKey="select" headerValue="--Select Accused--"/></td>
                 </tr>
             </table> <br/>   
             <s:submit value="SUBMIT" align="center"/>
         </s:form>
    </body>
</html>
