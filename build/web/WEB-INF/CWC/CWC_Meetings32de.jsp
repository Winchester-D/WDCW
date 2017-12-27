<%-- 
    Document   : Form 32
    Created on : 18 Sep, 2017, 3:09:00 PM
    Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 32</title>
        <style>          
            span
            {
                margin-left: 11%;

            }
            .form32
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

        <br><br>
        <form method="post" action="form32desave" name="form32">
            <div id="one">
                <input type="hidden" name="formName" value="form32"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 32<br/>
                        [Rule 23(15)]<br/>
                        ORDER OF FOSTER CARE PLACEMENT WITH A FAMILY<br/>
                        OR<br/>
                        GROUP FOSTER CARE<br/> </h4>                   
                </center>           
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 40%;  margin-right: 40%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>

                <span style="margin-left:16.5%;word-spacing: 9px">The child (name and address)<input type="text" name="name" id="name" class="form32">approximate age<input type="text" name="age" id="age" class="form32" size="18"> d/o or s/o </span><br>
                <span style="word-spacing: 7px">Mr<input type="text" name="mr" id="mr" class="form32" size="24">and Mrs<input type="text" name="mrs" id="mrs" class="form32" size="24">is in need of care and protection of a family.</span><br>
                <span style="word-spacing: 8px">Mr<input type="text" name="mr1" id="mr1" class="form32">and Mrs<input type="text" name="mrs1" id="mrs1" class="form32" size="23">resident of (complete address and contact number)</span><br>
                <span><input type="text" name="cno" id="cno" class="form32" size="49">are declared fit for foster-care placement of the child after</span><br>
                <span style="word-spacing: 2px">considering the Individual Care Plan,Child Study Report and Home Study Report.</span><br>
                <br>
                <center>OR</center><br>
                <span style="margin-left:16.5%">Child Care Institution (Name and Address)<input type="text" name="name1" id="name1" class="form32" size="30">is declared fit for foster-care</span><br>
                <span>placement of the child after considering the Individual Care Plan and Child Study Report </span><br><br>

                <span style="margin-left:16.5%;word-spacing: 8px" >The child (name)<input type="text" name="name2" id="name2" class="form32" size="42">is placed in foster care for a period of</span><br>
                <span style="word-spacing:8px"><input type="text" name="period" id="period" class="form32" size="30">under of the supervision of the aforesaid Child Welfare Officer/Social Worker</span><br>
                <span>(name and contact)<input type="text" name="contact" id="contact" class="form32" size="45"></span><br/><br/><br/>

                <h5><span style="margin-left: 79%">Chairperson/Member<br/></span>
                    <span style="margin-left: 75%">Child Welfare Committee</span></h5>

                <br/><br/>


                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>             
        </form>


    </body>
</html>
