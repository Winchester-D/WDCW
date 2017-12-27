<%-- 
    Document   : CWC_Meetings38_1de
    Created on : 10 Oct, 2017, 4:05:45 PM
    Author     : Rajat Bansal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
            }

            .form382{
                 color:blue;
                background-color: #ccffff;
                border:none;
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

            div#one {
                border-style: solid;
                border-color: black;
            }
        </style>
    </head>
    <body>
        <div id="one">
        <form method="post">
            <table>
                <tr><td>4.b</td><td>No. of toilets (mention with measurement)</td><td><input type="text" name="cpIntlts" id="cpIntlts" class="form382"></td></tr>
                <tr><td>4.c</td><td>No. of Kitchens (mention with measurement)</td><td><input type="text" name="cpInk" id="cpInk" class="form382"></td></tr>
                <tr><td>4.d</td><td>No. of sick room<td><input type="text" name="cpIsrm" id="cpIsrm" class="form382"><br/>
                <tr><td>4.e</td><td><b>Annex -Copy of blue print of the building (authentic sketch</b><br/>
                        <b>plan of building)</b></td><td><input type="File" name="cpIapob" id="cpIapob" class="form382"></tr>
                <tr><td>4.f</td><td>Arrangement to deal with unforeseen disaster also mention the<br/>
                        kind of arrangement made:<br/>
                        <span>  i) &emsp; Fire</span><br/>
                        <span> ii) &nbsp; &nbsp; Earth quake</span><br/>
                        <span> iii) &nbsp;&nbsp; Any other arrangement</span></td><td style="padding-top:3%">
                        <input type="text" name="cpIdfire" id="cpIfire" class="form382"><br/>
                        <input type="text" name="cpIdeqke" id="cpIeqke" class="form382"><br/>
                    <input type="text" name="cpIdoa" id="cpIoa" class="form382"></tr>                                                
                <tr><td>4.g</td><td>Arrangement of Drinking water <b>Annex-Certified from public</b><br/>
                        <b>health engineering (PHE) Department.</b></td><td><input type="File" name="cpIadw" id="cpIadw" class="form382"></td></tr>
                <tr><td>4.h</td><td>Arrangement to maintain sanitation and hygiene:<br/>
                        <span> i. &emsp; Pest Control </span><br/>
                        <span> ii. &nbsp; &nbsp; Waste disposal </span><br/>
                        <span> iii.&nbsp;&nbsp;&nbsp; Storage area </span> <br/>
                        <span> iv. &nbsp;&nbsp; Any other arrangement </span></td>
                    <td><input type="text" name="cpIshpc" id="cpIshpc" class="form382"><br/>
                        <input type="text" name="cpIshwd" id="cpIshwd" class="form382"><br/>
                        <input type="text" name="cpIshsa" id="cpIshsa" class="form382"><br/>
                        <input type="text" name="cpIshoa" id="cpIshoa" class="form382"></td></tr>

                <tr><td>4.i</td><td>Rent agreement/ building maintenance estimate (whichever is<br/>
                        applicable)<b>(Annex- copy of Rent agreement)</b> </td>
                    <td><input type="File" name="cpIara" id="cpIara" class="form382"></td></tr>
                <tr><th>5.</th><th style="border-right:none">Capacity of the Fit Facility</th><td style="border-left:none"></td></tr>
                <tr><th>6.</th><th style="border-right:none">Facilities Available (would depend on the purpose for which recognition as fit facility is<br/>
                        to be given)</th><td style="border-left:none"></td></tr>
                <tr><td>6.a</td><td>Any other facility that shall impact on the overall development of<br/>
                        the child</td><td><input type="text" name="cpFodc" id="cpFodc" class="form382"></td></tr>
                <tr><th>7.</th><th style="border-right:none">Staffing</th><td style="border-left:none"></td></tr>
                <tr><td>7.a</td><td>Detailed staff list</td><td><input type="text" name="cpSdsl" id="cpSdsl" class="form382"></td></tr>
                <tr><td>7.b</td><td>Name of partner organizations</td><td><input type="text" name="cpSpo" id="cpSpo" class="form382"></td></tr>
                <tr><th>8.</th><th style="border-right:none">Background of the Applicant</th><td style="border-left:none"></td></tr>
                <tr><td>8.a</td><td>Major activities of the organization in last two years</td><td><input type="text" name="cpBa2yr" id="cpBa2yr" class="form382"></td></tr>
                <tr><td>8.b</td><td>An updated list of members of the management committee/<br/>
                        governing body in the enclosed format <b>(Annex- resolution of the</b><br/>
                        <b>annual meeting)</b></td><td><input type="File" name="cpBaam" id="cpBaam" class="form382"></td></tr>
                <tr><td>8.c</td><td>List of assets/ infrastructure of the organization</td>
                    <td><input type="text" name="cpBlao" id="cpBlao" class="form382"></td></tr>
                <tr><td>8.d</td><td>If the organization is registered under the Foreign Contribution<br/>
                        (Regulation) Act, 1976 <b>(Annex – certificate of registration)</b></td>
                    <td><input type="File" name="cpBar1" id="cpBar1" class="form382"></td></tr>
                <tr><td>8.e</td><td>Details of foreign contribution received last two years <b>(Annex</b><br/>
                        <b>relevant documents)</b></td>
                    <td><input type="File" name="cpBard" id="cpBard" class="form382"></td></tr>
            </table>
        </form>
            </div>
    </body>
</html>
