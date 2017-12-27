<%-- 
    Document   : CWC_Meetings26de
    Created on : 6 Dec, 2017, 4:02:55 PM
    Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>



            span
            {
                margin-left: 11%;

            }
            .form
            {
                 color:blue;
                background-color: #ccffff;
                border-top-style:none;
                border-left-style:none;
                border-right-style: none;
                border-bottom-style:dotted;
                border-bottom-color:black;
            }
            #name
            {
                border-top-style:none;
                border-left-style:none;
                border-bottom-style:dotted;
                border-bottom-color:black;
            }



            .button {
                background-color: #4CAF50; /* Green */
                border: none;
                color: white;
                padding: 12px 32px;
                text-align: center;
                text-decoration: none;
                display: inline-block;
                font-size: 16px;
                margin: 4px 2px;
                -webkit-transition-duration: 0.4s; /* Safari */
                transition-duration: 0.4s;
                cursor: pointer;
            }

            .button1 {
                background-color: white; 
                color: black; 
                border: 2px solid #4CAF50;
            }

            .button1:hover {
                background-color: #4CAF50;
                color: white;
            }

            .button2 {
                background-color: white; 
                color: black; 
                border: 2px solid #008CBA;
            }

            .button2:hover {
                background-color: #008CBA;
                color: white;
            }

            div.one {
                border-style: solid;
                border-color: black;
            }

            #form_detail  { margin-left: 18%;
                            border:1px solid black;}
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
            </style>
        </head>
        <body>

            <br>
            <form method="post" action="form26desave" name="form26">
                <div class="one"><br>
                <input type="hidden" name="formName" value="form26"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                    <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                        <center><img src="images/govt.png" height="80" width="80"></center>
                        <center><h4>FORM 26<br/>
                                [Rule 20(1)]<br/>
                                CASE MONITORING SHEET FOR COMMITTEE<br/>
                                CASE MONITORING SHEET<br/>
                                (Separate Sheet may be used in case there are more than one child)<br/>
                                Child Welfare Committee, District……………… </h4></center>
                        <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 30%;  margin-right: 30%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>


                        <span style="margin-left:8%">Case No.<input type="text" name="cwCase" id="cwCase" class="form">of<input type="text" name="cwOf" id="cwOf" class="form"></span><br>
                        <br>
                        <span style="margin-left:8%">Case Name:</span>
                        <br><br>

                        <table id="form_detail" style="margin-left: 6%">

                            <tr>

                                <td width="450" height="65">Police Station<input type="text" name="cwPolice" id="cwPolice" class="form"><br>

                                    U/S<input type="text" name="cwUs" id="cwUs" class="form">   </td>

                                <td width="427" height="65">Date<input type="date" name="cwDate" id="cwDate" class="form"><br>


                                    FIR/ GD/ DD No<input type="text" name="cwFir" id="cwFir" class="form">    </td>

                            </tr>   

                            <tr>

                                <td width="400" height="65">Name of Probation Officer<input type="text" name="cwOfficer" id="cwOfficer" class="form"></td>

                                <td width="400" height="65">Name of IO<input type="text" name="cwIo" id="cwIo" class="form"> </td>

                            </tr>


                        </table>

                        <br>

                        <table id="form_detail" style="margin-left: 6%">

                            <tr>

                                <th colspan="4" width="800" height="45"><center>PARTICULARS OF CHILD</center></th>

                            </tr>

                            <tr>

                                <th  width="220" height="45" >Name</th>
                                <th  width="220" height="45" >Parents/ Guardian with<br>Contact No.</th> 
                                <th  width="220" height="45" >Present address</th>
                                <th  width="220" height="45" >Permanent address</th>
                            </tr>

                            <tr>

                                <td width="220" height="75"></td>
                                <td width="220" height="75"></td>
                                <td width="220" height="75"></td>
                                <td width="220" height="75"></td>
                            </tr>

                        </table>

                        <br>

                        <table id="form_detail" style="margin-left: 6%">

                            <tr>
                                <th width="880" height="55">DATE AND TIME CHILD PRODUCED BEFORE THE COMMITTEE<br>
                                    DATE AND TIME OF FIRST PRODUCTION   </th>
                            </tr>

                            <tr>

                                <th width="880" height="35">DATE OF MEDICAL EXAMINATION UNDER SECTION 54 Cr.P.C. (if any)</th>

                            </tr>

                            <tr>

                                <td width="880" height="200"><center style="margin-top:-1%"><b>AGE DETERMINATION</b></center><br><br>
                            Age on the Date of offense<br><br>
                            Date of age Determination<br><br>
                            Time taken for age determination<br><br>
                            Determination by <span style="margin-left: 29%">Committee</span><br><br>
                            Evidence Relied: <span style="margin-left: 29%">Documents </span><span style="margin-left: 27%">Medical</span>
                            </td>


                            </tr>


                        </table>

                        <br>

                        <table id="form_detail" style="margin-left: 6%">

                            <tr>

                                <th colspan="2" width="880" height="45"><center>PLACEMENT OF THE CHILD</center></th>

                            </tr> 

                            <tr>

                                <td width="430" height="65">In Children’s Home</td>
                                <td width="450" height="65">Sent under supervision<br>
                                    (Name of Institution)</td>

                            </tr>

                            <tr>

                                <td width="430" height="65">From<input type="date" name="cwFro" id="cwFro" class="form">To<input type="date" name="cwT" id="cwT" class="form"></td>
                                <td width="450" height="65"></td>
                            </tr>

                        </table>

                        <br>

                        <center><span><b>PROGRESS OF ENQUIRY</b></span></center>
                        <center><span>(Time schedule for disposal of the case to be fixed on the first day of hearing)</span></center>
                        <br>

                        <table id="form_detail" style="margin-left: 6%">

                            <tr>

                                <td height="25" width="500"><center>Steps to be taken</center></td>
                            <td height="25" width="185"><center>Scheduled Date</center></td>
                            <td height="25" width="185"><center>Actual Date</center></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Age determination</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro1" id="cwFro1" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Social Investigation Report (Form No.22)</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro2" id="cwFro2" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Submission of Report on Provisions of further investigation, if any</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro3" id="cwFro3" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="480">Statement of Child</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro4" id="cwFro4" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Individual Care Plan (In case of child in institutional care Individual<br>Care Plan should be prepared within one month of admittance</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro5" id="cwFro5" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Dispositional (Final) Order</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro6" id="cwFro6" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                            <tr>

                                <td height="25" width="500">Post Dispositional Review</td>
                                <td height="25" width="185">Dated<input type="date" name="cwFro7" id="cwFro7" class="form" size="10"></td>
                                <td height="25" width="185"></td>
                            </tr>

                        </table>

                        <br/><br/>

                       <h5> <span style="margin-left:81%">Signed by</span><br>
                        <span style="margin-left:69%">Child Welfare Committee</span></h5>

                        <br><br>

                        <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
                        <br><br>
                    </div>
                </form>
            </body>
        </html>
