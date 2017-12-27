<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="/struts-dojo-tags" prefix="sx"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head><title>Preliminary Enquiry Form</title></head>
<body>
<!--a href="#" id="alternatePER" style="float:right">Alternative Form</a-->
<s:form id="prel_form" name="prel_form" class="formDesign" action="savePrelEnq"> 
  
       <s:hidden name="formName" value="prel_form"/>
        <input type="hidden" name="sn" id="sn" value=""/>

       <table id='per_table' border="0" width="85%" style="float:right">
 <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>FORM-VI</p>
 <p>PRELIMINARY ENQUIRIES</p>
 <p>(Under rules 16 and 28(1) of the Andhra Pradesh Probation of Offenders Rules)</p>
 </caption>
 
 
 <tr colspan="4">
 <th width="">Serial No./Inward No* </th>
         <td width=""><input name="serialNo" id="serialNo" type="text" size="20" /></td> 
 </tr>
 
 <tr>
 <th width=""> In the court*</th>
         <td width=""><input name="magistrateCourt" id="magistrateCourt" type="text" size="40" /></td>
         <td width="">of the Magistrate,*</td>
         <td width=""><input name="courtPlace" id="courtPlace" type="text" size="20" /></td>
 </tr>
 
 <tr>
 
        
         
     <th width="">district*:</th><td>
         
         
      <select name="courtDistrict" id="courtDistrict">
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
      
    </select></td>
         <td width=""></td>
 </tr>
 
 <tr>
 <th>Case No.*</th>
 <td><input name="ccNo" id="ccNo" type="text" size="40" VALUE='<s:property value="sirName"/>'/><td> 

 </tr>
   
 <tr>
 <th>Offense*:</th>
 <td><input name="offence" id="offence" type="text" size="40"/><td>   
 </tr>
 
 <tr>
 
 <th>(Police Station)*</th>
 <td><input name="policeStation" id="policeStation" type="text" size="" /><td> 
 <th>Crime No.*</th>
 <td><input name="crimeNumber" id="crimeNumber"type="text" size="" /><td> 
 </tr>
 
 </table>
  
  <table>
 
 <tr>
 <th>Name of offender*</th>
 <td><input name="offenName" id="offenName" type="text" size=""/><td> 
 <th>Son of</th>
 <td><input name="offenFatherName" id="offenFatherName" type="text" size="" /><td>  
 </tr>
 
 <tr>
 <th>Address</th>
 <td>
	<textarea name="offenAddress" id="offenAddress" cols="30" rows="5"></textarea> 
 </td>
 </tr>
 
 <tr>
 <th>Age</th>
 
	<td><input name="offenAge" id="offenAge" size="5" type="text"/><td> 
	
 </tr>
 
 <tr>
 <th>Sex</th>
 
	<td><input name="offenGender" id="offenGender" type="text" size="" /><td> 
	<td>Religion<input name="offenReligion" id="offenReligion" type="text" size="" /></td>
	<td>Caste<input name="offenCaste" id="offenCaste" type="text" size="" /><td>  
 
 </tr>
 
 </table>
 <hr/>
 <table>
 <caption>
 PERSONAL HISTORY
 </caption>
 
<tr>
 <th>Childhood (facts about infancy)</th>
 <th>:</th>
 <td><input name="offenChildhood" id="offenChildhood" type="text" size="50" /><td> 
</tr>
 
 <tr>
 <th>Behaviour and habits(moral, recreational,etc)</th>
 <th>:</th>
 <td><input name="offenBehav" id="offenBehav" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Temperament(outstanding character and personality traits)</th>
 <th>:</th>
 <td><input name="offenTemperment" id="offenTemperment" type="text" size="50" /><td> 
</tr>
 
 <tr>
 <th>Physical and mental history and present condition:</th>
 <th>:</th>
 <td><textarea name="offenPhyMenHist" id="offenPhyMenHist" cols="50" rows="7"></textarea><td> 
</tr>
 </table>
 
 <hr/>

 <table>
 <caption>
 EXTERNAL INFLUENCES
 </caption>
 
 <tr>
 <th>School record and report of teachers, if available</th>
 <th>:</th>
 <td><textarea name="offenSchoolRec" id="offenSchoolRec" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Employment history</th>
 <th>:</th>
 <td><input name="offenEmpHist" id="offenEmpHist" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Present occupation and wages(give also conditions of labour, leisure,etc.)</th>
 <th>:</th>
 <td><input name="offenPresOccu" id="offenPresOccu" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Reports of employer, if any</th>
 <th>:</th>
 <td><input name="offenEmpRepo"  id="offenEmpRepo" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Associates</th>
 <th>:</th>
 <td><textarea name="offenAssociates" id="offenAssociates" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
      <th>Contact with social and religious organisations, If any</th>
      <th>:</th>
        <td><textarea name="offenSocOrgContact" id="offenSocOrgContact" cols="50" rows="5"></textarea></td>
</tr>

<tr>
 <th>Home conditions</th>
 <th>:</th>
 <td><textarea name="offenHomeCondi" id="offenHomeCondi" cols="50" rows="5"></textarea></td> 
</tr>
 </table>
 

 
 <hr/>
 <table>
 <caption>
 FAMILY HISTORY
 </caption>
 
 <tr>
 <th>Father</th>
 <th>:</th>
 <td><textarea name="offenFather" id="offenFather" cols="50" rows="5"></textarea><td> 
