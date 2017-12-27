<%-- 
    Document   : Form21
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 21</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <style>


            span { margin-left:9%;}
            .form21{
                 color:blue;
                background-color: #ccffff;
                border-top-style:none;
                border-left-style:none; 
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
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
        <br/>

        <br><br>
        <form method="post" action="form21desave" name="form21">
            <div id="one">
                <input type="hidden" name="formName" value="form21"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile_id</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 21<br/>
                        [Rule 19(3)]<br/>
                        ORDER FOR SOCIAL INVESTIGATION REPORT OF CHILD IN NEED OF CARE AND PROTECTION<br/>
                    </h4>
                </center>              
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 9%;  margin-right: 9%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span>To</span><br/><br/>
                <span style="margin-left: 16.5%;word-spacing:15px">Child Welfare Officer/ Social Worker/Case Worker/ Person in-charge of Home/ representative of</span><br/>
                <span>Non- Governmental Organization</span><br/><br/>
                <span style="margin-left: 16.5%;word-spacing:10px">Whereas report under section 31 (2) of the Juvenile Justice (Care and Protection of Children) Act,</span><br/>
                <span style="word-spacing:10px">2015 has been received from<input type="text" id="cpActName" name="cpActName" size="20" class="form21">in respect  of (name of the child)<input type="text" id="cpCname" name="cpCname" size="20" class="form21">aged</span><br/>
                <span style="word-spacing:20px">(approximate)<input type="text" id="cpAge" name="cpAge" size="10" class="form21">son/daughter of<input type="text" id="cpGname" name="cpGname" class="form21">residing at<input type="text" id="cpAddress" name="cpAddress" class="form21">who has been</span><br/>
                <span style="word-spacing:12px">produced before the Committee under section 31 of the Juvenile Justice (Care and Protection of Children)</span><br/>
                <span>Act, 2015.</span><br/><br/>
                <span style="margin-left: 16.5%;word-spacing:8px">You are hereby directed to conduct Social Investigation as per Form 22 for the above child. You are</span><br/>
                <span>directed to enquire into socio economic and family background of the said child.</span><br/>
                <span style="margin-left: 16.5%;word-spacing:4px">You are directed to submit the Social Investigation Report on or before<input type="date" id="cpDate" name="cpDate" size="27" class="form21">(date).</span><br/><br/>
                <span>Dated this<input type="text" id="cpDay" name="cpDay" size="16" class="form21">day of <input type="text" id="cpMon" name="cpMon" size="16" class="form21">20<input type="text" id="cpYr" name="cpYr" size="16" class="form21"></span><br/><br/>                   
                <h5><span style="margin-left: 82%">(Signature)</span><br/>
                    <span style="margin-left: 75.2%">Chairperson/ Member</span><br/> 
                    <span style="margin-left: 72.5%">Child Welfare Committee</span><h5/><br/><br/>  


                    <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>
    </body>
</html>
