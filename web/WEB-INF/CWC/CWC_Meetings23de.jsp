
<%-- 
    Document   : Form23
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 23</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <style>


            span { margin-left:11%;}
            .form23{
                 color:blue;
                background-color: #ccffff;
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }

            #cpCmname{
                border-top-style:none;
                border-left-style:none; 
                border-right-style:none;
                border-bottom-style:double;
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
        <form method="post" action="form23desave" name="form23">
            <div id="one">
                <input type="hidden" name="formName" value="form23"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/> 
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>     
                    <h4>FORM 23<br/>
                        [Rule 19(22)]<br/>
                        APPLICATION FOR SURRENDER OF CHILD<br/>
                    </h4>
                    <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 30%;  margin-right: 30%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                </center>            
                <span style="margin-left:75%">Date<input type="date" id="cpDate" name="cpDate" size="16" class="form23"/></span><br/>
                <span>To</span><br/><br/>
                <span style="margin-left: 16.5%">Child Welfare Committee,</span><br/>
                <span style="margin-left: 16.5%">District<input type="text" id="cpDistrict" name="cpDistrict" size="20" class="form23"/></span><br/><br/>
                <span style="margin-left: 16.5%;word-spacing:4.3px">I/ We<input type="text" id="cpAname" name="cpAname" size="20" class="form23"/>(name of the applicant/s) <input type="text" id="cpRname" name="cpRname" size="20" class="form23"/> (relation  with the child)</span><br/>
                <span style="word-spacing:1px">of <input type="text" id="cpCname" name="cpCname" size="20" class="form23"/> (name of the child), aged <input type="text" id="cpCage" name="cpCage" size="4" class="form23"/>years , intend to surrender <input type="text" id="cpCname2" name="cpCname2" size="15" class="form23"/> name of</span><br/>
                <span>child) before this Child Welfare Committee as<input type="text" id="cpReason" name="cpReason" size="47" class="form23"/>(reason/s for</span><br/>
                <span>surrender).</span><br/>
                <span style="margin-left: 16.5%;word-spacing:8px">I/we am /are fully conscious and making this application before this Child Welfare Committee. I</span><br/>
                <span style="word-spacing:21.8px">have not been forced or unduly influenced by any one to take this decision of</span><br/>
                <span style="word-spacing:3.5px">surrendering <input type="text" id="cpCname3" name="cpCname3" size="18" class="form23"/>(name  of  child). I  shall  have  no  objection  if the child is given in adoption. I</span><br/>
                <span style="word-spacing:3.5px">am fully aware of the consequences of surrendering the child.</span><br/><br/><br/>
                <span style="margin-left: 66%"><b>Full signature of the applicant(s)/</b></span><br/>   
                <span style="margin-left: 54%"><b>Thumb impression (if the CWC deems appropriate)</b></span><br/>
                <span>Name and address.</span><br/>
                <span><input type="text" id="cpNameAddress" name="cpNameAddress" size="18" class="form23"/></span><br/>
                <span style="margin-left: 61%"><b>(Signature of the Chairperson/ member</b></span><br/>
                <span style="margin-left: 59%"><b>Before whom such application is submitted)</b></span><br/> 
                <span style="margin-left: 48%"><b>Committee member/s present:</b><input type="text" id="cpCmname" name="cpCmname" size="25" class="form23"/></span><br/><br/>  
                <span>Date<input type="date" id="cpDate1" name="cpDate1" size="18" class="form23"/></span><br/>
                <span>Time<input type="text" id="cpTime" name="cpTime" size="18" class="form23"/></span><br/>
                <span>Place<input type="text" id="cpPlace" name="cpPlace" size="18" class="form23"/></span><br/><br/>

                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>
    </body>
</html>