</tr>

 <tr>
 <th>Mother</th>
 <th>:</th>
 <td><textarea name="offenMother" id="offenMother" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Step-father</th>
 <th>:</th>
 <td><input name="offenStepFather" id="offenStepFather" type="text" size="50" /><td> 
</tr>

 <tr>
 <th>Step-mother</th>
 <th>:</th>
 <td><input name="offenStepMother" id="offenStepMother" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Brothers</th>
 <th>:</th>
 <td><textarea name="offenBrothers" id="offenBrothers" cols="50" rows="5"></textarea><td> 
</tr>

 <tr>
 <th>Sisters</th>
 <th>:</th>
 <td><textarea name="offenSisters" id="offenSisters" cols="50" rows="5"></textarea></td> 
</tr>

<tr>
 <th>Wife</th>
 <th>:</th>
 <td><input name="offenWife" id="offenWife" type="text" size="50" /><td> 
</tr>

 <tr>
 <th>Children</th>
 <th>:</th>
 <td><input name="offenChildren" id="offenChildren" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Other interested relations if any</th>
 <th>:</th>
 <td><input name="offenIntrRel" id="offenIntrRel" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Any social agencies, institutions or individuals interested in the family</th>
 <th>:</th>
 <td><textarea name="offenInstFamIntrest" id="offenInstFamIntrest" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Reports of parents and relations</th>
 <th>:</th>
 <td><textarea name="offenParentRepo" id="offenParentRepo" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Attitude of family towards offender and extent of its influence on offender</th>
 <th>:</th>
 <td><textarea name="offenFamAtti" id="offenFamAtti" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Report of neihbours</th>
 <th>:</th>
 <td><textarea name="offenNeiRepo" id="offenNeiRepo" cols="50" rows="5"></textarea><td> 
</tr>

<tr>
 <th>Home surrounding and general outlook</th>
 <th>:</th>
 <td><textarea name="offenHomeSurr" id="offenHomeSurr" cols="50" rows="5"></textarea><td> 
</tr>
  </table>


  <hr/>



  <table>
 <caption>
 LEGAL HISTORY
 </caption>

 
 
 <tr>
 <th>Previous Institutional record, if any</th>
 <th>:</th>
 <td><input name="offenPrevInstRec" id="offenPrevInstRec" type="text"  /></td> 
</tr>

<tr>
 <th><p>Statement of the present offense and circumstances in which it was committed</p></th>
 <th>:</th>
 <td><textarea name="offenStatement" id="offenStatement" cols="30" rows="7"></textarea></td> 
</tr>

<tr>
 <th>Offenders own reaction to the offense and his attitude towards possible punishments</th>
 <th>:</th>
 <td><textarea name="offenReactAtti" id="offenReactAtti" cols="50" rows="7"></textarea></td> 
</tr>

     <tr>
      <th>Summery of investigation (give assets and liabilities)</th>
      <th>:</th>
        <td></td>
      </tr>
    <tr>
      <th>Assest:</th>
      <th></th>
        <th>Liabilities:</th>
   </tr>
    <tr>
      <th><textarea name="offenAssets" id="offenAssets" cols="30" rows="7"></textarea></th>
      <th></th>
        <th><textarea name="offenLiabilities" id="offenLiabilities" cols="30" rows="7"></textarea></th>
      </tr>
    <tr>

<tr>
 <th>Remarks of the D.P.O including recommendation regarding probation</th>
 <th>:</th> 
<td><textarea name="dpoRemarks" id="dpoRemarks" cols="50" rows="7"></textarea></td> 
</tr>

<tr>
 <th>Name and address of the District Probation officer</th>
 <th>:</th> 
 <td><textarea name="dpoNameAddr" id="dpoNameAddr"></textarea></td> 
</tr>

<tr>
 <th>STATION</th>
 <th>:</th>
 <td><input name="dpoStation" id="dpoStation" type="text" size="50" /></td>
</tr>

  </table>
  
  <hr/>
  
  <table>
  
 <tr>
 <th>Nature of disposal of the case</th>
 <th>:</th>
 <td><input name="disposalNature" id="disposalNature" type="text" size="50" /><td> 
</tr>

<tr>
 <th>Date of disposal</th>
 <th>:</th>
 <td><input name="disDate" id="datepicker" type="text" size="50" /><td> 
</tr>
</table>
  <s:submit value="SAVE"  align="center"/>
</s:form>

<div id="search-div">
<h3>Search profile by ... </h3>
<form id="searchForm">
    <input type="hidden" name="formName" value="penr_form"/>
    <input type='hidden' name='criteria' value='name'/>
<p>Name:<input name='name' type="text"> <button type="submit">search</button></p>

</form>

<form id="searchForm">
 <input type="hidden" name="formName" value="penr_form"/>
 <input type='hidden' name='criteria' value='caseNo'/>
<p>Calender Case No:<input name='name' type="text"> <button type="submit">search</button></p>    

</form>


<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="penr_form"/>
  <input type='hidden' name='criteria' value='all'/>
 <button id="all">Show All the records present</button>
</p>
</form>

<form id="searchForm">
<p>
  <input type="hidden" name="formName" value="penr_form"/>  
  <input type='hidden' name='criteria' value='new_records'/>
 <button id="all">Show New records for entry</button>
</p>
</form>

</div>
</body>
</html>