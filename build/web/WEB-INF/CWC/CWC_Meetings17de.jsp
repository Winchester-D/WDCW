<%-- 
    Document   : CWC_Meetings17de
    Created on : 20 Nov, 2017, 10:40:42 AM
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
                margin-left: 11%;

            }
            .form
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
            hr { 

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


        <form method="post" action="form17desave" name="form17">
            <div id="one"> <br/>

                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <input type="hidden" name="formName" value="form17"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <center>
                    <img src="images/govt.png" height="80" width="80">
                    <h4>FORM 17<br/>
                        [Rules 18(2), 19(25)]<br/>
                        REPORT TO BE SUBMITTED AT TIME OF PRODUCTION<br/>
                        OF CHILD BEFORE THE COMMITTEE</h4>
                </center> 
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 33%;  margin-right: 33%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>

                <span >Case No<input type="text" class="form"></span><br>
                <span>Produced before the Child Welfare Committee<input type="text" class="form"></span><br>
                <span>Date of production<input type="text" class="form">Time of production<input type="text" class="form"></span><br>
                <span>Place of production<input type="text" class="form"></span><br><br>

                <span style="margin-left: 10%">1. &emsp;&emsp;Details of person who is producing the child:</span><br><br>
                <span style="margin-left: 15%">(i)&emsp;&emsp;Name of the person<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(ii)&emsp;&emsp;Age<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iii)&emsp;&emsp;Sex<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iv)&emsp;&emsp;Address<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(v)&emsp;&emsp;Contact Number<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(vi)&emsp;&emsp;Occupation/ designation<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(vii)&emsp;&emsp;Name of the organization/CCI/SAA<input type="text" class="form"></span><br><br>

                <span style="margin-left: 10%">2. &emsp;&emsp;The child who is being produced:</span><br><br>
                <span style="margin-left: 15%">(i)&emsp;&emsp;Name (if any)<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(ii)&emsp;&emsp;Age (stated age/ age based on appearance)<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iii)&emsp;&emsp;Sex<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iv)&emsp;&emsp;Identity mark/s<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(v)&emsp;&emsp;Language used by the child<input type="text" class="form"></span><br><br>


                <span style="margin-left: 10%">3. &emsp;&emsp;Details of parents / guardians (if available):</span><br><br>
                <span style="margin-left: 15%">(i)&emsp;&emsp;Name<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(ii)&emsp;&emsp;Age<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iii)&emsp;&emsp;Address<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(iv)&emsp;&emsp;Contact number<input type="text" class="form"></span><br>
                <span style="margin-left: 15%">(v)&emsp;&emsp;Occupation<input type="text" class="form"></span><br>
                <br>

                <span style="margin-left: 10%">4. &emsp;&emsp;Place where the child was found<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">5. &emsp;&emsp;The details of the person (if any) with whom the child was found:<input type="text" class="form"></span><br>


                <span style="margin-left: 18%">(i)&emsp;&emsp;Name<input type="text" class="form"></span><br>
                <span style="margin-left: 18%">(ii)&emsp;&emsp;Age<input type="text" class="form"></span><br>
                <span style="margin-left: 18%">(iii)&emsp;&emsp;Address<input type="text" class="form"></span><br>
                <span style="margin-left: 18%">(iv)&emsp;&emsp;Contact number<input type="text" class="form"></span><br>
                <span style="margin-left: 18%">(v)&emsp;&emsp;Occupation<input type="text" class="form"></span><br>

                <br>
                <span style="margin-left: 10%">6.  &emsp;&emsp;Circumstances under which the child was found<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">7.  &emsp;&emsp;Allegation by the child of any offense/ abuse committed on the child in any manner<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">7.  &emsp;&emsp;Physical condition of the child<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">9.  &emsp;&emsp;Belongings of the child at the time of production<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">10.&emsp;&emsp;Date and Time at which the child came to the CCI/SAA<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">11.&emsp;&emsp;Immediate efforts made to trace family of the child<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">12.&emsp;&emsp;Medical treatment, if provided to the child<input type="text" class="form"></span><br>
                <span style="margin-left: 10%">13.&emsp;&emsp;Whether police has been informed<input type="text" class="form"></span><br>


                <br><br>

                <h5><span style="margin-left: 62%">Signature/ Thumb impression of the child</span><br/>
                    <span style="margin-left: 41.4%">Signature/ Thumb impression of the person who produced the child</span><br/><br/></h5>


                <span style="margin-left: 10%;word-spacing: 18px">Police-Local Police/Special Juvenile Police Unit/ designated child welfare police officer / Railway</span><br/>
                <span style="margin-left: 10%;word-spacing: 13px">Police/Probation Officers/ any public servant/Social Welfare Organization/Social Worker/ Person in-charge</span><br/>
                <span style="margin-left: 10%;word-spacing: 18px">CCI/ SAA/ any citizen/Child himself/herself (fill as applicable)</span><br/>

                <br/><br/><br/>

                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>

    </body>
</html>
