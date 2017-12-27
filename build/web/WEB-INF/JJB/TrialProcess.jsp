<%-- 
    Document   : DPOInputForm
    Created on : 20 Nov, 2014, 10:08:20 AM
    Author     : suresh
--%>

<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head><title>DPO Input Form</title></head>
    <body>
         <s:form name="te_form" id="te_form" class="formDesign" action="saveTrialProcess">
            <input type="hidden" name="formName" value="te_form"/>
 
    <table>
      <!--col width=45*>
      <col width=52*>
      <col width=45*>
      <col width=48*>
      <col width=66*-->
      <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>ENQUIRY PROCESS</p>
  <p>Section 14 Enquiry(TRIAL)</p>
      </caption>
      <tr>        
        <th>
       Proceeding Date:
        </th>
    <td>
     <s:textfield name="trialDate_str" id="datepicker" theme="simple"/>
     </td>
      </tr> 
    <tr>        
        <th>
            District:
        </th>
    <td>
    <s:property value="cs.accuDistrict"/>
     </td>
      </tr> 
      <tr>        
        <th>
       Calender Case Number(CC NO)/STC:
        </th>
    <td>
     <s:textfield name="ccNo" value="%{sno}" readonly="true" id="ccNo" theme="simple"/>
     </td>
      </tr> 
      <tr>         
        <th>
          Crime Number:
        </th>
        <td>
           <s:property value="sno"/>
        </td>
      </tr>
      <tr>        
        <th>
          Name of the juvenile:
        </th>
        <td>
          <s:property value="cs.accuName"/> 
        </td>        
      </tr>
      <tr>
           <th>
          Gender:           
        </th>
        <td>
          <s:property value="cs.accuGender"/>           
        </td> 
      </tr>
      <tr>        
        <th>
          Father's Name:
        </th>
        <td>
           <s:property value="cs.accuFatherName"/> 
        </td>        
      </tr>
      <tr>   
        <th>
          Address:
        </th>
        <td>
          <s:property value="cs.accuAddress"/>          
        </td>        
      </tr>
      <tr>   
        <th>
          Apprehended under Section(s) <br/> of the JJ(C& PC) Act 2000:
        </th>
        <td>
          <s:property value="cs.accuActsSec"/>           
        </td>        
      </tr>
      <tr>   
        <th>
         Offence:
        </th>
        <td>
         <s:property value="cs.fir.typeOfInfo"/>        
        </td>        
      </tr>
      <tr>        
        <th>
          Place of Offence :
        </th>
        <td>
          <s:property value="cs.fir.typeOfInfo"/>   
        </td>        
      </tr>
      <tr>        
        <th>
          Date of Offence:
        </th>
        <td>
            <s:property value="cs.fir.offencePlaceAddress"/>
        </td>        
      </tr>
      <tr>
           <th>
          Intimated To Parent:           
        </th>
        <td>
            <s:property value="parIntiSent"/>        
        </td> 
      </tr>
      <tr>
           <th>
          Social Investigation Report Received:           
        </th>
        <td>
                <s:property value="dpoSent"/>
        </td> 
      </tr>
      <tr>
           <th>
          Final Result (Charge Sheet) Filed:*           
        </th>
        <td>
         Yes<input type="radio" name="chargeSheetFiled" id="chargeSheetFiled" value="yes"/>
         No<input type="radio" name="chargeSheetFiled" id="chargeSheetFiled" value="no"/>          
        </td> 
      </tr>
      <tr id="chargeSheetFiledOptionsTr" style="visibility:hidden">
          
        <th>
          Termination Under Rule 13(Sub rule 6 & 7):           
        </th>
        <td>
         Yes<input type="radio" name="caseTerminated" id="caseTerminated" value="yes">
         No<input type="radio" name="caseTerminated" id="caseTerminated" value="no">                   
        </td>
        
      </tr>
      <tr id="terminationRemarksTr" style="visibility:hidden">
          
        <th>
          Remarks:          
        </th>
        <td>
         <textarea rows=2 cols=30 name="terminatedRemarks" id="terminatedRemarks"></textarea>                  
        </td>
        
      </tr>
      <tr id="submitInBet" style="visibility:hidden">
          <td colspan="2"><center><input type="submit" value="SUBMIT" align="center"/></center></td>
      </tr>
      
      <tr id="bailTr" style="visibility:hidden">  
           <th>
          Bail:*           
        </th>
        <td>
         Yes<input type="radio" name="bailGranted" id="bailGranted" value="yes" onchange="f2">
         No<input type="radio" name="bailGranted" id="bailGranted" value="no" onchange="f2">          
        </td>
        
      </tr>
    </table>
      <div id="tablediv" style="display:none">
      <table>
        <tr id="bailOptionsTr" style="visibility:hidden">
          
        <th>
          Bail Options:           
        </th>
        <td>
         <input type="radio" name="bailOptions" id="bailOptions" value="1">1. With Security and parental bond<br/>
         <input type="radio" name="bailOptions" id="bailOptions" value="2">2. Only parental bond<br/>          
         <input type="radio" name="bailOptions" id="bailOptions" value="3">3. Self bond<br/>
         <input type="radio" name="bailOptions" id="bailOptions" value="4">4. Under supervision of DPO          
        </td>
        
      </tr>

      <tr id="orderIssuedTr" style="visibility:hidden">  
          
           <th>
          Order issued:           
        </th>
        <td>
         <input type="radio" name="orderIssued" id="orderIssued" value="1">1. Safe Custody</br>
         <input type="radio" name="orderIssued" id="orderIssued" value="2">2. Safe custody extended</br>          
         <input type="radio" name="orderIssued" id="orderIssued" value="3">3. Final Order</br>         
            
        </td>
       
      </tr>
      <tr id="safeCustodyTr" style="visibility:hidden">  
          
           <th>
          Safe Custody:           
        </th>
        <td>
         <input type="radio" name="orderIssuedDetails" id="orderIssuedDetails" value="1">1. Fit Institution</br>
         <input type="radio" name="orderIssuedDetails" id="orderIssuedDetails" value="2">2. Observation Home</br>          
         <input type="radio" name="orderIssuedDetails" id="orderIssuedDetails" value="3">3. Place Of Safety</br>         
        </td>
       
      </tr>
      
       <tr id="finalOrderTr" style="visibility:hidden">  
          
           <th>
          Final Order:           
        </th>
        <td>
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="1">1. Advice or admonition</br>
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="2">2. Counseling (Group or Individual) </br>          
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="3">3. Community Service</br>         
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="4">4. Fine</br>
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="5">5. Release on probation under care of parent/ fit person </br>          
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="6">6. Release on probation under care of fit institution</br>
         <input type="radio" name="finalOrderFineDet" id="finalOrderFineDet" value="7">7. Send to Special home for 1-3 years/Boston School</br>
         
            
        </td>
       
      </tr>
      
      <tr id="fineOptionsTr" style="visibility:hidden">  
          
           <th>
          Fine Payment Options:           
        </th>
        <td>
         <input type="radio" name="fineDetails" id="finedetails" value="1">1. Below 14years by Parent</br>
         <input type="radio" name="fineDetails" id="finedetails" value="2">2. Above 14years by Child</br>          
         <input type="radio" name="fineDetails" id="finedetails" value="3">3. Above 14years by Parent</br>         
        </td>
       
      </tr>
      
      <tr>        
        <th>
          Date of next hearing:
          
        </th>
        <td>
          <s:textfield name="dateOfNextHearing" id="datepicker1" theme="simple"  />
          
        </td>
        
      </tr>
      <tr>
        
        <th>
          Observations:
          
        </th>
        <td>
          <textarea name="observations" rows=2 cols=30 name="observations"></textarea>
          
        </td>
      </tr>
      <tr>
          <td colspan="2"> <s:submit value="SUBMIT" align="center"/></td>
      </tr>
      </table>
    </div>    

                <br/><br/><br/><br/><br/><br/><br/><br/>
