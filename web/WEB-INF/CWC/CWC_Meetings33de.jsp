<%-- 
    Document   : Form 33
    Created on : 18 Sep, 2017, 4:13:36 PM
     Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 33</title>  
        <style>


            span
            {
                margin-left: 9%;

            }
            .form33
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
        <form method="post" action="form33desave" name="form33">
            <div id="one">

                <input type="hidden" name="formName" value="form33"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 33<br/>
                        [Rule 23(16)]<br/>
                        UNDERTAKING BY THE FOSTER FAMILY/GROUP FOSTER CARE ORGANIZATION</h4>
                </center>
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 12%;  margin-right: 12%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>


                <span style="margin-left:16.5%">I/We<input type="text" name="i33" id="i33" class="form33" size="12"/>resident(s)  of  House  no.<input type="text" class="form33" name="hno33" size="15">Street<input type="text" class="form33" name="street33" id="street33" size="15"/>Village/Town</span><br/>
                <span style="word-spacing:4px"><input type="text" class="form33" size="8" name="village33" id="village33"/>District<input type="text" class="form33" size="8" name="district33" id="district33">State<input type="text" class="form33" size="8" name="state33" id="state33"> care giver associated with foster care home run by<input type="text" class="form33" size="7" name="home33" id="home33"></span><br>
                <span style="word-spacing:3px"><input type="text" class="form33" size="8" name="org33" id="org33"/>organization  at<input type="text" class="form33" size="8" name="add33" id="add33" >(address),  do  hereby declare  that  I/We  am/are  willing  to  take charge  of</span><br>
                <span style="word-spacing:4px">(name  of  the  child <input type="text" class="form33" size="19" name="name33" id="name33">Aged<input type="text" class="form33" size="20" name="age33" id="age33">under  the  orders  of  the  Child  Welfare</span><br>
                <span style="word-spacing:4px">Committee<input type="text" class="form33" size="30" name="commit33" id="commit33">subject to the following terms and conditions: </span><br><br>

                <span style="margin-left:14%;word-spacing: 3px">i. If the conduct of the child is unsatisfactory I/we shall at once inform the Committee</span><br><br>
                <span style="margin-left:14%;word-spacing: 3px">ii. I/We shall do my/our best for the welfare and education of thesaid child as long as he remains in</span><br><br>
                <span style="margin-left:15.7%">my charge and shall make proper provision for his maintenance. </span><br><br>
                <span style="margin-left:14%;word-spacing: 2px">iii. In the event of his illness, he shall have proper medical attention in the nearest hospital and report </span><br><br>
                <span style="margin-left:15.8%">of it followed by a fitness certificate shall be submitted before the Committee.</span><br><br>
                <span style="margin-left:14%">iv. I/We shall inform the Committee about any change of address. </span><br><br>
                <span style="margin-left:14%">v. I/We shall do my best to ensure that the child will not be subjected to any form of abuse.</span><br><br>
                <span style="margin-left:14%">vi. I/We agree to adhere to the conditions laid by the Committee.</span><br><br>
                <span style="margin-left:14%">vii. I/We undertake to produce him before the Committee as and when required.</span><br><br>
                <span style="margin-left:14%">viii. I/We undertake to inform the Committee immediately if the child goes out of my charge or control.</span><br><br>

                <span  >Date this<input type="text" class="form33" name="date33" id="date33"> day of <input type="text" class="form33" name="day33" id="day33"></span><br><br>

                <h5><span>Signature and address of 2 witnesses</span></h5><h5><span style="margin-left:68%"> Signature of Applicant(s)</span></h5> <br><br>

                <h5><span style="margin-left:74%"> (Signed before me) </span><br><br>
                <span style="margin-left:53.7%">Chairperson/Member, Child Welfare Committee </span></h5>

                <br><br><br>

                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>

            </div>
        </form>    
    </body>
</html>
