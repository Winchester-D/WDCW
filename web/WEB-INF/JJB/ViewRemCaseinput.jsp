<%-- 
    Document   : ViewRemCaseinput
    Created on : 24 Nov, 2014, 11:41:16 AM
    Author     : suresh
--%>

<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head><title>View Remand Case Diary</title>
    
     <sx:head/>
        <script>
            function show_details(val)
            {
                dojo.event.topic.publish("show_RemDetails");
            }
        </script>
    </head>    
    <body>
         <s:form name="ViewRemDiary" action="JJB-View-RemDiary" id="ViewRemDiary" theme="css_xhtml">
             <s:hidden name="formName" value="RemandDiaForm"/>
             <TABLE WIDTH=575 BORDER=1 CELLPADDING=2 CELLSPACING=0>   
<!--table border="1"-->
<caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>View Remand Case Diary</p>
</caption>
 </table>
             <table>
                 <tr>
                     <td>View Remand Case Diary for Accused of FIR and P.S</td>
                     <td><s:select name="remandId" list="remMap" listKey="key" listValue="value" headerKey="select" headerValue="--Select Accused--"/></td>
                 </tr>
             </table> <br/>   
             <s:submit value="SUBMIT" align="center" onclick="javascript:show_details(this);return false;"/>
             
             
                   <s:url id="d_url" action="JJB-View-RemDetails"/>                  
                 <sx:div id="details" href="%{d_url}" listenTopics="show_RemDetails" formId="ViewRemDiary" showLoadingText="true">
                 </sx:div>
         </s:form>
    </body>
</html>
