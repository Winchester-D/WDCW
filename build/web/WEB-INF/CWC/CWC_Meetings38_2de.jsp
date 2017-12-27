<%-- 
    Document   : CWC_Meetings38_2de
    Created on : 11 Oct, 2017, 5:41:27 PM
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


            #cpIoname{      
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style:dotted;
                border-bottom-color:black;
            }
            .form383{
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
                <tr><td>8.f</td><td style="width:70%;">List of other sources of grant- in – aid funding (if any )with the<br/>
                        name of the scheme / project , purpose amount, etc. (separately)</td><td><input type="text" name="cpBaaf" id="cpBaaf" class="form383 "></td></tr>
                <tr><td>8.g</td><td>Details of existing bank account of the agency indicating branch<br/>
                        code account no.</td><td><input type="text" name="cpBba" id="cpBba" class="form383"/></td></tr>
                <tr><td>8.h</td><td>Whether the agency agrees to open a separate bank account for<br/>
                        the grant proposed</td><td><input type="text" name="cpBaba" id="cpBaba" class="form383"/></td></tr><br/>
                <tr><td>8.i</td><td><b>Annex -Photocopy of Accounts of last three years:</b><br/>
                        <span><b>i. &emsp; Auditors report</b></span><br/>
                        <span><b>ii. &emsp; Income and</b></span><br/>
                        <span><b> &emsp;&emsp;expenditure account</span></b><br/>
                        <span><b>iii.&nbsp;&nbsp;&nbsp; Receipt and payment</span></b><br/>
                        <span><b> &emsp;&emsp; account</b></span><br/>
                        <span><b> iv.&nbsp;&nbsp;&nbsp; Balance sheet of the</b></span><br/>
                        <span style="padding-left:4%"><b>  &emsp;&emsp; organization.</b></span></td>
                    <td style='padding-top: .1%'><input type="File" name="cpBar" id="cpBar" class="form383"/><br/>
                        <input type="File" name="cpBiea" id="cpBiea" class="form383"/><br/>
                        <input type="File" name="cpBrpa" id="cpBrpa" class="form383"/><br/>
                        <input type="File" name="cpBbso" id="cpBbso" class="form383"/></td></tr>

            </table><br/>

            <span style="margin-left: 5.5%;word-spacing:18px">I have read and understood The Juvenile Justice (Care and Protection of Children Act), 2015; and</span><br/>
            <span style="word-spacing:3px">the Juvenile Justice (Care and Protection of Children) Rules, 2016.</span><br/>
            <span style="margin-left: 5.5%;word-spacing:32px"> <input type="text" name="cpIoname" id="cpIoname" />(Name of the Organization / Institution) has complied with all the</span><br/>
            <span style="word-spacing:17px">requirements to be granted recognition as a Fit Facility under the Juvenile Justice (Care and Protection of</span><br/>
            <span>Children) Act, 2015 and the Juvenile Justice (Care and Protection of Children) Rules, 2016.</span><br/>
            <span style="margin-left:5.5%;word-spacing:21px">I declare that no person associated with the organization has been previously convicted or has</span><br/>
            <span style="word-spacing:6px;word-spacing:14px">been involved in any immoral act or in any act of child abuse or employment of child labor or an offense</span><br/>
            <span style="word-spacing:8.1px;word-spacing:18px">involving moral turpitude and that the organization has not been blacklisted by the Central or the State</span><br/>
            <span>Government at any point of time.</span><br/><br/><br/>
            <span style="margin-left:5.5%;word-spacing:15px">I undertake to abide by all the conditions laid down by the Central/ State Act, Rules, Guidelines and</span><br/>
            <span>Notifications in this regard.</span><br/>
            <span  style="margin-left:5.5%;word-spacing:19px">I undertake to abide by the orders passed by the Juvenile Justice Board or the Child Welfare</span><br/>
            <span>Committee from time to time.</span><br/><br/>
            <span>Signature of the authorized signatory: ……………………………</span><br/>
            <span>Name:<span><br/>
                    <span>Designation:</span><br/>
                    <span>Address:</span><br/>
                    <span>District:</span><br/>
                    <span>Date:</span><br/>
                    <span>Office stamp:</span><br/>
                    <span>Signature of:</span><br/>
                    <span>Witness no.1: …………………………….</span><br/>
                    <span>Witness no.2: ………………………………</span><br/><br/>
                    <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
                    </form>
            </div>
                    </body>
                    </html>
