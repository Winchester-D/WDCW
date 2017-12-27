<%-- 
    Document   : ViewParentIntimation
    Created on : 4 Dec, 2014, 3:39:08 PM
    Author     : ajay
--%>
<%@page import="java.text.*;"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
    <sx:head/>
    <script>
        function show_details(val)
        {
            dojo.event.topic.publish("show_ParentIntimation");
        }
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>View Parent Intimation</title>
</head>
<body>
    <div id="formWrapper">
        <!--div class="curl"></div-->
        <s:form name="piFirst" id="piFirst" class="formDesign" action="ViewParentIntimation_FormDetails">

<table border="0" width="1050" style="padding: 2em">
    <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>FORM</p>
 </caption>
</table>   

        <ul class='a'>
            <li class='line'>*Select Fir No -- Police Station -- Child Name <select name="profile_id" id="profile_id">
                                   <option value="1">---Please Select---</option>
                                   <c:forEach items="${firNoPS_List}" var="obj">
                                       <option value=${obj.accusedId}>${obj.firNo}--${obj.policeStation}--${obj.accuName}</option>
                                   </c:forEach>
                               </select></li>
            <li></li> 
            <li class='line'><input type="submit" value="submit" align="center"/></li>
</ul>
</s:form>

    </div>