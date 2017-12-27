<%-- 
    Document   : ParentalIntimationFirst
    Created on : 19 Nov, 2014, 4:09:44 PM
    Author     : Swetha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%--@page import="java.text.*;"--%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>

    <div id="formWrapper">
        <!--div class="curl"></div-->
<s:form name="piFirst" id="piFirst" class="formDesign" action="piFirst_action">

   
  <center>
<table border="0" width="1050" style="padding: 2em" >
    <caption>
<center> <span style="margin-left:-20%"><img src="images/govt-emblem_pic_nobg.png"/></span></center><br>
 <center><span style="margin-left:-20%"><b>INTIMATION TO PARENTS/GUARDIAN OF JUVENILE</b></span></center><br>

 </caption>
</table>  

      
           Select Fir No -- Police Station -- Child Name <select name="profile_id" id="profile_id">
                                   <option value="1">---Please Select---</option>
                                   <c:forEach items="${firNoPS_List}" var="obj">
                                       <option value=${obj.accusedId}>${obj.firNo}--${obj.policeStation}--${obj.accuName}</option>
                                   </c:forEach>
                               </select>
           <br/><br/>
           <input type="submit" value="submit" style="text-align: center"/>
  </center>
</s:form>

</div>