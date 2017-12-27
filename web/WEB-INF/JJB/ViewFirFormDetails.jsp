<%-- 
    Document   : ViewFirFormDetails
    Created on : 3 Dec, 2014, 5:08:49 PM
    Author     : ajay
--%>
<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Fir Details</title>
    </head>
    <body>
        <h1>Fir Informtion</h1>
        <div>
            <table border="1">
                <tr>
                    <td>District </td><td><s:property value="firForm.district"/></td>
                </tr>
                <tr>
                    <td>Fir No </td><td><s:property value="firForm.firPK.firNo"/></td>
                </tr>
                <tr>
                    <td>Police Station(PS) </td><td><s:property value="firForm.firPK.policeStation"/></td>
                </tr>
                <tr>
                    <td>Fir Date </td><td><s:date name="firForm.firDate"/></td>
                </tr>     
                <tr>
                    <td>Act-1 </td><td><s:property value="firForm.act1"/></td>
                </tr>
                <tr>
                    <td>Section-1 </td><td><s:property value="firForm.section1"/></td>
                </tr>
                <tr>
                    <td>Act-2 </td><td><s:property value="firForm.act2"/></td>
                </tr>
                <tr>
                    <td>Section-2</td><td><s:property value="firForm.section2"/></td>
                </tr>
                <tr>
                    <td>Act-3 </td><td><s:property value="firForm.act3"/></td>
                </tr>
                <tr>
                    <td>Section-3</td><td><s:property value="firForm.section3"/></td>
                </tr>
                <tr>
                    <td>Other Acts And Sections</td><td><s:property value="firForm.otherActSec"/></td>
                </tr>
                <tr>
                    <td>Occurrence of Offence </td><td><s:date name="firForm.offenceDateTime"/></td>
                </tr>
                <tr>
                    <td>Information received at P.S </td><td><s:date name="firForm.psInfoRecDate"/></td>
                </tr>
                <tr>
                    <td>General Dairy Reference: Entry No(s)</td><td><s:property value="firForm.genDairyRefEntryNo"/></td>
                </tr>
                <tr>
                    <td>General Dairy Reference Time </td><td><s:date name="firForm.genDairyRefTime"/></td>
                </tr>
                <tr>
                    <td>Type of information</td><td><s:property value="firForm.typeOfInfo"/></td>
                </tr>
                <tr>
                    <td>Place of occurrence:(a)Direction and Distance from P.S</td><td><s:property value="firForm.offencePlacePsDist"/></td>
                </tr>
                <tr>
                    <td>Beat No </td><td><s:property value="firForm.offencePlaceBeatNo"/></td>
                </tr>
                <tr>
                    <td>Address</td><td><s:property value="firForm.offencePlaceAddress"/></td>
                </tr>
                
                <tr>
                    <td>In case outside limit of this police station,then the name of the P.S</td><td><s:property value="firForm.outsideLimitPs"/></td>
                </tr>
                <tr>
                    <td>District</td><td><s:property value="firForm.outsideLimitPsDistrict"/></td>
                </tr>
                <tr>
                    <td colspan="2">Complainant / Information</td>
                </tr>
                <tr>
                    <td>Name</td><td><s:property value="firForm.cName"/></td>
                </tr>
                <tr>
                    <td>Father's/Husband's Name</td><td><s:property value="firForm.cFatherName"/></td>
                </tr>
                <tr>
                    <td>Date Of Birth</td><td><s:date name="firForm.cDob"/></td>
                </tr>
                
                <tr>
                    <td>Age</td><td><s:property value="firForm.cAge"/></td>
                </tr>
                <tr>
                    <td>Nationality</td><td><s:date name="firForm.cNationality"/></td>
                </tr>
                <tr>
                    <td>Passport No </td><td><s:property value="firForm.cPpNo"/></td>
                </tr>
            
                <tr>
                    <td>Date of Issue</td><td><s:date name="firForm.cPpDate"/></td>
                </tr>
                <tr>
                    <td>Place of Issue</td><td><s:property value="firForm.cPpIssuePlace"/></td>
                </tr>
            
                <tr>
                    <td>Occupation </td><td><s:property value="firForm.cOccu"/></td>
                </tr>
                <tr>
                    <td>Address </td><td><s:property value="firForm.cAddress"/></td>
                </tr>
                <tr>
                    <td>Details of known/suspected/unknown/accused with full particulars </td><td><s:property value="firForm.suspectDetails"/></td>
                </tr>
                <tr>
                    <td>Reasons for delay in reporting by the complainant/Informant </td><td><s:property value="firForm.cRepoDelayRea"/></td>
                </tr>
                <tr>
                    <td>Particulars of properties stolen/involved:</td><td><s:property value="firForm.invoPropPaticu"/></td>
                </tr>
                <tr>
                    <td>Total value of properties stole / involved</td><td><s:property value="firForm.invoPropTotVal"/></td>
                </tr>
                <tr>
                    <td>Inquest report /U.D. Case No., if any </td><td><s:property value="firForm.udCaseNo"/></td>
                </tr>
                <tr>
                    <td>F.I.R contents</td><td><s:property value="firForm.firContents"/></td>
                </tr>
                
                <tr>
                    <td>Action taken:Since the above report reveals commission of offence(s) u/s as mentioned at Item No.2.,<br/> registered the case and took up the investigation/ direction </td><td><s:property value="firForm.ioName"/></td>
                </tr>
                <tr>
                    <td>IO Rank </td><td><s:property value="firForm.ioRank"/></td>
                </tr>
                <tr>
                    <td>SJPU </td><td><s:property value="firForm.ioSjpu"/></td>
                </tr>
                
                <tr>
                    <td>Investigation transferred to P.S</td><td><s:property value="firForm.transferredPs"/></td>
                </tr>
                <tr>
                    <td colspan="2">F.I.R. read over to the complainant / Informant, admitted to be correctly recorded and copy given to the Complainant / Informant free of cost. </td>
                </tr>
                
                <tr>
                    <td>Officer-in-charge Name</td><td><s:property value="firForm.inchargeName"/></td>
                </tr>
                <tr>
                    <td>Officer-in-charge Rank</td><td><s:property value="firForm.inchargeRank"/></td>
                </tr>
                <tr>
                    <td>Officer-in-charge No</td><td><s:property value="firForm.inchargeNo"/></td>
                </tr>
                
                <tr>
                    <td>Date And Time of despatch to the court </td><td><s:date name="firForm.courtDispachDateTime"/></td>
                </tr>
            </table>
                <br/><br/>
        </div>
    </body>
</html>
