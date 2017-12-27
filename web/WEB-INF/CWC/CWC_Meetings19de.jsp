<!DOCTYPE html>

<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<%-- 
    Document   : Form19
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 19</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <script src="jq/jquery-1.8.2.js"></script>
        <script src="jq/jquery-ui.js"></script>

        <style>


            span { margin-left:11%;}
            p {margin-left: 10%;
            }

            .form19{ 
                 color:blue;
                background-color: #ccffff;
                border-top-style:none; 
                border-left-style:none; 
                border-right-style:none;  
                border-bottom-style: dotted;  
                border-bottom-color: black;
            }
            #cpDay{
                border-top-style:none;
                border-left-style:none; 
                border-right-style:none; 
                border-bottom-style:double;
                border-bottom-color: black;
            }
            #cpMon{
                border-top-style:none;
                border-left-style:none; 
                border-right-style:none;
                border-bottom-style:double;
                border-bottom-color: black;
            }
            #cpYr{
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
        <form method="post" action="form19desave" name="form19">
            <div id="one"><br/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <input type="hidden" name="formName" value="form19"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 19<br/>
                        [Rule 18(8)]<br/>
                        ORDER FOR PLACEMENT OF CHILD UNDER THE CARE OF A PARENT, GUARDIAN OR FIT<br/>
                        PERSON PENDING INQUIRY</h4>
                </center>                
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 37%;  margin-right: 37%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                <span>Case No<input type="text" id="cipiNo" name="cipiNo" size="8" class="form19"/>of<input type="text" id="cipiDay" name="cipiDay" size="12" class="form19"/>20<input type="text" id="cipiYear" name="cipiYear" size="14" class="form19"/></span><br/>
                <span>In Re<input type="text" id="cpRe" name="cpRe" class="form19"/></span><br/><br/>
                <span style="margin-left: 16.5%;word-spacing:1px">Whereas (name of the child)<input type="text" id="cpName" name="cpName" class="form19">has on <input type="date" id="cpDate" name="cpDate" size="12" class="form19"/>(date) been found to be in need</span><br/>
                <span style="word-spacing:8px">of care and protection, and is placed under the care and supervision of (name)<input type="text" id="cpFat" name="cpFat" size="20" class="form19"/></span><br/>
                <span style="word-spacing:.5px">(address)<input type="text" id="cpFatAddress" name="cpFatAddress" size="20" class="form19"/>on executing a bond by the said<input type="text" id="cpCname" name="cpCname" size="16" class="form19"/> and the Committee is satisfied</span><br/>
                <span style="word-spacing:5px">that it is expedient to deal with the said child by making an order placing him/her under supervision.</span><br/>
                <p>Reason for the child being produced before the CWC<input type="text" name="cpCwc" id="cpCwc" size="105" class="form19"/></p>
                <span style="margin-left: 16.5%;word-spacing:21px">It is hereby ordered  that  the  said  child be  placed  under  the  supervision  of</span><br/>
                <span style="word-spacing:26.5px">(name)<input type="text" id="cpFat1" name="cpFat1" size="27" class="form19"/> (address)<input type="text" id="cpFatAddress1" name="cpFatAddress1" size="30" class="form19"/> for a period of</span><br/>
                <span style="word-spacing:20px"><input type="text" id="cpPer" name="cpPer" class="form19"/> This shall be subject to the following conditions that:</span><br/>
                <span style="word-spacing:15.4px">1.&nbsp;the child along with the copies of the order and the bond, if any, executed by the</span><br/>
                <span style="margin-left: 14.5%;word-spacing:6.5px">said<input type="text" id="cpCname1" name="cpCname1" size="26" class="form19"/>shall be produced before the Committee as and when required by the</span><br/>
                <span style="margin-left: 14.5%;word-spacing:11.8px">person executing the bond</span><br/>
                <span style="word-spacing:18.3px">2.&nbsp;the child shall reside at<input type="text" id="cpFatAddress2" name="cpFatAddress2" class="form19"/> for a period of<input type="text" id="cpPer" name="cpPer1" class="form19"/></span><br/>                           
                <span style="word-spacing:1px">3.&nbsp;&nbsp;&emsp;the child shall not be allowed to quit the district jurisdiction of<input type="text" name="cpJurisdiction" id="cpJurisdiction" class="form19"/>without the permission of</span><br/>
                <span style="margin-left: 13.5%;word-spacing:5.3px"> &nbsp;the Committee.</span><br/>
                <span style="word-spacing:16.2px">4.&nbsp;the child shall go to school/ vocational training centre regularly. The  child shall attend</span><br/>
                <span style="margin-left: 15%;word-spacing:9.5px"><input type="text" id="cpSchoolName" name="cpSchoolName" size="28" class="form19"/>(name of) school/ vocational  training centre  (if already identified) at</span><br/>
                <span style="margin-left: 15%;word-spacing:15.5px"><input type="text" id="cpSchoolAddress" name="cpSchoolAddress" size="28" class="form19"/>(address of school/ vocational training centre).</span><br/>
                <span style="word-spacing:8.5px;">5.&nbsp;&#8239;&#8239;&#8239;the person under whose care the child is placed shall arrange for the proper care, education and</span><br/>
                <span style="margin-left: 14.8%;word-spacing: 12.3px">welfare of the child.</span><br/>
                <span style="word-spacing:9px">6.&nbsp;&#8239;&#8239;the child shall not be allowed to associate with undesirable characters  and shall be prevented from</span><br/>
                <span style="margin-left: 14.8%;word-spacing:13px">coming in conflict with law.</span><br/>
                <span style="word-spacing:10px">7.&nbsp;&#8239;&#8239;the child shall be prevented from taking narcotic drugs or  psychotropic substances or any other</span><br/>
                <span style="margin-left: 14.8%">intoxicant.</span><br/>
                <span style="word-spacing:8.5px">8.&nbsp;&#8239;&#8239;the directions given by the Committee from time to time, forthe due observance of the conditions</span><br/>
                <span style="margin-left: 14.8%;word-spacing:12.3px">mentioned above, shall be carried out.</span><br/>
                <br/>
                <span>Dated this<input type="text" id="cpDay" name="cpDay" size="16"/>day of <input type="text" id="cpMon" name="cpMon" size="16"/>20<input type="text" id="cpYr" name="cpYr" size="16"/></span><br/>                   
                <h5><span style="margin-left: 84%">(Signature)</span><br/>
                    <span style="margin-left: 75.3%">Chairperson/ Member</span><br/> 
                    <span style="margin-left: 73%">Child Welfare Committee</span><br/></h5>  
                <span style="margin-left: 22%">• Additional conditions, if any may be inserted by the Child Welfare Committee </span>
                <br/><br/>
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form> 
    </body>
</html>