</s:form>

<div id="search-div">
<h3>View Analytical Reports </h3>
<%--
<form id="searchForm">
    <input type="hidden" name="formName" value="te_form"/>
    <input type='hidden' name='criteria' value='name'/>
<p>Name:<input name='name' type="text"> <button type="submit">search</button></p>

</form>

<form id="searchForm">
 <input type="hidden" name="formName" value="sce_form"/>
 <input type='hidden' name='criteria' value='te_form'/>
<p>Case No:<input name='name' type="text"> <button type="submit">search</button></p>    

</form>


<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="te_form"/>
  <input type='hidden' name='criteria' value='all'/>
All the records present <button id="all">show</button>
</p>
</form>
--%>
<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="te_form"/>  
  <input type='hidden' name='criteria' value='new_records'/>
 <button id="all">Show New records for entry</button>
</p>
</form>

<p>
    <button id="pieReportButton">Show Current years Juvenile Crime Report(Consolidated)</button>
</p>

<p>
    <button id="barReportButton">Show current years Police Station wise Juvenile Crime report(Consolidated)</button>
</p>

<p>
    <button id="barReportButton1">Show current years District wise Juvenile Crime report(Consolidated)</button>
</p>

</div>

<div id="report-div">
    <span class=close>X</span>
    <canvas id="canvas" height="450" width="500"></canvas>
</div>