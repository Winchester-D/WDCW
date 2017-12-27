<%-- 
    Document   : Form20
    Created on : 15 Sep, 2017, 11:20:26 AM
     Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form20</title>

        <style>

            span
            {
                margin-left: 11%;

            }
            .form20
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

            div#one {
                border-style: solid;
                border-color: black;
            }
        </style>       
    </head>
    <body>     
        <form method="post" action="form20desave" name="form20">
            <div id="one">
                <input type="hidden" name="formName" value="form20"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile_id</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center><h4>FORM 20<br/>
                        [Rule 18(8) and 19 (7)]<br/>
                        UNDERTAKING BY THE PARENT OR GUARDIAN OR ‘FIT PERSON’</h4></center>
                <hr style="display: block; margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 22%;  margin-right: 22%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span style="word-spacing:14px">I <input type="text" name="cpFat" size="18" class="form20">resident of House no<input type="text" name="cpNd" size="18" class="form20" >Street <input type="text" name="cpPs" class="form20" size="18" >  Village/Town</span><br>
                <span style="word-spacing:6.3px"><input type="text" name="cpVil" size="10" class="form20">District <input type="text" name="cpDD" size="10" class="form20">State <input type="text" name="cpSt" size="13" class="form20">do hereby declare that I am willing to take charge of</span><br/>
                <span style="word-spacing:6.3px">(name of the child) <input type="text" name="cpName"  class="form20"> Aged<input type="text" name="cpAge" size="18" class="form20"> under the orders of the Child Welfare</span><br/>
                <span>Committee <input type="text" name="commit" class="form20" size="18" >subject to the following terms and conditions:</span><br><br>     
                <span style="margin-left:14%;word-spacing: 4px">1. If his conduct is unsatisfactory I shall at once inform the Committee.</span><br><br>
                <span style="margin-left:14%;word-spacing: 5px">2. I shall do my best for the welfare and education of the said child as long as he remains in my</span><br>
                <span style="margin-left:15.8%;word-spacing: 2px">charge and shall make proper provision for his maintenance.</span><br><br>
                <span style="margin-left:14%">3. In the event of his/her illness, he shall have proper medical attention in the nearest hospital.</span><br><br>
                <span style="margin-left:14%;word-spacing: 3.8px">4. I agree to adhere to the conditions that may be imposed by the Committee from time to time and</span><br>
                <span style="margin-left:15.8%">also to keep the Committee informed about the compliance with the conditions.</span><br><br>
                <span style="margin-left:14%">5. I undertake to produce him/her before the Committee as and when required.</span><br><br>
                <span style="margin-left:14%">6. I shall inform the Committee immediately if the child goes out of my charge or control.</span><br><br><br>
                <span>Date this <input type="text" name="cpDay" class="form20">day of <input type="text" name="cpMon" class="form20"></span><br><br><br>
                <h5><span style="margin-left: 79.5%">Signature</span><br/>
                    <span style="margin-left: 57.7%">Signed before Child Welfare Committee</span></h5><br/>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>
    </body>
</html>
