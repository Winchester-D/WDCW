<%-- 
    Document   : showDpoRep
    Created on : 24 Nov, 2014, 4:03:58 PM
    Author     : suresh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
           <s:if test="%{socInv==null}">
   

</s:if>
<s:else>
    <hr/>
        <table border="1">
            <tr><td>Case Number:</td><td><s:property value="socInv.ccNo"/></td></tr>
            <tr><td>Serial Number:</td><td><s:property value="socInv.serialNo"/></td></tr>
            <tr><td>Magistrate Court:</td><td><s:property value="socInv.serialNo"/></td></tr>
            <tr><td>Court Place:</td><td><s:property value="socInv.courtPlace"/></td></tr>
            <tr><td>Offence:</td><td><s:property value="socInv.offence"/></td></tr>
            <tr><td>Offence Name:</td><td><s:property value="socInv.offenName"/></td></tr>
            <tr><td>Offence Father Name:</td><td><s:property value="socInv.offenFatherName"/></td></tr>
            <tr><td>Offence Address:</td><td><s:property value="socInv.offenAddress"/></td></tr>
            <tr><td>Offence Age:</td><td><s:property value="socInv.offenAge"/></td></tr>
            <tr><td>Offence Gender:</td><td><s:property value="socInv.offenGender"/></td></tr>
            <tr><td>Offence Religion:</td><td><s:property value="socInv.offenReligion"/></td></tr>
            <tr><td>Offence Caste:</td><td><s:property value="socInv.offenCaste"/></td></tr>
            
            
            <tr><td>Childhood (facts about infancy):</td><td><s:property value="socInv.offenChildhood"/></td></tr>
            <tr><td>Behaviour and habits(moral, recreational,etc):</td><td><s:property value="socInv.offenBehav"/>
            <tr><td>Temperament(outstanding character and personality traits):</td><td><s:property value="socInv.offenTemperment"/></td></tr>
            <tr><td>Physical and mental history and present condition::</td><td><s:property value="socInv.offenPhyMenHist"/></td></tr>
            
            <tr><td>School record and report of teachers, if available:</td><td><s:property value="socInv.offenSchoolRec"/></td></tr>
            <tr><td>Employment history:</td><td><s:property value="socInv.offenEmpHist"/></td></tr>
            <tr><td>Present occupation and wages(give also conditions of labour, leisure,etc.):</td><td><s:property value="socInv.offenPresOccu"/></td></tr>
            <tr><td>Reports of employer, if any:</td><td><s:property value="socInv.offenEmpRepo"/></td></tr>
            <tr><td>Associates:</td><td><s:property value="socInv.offenAssociates"/></td></tr>
            <tr><td>Contact with social and religious organisations, If any:</td><td><s:property value="socInv.offenSocOrgContact"/></td></tr>
            <tr><td>Home conditions:</td><td><s:property value="socInv.offenHomeCondi"/></td></tr>
            <tr style="text-align: center"><td colspan="2">FAMILY HISTORY</td></tr>
             
            <tr><td>Father:</td><td><s:property value="socInv.offenFather"/></td></tr>
            <tr><td>Mother:</td><td><s:property value="socInv.offenMother"/></td></tr>
            <tr><td>Step-father:</td><td><s:property value="socInv.offenMother"/></td></tr>
            <tr><td>Step-mother:</td><td><s:property value="socInv.offenMother"/></td></tr>
            
            <tr><td>Brothers:</td><td><s:property value="socInv.offenBrothers"/></td></tr>
            <tr><td>Sisters:</td><td><s:property value="socInv.offenSisters"/></td></tr>
            <tr><td>Wife:</td><td><s:property value="socInv.offenWife"/></td></tr>
            <tr><td>Children:</td><td><s:property value="socInv.offenChildren"/></td></tr>
            <tr><td>Other interested relations if any:</td><td><s:property value="socInv.offenIntrRel"/></td></tr>
            <tr><td>Any social agencies, institutions <br/>or individuals interested in the family:</td><td><s:property value="socInv.offenInstFamIntrest"/></td></tr>
            <tr><td>Reports of parents and relations:</td><td><s:property value="socInv.offenParentRepo"/></td></tr>
            <tr><td>Attitude of family towards offender<br/> and extent of its influence on offender:</td><td><s:property value="socInv.offenFamAtti"/></td></tr>
            <tr><td>Report of neihbours:</td><td><s:property value="socInv.offenNeiRepo"/></td></tr>
            <tr><td>Home surrounding and general outlook:</td><td><s:property value="socInv.offenHomeSurr"/></td></tr>
            <tr style="text-align: center"><td colspan="2">LEGAL HISTORY</td></tr>
            <tr><td>Previous Institutional record, if any:</td><td><s:property value="socInv.offenPrevInstRec"/></td></tr>
            <tr><td>Statement of the present offense and<br/> circumstances in which it was committed:</td><td><s:property value="socInv.offenStatement"/></td></tr>
            <tr><td>Offenders own reaction to the offense and<br/> his attitude towards possible punishments:</td><td><s:property value="socInv.offenReactAtti"/></td></tr>
            <tr><td>Summery of investigation (give assets):</td><td><s:property value="socInv.offenAssets"/></td></tr>
            <tr><td>Summery of investigation (give liabilities):</td><td><s:property value="socInv.offenLiabilities"/></td></tr>
            <tr><td>Remarks of the D.P.O including <br/>recommendation regarding probation:</td><td><s:property value="socInv.dpoRemarks"/></td></tr>
            <tr><td>Name and address of the District<br/> Probation officer:</td><td><s:property value="socInv.dpoNameAddr"/></td></tr>
            <tr><td>Station of the District<br/> Probation officer:</td><td><s:property value="socInv.dpoStation"/></td></tr>
            <tr><td>Nature of disposal of the case:</td><td><s:property value="socInv.disposalNature"/></td></tr>
            <tr><td>Date of disposal of the case:</td><td><s:property value="socInv.disposalDate"/></td></tr>
        </table>
        <br/><br/>
</s:else>
    </body>
</html>
