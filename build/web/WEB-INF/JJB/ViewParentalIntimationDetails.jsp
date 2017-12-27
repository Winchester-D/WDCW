<%-- 
    Document   : ViewParentalIntimationDetails
    Created on : 4 Dec, 2014, 4:34:07 PM
    Author     : ajay
--%>

<%@page import="java.text.*;"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
    <head>
        <sx:head/>
    </head>
<div id="formWrapper">
 <TABLE WIDTH=575 BORDER=1 CELLPADDING=2 CELLSPACING=0>   
<!--table border="1"-->
<caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>INTIMATION TO PARENTS/GUARDIAN OF JUVENILE</p>
</caption>
 </table>

   <table border="1">    
    <tr>
        <td>To</td>
        <td>
            <s:property value="%{parIntDTO.accuIntimationName}"/>
        </td>
   </tr>
   <tr>
       <td>Address</td> 
       <td>
           <s:property value="%{parIntDTO.accuAddress}"/>
        </td>
    </tr>
    <tr><td colspan="2">where as your son/daughter/ward:</td></tr>
    <tr>
        <td>Name of Child </td>
        <td><s:property value="%{parIntDTO.accuName}"/></td>
    </tr>
    <%--<li class='line'>1 Name of Child</li>
    <li class='line'><s:hidden name="profile_id" value="%{parIntDTO.accusedId}"/><s:textfield readonly="true" name="accId" value="%{parIntDTO.accusedId}"/<s:textfield readonly="true" name="accName" value="%{parIntDTO.accuName}"/></li>
    --%>
    <tr>
        <td>Age</td>
        <td><s:property value="%{parIntDTO.accuAge}"/></td>
    </tr>
   
    <tr>
        <td>has been apprehended under: Section(s) of the JJ(C& PC) Act 2000</td>
        <td><s:property value="%{parIntDTO.accuActsSec}" /></td>
    </tr>
    <tr>
        <td>Date & time </td>
        <td><s:property  value="%{parIntDTO.accuCustodyDateTime}" /></td>
    </tr>
    
    <tr>
        <td>Placed in Institution</td>
        <td><s:property value="%{parIntDTO.instName}"/></td>
    </tr>

    <tr>
        <td>She/he will be brought before the Juvenile Justice Board at Place </td>
        <td><s:property value="%{parIntDTO.jjbPlace}"/></td>
    </tr>
    <tr>
        <td>On Date and Time</td>
        <td><s:date name="%{parIntDTO.accuJjbDate}"/></td>
    </tr>
    
    <!--<li class='line'>You are hereby directed to be present at the JJB at the above mentioned place and time.</li>
    <li></li>-->
    
    <tr>
        <td>6 reason for taking charge of the child </td>
        <td><s:property value="%{parIntDTO.accuChargeReason}"/></td>
    </tr>
    </table>
    <br/><br/>
    </div>
    </body>
</html>
