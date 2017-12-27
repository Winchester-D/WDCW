

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

    <div id="formWrapper" >
        <!--div class="curl"></div-->
        <%--<s:form name="firForm" id="firForm" class="formDesign" action="fir_form_action">--%>
        <s:form name="firForm" id="firForm" class="formDesign" action="fir_form_action">
    <input type="hidden" name="formName" value="frr_form"/>
    <input type="hidden" name="sn" id="sn" value=""/>    
<input type="hidden" name="parentIntimationSent" value="N"/>
<input type="hidden" name="dpoIntimated" value="N"/>
<input type="hidden" name="perSubmittedByDpo" value="N"/>
<input type="hidden" name="status" value="ACTIVE"/>

<table border="0" width="1050" style="padding: 2em" >
    <caption>
<center> <span style="margin-left:-20%"><img src="images/govt-emblem_pic_nobg.png"/></span></center><br>
 <center><span style="margin-left:-20%"><b>FORM-IF1-(Integrated Form)</b></span></center><br>
 <center><span style="margin-left:-20%"><b>FIRST INFORMATION REPORT</b></span></center><br>
 <center><span style="margin-left:-20%"><b>(Under Section 154 Cr.P.C)</b></span></center><br>
 </caption>
</table>  

        
<span style="margin-left:6%">1.&emsp;*Dist <select id="district" name="district">
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
    </select>&emsp;*P.S<s:textfield name="fir_police_station" id="fir_police_station" size="10" />
     &emsp;*F.I.R No<s:textfield name="fir_fir_No" id="fir_fir_no" size="10" />
     &emsp; *Date<s:textfield name="fir_fir_date" id="datepicker" size="10" /></span><br><br>
     
     
     <span style="margin-left:6%">2.&emsp;(i)&emsp;*Act<s:textfield name="act1" id="fir_act1" size="30" />&emsp;
        *Sections<s:textfield name="section1" id="fir_section1" size="30" /></span><br><br>

        
    <span style="margin-left:8.9%">(ii)&emsp;Act<s:textfield name="act2" id="fir_act2" size="30" />&emsp;
    &emsp;  Sections<s:textfield name="section2" id="fir_section2" size="30" /></span><br><br>   

    <span style="margin-left:8.9%">(iii)&emsp;ActAct<s:textfield name="act3" id="fir_act3" size="30" />&emsp;
    &emsp;  Sections<s:textfield name="section3" id="fir_section3" size="30" /></span><br><br>   

    <span style="margin-left:8.9%">(iv)&emsp;Other Acts And Sections<s:textfield name="otherActSec" id="fir_other_act_sec" size="60" /></span><br><br>   

    <span style="margin-left:6%">3.&emsp;(a)&emsp;Occurrence of Offence:&emsp;*Date<s:textfield name="fir_offence_date" id="datepicker1" size="20" />
        &emsp;*Time<sx:datetimepicker type="time" name="fir_offence_time" id="fir_offence_time"/></span><br><br>      
          
          
        <span style="margin-left:9%">(b)&emsp;Information received at P.S&emsp;*Date<s:textfield name="fir_ps_info_rec_date" id="datepicker2" size="20" />&emsp;
         *Time<sx:datetimepicker type="time" name="fir_ps_info_rec_time" id="fir_ps_info_rec_time"/></span><br><br>      
          
         <span style="margin-left:9%">(c)&emsp;General Dairy Reference:&emsp;*Entry No(s)<s:textfield name="genDairyRefEntryNo" id="fir_gen_dairy_ref_entry_no" size="20" />
         &emsp; *Time<sx:datetimepicker type="time" name="fir_gen_dairy_ref_time" id="fir_gen_dairy_ref_time"/></span>  <br><br>
         
        <span style="margin-left:6%">4.&emsp;Type of information:<s:textfield name="typeOfInfo" id="fir_type_of_info" size="20" /></span><br><br> 
          
        <span style="margin-left:6%">5.&emsp;Place of occurrence:&emsp;(a)Direction and Distance from P.S&emsp;<s:textfield name="offencePlacePsDist" id="fir_offence_place_ps_dist" size="15" />
        &emsp;Beat No<s:textfield name="offencePlaceBeatNo" id="fir_offence_place_beat_no" size="15" /></span> <br><br>
        
        <span style="margin-left:9%">(b).&emsp;*Address&emsp;<s:textfield name="offencePlaceAddress" id="fir_offence_place_address" size="60" /></span><br><br>
        <span style="margin-left:9%">(c).&emsp;In case outside limit of this police station,&emsp;then the name of the P.S&emsp;<s:textfield name="outsideLimitPs" id="fir_outside_limit_ps" size="20" /></span><br><br>  
        <span style="margin-left:9%">District<s:textfield name="outsideLimitPsDistrict" id="fir_outside_limit_ps_district" size="10" /></span><br><br>  
          
        <span style="margin-left:6%">6.&emsp;Complainant / Information</span><br><br>  
        
        <span style="margin-left:9%">(a)&emsp;*Name<s:textfield name="cName" id="fir_c_name"/></span><br><br>  
        
        <span style="margin-left:9%">(b)&emsp;Father's/Husband's Name<s:textfield name="cFatherName" id="fir_c_father_name" size="20" /></span><br><br> 
        
        <span style="margin-left:9%">(c)&emsp;Date Of Birth<s:textfield name="fir_c_dob" id="datepicker3" size="20" />&emsp;Age<s:textfield name="cAge" id="fir_c_age" size="5" />
        </span><br><br>
        
        <span style="margin-left:9%">(d)&emsp;Nationality <s:textfield name="cNationality" id="fir_c_nationality" type="text" size="15" /></span><br><br>
       
        <span style="margin-left:9%">(e)&emsp;Passport No:<s:textfield name="cPpNo" id="fir_c_pp_no" />&emsp;Date of Issue:<s:textfield name="fir_c_pp_date" id="datepicker4" size="10" />
        &emsp;Place of Issue:<s:textfield name="cPpIssuePlace" id="fir_c_pp_issue_place" size="10" /></span><br><br>
        
        <span style="margin-left:9%">(f)&emsp;Occupation:<s:textfield name="cOccu" id="fir_c_occu" size="50" /></span><br><br>
        
        <span style="margin-left:9%">(g)&emsp;Address:<s:textfield name="cAddress" id="fir_c_address" size="50" /></span><br><br>
        
        <span style="margin-left:6%">7.&emsp;Details of known/suspected/unknown/accused with full particulars</span><br><br>
        <span style="margin-left:9%">(Attach separate sheet if necessary):</span><br><br>
        <span style="margin-left:9%"><s:textfield name="suspectDetails" id="fir_suspect_details" size="50" /></span><br><br>   
        
        <span style="margin-left:6%">8.&emsp;Reasons for delay in reporting by the complainant/Informant</span><br><br>
        
        <span style="margin-left:9%"><s:textfield name="cRepoDelayRea" id="fir_c_repo_delay_rea" size="50" /></span><br><br> 
        
        <span style="margin-left:6%">9.&emsp;Particulars of properties stolen/involved(Attach separate sheet if necessary):</span><br><br>
        
        <span style="margin-left:9%"><s:textfield name="invoPropPaticu" id="fir_invo_prop_paticu" size="50" /></span><br><br> 
        
        
        <span style="margin-left:6%">10.&emsp;Total value of properties stole / involved <s:textfield name="invoPropTotVal" id="fir_invo_prop_tot_val" size="10"/></span><br><br>
        
        <span style="margin-left:6%">11.&emsp;Inquest report /U.D. Case No., if any &emsp;<s:textfield name="udCaseNo" id="fir_ud_case_no" size="50"/></span><br><br>
        
        <span style="margin-left:6%">12.&emsp;F.I.R contents (Attach separate sheets, if required):</span><br><br>
        
        <span style="margin-left:8%">&emsp;<s:textarea name="firContents" id="fir_fir_contents"   cols="50"  rows="5"/></span><br><br>
        
        <span style="margin-left:6%">13.&emsp;Action taken:Since the above report reveals commission of offence(s) u/s as mentioned at Item No.</span><br><br>
        
        <span style="margin-left:10%">2., registered the case and took up the investigation/ direction.<s:textfield name="ioName" id="fir_io_name" size="20"/>&emsp;Rank&emsp; <s:textfield name="ioRank" id="fir_io_rank" size="5"/></span><br><br>
        
        <span style="margin-left:10%">under SJPU <s:textfield name="ioSjpu" id="fir_io_sjpu" size="20"/> to take up the investigation transferred to P.S. <s:textfield name="transferredPs" id="fir_transferred_ps" size="20"/></span><br><br>
        
        <span style="margin-left:10%">F.I.R. read over to the complainant / Informant, admitted to be correctly recorded and copy given to </span><br><br>
        
        <span style="margin-left:10%">the Complainant / Informant free of cost.</span><br><br>
        
        <span style="margin-left:10%">Signature of the Officer-in-charge, Police Station</span><br><br>
        
        <span style="margin-left:10%">*Name <s:textfield name="inchargeName" id="fir_incharge_name" size="20"/></span><br><br>
        <span style="margin-left:10%">Rank:<s:textfield name="inchargeRank" id="fir_incharge_rank" size="20"/> No<s:textfield name="inchargeNo" id="fir_incharge_no" size="20"/></span><br><br>
        
        <span style="margin-left:6%">14.&emsp;Signature /Thumb-impression of the complainant / informant</span><br><br>
             
        <span style="margin-left:6%">15.&emsp;*Date of despatch to the court:<s:textfield name="fir_court_dispach_date" id="datepicker5" size="15"/>&emsp;
            *Time of despatch to the court:<sx:datetimepicker type="time" name="fir_court_dispach_time" id="fir_court_dispach_time"/></span><br><br>     
             
             
        <span style="margin-left:10%"><input type="submit" id="fir_form_submit" value="submit" align="center"/></span><br><br>     

            <br/><br/>
</s:form>

</div>
        
        <%--
    <div id="errorDialog"></div>

<div id="search-div">
<h3 style="margin-left:7%">Search profile by ... </h3>
<form id="searchForm">
    <input type="hidden" name="formName" value="frr_form"/>
    <input type='hidden' name='criteria' value='name'/>
<p style="margin-left: 7%">Name:<input name='name' type="text"> <button type="submit">search</button></p>
</form>

<form id="searchForm">
    <input type="hidden" name="formName" value="frr_form"/>
 <input type='hidden' name='criteria' value='caseNo'/>
<p style="margin-left: 5%">Case No:<input name='name' type="text"> <button type="submit">search</button></p>   

</form>


<form id="searchForm">

  <input type='hidden' name='criteria' value='all'/>
  <input type="hidden" name="formName" value="frr_form" />
 <button id="all" style="margin-left:13%">Show All the Records present</button>

</form>
<div id="msgDialog"></div>
</div>
        --%>
</html>