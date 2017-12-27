
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>   
        
    <body>
<s:form name="frr_form" id="frr_form"  action="saveRemCaseDiary" heme="css_xhtml">
    <input type="hidden" name="formName" value="frr_form"/>

    

    <div style="text-align: center;">
        
    <input type="hidden" name="formName" value="frr_form"/>
    <input type="hidden" name="sn" id="sn" value=""/>    
<input type="hidden" name="parentIntimationSent" value="N"/>
<input type="hidden" name="dpoIntimated" value="N"/>
<input type="hidden" name="perSubmittedByDpo" value="N"/>
<input type="hidden" name="status" value="ACTIVE"/>

<table border="0" width="1050" style="padding: 2em" align="center">
    <caption>
 <img src="images/govt-emblem_pic_nobg.png"/>
 <p>REMAND CASE DIARY</p>
 <p>Offense U/Sec. 379 I.P.C</p>
 </caption>
    
</table>  
<div style="width: 650px;text-align: center;">
    <table align="left">
        <tr><td style="font-weight: bold">P.S:</td><td><s:property value="cs.fir.firPK.policeStation"/><s:hidden name="policeStation" value="%{cs.fir.firPK.policeStation}"/></td></tr>
        <tr><td>Fir No:</td><td><s:property value="cs.fir.firPK.firNo"/><s:hidden name="firNo" value="%{cs.fir.firPK.firNo}"/></td></tr>
    </table>
    
        <table align="right">
            <tr><td>Date & Time Of Offense</td><td><s:property value="cs.fir.offenceDateTime"/></td></tr>
            <tr><td>Place Of Offense</td><td><s:property value="cs.fir.offencePlaceAddress"/></td></tr>
            <tr><td>Enter Remand Date*</td><td><s:textfield id="datepicker" name="remCDDate" theme="simple"/></td></tr>
    </table>
    </div>
    <br/><br/><br/>
       <table border="1" align="center">
           <tr>
            <td>1.</td>
            <td>Date on which action was taken</td>
            <td><s:property value="cs.accuArrestDate"/><s:hidden name="accId" value="%{cs.accusedId}"/></td>
            
            </tr><tr>
     
        
            <td>2.</td>
            <td>Name of the Complainant</td>
            <td><s:property value="cs.fir.cName"/></td>        
             
             </tr><tr>
             
        
            <td>3.</td>
            <td>Address of the Complainant</td>
            <td><s:property value="cs.fir.cAddress"/></td>        
             
             </tr><tr>
             
                    
            <td>5.</td>
            <td>Name of the Accused/Respondent</td>
            <td><s:property value="cs.accuName"/></td>
           
       </tr><tr>
                    
            <td>6.</td>
            <td>Address of the Accused/Respondent</td>
            <td><s:property value="cs.accuAddress"/></td>
           
       </tr><tr>
        
        
            <td>7.</td>
            <td>Age</td>
            <td><s:property value="cs.accuAge"/></td>        
             
             </tr><tr>
        
            <td>8.</td>
            <td>Date Of Birth Certificate Type</td>
            <td><input type="radio" name="dobCertificateType" value="1"/>Matriculation Certificate<br/>
                           <input type="radio" name="dobCertificateType" value="2"/>Date Of Birth Certificate from School<br/>
                             <input type="radio" name="dobCertificateType" value="3"/>Date Of Birth Certificate from Municipal Corporation <br/>
                             <input type="radio" name="dobCertificateType" value="4"/>Doctor Certificate(Ossification/Age Determination)
            </td>        
             
             </tr><tr>
            <td>9.</td>
            <td>Particulars of the Property loss.</td>
            <td><s:property value="invoPropPaticu"/></td>
            </tr><tr>
            
            
            <td>10.</td>
            <td>Particulars of the Property Recovered</td>
            <td><s:property value="accuSearchArticle1"/><br/><s:property value="accuSearchArticle1"/></td>
        
        </tr><tr>
            <td>11.</td>
            <td >Date of the Previous Case Diary.</td>
            <td >Fir Dated:<s:property value="cs.fir.firDate"/></td>            
            
        </tr><tr>
            <td>12.</td>
            
            <td><b><u> Name of the Witness Examined.</b></u></td><td></td>
            </tr>
            
            <tr>
            <td>&nbsp;&nbsp;</td>
            <td><textarea rows="10" cols="50" name="examinedWitnessDetails"></textarea></td>
            <td></td>
</tr>
        </table><s:submit align="center" value="SAVE"/><br/>
</div>
    
</s:form>

</body>
</html>
<!--
<div id="search-div">
<h3>Search profile by ... </h3>
<form id="searchForm">
    <input type="hidden" name="formName" value="frr_form"/>
    <input type='hidden' name='criteria' value='name'/>
<p>Name:<input name='name' type="text"> <button type="submit">search</button></p>
</form>

<form id="searchForm">
    <input type="hidden" name="formName" value="frr_form"/>
 <input type='hidden' name='criteria' value='caseNo'/>
Case No:<input name='name' type="text"> <button type="submit">search</button>   

</form>


<form id="searchForm">

  <input type='hidden' name='criteria' value='all'/>
  <input type="hidden" name="formName" value="frr_form"/>
 <button id="all">Show All the Records present</button>

</form>

</div>
-->