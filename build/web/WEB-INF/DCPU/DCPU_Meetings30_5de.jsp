<%-- 
    Document   : CWC_Meetings30_5de
    Created on : 7 Dec, 2017, 4:59:06 PM
    Author     : VenkatadriReddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

div.one {
    border-style: solid;
    border-color: black;
}

 #form_detail  { margin-left: 18%;
                            border:1px solid black;}
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
        </style>
    </head>
    <body>
       
         <br>
        <form method="post" action="SimpleReport.jsp">
            <div class="one"><br>
                
                 <span style="margin-left: 8%"><b>2.&emsp;Psychosocial Assessment:</b></span><br>
                 <span style="margin-left: 8%"><b>2.1&emsp;Interaction with the prospective</b>foster parents</span><br><br>
                 
                 <span style="margin-left: 8%;word-spacing: 13px">  (i)&emsp;Have you interacted with the prospective foster parents individually and jointly?</span><br>
                 <span style="margin-left: 8%;word-spacing: 18.6px"> (ii)&emsp;Are the prospective foster parents well prepared for fostering the child?</span><br>
                 <br>
                 <span style="margin-left: 8%"><b>2.2&emsp;Home visit findings</b></span><br><br>
                  
                 <span style="margin-left: 8%;word-spacing: 1px">  (i)&emsp;When did you visit the home of the prospective foster parents? Who were the members present</span><br>
                 <span style="margin-left: 11.3%">     during your visit?</span><br>
                 <br>
                 <span style="margin-left: 8%"> (ii)&emsp;Whom did you interact during the home visit?</span><br>
                 <br>
                 <span style="margin-left: 8%;word-spacing: 6px">(iii)&emsp;Have you met any neighbour/relative? Give a detailed description about the interaction?</span><br>
                 <br>
                 <span style="margin-left: 8%"> (iv)&emsp;Whether the home environment is conducive for the child?</span><br>
                 <br>
                 <span style="margin-left: 8%">  (v)&emsp;Are the prospective foster parents well prepared for foster care?</span><br>
                 <br>
                 <span style="margin-left: 8%;word-spacing: 2px"> (vi)&emsp;Did the prospective foster parents have any doubt about parenting issues or any other issues?</span><br>
                 <span style="margin-left: 11.5%">Have you cleared their doubts?</span><br><br>

                 <span style="margin-left: 8%"><b>2.3&emsp;Interaction with the family members</b></span><br><br>
                 
                 <span style="margin-left: 8%;word-spacing: 2px">  (i)&emsp;Have you interacted with other family members of the prospective foster parents? What is their</span><br>
                 <span style="margin-left: 11.2%;word-spacing: 2.7px">     opinion about the proposed foster care? Are they positive about the foster care arrangement?</span><br>
                 <br>
                 <span style="margin-left: 8%;word-spacing: 1.2px"> (ii)&emsp;Are there any other family member(s) whom you could not interact but they might have a larger</span><br>
                 <span style="margin-left: 11.5%">     role in the proposed foster care? If so, how did you interact? Would you plan to take their views?</span><br>
                 <br>
                 <span style="margin-left: 8%;word-spacing: 0.7px">(iii)&emsp;Have you interacted with older child/ren present in the home of the prospective foster parents? If</span><br>
                 <span style="margin-left: 11.5%">    yes, please give details.</span><br>
                 <br>
                 <span style="margin-left: 8%;word-spacing: 2px"> (iv)&emsp;Have you noticed any adverse remarks from the family members? If so, how far those remarks</span><br>
                 <span style="margin-left: 11.5%">      may have an impact on the foster care process?</span><br>
                 <br>
                 
                 <span style="margin-left: 8%"><b>2.4&emsp;Financial capacity</b></span><br><br>
                 
                  <span style="margin-left: 8%;word-spacing: 5px">  (i)&emsp;What is your opinion about the financial status of the prospective foster parents? Are they</span><br>
                  <span style="margin-left: 11.3%">     financially sound to welcome another member into their family?</span><br>
                  <br>
                  <span style="margin-left: 8%;word-spacing: 3px"> (ii)&emsp;Have you observed any financial situation which is hidden in the template?</span><br>
                  <br>
                  <span style="margin-left: 8%;word-spacing: 5px">(iii)&emsp;Would you recommend any financial assistance to them?</span><br><br>
                  
                 <span style="margin-left: 8%"><b>2.5&emsp;Physical and emotional capacity</b></span><br><br>
                 
                 <span style="margin-left: 8%;word-spacing: 1.8px">  (i)&emsp;Are the prospective foster parents in a good physical and emotional state to take care of a child?</span><br>
                 <br>
                  <span style="margin-left: 8%;word-spacing: 3.2px"> (ii)&emsp;Have you observed any physical or psychological issues with the prospective foster parents or</span><br>
                 <span style="margin-left: 11.5%">     any other family members that is going to affect the life of the upcoming child? If so, give details.</span><br>
               <br>
                 <span style="margin-left: 8%">(iii)&emsp;Are the prospective foster parents emotionally equipped enough to take care of a child?</span><br><br>
                
                 <span style="margin-left: 8%"><b>3.&emsp;Recommendation for Foster care</b></span><br><br>
                 
                  <span style="margin-left: 9.1%;word-spacing: 2.2px">3&emsp;Do you recommend the prospective foster parents for foster care? Put your views and rationale</span><br>
                 <span style="margin-left: 11.5%">    for recommending the prospective foster parents for foster care.</span><br>
                <br> 
                  <span style="margin-left: 8%;word-spacing: 2.5px">3.2&emsp;In case, you do not recommend the prospective foster parents for foster care, cite appropriate</span><br>
                 <span style="margin-left: 11.5%">     reasons for taking such decision.</span><br>
                 
                 <br>
                 
                 <h5><span style="margin-left: 45%">Signature, name, designation and official seal</span></h5>
                 
                 <br><br>
                 
                 <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
   <br><br>
                 </div>
              
              </form>
        
    </body>
</html>
