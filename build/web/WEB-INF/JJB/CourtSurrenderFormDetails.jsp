<%-- 
    Document   : CourtSurrenderFormDetails
    Created on : 2 Dec, 2014, 5:19:08 PM
    Author     : ajay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="float: left;" id="formContent">
            <table style="width: 100%;" border="1">
                    <tr> 
                        <%--<s:label >P.S* <%--<s:textfield name="PS" id="police_station"/><s:if test="%{psList==null}"><s:select name="ps" list="{Select P.S}"></s:select></s:if><s:else><s:select name="ps" list="%{psList}"></s:select></s:else><s:label >Date* <s:textfield id="datepicker" name="accu_date"/>&nbsp;&nbsp;<s:label >FIR No.* <s:if test="%{firList==null}"><s:select name="firNo" list="{'Select Fir No'}"></s:select></s:if><s:else><s:select name="firNo" list="%{firList}"></s:select></s:else><br/><br/>Proceeding/GD No. <s:textfield name="proceedingGdNo" id="proceeding_gd_no"/><br/><br/>--%>
                        <td>Alphanumeric Code of Accused</td>
                        <td><s:property value="courtSurrender.acodeAccu"/></td>
                    </tr>
                    <tr>
                        <td>Date of Arrest/Surrender : Date* </td><td><s:date name="courtSurrender.accuArrestDate"/></td>
                    </tr>
                    <tr>
                     <td>Proceeding/GD No. 
                    </td><td><s:property value="courtSurrender.proceedingGdNo"/></td>
                    </tr>
                    <tr>
                        <td>Place of Arrest : P.S </td><td><s:property value="courtSurrender.accuArrestPs" /></td>
                    </tr>
                    <tr>
                        <td> District</td>
                        <td><s:property value="courtSurrender.accuArrestDistrict"/></td>
                    </tr>
                    <tr>
                        <td>Name of the Court (If Surrendered) :</td><td><s:property value="courtSurrender.accuSurrenderCourt"/></td>
                    </tr>
                    <tr>
                        <td>Acts and Sections* : </td><td><s:property value="courtSurrender.accuActsSec"/></td>
                    </tr>
                    <!--<li><p>Arrested and forwarded/Arrested and released on bail or PR bond/Arrested but released on Anticipatory Bail/Arrested and Remanded to Police Custody/Surrenderd in court and Bailed Out/Surrenderd in court and sent to judicial Custody/Surrenderd in Court and Remanded to Police Custody.<br/>(Tick the Applicable portion).</p></li>-->
                    <tr><td>Arrest Type :</td><td><s:property value="courtSurrender.accuArrestType"/></td></tr>
                    <tr><th colspan="2">Particulars of the arrested persons </th></tr>
                        <!--<ol type="i" style="float:auto">-->
                            <tr>
                                <td>Name* : </td><td><s:property value="courtSurrender.accuName"/></td>
                            </tr>
                            <tr>
                                <td>Father's/Husband's Name : </td><td><s:property value="courtSurrender.accuFatherName"/></td>
                            </tr>
                            <tr>
                                <td>First Alias : </td><td><s:property value="courtSurrender.accuFirstAlias"/></td>
                            </tr>
                            <tr>
                                <td> Second Alias : </td><td><s:property value="courtSurrender.accuSecAlias"/></td>
                            </tr>
                            <tr>
                                    <td>Nationality : </td><td><s:property value="courtSurrender.accuNationality"/></td>
                            </tr>
                            <tr>
                                    <td>Voter ID. No. : </td><td><s:property value="courtSurrender.accuVoterIdNo"/></td>   
                            </tr>
                            <tr>
                                <td>Passport No. : </td><td><s:property value="courtSurrender.accuPpNo"/></td>
                            </tr>
                            <tr>
                                <td>Date of Issue : </td><td><s:date name="courtSurrender.accuPpIssuDate"/></td>
                            </tr>
                            <tr>
                                <td>Place of Issue : </td><td><s:property value="courtSurrender.accuPpIssuPlace"/></td>
                            </tr>
                            <tr><td>Religion : </td><td><s:property value="courtSurrender.accuReligion"/></td></tr>
                            <tr><td>Caste/Tribe : </td><td><s:property value="courtSurrender.accuCaste" /></td></tr>
                            <tr><td>SC/ST/OBC : </td><td><s:property value="courtSurrender.accuCasteType"/></td></tr>
                            <tr><td>Occupation : </td><td><s:property value="courtSurrender.accuOccu"/></td></tr>
                            <tr>
                            <td>Permanent Address : </td>
                            <td><s:property value="courtSurrender.accuAddress"/></td>
                            </tr>
                            <tr>
                            <td>Dist : </td>
                            <td><s:property value="courtSurrender.accuDistrict"/></td>
                            </tr>
                            <tr>
                            <td>P.S : </td>
                            <td><s:property value="courtSurrender.accuPs"/></td>
                            </tr>
                            <tr>
                                <td>Present Address : </td><td><s:property value="courtSurrender.accuPresentAddr"/></td>
                            </tr>
                            <tr>
                                <td>P.S : </td><td><s:property value="courtSurrender.accuPresentAddrPs"/></td>
                            </tr>
                        <!--</ol>-->
                    <tr>
                        <td><p>Injuries, cause of injuries and physical conditions of arrested person (Indicate if medically examined):<p></td>
                        <td><s:property value="courtSurrender.accuInjuries"/></td>
                    </tr>
                    <tr>
                        <td colspan="2"><p>The arrested person, after being informed of the grounds of arrest and his legal rights, was duly taken into custody<br/> on Date * <s:date name="courtSurrender.accuCustodyDateTime" format="dd/MM/yyyy"/>(Place) <s:property value="courtSurrender.accuCustodyPlace"/>The following article(s)
                        was/were found on physical search, conducted on the person of the arrested person and was/were taken into possession,<br/>for which a receipt was given to arrested person, If no article found 'NIL' may be indicated.(1) <s:property value="courtSurrender.accuSearchArticle1"/> (2) <s:property value="courtSurrender.accuSearchArticle2"/></p>
                            <p>Necessary wearing apparels were left on the arrest person for the sake of human dignity and body protection.<br/>The arrested was cautioned to keep himself/herself covered for purpose of identification.<br/>Intimation given to Sri/Smt. <s:property value="courtSurrender.accuIntimationName"/> relation of <s:property value="courtSurrender.accuIntimationRelation"/> on (date)* <s:date name="courtSurrender.accuIntimationDateTime"/></p></td> 
                    </tr>
               </table>
                    <div><span>Physical features deformities and other details of the arrest person.</span></div> 
                        <table style="width:100%;" border="1">
                            <tr>
                                <th style="width:16%;">Sex</th>
                                <th style="width:16%;">Date Year of Birth(Age)*</th> 
                                <th style="width:16%;">Build</th>
                                <th style="width:16%;">Height(cms)</th>
                                <th style="width:16%;">Complexion</th>
                                <th style="width:16%;">Identification Marks</th>
                            </tr>
                            <tr>
                                <th style="width:16%;">1</th>
                                <th style="width:16%;">2</th> 
                                <th style="width:16%;">3</th>
                                <th style="width:16%;">4</th>
                                <th style="width:16%;">5</th>
                                <th style="width:16%;">6</th>
                            </tr>
                            <tr>
                                <td style="width:16%;">
                                    <s:property value="courtSurrender.accuGender"/>
                                </td>
                                <td style="width:16%;">                                
                                    <s:property value="%{Age}"/>         
                                </td>
                                <td style="width:16%;"><s:property value="courtSurrender.accuBuild" /></td>
                                <td style="width:16%;"><s:property value="courtSurrender.accuHeight"/></td>
                                <td style="width:16%;"><s:property value="courtSurrender.accuComplexion"/></td> 
                                <td style="width:16%;"><s:property value="courtSurrender.accuIdentMarks" /></td>
                            </tr>
                        </table>
                      <div style="width: 100%;">    
                          <table border="1">
                            <tr>
                                <th style="width:10%;">Deformities Peculiarities </th>
                                <th style="width:10%;">Teeth</th> 
                                <th style="width:10%;">Hair</th>
                                <th style="width:10%;">Eyes</th>
                                <th style="width:10%;">Habit(s)</th>
                                <th style="width:10%;">Dress Habits</th>
                                <th style="width:10%;">Language/Dialect</th>
                                <th colspan="5">
                            <table border="1">
                                <tr>
                                    <th colspan="5" style="text-align:center;">Place of</th>

                                </tr>
                                <tr>
                                    <th style="width:20%;">Burn Mark</th>
                                    <th style="width:20%;">Leuco derma</th> 
                                    <th style="width:20%;">Mole</th>
                                    <th style="width:20%;">Sear</th>
                                    <th style="width:20%;">tattoo</th>
                                </tr>	
                            </table>						    	
                            </th>
                            </tr>
                            <tr>
                                <th style="width:10%;">7</th>
                                <th style="width:10%;">8</th> 
                                <th style="width:10%;">9</th>
                                <th style="width:10%;">10</th>
                                <th style="width:10%;">11</th>
                                <th style="width:10%;">12</th>
                                <th style="width:10%;">13</th> 
                                <th>
                            <table style="width:100%" border="1">
                                <tr rowspan="2">
                                    <th style="width:15%;">14</th>
                                    <th style="width:15%;">15</th>
                                    <th style="width:15%;">16</th>
                                    <th style="width:15%;">17</th>
                                    <th style="width:15%;">18</th>
                                </tr>
                            </table> 
                            </th>
                            </tr>
                            <tr style="height: 15%;">
                                <td style="width:10%;"><s:property value="courtSurrender.accuDeformities" /></td>
                                <td style="width:10%;"><s:property value="courtSurrender.accuTeeth"/></td> 
                                <td style="width:10%;"><s:property value="courtSurrender.accuHair"/></td>
                                <td style="width:10%;"><s:property value="courtSurrender.accuEyes"/></td>
                                <td style="width:10%;"><s:property value="courtSurrender.accuHabits"/></td> 
                                <td style="width:10%;"><s:property value="courtSurrender.accuDressHabits" /></td>
                                <td style="width:10%;"><s:property value="courtSurrender.accuLanguage"/></td>
                                <td>
                                    <table style="width:100%" border="1">
                                        <tr>
                                            <td style="width:10%;"><s:property value="courtSurrender.accuBurnMark"/></td>
                                            <td style="width:10%;"><s:property value="courtSurrender.accuLeucoderma"/></td>
                                            <td style="width:10%;"><s:property value="courtSurrender.accuMole" /></td>
                                            <td style="width:10%;"><s:property value="courtSurrender.accuSear" /></td>
                                            <td style="width:10%;"><s:property value="courtSurrender.accuTatoo"/></td>
                                        </tr>
                                    </table>
                                </td>

                            </tr>
                        </table>
                       </div>
                      <table style="width: 100%;" border="1">                  
                        <tr>
                            <td>Other features, if any</td><td><s:property value="courtSurrender.accuOtherFeatures"/></td>
                        </tr>
                    <tr>
                        <td>Whether fingerprints taken : </td><td><s:property value="courtSurrender.accuFpTaken"/></td>
                    </tr>
                    <tr>
                        <td>Socio-economic profile of the arrest person : </td>
                    </tr>
                    <tr>
                        <td>Living Status :</td> <td><s:property value="LivingStatus"/></td>
                    </tr>
                    <tr>
                        <td>Education Qualification(s </td> <td><s:property value="courtSurrender.accuEduQua"/></td><br/>
                    </tr>
                    <tr>
                        <td>Occupation </td><td><s:property  value="courtSurrender.accuRealOccu"/></td><br/>
                    </tr>
                    <tr>
                        <td>Income Group : </td><td><s:property value="IncomeGroup"/></td>
                    </tr>
                    <tr>
                        <th colspan="2">Whether the arrested person,as per observation and police records</th>
                    </tr>    
                   <tr>
                       <td>Is Dangerous: </td>
                       <td><s:property value ="courtSurrender.accuDangerous"/></td>
                   </tr>
                   <tr>
                    <td>Previously jumped any bail: </td>
                    <td><s:property value="courtSurrender.accuPrevJumpedBail"/></td>
                    </tr>
                     <tr>
                         <td>Is generally armed: </td>
                         <td><s:property value ="courtSurrender.accuGenArmed"/></td>
                     </tr>
                            <tr>
                                <td>Operate with accomplices: </td>
                                <td><s:property value ="courtSurrender.accuAccomplices"/></td>
                            </tr>
                            <tr>
                                <td>Is known/listed criminal: </td>
                                <td><s:property value ="courtSurrender.accuKnownCri"/></td>
                            </tr>
                            <tr>
                                <td>Is recidivest: </td>
                                <td><s:property value ="courtSurrender.accuRecividist"/></td>
                            </tr>
                            <tr>
                                <td>Is likely to jump bail : </td>
                                <td><s:property value="courtSurrender.accuLikelyJumpBail"/></td>
                            </tr>
                            <tr>
                                <td>If released on bail, likely to commit crime or threaten victims/witnesses :</td>
                                <td> <s:property value="courtSurrender.accuLikelyThreaten"/></td>
                            </tr>
                            <tr>
                                <td>Is wanted in any other case:</td>
                                <td><s:property value ="courtSurrender.accuWantedOtherCase"/></td>
                            </tr>
                        
                        <tr>
                            <td>Name and address of witnesses 1(At least one witness is necessary)</td>
                            <td><s:property value="courtSurrender.nameAddrWitness1"/></td>
                        </tr>
                        <tr>
                            <td>Name and address of witnesses 2(At least one witness is necessary)</td>
                            <td><s:property value="courtSurrender.nameAddWitness2"/></td>
                        </tr>
                    </table>  
                    <li>
                        <p>Signature of arrested person <span style="float:right;padding-right:50%;">Signature of Investigating Officer</span> </p><br/>
                        <p>Place : <s:property value="courtSurrender.courtSurrPlace"/><span style="float:right;padding-right:50%;">Name : <s:property value="courtSurrender.ioName"/></span></p><br/>
                        <p>Date* : <s:date name="courtSurrender.courtSurrDate"/><span style="float:right;padding-right:50%;">Rank : <s:property value="courtSurrender.ioRank"/></span></p><br/>
                    </li>
                
        </div>
    </body>
</html>
