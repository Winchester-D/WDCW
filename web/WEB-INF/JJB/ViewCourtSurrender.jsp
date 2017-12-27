<%-- 
    Document   : CourtSurrender
    Created on : 17 Nov, 2014, 4:49:33 PM
    Author     : ajay
--%>

<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>View Court Surrender</title>
        <sx:head/>
        <script>
            function show_details(val)
            {
              dojo.event.topic.publish("show_CourtSurrenderDetails");
            }
        </script>
        <style>
            /*.textlabel {
                width:180px;
                clear:left;
                text-align:right;
                padding-right:10px;
                margin-left:10px;
                color: black;
                font-family: Monospace;
            }*/

            p{
                margin-left:10px;
                /*font-family: Monospace;*/
            }
            ol.document li
            {
                float: left;
                width: 300px;
                padding: 2px 0px;
                /*font-family: Monospace;*/
            }
            hr { 
                display: block;
                margin-top: 0.25em;
                margin-bottom: 0.25em;
                border-style: solid;
                border-width: 1px;
                width: 300px;
            }

        </style>
    </head>
    <body>
        <div style="padding-left: 5%;">
        <div id="heading">
            <p align="center">ARREST/COURT SURRENDER FORM</p>
            <hr>
        </div>
      
            <s:form name="CourtSurrenderForm" method="post" action="#" id="formDesign" theme="simple">
                    <%--<li>
                        Police Station <s:if test="%{psList==null}"><s:select name="ps" list="{Select P.S}"></s:select></s:if><s:else><s:select name="ps" headerKey="-1" headerValue="Select P.S" list="%{psList}"></s:select></s:else>&nbsp;&nbsp;<s:label >FIR No.* </s:label><s:if test="%{firList==null}"><s:select name="firNo" list="{'Select Fir No'}"></s:select></s:if><s:else><s:select name="firNo" headerKey="-1" headerValue="Select FIR" list="%{firList}"></s:select></s:else>
                    </li>--%>
                <div align="center"><s:select name="psFir" headerKey="-1" headerValue="Select P.S--------->FIR" list="%{csViewList}"></s:select><br/><br/>
                 
                    <s:submit type="button" value="SUBMIT" align="center" onclick="javascript:show_details(this);return false;"/></div>
                    <s:url id="d_url" action="View-Court-Surrender-Details"/>
                    <sx:div preload="false" id="details" href="%{d_url}" listenTopics="show_CourtSurrenderDetails" formId="formDesign" showLoadingText="true">
                    </sx:div>
                    
           </s:form>   
         
            </div>
        </body>
      </html>