<%-- 
    Document   : CourtSurrender
    Created on : 17 Nov, 2014, 4:49:33 PM
    Author     : ajay
--%>

<%@taglib  uri="/struts-tags" prefix="s"%>
<%@taglib  uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Court Surrender</title>
        <sx:head/>
        <style>
            /*.textlabel {
                width:180px;
                clear:left;
                text-align:right;
                padding-right:10px;
                margin-left:10px;
                color: black;
                font-family: Monospace;
            }*/

            p{
                margin-left:10px;
                /*font-family: Monospace;*/
            }
            ol.document li
            {
                float: left;
                width: 300px;
                padding: 2px 0px;
                /*font-family: Monospace;*/
            }
            hr { 
                display: block;
                margin-top: 0.25em;
                margin-bottom: 0.25em;
                border-style: solid;
                border-width: 1px;
                width: 300px;
            }

        </style>
    </head>
    <body>
        
<table border="0" width="1050" style="padding: 2em" >
    <caption>
<center> <span style="margin-left:-20%"><img src="images/govt-emblem_pic_nobg.png"/></span></center><br>

 <center><span style="margin-left:-20%"><b>ARREST/COURT SURRENDER FORM</b>
             <hr>
            (Separate Form for each Accused)
     </span></center><br>

 </caption>
