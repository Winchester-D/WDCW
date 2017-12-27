<%-- 
    Document   : PrelEnqInput
    Created on : 20 Nov, 2014, 10:48:36 AM
    Author     : suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trial Input Form</title>
    </head>
    <body>
        <s:form action="JJB-Trial-Form" name="TrialInputForm" id="TrialInputForm" theme="css_xhtml">
            <input type="hidden" name="formName" value="TrialInputForm"/>
         <TABLE WIDTH=575 BORDER=1 CELLPADDING=2 CELLSPACING=0>   
<!--table border="1"-->   
              <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>TRIAL INPUT FORM</p>
      </caption>
            <table>
                <tr>
                    <td>
            Select Trial Enquiry For :
                    </td>
                    <td>
                        <s:select name="trialName" list="ccList" listKey="accusedId" listValue='ccNo+"-->"+firNo+"-->"+accuName' headerKey="ccNo" headerValue="CC No-->FIR No-->Accused Name"/>
                    </td>
                </tr>
            </table>      
                        <br/>
            <s:submit value="SUBMIT" align="center"/>
            
        </s:form>    
    </body>
</html>
