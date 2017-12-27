<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%-- 
    Document   : Form24
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>

<!DOCTYPE html>
<html>
    <head>
        <title>FORM 24</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <style>
            span { margin-left:11%;
                   word-spacing: 7px;}
            .form24{
                 color:blue;
                background-color: #ccffff;
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }
            .form{
                word-spacing: normal;
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
        <form method="post" action="form24desave" name="form24">
            <div id="one">
                <input type="hidden" name="formName" value="form24"/>
                <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                <center><img src="images/govt.png" height="80" width="80"></center>
                <center>
                    <h4>FORM 24<br/>
                        [Rule 19(22)]<br/>
                        DEED OF SURRENDER<br/>
                    </h4>
                    <hr style="display: block;  margin-top: 0.5em;  margin-bottom: 0.5em;  margin-left: 39%;  margin-right: 39%;  border-style: inset;  border-width: 2px;  border-color:#737373"/><br/><br/>
                    Declaration by Person surrendering the child or children
                </center>   
                <span>Case No<input type="text" id="cpNo" name="cpNo" size="14" class="form24"/></span><br/>
                <span>In Re<input type="text" id="cpRe" name="cpRe" size="15" class="form24"/></span><br/>
                <span style="word-spacing:5px">I/We, the undersigned<input type="text" id="cpSname" name="cpSname" size="13" class="form24"/>Family name/First name(s)<input type="text" id="cpGname" name="cpGname" size="13" class="form24"/>residing at, surrender the child</span><br/>
                <span>(named)<input type="text" id="cpCname" name="cpCname" size="13" class="form24"/>Aged<input type="text" id="cpCage" name="cpCage" size="5" class="form24"/>having date of birth<input type="date" id="cpCbirth" name="cpCbirth" size="13" class="form24"/>for the reason:<input type="text" id="cpReason" name="cpReason" size="16" class="form24"/></span><br/>      
                <span style="word-spacing: 8.6px">(ii)&emsp;&emsp;&#8239;I/we are surrendering my/our child or children on our own and without any coercion, compulsion,</span><br/>
                <span style="margin-left:16.5%">threat, payment, consideration, compensation of any kind;</span><br/>
                <span style="word-spacing: 8px">(iii)&emsp;&emsp;&#8239;I/we have been counseled and informed about the implication that I/we can withdraw our consent</span><br/>
                <span style="margin-left:16.5%">until 60th day of this surrender deed after which my/our consent will be irrevocable and I/we shall</span><br/>
                <span style="margin-left:16.5%">have no claim over the child or children.</span><br/>
                <span style="word-spacing: 6px">(iv) &emsp;&#8239;I/we have been made aware of the implications of surrender and are conscious of the fact that after</span><br/>
                <span style="margin-left:16.5%;word-spacing: 8px">the 60th day from date of the surrender deed, the legal parent-child relationship between my/our</span><br/>
                <span style="margin-left:16.5%">child or children and me/us will be terminated.</span><br/>
                <span style="word-spacing: 8px">(v) &nbsp; I/we understand that my/our child may be adopted by person(s) residing in India or abroad and</span><br/>
                <span style="margin-left:16.5%">give my/our consent for this purpose.</span><br/>
                <span>(vi) &nbsp; I/we understand that the adoption of my/our child will create a permanent parent-child relationship</span><br/>
                <span style="margin-left:16.5%">with the adoptive parent(s) and then cannot claim back the child.</span><br/>
                <span style="word-spacing: 9px">(vii)&emsp;&nbsp;I/we wish/ do not wish (please tick whichever is applicable) my/our identity and address to be</span><br/>
                <span style="margin-left:16.5%">disclosed to my/our child when he/she returns for root search.</span><br/>
                <span style="word-spacing: 9px">(viii) &nbsp;I/we declare that I/We have read the above statements carefully and have fully understood the</span><br/>
                <span style="margin-left:16.5%">same.</span><br/>
                <span>Done at <input type="text" id="cpPlace" name="cpPlace" size="16" class="form24"/> on <input type="text" id="cpDate" name="cpDate" size="16" class="form24"/></span><br/>
                <span style="margin-left:70%">[Signature or Thumb Impression of</span><br/>
                <span style="margin-left:78%">surrendering person(s)]</span><br/>
                <span>2. Declaration by Witnesses</span><br/>
                <span>We the undersigned have witnessed the above surrender.</span><br/>
                <span>(a) Signature, Name and Address of the first witness</span><br/>
                <span><input type="text" id="cpWname" name="cpWname" size="70" class="form24"/></span><br/>
                <span><input type="text" id="cpWaddress" name="cpWaddress" size="70" class="form24"/></span><br/>
                <span>(b) Signature, Name and Address of the second witness</span><br/>
                <span><input type="text" id="cpWname1" name="cpWname1" size="70" class="form24"/></span><br/>
                <span><input type="text" id="cpWaddress1" name="cpWaddress1" size="70" class="form24"/></span><br/>
                <span>3. Certification of child welfare committee</span><br/>
                <span>We hereby certify that the person and the witness(es) named or identified above appeared before me this</span><br/>
                <span>date and signed this document in our presence.</span><br/>
                <span>Done at <input type="text" id="cpPlace1" name="cpPlace1" size="16" class="form24"/> on<input type="date" id="cpDate1" name="cpDate1" size="16" class="form24"/></span><br/>
                <h5><span style="margin-left:80%">Signature & Seal of</span><br/>
                    <span style="margin-left: 79.5%">Members/Chairperson</span><br/>
                    <span style="margin-left: 76%">Child Welfare Committee</span><br/></h5>                             
                <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
            </div>
        </form>
    </body>
</html>



