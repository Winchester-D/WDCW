<%-- 
    Document   : Form34
    Created on : 18 Sep, 2017, 5:07:05 PM
    Author     : Rajat Bansal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 34</title>
        <style>
            p{ margin-left: 11%; }
            .form34{
                border-top-style:none;
                border-left-style:none; 
                border-right-style: none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }
            hr { 
                display: block;
                margin-top: 0.5em;
                margin-bottom: 0.5em;
                margin-left: 17%;
                margin-right: 17%;
                border-style: inset;
                border-width: 2px;
                border-color:#737373;
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
 
        <form method="post" action="form34desave" name="form34">
            <div id="one"><br/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <input type="hidden" name="formName" value="form34"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                   <center>
                <img src="images/govt.png" height="80" width="80"/>
                <h4>FORM 34<br/>
                    [Rule 23(17)]<br/>
                    RECORD OF A CHILD IN FOSTER CARE
                </h4>
                </center>
                <hr/><br/><br/>
                <p>a) Case no<input type="text" id="cpCno" name="cpCno" size="20" class="form34"/><br/>
                    b) Name of the Child<input type="text" id="cpCname" name="cpCname" size="20" class="form34"/><br/>
                    c) Age<input type="text" id="cpCage" name="cpCage" size="20" class="form34"/><br/>
                    d) Gender<input type="text" id="cpCgender" name="cpCgender" size="20" class="form34"/><br/>
                    e) Name and address of the Child Care Institution, if any from where the child has been given for foster<br/>
                    care<input type="text" id="cpINameaddress" name="cpINameAddress" size="20" class="form34"/><br/>
                    f) Individual Care Plan<br/>
                    g) Any other source of referral<input type="text" id="cpRname" name="cpRname" size="20" class="form34"/><br/>
                    h) Details of the child &nbsp; placed in foster care including &nbsp; Photograph of the child, foster care giver/parent,<br/>
                    biological parents, if available<input type="text" id="cpGname" name="cpGname" size="20" class="form34"/><br/>
                    i) Details of the placement - individual or group including date and period of placement<br/>
                    j) Home Study Report of the biological family, where applicable with photograph<br/>
                    k) Home Study report of the foster family- individual or group care, with photograph<br/>
                    l) Child Study Report<br/>
                    m) Address of the Child Welfare Committee<br/>
                    n) Particulars of the order of the Committee placing the child in foster care<br/>
                    o) Record (number and significant details) of each visit &nbsp; with the child, foster &nbsp; family, Biological family,<br/> if
                    available and child’s school<br/>
                    p) Record of all reviews of the placement including observations, extent and quality of compliance with<br/>
                    Care Plan, child’s developmental &nbsp; milestones, child’s academic &nbsp; progress, and any &nbsp; changes &nbsp; in family<br/>
                    environment<br/>
                    q) In the case of extension or termination of the placement, record of date and reason for termination<br/>
                    r) Date of the child being handed over to the foster family:<br/>
                    s) Financial assistance provided, if any<br/>
                    t) Name of the Case Worker appointed<br/></p>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>           
            </div>
        </form>
    </body>
</html>
