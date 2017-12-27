<%-- 
    Document   : Form 39
    Created on : Sep 19, 2017, 5:17:39 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 39</title>
        <style>



            span
            {
                margin-left: 11%;

            }
            .form39
            {
                color:blue;
                background-color: #ccffff;
                border-top-style:none;
                border-left-style:none;
                border-right-style: none;
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
        <form method="post" action="form39desave" name="form39">
            <div id="one">
                <input type="hidden" name="formName" value="form39"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center><h4>FORM 39<br/>
                        [Rule 27(4)]<br/>
                        CERTIFICATE OF RECOGNITION OF FIT FACILITY INCLUDING GROUP FOSTER CARE</h4></center>
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 11%;  margin-right: 11%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span style="margin-left:18.9%;word-spacing: 2px">After perusal of the documents and on the basis of an inspection of the Institution conducted</span><br>
                <span style="word-spacing:1.6px">on<input type="text" name="on39" id="on39" class="form39" size="9" >the<input type="text" class="form39" size="9" name="inst39" id="inst39">(Name of the Institution) is recognized as a Fit Facility under Section 51 of</span><br>
                <span style="word-spacing:2px">the Juvenile Justice (Care and Protection of Children) Act, 2015 with effect from<input type="text" class="form39" size="7" name="from39" id="from39">for a period of</span><br>
                <span><input type="text" class="form39" size="2" name="period39" id="period39">years.</span><br><br>
                <span style="margin-left:16.5%;word-spacing: 3.7px">The Facility shall remain bound to follow the Juvenile Justice (Care and Protection of Children)</span><br>   
                <span style="word-spacing: 4.4px">Act, 2015, the Juvenile Justice (Care and Protection of Children) Rules, 2016 and regulations framed</span><br>
                <span>by the appropriate Government from time to time.</span><br><br>
                <span style="margin-left:16.5%;word-spacing:6.6px">The Facility shall remain bound to comply with the orders passed by the Juvenile Justice</span><br>
                <span>Board or the Child Welfare Committee from time to time.</span><br><br>
                <span style="margin-left:12%">Dated this<input type="text" class="form39" size="15" name="date139" id="date139">day of<input type="text" class="form39" size="15" name="day139" id="day139">20<input type="text" class="form39" size="12" name="year139" id="year139"></span><br><br><br>
                <h5><span style="margin-left: 76%">(Signature)</span><br>
                    <span style="margin-left: 80.5%">(Seal)</span></h5><br>
                <span style="margin-left:12%">Dated this<input type="text" class="form39" size="10" name="date239" id="date239">day of<input type="text" class="form39" size="10" name="day239" id="day239">20<input type="text" class="form39" size="10" name="year239" id="year239"></span><br><br>
                <h5><span style="margin-left: 80.3%">(Signature)</span><br>
                    <span style="margin-left: 17%">Chairperson, Child Welfare Committee / Principal Magistrate, Juvenile Justice Board</span><br></h5>
                <br><br><br>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>            
        </form>
    </body>
</html>
