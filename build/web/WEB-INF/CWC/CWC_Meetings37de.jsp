<%-- 
    Document   : Form37
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 37</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <style>


            span { margin-left:9%;}
            .form37{
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
        <form method="post" action="form37desave" name="form37">
            <div id="one">
                <input type="hidden" name="formName" value="form37"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 37<br/>
                        [Rule 25(2)]<br/>
                        ORDER OF AFTER CARE PLACEMENT<br/>
                    </h4>
                </center>          
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 33%;  margin-right: 33%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span style="word-spacing:4px">The child (name)<input type="text" id="cpCname" name="cpCname" size="16" class="form37"/>d/o or s/o<input type="text" id="cpGname" name="cpGname" size="15" class="form37"/>has/ will be completing 18 years of age on (date)</span><br/>
                <span style="word-spacing:8.5px"><input type="text" id="cpDate" name="cpDate" size="18" class="form37"/> She/ he  is  still  in  need  of  care  and  protection  for  the  purpose  of  rehabilitation  and</span><br/>
                <span style="word-spacing:1px">reintegration and specifically for<input type="text" id="cpPurpose" name="cpPurpose" size="20" class="form37"/>(specify the purpose). She/he is placed in (name of organization)</span><br/>
                <span style="word-spacing:4.7px"><input type="text" id="cpOname" name="cpOname" size="18" class="form37"/>for  providing  aftercare. The  In-charge  of  the Organization is directed to admit the child and</span><br/>
                <span style="word-spacing:7.8px">provide all possible opportunities for her/ his rehabilitation and reintegration in its truest sense. The person</span><br/>
                <span style="word-spacing:7.4px">shall be provided all these opportunities maximum till the age of 21 years only or till reintegration in the</span><br/>
                <span style="word-spacing:5.9px">society, whichever is earlier. The in-charge will send half yearly report on  the  status  of  the  child/youth  to  the</span><br/>
                <span style="word-spacing:5.4px">Child Welfare Committee.</span><br/><br/>
                <span style="word-spacing:1px">The State/ District Child Protection Unit is hereby directed to release Rs<input type="text" id="cpRupees" name="cpRupees" size="20" class="form37"/> per month towards after-</span><br/>
                <span style="word-spacing:.5px">care support to the said person for a period of<input type="text" id="cpPeriod" name="cpPeriod" size="20" class="form37"/>(days/month) and carryout necessary follow up and</span><br/>
                <span>for the said purpose shall open a bank account in the name of the person<input type="text" id="cpBname" name="cpBname" size="20" class="form37"/></span><br/><br/><br/>
                <h5><span style="margin-left: 47%;word-spacing:1px">Children’s Court/ Principal Magistrate, Juvenile Justice Board/</span><br/>
                <span style="margin-left: 58%;word-spacing:1px">Chairperson/Member, Child Welfare Committee</span></h5><br/><br/>
                <span>Copy to: State/ District Child Protection Unit or concerned Department of the State Government</span><br/><br/>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div> </form>
    </body>
</html>


