<%-- 
    Document   : ViewFirForm
    Created on : 3 Dec, 2014, 4:24:16 PM
    Author     : ajay
--%>
<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <sx:head/>
        <script>
            function show_details(val)
            {
              dojo.event.topic.publish("show_FirDetails");
            }
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Fir Form</title>
    </head>
    <body>
        <div>
            <s:form name="CourtSurrenderForm" method="post" action="#" id="formDesign" theme="simple">
                <%--<ol>
                    <li>
                        Police Station <s:if test="%{psList==null}"><s:select name="ps" list="{Select P.S}"></s:select></s:if><s:else><s:select name="ps" headerKey="-1" headerValue="Select P.S" list="%{psList}"></s:select></s:else>&nbsp;&nbsp;<s:label >FIR No.* </s:label><s:if test="%{firList==null}"><s:select name="firNo" list="{'Select Fir No'}"></s:select></s:if><s:else><s:select name="firNo" headerKey="-1" headerValue="Select FIR" list="%{firList}"></s:select></s:else>
                    </li>
                </ol>--%>
                    <div align="center">Select FIR No And Police Station : <s:select name="psFir" headerKey="-1" headerValue="Select P.S--------->FIR" list="%{csViewList}"></s:select><br/><br/>
                    <s:submit type="button" value="SUBMIT" align="center" onclick="javascript:show_details(this);return false;"/></div>
                    <s:url id="d_url" action="View-Fir-Form-Details"/>
                    <sx:div preload="false" id="details" href="%{d_url}" listenTopics="show_FirDetails" formId="formDesign" showLoadingText="true">
                    </sx:div>
                    
           </s:form>   
        </div>
    </body>
</html>
