<%-- 
    Document   : CWC_Meetings15de
    Created on : 6 Dec, 2017, 11:53:55 AM
    Author     : Shashank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 15</title>
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

div#one {
    border-style: solid;
    border-color: black;
}
        </style>
    </head>
    <body >
        
        
        <br>
                  <form method="post" action="form15desave" name="form15">
            <div id="one"><br/>
                <div style="text-align: left"> <b>Profile ID</b>:<s:property value="profile_id"/></div>
                      <input type="hidden" name="formName" value="form15"/>
                      <input type="hidden" name="profile_id" value="${action.profile_id}"/>
                      <center><img src="images/govt.png" height="80" width="80"></center>
                      <center><h4>FORM 15 <br/>
    [Rule 17 (1)(i)]<br/>
    CASE SUMMARY MAINTAINED BY THE CHILD WELFARE COMMITTEE</h4></center>
    <hr style="display: block;margin-top: 0.5em;margin-bottom: 0.5em; margin-left: 17%; margin-right: 17%;border-style: inset;border-width: 2px;border-color:#737373" >
    
    <br><br>
    
    <span style="margin-left:9%">Case No<input type="text" name="wcCase" id="wcCase" class="form"></span><br>
    <span style="margin-left:9%">In Re<input type="text" name="wcRe" id="wcRe" class="form"></span><br>
    <span style="margin-left:9%">Case Record<input type="text" name="wcRecord" id="wcRecord" class="form"></span><br>
    
    <br>
    
    <span style="margin-left:9%">1.&emsp; Name of the child<input type="text" name="wc1" id="wc1" class="form" > </span><br>
    <span style="margin-left:9%">2.&emsp; Father’s/Mother’s/Guardian’s name (if available)<input type="text" name="wc2" id="wc2" class="form" > </span><br>
    <span style="margin-left:9%">3.&emsp; Date of production of the child<input type="text" name="wc3" id="wc3" class="form" > </span><br>
    <span style="margin-left:9%">4.&emsp; Name of person producing the child<input type="text" name="wc4" id="wc4" class="form" > </span><br>
    <span style="margin-left:9%">5.&emsp; A list of all follow up dates (of the child, before the Committee)<input type="text" name="wc5" id="wc5" class="form" > </span><br>
    <span style="margin-left:9%">6.&emsp; Orders passed by the CWC (tick as applicable)</span><br><br>
    
    <span style="margin-left: 14%">(i)   &emsp;  Declaration that child is in need of care and protection.</span><br>
    <span style="margin-left: 14%">(ii)  &emsp; Finding on age of child</span><br>
    <span style="margin-left: 14%">(iii) &emsp;Medical Examination</span><br>
    <span style="margin-left: 14%">(iv)  &emsp;Interim custody</span><br>
    <span style="margin-left: 14%">(v)   &emsp;  Undertaking (by parent, guardian or fit person, if applicable)</span><br>
    <span style="margin-left: 14%">(vi)  &emsp; Order appointing Case Worker & NGO etc.</span><br>
    <span style="margin-left: 14%">(vii) &emsp;Order for compensation/recovery of wages (if applicable)</span><br>
    <span style="margin-left: 14%">(viii)&emsp;Transfer order</span><br>
    <span style="margin-left: 14%">(ix)  &emsp; Final Order (concluding inquiry)</span><br>
    <span style="margin-left: 14%">(x)   &emsp;  Any other order.</span><br><br>
    
    <span style="margin-left:9%">7 .&emsp; Medical Records including but not limited to age verification<input type="text" name="wc7" id="wc7" class="form" > </span><br>
    <span style="margin-left:9%">8 .&emsp; Social Investigation Report under Form 22<input type="text" name="wc8" id="wc8" class="form" > </span><br>
    <span style="margin-left:9%">9 .&emsp; Individual Care Plan under Form 7<input type="text" name="wc9" id="wc9" class="form" > </span><br>
    <span style="margin-left:9%">10.&emsp; Rehabilitation Card in Form 14<input type="text" name="wc10" id="wc10" class="form"> </span><br>
    <span style="margin-left:9%">11.&emsp; Case History Form 43<input type="text" name="wc11" id="wc11" class="form" > </span><br>
    <span style="margin-left:9%">12.&emsp; All details, documents and records with regards to Sponsorship/Foster Care/Adoption services (if<br> 
    <span style="margin-left:13%">applicable).</span> <br>  <br>
    
    <span style="margin-left:9%">Date:</span><br>
    <span style="margin-left:9%">Place:</span><br>
    
    <span style="margin-left:77%">(Signatures)</span><br>
    <span style="margin-left:68%">Child Welfare Committee</span>
    
     <br><br><br>

    <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
    
    <br><br>
    
    </div>
        </form>
        
    </body>
</html>
