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
        <title>View Trial Input Form</title>
        <sx:head/>
        <script>
            function show_details(val)
            {
                dojo.event.topic.publish("show_RemDetails");
            }
        </script>
    </head>
    <body>
        <s:form action="JJB-View-Trial" name="ViewTrialInputForm" id="ViewTrialInputForm" theme="css_xhtml">
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
                        <s:select name="trialName" list="epMap" listKey="key" listValue="value" headerKey="ccNo" headerValue="CC No-->Trial Date-->Accused Name"/>
                    </td>
                </tr>
            </table>      
                        <br/>
            <s:submit value="SUBMIT" align="center" onclick="javascript:show_details(this);return false;"/>
            
            
                   <s:url id="d_url" action="JJB-View-TrDetails"/>                  
                 <sx:div id="details" href="%{d_url}" listenTopics="show_RemDetails" formId="ViewTrialInputForm" showLoadingText="true">
                 </sx:div>
            
        </s:form>    
    </body>
</html>
