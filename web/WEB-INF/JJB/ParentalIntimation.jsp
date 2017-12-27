<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
    <head>
         <sx:head/>
    </head>
<div id="formWrapper">
<s:form name="pi_form" id="pi_form" class="css_xhtml" action="storeParentalIntimation">
    <input type="hidden" name="formName" value="pi_form"/>
    
  
<table border="0" width="1050" style="padding: 2em" >
    <caption>
<center> <span style="margin-left:-20%"><img src="images/govt-emblem_pic_nobg.png"/></span></center><br>
 <center><span style="margin-left:-20%"><b>INTIMATION TO PARENTS/GUARDIAN OF JUVENILE</b></span></center><br>

 </caption>
</table>  

<br><br>

<span style="margin-left: 6%">To,&emsp;<s:textfield readonly="true" name="parentName" value="%{parIntDTO.accuIntimationName}"/> &emsp;<s:textarea readonly="true" name="parentAddr" value="%{parIntDTO.accuAddress}" cols="25"/></span>
<br><br>

<span style="margin-left: 6%">where as your son/daughter/ward:</span><br><br>

<span style="margin-left: 6%">Name of Child &emsp; <s:hidden name="profile_id" value="%{parIntDTO.accusedId}"/><s:textfield readonly="true" name="accName" value="%{parIntDTO.accuName}"/>&emsp;Age&emsp;<s:textfield readonly="true" name="accAge" value="%{parIntDTO.accuAge}"/></span><br><br>
<span style="margin-left: 6%">has been apprehended under:</span><br><br>

<span style="margin-left: 6%">Section(s) of the JJ(C& PC) Act 2000:</span><br><br>

<span style="margin-left: 6%"><s:textarea name="accuActs" rows="3" cols="30" value="%{parIntDTO.accuActsSec}" readonly="true"/></span><br><br>

<span style="margin-left: 6%">On Date & time&emsp;<s:textfield name="dateOfApp" value="%{parIntDTO.accuCustodyDateTime}" readonly="true"/></span><br><br>

<span style="margin-left: 6%">and placed in Institution Name & Address*:</span><br><br>

<span style="margin-left: 6%"><s:textarea name="instName" cols="30" rows="3" id="instName" value="Not sent to any Institution."/></span><br><br>

<span style="margin-left: 6%">She/he will be brought before the Juvenile Justice Board at:</span><br><br>

<span style="margin-left: 6%">Place*:&emsp;&nbsp;&nbsp; <s:textfield name="jjbPlace" id="jjbPlace"/></span><br><br>

<span style="margin-left: 6%">On Date*:<s:textfield name="jjbAppointDate" id="datepicker"/>&emsp;and on time*:<sx:datetimepicker type="time" name="jjbTime" id="jjbTime"/></span><br><br>

<span style="margin-left: 6%">You are hereby directed to be present at the JJB at the above mentioned place and time.</span><br><br>

<span style="margin-left: 6%">Reason for taking charge of the child:</span><br><br>

<span style="margin-left: 6%"><s:textarea name="chargeReason" id="chargeReason" value="%{parIntDTO.accuActsSec}" cols="40" rows="8"/></span><br><br>

<span style="margin-left: 6%"><input type="submit" value="submit" align="center"/></span><br><br>


<br><br>
</s:form>

</div>
<%--
<div id="search-div">
    <h3 style="margin-left:7%">Search profile by ... </h3><br><br>
<form id="searchForm">
    <input type="hidden" name="formName" value="pi_form"/>
    <input type='hidden' name='criteria' value='name'/>
&emsp;&nbsp;Name:&emsp;&nbsp;<input name='name' type="text"> <button type="submit">search</button>

</form>
<br>
<form id="searchForm">
 <input type="hidden" name="formName" value="pi_form"/>
 <input type='hidden' name='criteria' value='caseNo'/>
&emsp;&nbsp;Case No:<input name='name' type="text"> <button type="submit">search</button>   

</form>

<br>
<form id="searchForm">

  <input type="hidden" name="formName" value="pi_form"/>  
  <input type='hidden' name='criteria' value='all'/>
 <button id="all" style="margin-left:10%">All the Records Present</button>

</form>
<br>
<form id="searchForm">

  <input type="hidden" name="formName" value="pi_form"/>  
  <input type='hidden' name='criteria' value='new_records'/>
  <button id="all" style="margin-left:10%">Show New records for entry</button>

</form>

</div>
--%>
</html>