</table> 
        <div style="padding-left: 5%;">
        <div id="heading">
          
    
        </div>
        <div>
            <%-- id="CourtSurrenderForm" --%>
            <s:form name="CourtSurrenderForm" id="CourtSurrenderForm" method="post" action="JJBCourtSurrender" class="formDesign" theme="simple">
                <ol>
                    <li>
                        <s:label>District</s:label><%--<s:textfield name="district" id="accu_district"/>--%>
                        <select id="accuDis" name="accu_district">
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
                              </select>
                                  &nbsp;&nbsp;<s:label >P.S* </s:label><%--<s:textfield name="PS" id="police_station"/>--%><s:if test="%{psList==null}"><s:select name="ps" list="{Select P.S}"></s:select></s:if><s:else><s:select name="ps" id="pslist" list="%{psList}"></s:select></s:else><s:label >Date* </s:label><s:textfield id="datepicker" name="accu_date"/>&nbsp;&nbsp;<s:label >FIR No.* </s:label><s:if test="%{firList==null}"><s:select name="firNo" list="{'Select Fir No'}"></s:select></s:if><s:else><s:select name="firNo" id="firno" list="%{firList}"></s:select></s:else><br/><br/><s:label>Proceeding/GD No. </s:label><s:textfield name="proceedingGdNo" id="proceeding_gd_no"/><br/><br/>
                        <s:label>Alphanumeric Code of Accused  </s:label><s:textfield name="acodeAccu" id="acode_accu"/><s:label>(Write A1 to A9 for the first 9 persons, B1 for 10th person & so on)</s:label><br/><br/>
                    </li>
                    <li>
                    <s:label>Date, Time and Place of Arrest/Surrender : Date* </s:label><s:textfield id="datepicker1" name="accuArrestDate1"/><s:label >Time* : </s:label> <sx:datetimepicker type="time" displayFormat="H:mm" name="accu_arrest_time" id="accu_arrest_time"/><s:label>G D No. : </s:label><s:textfield name="DNo" id="d_no" /><br/><br/>
                    <s:label>Place of Arrest : P.S </s:label><s:textfield name="accuArrestPs" id="accu_arrest_ps"/><s:label> District</s:label><s:textfield name="accuArrestDistrict" id="accu_arrest_district"/><br/><br/>
                    </li>
                    <li>
                        <s:label>Name of the Court (If Surrendered) : </s:label><s:textfield name="accuSurrenderCourt" id="accu_surrender_court"/> <br/><br/>
                    </li>
                    <li>
                    <s:label>Acts and Sections* : </s:label><s:textfield name="accuActsSec" id="accu_acts_sec"/> <br/><br/>
                    </li>
                    <!--<li><p>Arrested and forwarded/Arrested and released on bail or PR bond/Arrested but released on Anticipatory Bail/Arrested and Remanded to Police Custody/Surrenderd in court and Bailed Out/Surrenderd in court and sent to judicial Custody/Surrenderd in Court and Remanded to Police Custody.<br/>(Tick the Applicable portion).</p></li>-->
                    <li><s:label>Arrest Type :</s:label><s:select label="Select" name="accuArrestType" headerKey="" headerValue="Please Select" 
                              list="{'Arrested and forwarded','Arrested and released on bail or PR bond','Arrested but released on Anticipatory Bail','Arrested and Remanded to Police Custody','Surrenderd in court and Bailed Out','Surrenderd in court and sent to judicial Custody','Surrenderd in Court and Remanded to Police Custody'}">
                    </s:select></li>
                    <li>
                        <p>Particulars of the arrested persons :</p>
                        <ol type="i" style="float:auto">
                            <li>
                            <s:label>Name* : </s:label><s:textfield name="accuName" id="accu_name"/><br/><br/>
                            </li>
                            <li>
                            <s:label>Father's/Husband's Name : </s:label><s:textfield name="accuFatherName" id="accu_fathers_name"/><br/><br/>
                            </li>
                            <li>
                            <s:label>First Alias : </s:label><s:textfield name="accuFirstAlias" id="accu_first_alias"/><s:label> Second Alias : </s:label><s:textfield name="accuSecAlias" id="accu_sec_alias"/><br/><br/>
                            </li>
                            <li>
                            <s:label>Nationality : </s:label><s:textfield name="accuNationality" id="acc_nationality"/>
                            </li>
                            <li>
                                <ol class="document" type="a">
                                    <li><s:label>Voter ID. No. : </s:label><s:textfield name="accuVoterIdNo" id ="acc_voter_id"/></li>
                                    <li><s:label>Passport No. : </s:label><s:textfield name="accuPpNo" id="accu_pp_no"/></li>
                                    <li><s:label>Date of Issue : </s:label><s:textfield name="accuPpIssuDate1" class="datepick" id="datepicker2"/></li>
                                    <li><s:label>Place of Issue : </s:label><s:textfield name="accuPpIssuPlace" id="accu_pp_issu_place"/></li>
                                </ol>
                                <br/>
                            </li>
                            <li><s:label>Religion : </s:label><s:textfield name="accuReligion" id="accu_religion"/><br/><br/></li>
                            <li><s:label>Caste/Tribe : </s:label><s:textfield name="accuCaste" id="accu_caste"/><br/><br/></li>
                            <li><s:label>SC/ST/OBC : </s:label><s:textfield name="accuCasteType" id="accu_caste_type"/><br/><br/></li>
                            <li><s:label>Occupation : </s:label><s:textfield name="accuOccu" id="accu_occup"/><br/><br/></li>
                            <li>
                            <s:label>Permanent Address : </s:label><s:textarea name="accuAddress" cols="40" rows="1" id="permanentAddress"></s:textarea><s:label >Dist : </s:label><s:textfield name="accuDistrict" id="accu-district"/><s:label >P.S : </s:label><s:textfield name="accuPs" id="accu-ps"/><br/><br/>
                            </li>
                            <li>
                            <s:label>Present Address : </s:label><s:textfield name="accuPresentAddr" id="presentAddress"/>
                            <s:label>P.S : </s:label><s:textfield name="accuPresentAddrPs" id="present-ps"/>
                            </li>
                        </ol>

                    </li>
                    <li>
                        <p>Injuries, cause of injuries and physical conditions of arrested person (Indicate if medically examined):<p>
                            <s:textarea name="accuInjuries" id="accuInjuries" cols="90" rows="5"></s:textarea>
                    </li>
                    <li>
                        <p>The arrested person, after being informed of the grounds of arrest and his legal rights, was duly taken into custody<br/> on <s:label>Date * </s:label> <s:textfield id="datepicker3"  name="accuCustodyDateTime1"/> (Place) <s:textfield name="accuCustodyPlace" id="accuCustodyPlace"/> at * <sx:datetimepicker type="time" name="custodyTime"/>(Hours). <br/>The following article(s)
                            was/were found on physical search, conducted on the person of the arrested person and was/were taken into possession,<br/>for which a receipt was given to arrested person, If no article found 'NIL' may be indicated.<br/>(1) <s:textfield size="35" name="accuSearchArticle1" id="accuSearchArticle1"/>  (2) <s:textfield name="accuSearchArticle2" id="accuSearchArticle2" size="35"/><br/></p>
                    <p>Necessary wearing apparels were left on the arrest person for the sake of human dignity and body protection.<br/>The arrested was cautioned to keep himself/herself covered for purpose of identification.<br/>Intimation given to Sri/Smt. <s:textfield name="accuIntimationName" id="accuIntimationName"/> relation of <s:textfield name="accuIntimationRelation" id="accuIntimationRelation"/> on (date)* <s:textfield id="datepicker4" name="accuIntimationDateTime1"/> at (hrs)* <sx:datetimepicker type="time" name="intimatedTime"/><p> 
                    </li>
                    <li><span>Physical features deformities and other details of the arrest person.</span> 
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
                                <td align="center" style="width:16%;">
                                    <%--<s:textfield name="accuGender" size="24"></s:textfield>--%>
                                    <s:select name="accuGender" id="accuGender" headerKey="" headerValue="Select" list="#{'M':'Male','F':'Female'}"></s:select>
                                </td>
                                <td align="center" style="width:10%;">
                                    <select name="accuAge1">
                                        <s:iterator var="x" begin="0" end="100">
                                            <option> <s:property default="0" value="%{#x}"/></option>>  
                                        </s:iterator>
                                    </select>
                                <%--<s:textfield name="accuAge1" id="accuAge1" size="24">         
                                </s:textfield>--%>
                                </td>
                                <td style="width:16%;"><s:textfield name="accuBuild" id="accuBuild" size="24"></s:textfield></td>
                                <td style="width:16%;"><s:textfield name="accuHeight" id="accuHeight" size="24"></s:textfield></td>
                                <td style="width:16%;"><s:textfield name="accuComplexion" id="accuComplexion" size="24"></s:textfield></td> 
                                <td style="width:16%;"><s:textfield name="accuIdentMarks" id="accuIdentMarks" size="24"></s:textfield></td>
                            </tr>
                        </table>
                      <div style="width: 80%;">    
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
                            <tr>
                                <td style="width:10%;"><s:textfield name="accuDeformities" id="accuDeformities" size="13"/></td>
                                <td style="width:10%;"><s:textfield name="accuTeeth" id="accuTeeth" size="13"/></td> 
                                <td style="width:10%;"><s:textfield name="accuHair" id="accuHair" size="13"/></td>
                                <td style="width:10%;"><s:textfield name="accuEyes" id="accuEyes" size="13"/></td>
                                <td style="width:10%;"><s:textfield name="accuHabits" id="accuHabits" size="13"/></td> 
                                <td style="width:10%;"><s:textfield name="accuDressHabits" id="accuDressHabits" size="13"/></td>
                                <td style="width:10%;"><s:textfield name="accuLanguage" id="accuLanguage" size="13"/></td>
                                <td>
                                    <table style="width:100%" border="1">
                                        <tr>
                                            <td><s:textfield name="accuBurnMark" id="accuBurnMark" size="5"/></th>
                                            <td><s:textfield name="accuLeucoderma" id="accuLeucoderma" size="5"/></th>
                                            <td><s:textfield name="accuMole" id="accuMole" size="5"/></th>
                                            <td><s:textfield name="accuSear" id="accuSear" size="5"/></th>
                                            <td><s:textfield name="accuTatoo" id="accuTatoo" size="5"/></th>
                                        </tr>
                                    </table>
                                </td>

                            </tr>
                        </table>
                       </div>
                        <p>
                            Other features, if any &nbsp &nbsp <s:textfield size="100" name="accuOtherFeatures" id="accuOtherFeatures"/>
                        </p>

                        </li>
                    <li>
                        <s:label>Whether fingerprints taken : </s:label><s:radio name="accuFpTaken" list="{'Yes','No'}" />
                    </li>
                    <li>
                        <p>Socio-economic profile of the arrest person : </p>
                        <ol type="a">
                            <li>Living Status : <s:select name="accuLivingStat1" id="accuLivingStat1" headerKey="" headerValue="Select" list="#{'01':'Living alone','02':'living with family','03':'living with associate in pucca house','04':'Hotel','05':'Hostel','06':'Katcha house','07':'Thatched house','08':'Slum','09':'Homeless','10':'Harbourer'}">
                                </s:select><br/>
                            </li>
                            <li>Education Qualification(s  <s:textfield size="30" name="accuEduQua"/><br/></li>
                            <li>Occupation <s:textfield size="30" name="accuRealOccu"/><br/></li>
                            <li>Income Group : <s:select name="accuIncomeGroup1" headerKey="" headerValue="Select" list="#{'01':'Economically Weaker Section(Annual Income below Rs.25000/-)','02':'Lower Income(Rs.25001/- to Rs.50000/-)','03':'Lower middle income(Rs.50001/- to Rs.100000/-)','04':'middle income(Rs.100000/- to Rs.200000/-)','05':'Upper middle income(Rs.200000/- to Rs.300000/-)','06':'Upper income(Above Rs.300000/-)'}">
                                </s:select><br/>

                            </li>	
                        </ol>
                    </li>
                    <li>
                        <p>Whether the arrested person,as per observation and police records:</p>
                        <ol type="a">
                            <li>Is Dangerous: <s:radio name ="accuDangerous" list="{'Yes','No'}"/><br/> </li>
                            <li>Previously jumped any bail: <s:radio name ="accuPrevJumpedBail" list="{'Yes','No'}" /><br/></li>
                            <li>Is generally armed: <s:radio name ="accuGenArmed" list="{'Yes','No'}"/><br/></li>
                            <li>Operate with accomplices: <s:radio name ="accuAccomplices" list="{'Yes','No'}" /><br/></li>
                            <li>Is known/listed criminal: <s:radio name ="accuKnownCri" list="{'Yes','No'}" /><br/></li>
                            <li>Is recidivest: <s:radio name ="accuRecividist" list="{'Yes','No'}" /><br/></li>
                            <li>Is likely to jump bail : <s:radio name ="accuLikelyJumpBail" list="{'Yes','No'}" /><br/></li>
                            <li>If released on bail, likely to commit crime or threaten victims/witnesses  : <s:radio name ="accuLikelyThreaten" list="{'Yes','No'}" /><br/></li>
                            <li>Is wanted in any other case: <s:radio name ="accuWantedOtherCase" list="{'Yes','No'}"/><br/></li>
                            <!--<p>If yes against item (b),(e) or (i) give case reference/sections. Attache seperate sheet if required.</p>-->
                        </ol>
                    </li>
                    <li>Name and address of witnesses(At least one witness is necessary)
                        <ol>
                            <li><s:textfield name="nameAddrWitness1" id="nameAddrWitness1" size="60"/><br/><br/></li>
                            <li><s:textfield name="nameAddWitness2" id="nameAddWitness2" size="60"/></li>
                        </ol>
                    </li>

                    <li>
                        <p>Signature of arrested person <span style="float:right;padding-right:50%;">Signature of Investigating Officer</span> </p><br/>
                        <p>Place : <input type="text" name="courtSurrPlace" id="courtSurrPlace"/><span style="float:right;padding-right:50%;">Name : <s:textfield name="ioName" id="ioName"/></span></p><br/>
                        <p>Date* : <s:textfield id="datepicker5" name="courtSurrDate1"/><span style="float:right;padding-right:50%;">Rank : <s:textfield name="ioRank"/></span></p><br/>
                    </li>	
                    </ol>
                       <div align="center"> <s:submit value="Submit"/></div>
                       <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                        </s:form>
                       </div>
                    </div>
        <div id="errorDialog"></div>
        </body>
      </html>