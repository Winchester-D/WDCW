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
        <s:if test="%{epData==null}">
   
</s:if>

<s:else>
<hr/>
        <table border="1">
            <tr><td>Trial Date:</td><td><s:date name="epData.trialDate" format="dd/MM/yyyy"/></td></tr>
            <tr><td>Calender Case Number:</td><td><s:property value="epData.enquiryProcessPK.ccNo"/></td></tr>
            
            
            
            <tr><td>Charge Sheet Filed:</td><td><s:property value="epData.chargeSheetFiled"/></td></tr>
            <tr><td>Case Terminated:</td><td><s:property value="epData.caseTerminated"/></td></tr>
            <tr><td>Terminated Remarks:</td><td><s:property value="epData.terminatedRemarks"/></td></tr>
            
            
            <tr><td>Bail Granted:</td><td><s:property value="epData.bailGranted"/></td></tr>
            <tr><td>Bail Options:</td><td>
                    <s:if test="%{epData.bailOptions==1}">
                        With Security and parental bond
                    </s:if>
                    <s:elseif test="%{epData.bailOptions==2}">
                         Only parental bond
                    </s:elseif>
                    <s:elseif test="%{epData.bailOptions==3}">
                        Self bond
                    </s:elseif>
                    <s:elseif test="%{epData.bailOptions==4}">
                        Under supervision of DPO
                    </s:elseif>
                        <s:else>
                        </s:else>
                   </td></tr>
            <tr><td>Order issued:</td><td>
                    <s:if test="%{epData.orderIssued==1}">
                       Safe Custody
                    </s:if>
                    <s:elseif test="%{epData.orderIssued==2}">
                         Safe custody extended
                    </s:elseif>
                    
                    <s:elseif test="%{epData.orderIssued==3}">
                        Final Order
                    </s:elseif>
                        <s:else>
                        </s:else>
                 
            <tr><td>Safe Custody Details:</td><td>
                    
                     <s:if test="%{epData.orderIssuedDetails==1}">
                       Fit Institution
                    </s:if>
                    <s:elseif test="%{epData.orderIssuedDetails==2}">
                        Observation Home
                    </s:elseif>
                    
                    <s:elseif test="%{epData.orderIssuedDetails==3}">
                       Place Of Safety
                    </s:elseif>
                       <s:else>
                       </s:else>
                   </td></tr>
            <tr><td>Final Order Issued:</td><td>
                     <s:if test="%{epData.finalOrderFineDet==1}">
                       Advice or admonition
                    </s:if>
                    <s:elseif test="%{epData.finalOrderFineDet==2}">
                        Counseling (Group or Individual)
                    </s:elseif>  
                    <s:elseif test="%{epData.finalOrderFineDet==3}">
                        Community Service
                    </s:elseif>
                     <s:elseif test="%{epData.finalOrderFineDet==4}">
                        Fine
                    </s:elseif>
                    <s:elseif test="%{epData.finalOrderFineDet==5}">
                       Release on probation under care of parent/ fit person
                    </s:elseif>
                    <s:elseif test="%{epData.finalOrderFineDet==6}">
                        Release on probation under care of fit institution
                    </s:elseif>
                    <s:elseif test="%{epData.finalOrderFineDet==7}">
                       Send to Special home for 1-3 years/Boston School
                    </s:elseif>
                    <s:elseif test="%{epData.finalOrderFineDet==8}">
                       Termination Under Rule 13(Sub rule 6 & 7)
                    </s:elseif> 
                    <s:else>
                    </s:else>
                   </td></tr>
            <tr><td>Fine Paid Details:</td><td>
                    <s:if test="%{epData.fineDetails==1}">
                       Below 14years by Parent
                    </s:if>
                    <s:elseif test="%{epData.fineDetails==2}">
                        Above 14years by Child
                    </s:elseif>  
                    <s:elseif test="%{epData.fineDetails==3}">
                        Above 14years by Parent
                    </s:elseif>
                    <s:else>
                    </s:else>
                </td></tr>
            
            
            <tr><td>Next Hearing Date:</td><td><s:date  name="epData.nextHearingDate" format="dd/MM/yyyy"/></td></tr>
            <tr><td>Observations:</td><td><s:property value="epData.observations"/></td></tr>
            
            <%--
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
            --%>
        </table>
        <br/><br/>
</s:else>
    </body>
</html>
