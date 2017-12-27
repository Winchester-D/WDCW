<%-- 
    Document   : Form 36
    Created on : Sep 19, 2017, 4:07:28 PM
     Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title>
        <style> 
            span
            {
                margin-left: 7%;    
            } 
            .form36 {
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

        <form method="post" action="form36desave" name="form36">
            <div id="one">
                <input type="hidden" name="formName" value="form36"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center><h4>FORM 36<br/>
                        [Rule 24(5)]<br/>
                        ORDER OF SPONSORSHIP PLACEMENT</h4></center>
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 32%;  margin-right: 32%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span style="margin-left:16.5%">The child (name and address)<input type="text" class="form36" size="15" name="name36" id="name36">age<input type="text" class="form36" size="15" name="age36" id="age36">d/o or s/o Mr<input type="text" class="form36" size="15" name="mr36" id="mr36"> </span><br>
                <span>and/or Mrs<input type="text" class="form36" name="mrs36" id="mrs36" size="17">has been identified as a child needing sponsorship support for education/ health/</span><br>
                <span style="word-spacing:9px">nutrition/ other developmental needs<input type="text" class="form36" name="needs36" id="needs36">(please specify).The District Child Protection Unit is</span><br>
                <span>hereby directed to release Rs<input type="text" class="form36" size="12" name="rs36" id="rs36">per month/ Rs<input type="text" class="form36" size="11" name="rss36" id="rss36">as one time sponsorship support to the</span><br>
                <span style="word-spacing: 6px">said child for a period of<input type="text" class="form36" name="period36" id="period36" size="21">(days/month) and carryout necessary follow up and for the said</span><br>
                <span style="word-spacing: 8px">purpose shall open a bank account in the name of the child<input type="text" class="form36" name="child36" id="child36" size="27">to be operated by</span><br>
                <span><input type="text" class="form36" name="op36" id="op36"></span><br><br><br/>
                <h5><span style="margin-left: 43%">Children’s Court/ Principal Magistrate, Juvenile Justice Board/</span><br><br>
                <span style="margin-left: 54%">Chairperson/Member, Child Welfare Committee</span></h5>
                <br><br><br>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>
    </body>
</html>
