<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="/struts-tags" prefix="s"%>

<%@taglib  uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <style>
            
            
            #form_detail  { margin-left: 18%;
                            border:1px solid black;}
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
            
            
        </style>
        
        <sx:head/>
    </head>
    
    
    <div id="formWrapper" >    
   

        <s:form  id="dpoi_form" class="formDesign" action="saveDPOInti" theme="css_xhtml">
    <input type="hidden" name="formName" value="dpoi_form"/>
    <input type="hidden" name="sn" id="sn" value=""/>    


<table border="0" width="1050" style="padding: 2em" >
    <caption>
<center> <span style="margin-left:-20%"><img src="images/govt-emblem_pic_nobg.png"/></span></center><br>
 <center><span style="margin-left:-20%"><b>ORDER FOR SOCIAL INVESTIGATION REPORT</b></span></center><br>
 <center><span style="margin-left:-20%"><b>[Vide rule 13(2)(e) and 13(14)]</b></span></center><br>
 
 </caption>
</table>  

    <table id="form_detail" style="margin-left:12%" >
        
        
        <tr>
            
            <td width="300" height="300"  ><center style="margin-left:-93%;margin-top: -5%">To, </center><br><br>
           The Probation Officer/Case Worker<br><br>
            Name*&emsp;&emsp;<input type="text" name="dpoName" id="dpoName"/><br><br>
            Address*&emsp;<textarea cols="15" rows="3" name="dpoAddress" id="dpoAddress"></textarea><br><br>
            District*&emsp;&nbsp;<select name="districtId" id="districtId">
      <option value="-1" selected>---please select---</option>       
      <option>JJB  Adilabad</option>
      <option>JJB  Anantpur</option>
      <option>JJB  Chittor</option>
      <option>JJB  Cuddapah</option>
      <option>JJB  East Godavari</option>
      <option>JJB  Guntur</option>
      <option>JJB  Hyderabad</option>
      <option>JJB  KarimNagar</option>
      <option>JJB  Khammam</option>
      <option>JJB  Krishna</option>
      <option>JJB  Kurnool</option>
      <option>JJB  Medak</option>
      <option>JJB  Mehboobnagar</option>
      <option>JJB  Nalgonda</option>
      <option>JJB  Nellore</option>
      <option>JJB  Nizamabad</option>
      <option>JJB  Prakasam</option>
      <option>JJB  Ranga Reddy</option>
      <option>JJB  Srikakulam</option>
      <option>JJB  Vishakapatnam</option>
      <option>JJB  Vizianagaram</option>
      <option>JJB  Warangal</option>
      <option>JJB  West Godavari</option>  
      
    </select>   </td>
            
            
            
            
            
            
            <td width="300" height="200"   ><center style="margin-left:-10%;margin-top: -.12%">(To be filled by JJB Clerk/ Case Worker)</center>
            <s:hidden name="acc_id" value="%{cs.accusedId}"/><br>
            <ul><li> FirNO:</li></ul>
            <s:textfield id="accFir" name="accFir" value="%{cs.fir.firPK.firNo}" readonly="true"/><br>
           &emsp; & PoliceStation:<br><br><s:textfield id="accPS" name="accPS" value="%{cs.fir.firPK.policeStation}" readonly="true"/><br>
            <ul><li>Child's Name:</li></ul><s:property value="accChildName"/><s:textfield name="accChildName" value="%{cs.accuName}" readonly="true"/><br>
           <ul><li> Calender Case Number* :</li></ul><s:textfield id="ccNo" name="ccNo" /><br>
            <ul><li>Presented  under section(s):</li></ul><s:textfield name="provisionsForApprehention" value="%{cs.accuActsSec}" readonly="true"/><br>
            
            </td>
            
        </tr>
        
        <tr>
            
            <td colspan="2" height="100">You are hereby directed into the social antecedents, family background  and the circumstances<br>
    of the alleged offense by the said child and submit your Social Investigation Report on or before* :<br>
<input type="text" name="sBDate" id="datepicker"/> or with in* <input type="text" name="timePeriod"/> <br>period or time as allowed by the board.<br></td>
            
            
        </tr>
        
        
          <tr>
            
            <td colspan="2" height="100">You are also hereby directed to the consult an expert in<br>
    child psychology, psychology, psychiatric treatment or <br>
    counseling for their expert option if any.<br></td>
            
            
        </tr>
        
        
     
    </table>
            
            <span style="margin-left: 20%"><s:submit value="SAVE" align="center"/></span>
 




        </s:form>

</div>
    <%--
<div id="search-div">
<h3 style="margin-left:7%">Search profile by ... </h3>
<form id="searchForm">
    <input type="hidden" name="formName" value="dpoi_form"/>
    <input type='hidden' name='criteria' value='name'/>
<p style="margin-left: 7%">Name:<input name='name' type="text"> <button type="submit">search</button></p>

</form>

<form id="searchForm">
 <input type="hidden" name="formName" value="dpoi_form"/>
 <input type='hidden' name='criteria' value='caseNo'/>
<p style="margin-left: 5%">Case No:<input name='name' type="text"> <button type="submit">search</button></p>  

</form>


<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="dpoi_form"/>
  <input type='hidden' name='criteria' value='all'/>
 <button id="all" style="margin-left:13%">Show All the records present</button>
</p>
</form>

<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="dpoi_form"/>  
  <input type='hidden' name='criteria' value='new_records'/>
 <button id="all" style="margin-left:13%">Show New Records for Entry</button>
</p>
</form>

</div>

    
    --%>
</html>
    