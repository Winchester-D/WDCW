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
        <title>View Preliminary Input Form</title>
        
          <sx:head/>
        <script>
            function show_details(val)
            {
                dojo.event.topic.publish("show_RemDetails");
            }
        </script>
    </head>
    <body>
        <s:form action="JJB-Preliminary-Enquiry" name="PrelEnqInputForm" id="PrelEnqInputForm" theme="css_xhtml">
            <TABLE WIDTH=575 BORDER=1 CELLPADDING=2 CELLSPACING=0>   
<!--table border="1"-->
<caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>PRELIMINARY ENQUIRY INPUT FORM</p>
</caption>
 </table>
            <table>
                <tr>
                    <td>
            Select Social Investigation For :
                    </td>
                    <td>
                        <s:select name="sirName" list="ccList" listKey="ccNo" listValue='ccNo+"-->"+firNo+"-->"+accuName' headerKey="ccNo" headerValue="CC No-->FIR No-->Accused Name"/>
                    </td>
                </tr>
            </table>      
                        <br/>
                        
                       
            <s:submit value="SUBMIT" align="center" onclick="javascript:show_details(this);return false;"/>
            
            
             
                           <s:url id="d_url" action="JJB-View-DPORep"/>                  
                 <sx:div id="details" href="%{d_url}" listenTopics="show_RemDetails" formId="PrelEnqInputForm" showLoadingText="true">
                 </sx:div>
        </s:form>    
    </body>
</html>