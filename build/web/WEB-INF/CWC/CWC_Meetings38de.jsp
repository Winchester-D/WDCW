<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%-- 
    Document   : Form38(1) 
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
<glass fish server error solution>netstat -aon | find ":8080" |find "LISTENING"
-->
<html>
    <head>
        <title>Form 38</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            .form_detail{ 
                border:1px solid black;}
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
            }

            .form381{
                 color:blue;
                background-color: #ccffff;
                border:none;
            }
            span { padding-left:4%; }    
            #p{margin-left:11%}
            #ep{      
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
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

            div#one {
                border-style: solid;
                border-color: black;
            }

        </style>
    </head>
    <body>  
         <div id="one">
    <center>
        <form method="post">
          
            <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
            <center><img src="images/govt.png" height="80" width="80"/></center>
            <h4>FORM 38<br/>
                [Rule 27(2)]<br/>
            APPLICATION FOR FIT FACILITY INCLUDING GROUP FOSTER CARE</h4>
    </center>
    <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 19%;  margin-right: 19%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
    <!-- First Part-->         
    <table>
        <tr><th style="padding-bottom:5%">1.</th><th style="padding-bottom:5%;border-right:none">Detail of Institution/ Agency/ Organization which seeks recognition as fit facility</th><td style="border-left:none"></td></tr>
        <tr><td>1.a</td><td>Name of the Institution /Agency/ Organization</td><td><input type="text" name="cpOname" id="cpOname" class="form381"></td></tr>
        <tr><td>1.b</td><td>Registration number and date of Registration of the Institution/<br/>
                Organization under the relevant Act<br/><br/>
                <b>(Annex- Relevant documents of registration, bye-laws,<br/>
                    memorandum of association)</b></td>
            <td style="padding-top: .1%"> <input type="text" name="cpOrno" id="cpOrno" class="form381"><br/>
                <input type="text" name="cpOrdate" id="cpOrdate" class="form381"><br/><br/>
                <input type="File" name="cpOama" id="cpOama" class="form381"></td></tr>

        <tr><td>1.c</td><td style="width:70%">Complete address of the Applicant/ Institution/ organization</td><td><input type="text" name="cpOaddress" id="cpOaddress" class="form381"></td></tr>
        <tr><td>1.d</td><td>STD code/ Telephone No.</td><td><input type="text" name="cpTel" id="cpTel" class="form381"></td></tr>
        <tr><td>1.e</td><td>STD code Fax No.</td><td><input type="text" name="cpFax" id="cpFax" class="form381"></td></tr>
        <tr><td>1.f</td><td>E-mail address</td><td><input type="text" name="cpEmail" id="cpEmail" class="form381"></td></tr>
        <tr><td>1.g</td><td>Whether the organization is of all India character, if yes, give address<br/>
                of its branches, in other states</td><td><input type="text" name="cpIaddress" id="cpIaddress" class="form381"></td></tr>
        <tr><td>1.h</td><td>If the Institution had been denied recognition earlier? If yes<br/>
                <span> i.&emsp; Reference No. of application leading to denial of recognition </span> <br/>
                <span> ii.&nbsp;&nbsp;&nbsp; Date of denial </span><br/>
                <span> iii.&nbsp;&nbsp; Who had denied the recognition </span><br/>
                <span> iv. &nbsp;&nbsp; Reason for denial of recognition </span> </td><td style="padding-top:2%"><input type="text" name="cpRefno" id="cpRefno" class="form381"><br/>
                <input type="text" name="cpDenial" id="cpDenial" class="form381"><br/>
                <input type="text" name="cpDname" id="cpDname" class="form381"><br/>
                <input type="text" name="cpReason" id="cpReason" class="form381"></td></tr>
        <tr><th>2.</th><th style="border-right:none">Details of the proposed fit facility:</th><td style="border-left:none"></td></tr>
        <tr><td>2.a</td><td>Complete address/ location of proposed Fit Facility</td><td><input type="text" name="cpPaddress" id="cpPaddress" class="form381"></td></tr>
        <tr><td>2.b</td><td>STD code/ telephone no</td><td><input type="text" name="cpPtel" id="cpPtel" class="form381"></td></tr>
        <tr><td>2.c</td><td>STD code fax no</td><td><input type="text" name="cpPfax" id="cpPfax" class="form381"></td></tr>
        <tr><td>2.d</td><td>E-mail</td><td><input type="text" name="cpPemail" id="cpPemail" class="form381"></td></tr>
        <tr><th style="padding-bottom:5%">3.</th><th style="padding-bottom:5%;border-right:none">Connectivity (Name and Distance from the proposed Fit Facility):</th><td style="border-left:none"></td></tr>
        <tr><td>3.a</td><td>Main Road</td><td><input type="text" name="cpCmrd" id="cpCmrd" class="form381"></td></tr>
        <tr><td>3.b</td><td>Bus –stand</td><td><input type="text" name="cpCbstn" id="cpCbstn" class="form381"></td></tr>
        <tr><td>3.c</td><td>Railway Station</td><td><input type="text" name="cpCrstn" id="cpCrstn" class="form381"></td></tr>
        <tr><td>3.d</td><td>Any landmark</td><td><input type="text" name="cpClmrk" id="cplmrk" class="form381"></td></tr>
        <tr><th style="padding-bottom:5%">4.</th><th style="padding-bottom:5%;border-right:none">Infrastructure:</th><td style="border-left:none"></td></tr>
        <tr><td>4.a</td><td>No. of Rooms (Mention with measurement)</td><td><input type="text" name="cpInr" id="cpInr" class="form381"></td></tr>
    </table>
    </div>
</form>
</body>
</html>

