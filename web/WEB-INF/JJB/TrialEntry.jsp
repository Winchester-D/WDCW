<form name="te_form" id="te_form" class="formDesign">
    <input type="hidden" name="formName" value="te_form"/>
<fieldset>  
    <table>
      <!--col width=45*>
      <col width=52*>
      <col width=45*>
      <col width=48*>
      <col width=66*-->
      <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>TRIAL ENTRY FORM</p>
      </caption>

      <tr>        
        <th>
       Cases Scheduled for Today:
        </th>

    <td>
     <select>
      <option value="-1" selected>---please select---</option>       
      <option>caseno-1234 </option>
      <option >caseno-1323</option>
      <option >caseno-3426</option>
    </select>
     </td>
      </tr>

      <tr>        
        
        
        <th>
          Trail no:
        </th>
        <td>
          
            <input type=text name="trailno" size=20 >
          
        </td>
      </tr>
      <tr>        
        <th>
          Name of the juvenile:
        </th>
        <td>
          <input type=text name="nameofthejuvenile" size=20>
          
        </td>        
      </tr>
      <tr>
        
        <th>
          Charge/Offence:
          
        </th>
        <td>
          <textarea rows=1 cols=30 name="provisionsForApprehention"></textarea>          
        </td>        
      </tr>

      <tr>
        
        <th>
          Observations:
          
        </th>
        <td>
          <textarea rows=1 cols=30 name="observations"></textarea>          
        </td>        
      </tr>
      
      <tr>
          
           <th>
          Bail:           
        </th>
        <td>
         Yes<input type="radio" name="bail" id="bail" value="yes">
         NO<input type="radio" name="bail" id="bail" value="no">          
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
         <input type="radio" name="bailOptions" id="bailOptions" value="Serious Offence">1. With Security and parental bond</br>
         <input type="radio" name="bailOptions" id="bailOptions" value="Serious Offence">2. Only parental bond</br>          
         <input type="radio" name="bailOptions" id="bailOptions" value="Serious Offence">3. Self bond</br>
         <input type="radio" name="bailOptions" id="bailOptions" value="Serious Offence">4. Under supervision of DPO          
        </td>
        
      </tr>

      <tr id="orderIssuedTr" style="visibility:hidden">  
          
           <th>
          Order issued:           
        </th>
        <td>
         <input type="radio" name="orderIssued" id="orderIssued" value="Safe Custody">1. Safe Custody</br>
         <input type="radio" name="orderIssued" id="orderIssued" value="Safe Custody Extended">2. Safe custody extended</br>          
         <input type="radio" name="orderIssued" id="orderIssued" value="Final Order">3. Final Order</br>         
            
        </td>
       
      </tr>
      
       <tr id="finalOrderTr" style="visibility:hidden">  
          
           <th>
          Final Order:           
        </th>
        <td>
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">1. Advice or admonition</br>
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">2. Counseling (Group or Individual) </br>          
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">3. Community Service</br>         
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">4. Fine</br>
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">5. Release on probation under care of parent/ fit person </br>          
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">6. Release on probation under care of fit institution</br>
         <input type="radio" name="finalOrder" id="finalOrder" value="Serious Offence">7. Send to Special home for 3 years</br>
         
            
        </td>
       
      </tr>
      <tr>        
        <th>
          Date of next hearing:
          
        </th>
        <td>
          <input type=text name="dateOfNextHearing" size=20 >
          
        </td>
        
      </tr>
      <tr>
        
        <th>
          Remarks:
          
        </th>
        <td>
          <textarea name="remarks" rows=1 cols=20 name="remark"></textarea>
          
        </td>
      </tr>
      </table>
    </div>
    <table cellpadding="10">
        <tr>
        <td><a href="#" id="referTrial">Refer Trial History</a></td>
        <td><a href="#" id="socialInvestigation">Refer Social Investigation Report</a></td>
        </tr>
    </table>
 
    <table id="trial_history_table" border=1 >
     <tr>
      <th>Trial No</th>
      <th>Date</th>
      <th>Observation</th>
      <th>Order Issued</th>
     </tr>
     
      <tr>
      <td>1</td>
      <td>21/7/2011</td>
      <td><p>Observation details of the first 
       first trial noted on 21/7/2011.Observation details of the first 
       first trial noted on 21/7/2011.
      </p></td>
      <td>Safe custody extended</td>
     </tr>  

     <tr>
      <td>2</td>
      <td>21/8/2011</td>
      <td><p>Observation details of the first 
       first trial noted on 21/8/2011.
       Observation details of the first 
       first trial noted on 21/8/2011.
      </p></td>
      <td>Safe custody extended</td>
     </tr>  

     <tr>
      <td>3</td>
      <td>21/9/2011</td>
      <td><p>Observation details of the first 
       first trial noted on 21/9/2011.
       Observation details of the first 
       first trial noted on 21/9/2011
      </p></td>
      <td>Safe custody extended</td>
     </tr>  


    </table>
  
     

</fieldset> 
    
</form>

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

</div>

<div id="report-div">
    <span class=close>X</span>
    <canvas id="canvas" height="450" width="450"></canvas>
</div>