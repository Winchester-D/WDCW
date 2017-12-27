<%-- 
    Document   : CWC_Meetings25de
    Created on : 6 Dec, 2017, 2:42:06 PM
    Author     : Shashank
    Modified   : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 25</title>
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

            div.one {
                border-style: solid;
                border-color: black;
            }
        </style>
    </head>
    <body>
        <form method="post" action="form25desave" name="form25">
            <div class="one"><br>
                <input type="hidden" name="formName" value="form25"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center><h4>FORM 25<br/>
                        [Rule 19(29)]<br/>
                        CERTIFICATE DECLARING THE CHILD LEGALLY FREE FOR ADOPTION</h4></center>
                <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 18%;  margin-right: 18%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>


                <span style="margin-left: 8%;word-spacing:7px">1. In exercise of the powers vested in the Child Welfare Committee<input type="text" name="adRess" id="adRess" class="form">under section 38 of</span><br>
                <span style="margin-left: 8%;word-spacing: 8px">the Juvenile Justice (Care and Protection of Children) Act, 2015, child<input type="text" name="adChild" id="adChild" class="form" size="30">date of</span><br>
                <span style="margin-left: 8%;word-spacing: 6px">birth<input type="date" name="adBirth" id="adBirth" class="form">placed in the care of the Specialized Adoption Agency/Child Care Institution ( name  &</span><br>
                <span style="margin-left: 8%;word-spacing: 3px">address) vide order no<input type="text" name="adOrder" id="adOrder" class="form">dated<input type="date" name="adDate" id="adDate" class="form" size="13">of this Committee, is hereby declared legally</span><br>
                <span style="margin-left: 8%">free for adoption on the basis of the following:</span><br><br>

                <span style="word-spacing:5.7px">• &nbsp;Inquiry report of the Probation Officer/ Child Welfare Officer / Social Worker / Case Worker/any</span><br>
                <span style="margin-left: 13.7%">other (as the case may be);</span><br><br>

                <span style="word-spacing:3.7px">• &nbsp;Deed of surrender executed by the biological parent(s) or the legal guardian of the child before this</span><br>
                <span style="margin-left: 13.7%">Committee on (date);</span><br><br>

                <span style="word-spacing:3.7px;word-spacing: 5px">• &nbsp;Declaration submitted by District Child Protection Unit and the Child Care Institution or Specialized</span><br>
                <span style="margin-left: 13.7%;word-spacing: 4.3px">Adoption Agency concerned to the effect that they have made restoration efforts as required under</span><br>
                <span style="margin-left: 13.7%;word-spacing: 3.8px">Section 40(1) of the Act, the Rules and Adoption Regulations, but, nobody has approached them for</span><br>
                <span style="margin-left: 13.7%;word-spacing: 3px">claiming the child as biological parents or legal guardian as on date of the said declaration.</span><br><br>

                <span style="margin-left: 8%">2. This is to certify that:</span><br><br>

                <span style="margin-left: 11.3%;word-spacing: 8.1px">The biological parent(s) / legal guardian, wherever available, has/have been counseled and duly</span><br>
                <span style="margin-left: 11.3%;word-spacing: 5.4px">informed of the effects of their consent including the placement of the child or children in adoption</span><br>
                <span style="margin-left: 11.3%;word-spacing: 3px">which would result in the termination of the legal relationship between the child and his or her family of</span><br>
                <span style="margin-left: 11.3%;word-spacing: 4px">origin;</span><br>
                <br>

                <span style="margin-left: 11.3%;word-spacing: 4px">The biological parents / legal guardian have given their consent freely, in the required legal form, and</span><br>
                <span style="margin-left: 11.3%;word-spacing: 4.1px">the consents have not been induced by payment or compensation of any kind and the consent of the</span><br>
                <span style="margin-left: 11.3%">mother (where applicable), has been given only after the birth of the child.</span><br>

                <br>

                <span style="margin-left: 11.3%;word-spacing: 4px">The Specialized Adoption Agency/ Child Care Institution to which the aforesaid child is entrusted shall</span><br>
                <span style="margin-left: 11.3%;word-spacing: 3.5px">post the photograph and other essential details of the child in the CARING and shall place such child</span><br>
                <span style="margin-left: 11.3%">in adoption as per the procedure laid down in the Act and Adoption Regulations.</span><br><br>

                <h5><span style="margin-left: 84%">Signature</span><br>
                <span style="margin-left: 56.5%">Chairperson and Members of the Committee</span></h5><br>

                <span style="margin-left: 8%">(Seal of the Child Welfare Committee)</span><br><br>

                <span style="margin-left: 8%">Date:</span><br>
                <span style="margin-left: 8%">Place:</span><br>

                <span style="margin-left: 10%;word-spacing: 3px">To: Child Care Institution /Specialized Adoption Agency/ District Child Protection Unit Concerned –</span><br>
                <span style="margin-left: 10%">for information and necessary action.</span><br>

                <br/>

                <h5><span style="margin-left:58%">(Signature & Seal)</span><br>
                <span style="margin-left: 63%">Date:</span></h5><br/><br/>

                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>

                <br><br>
            </div>

        </form>

    </body>
</html>
