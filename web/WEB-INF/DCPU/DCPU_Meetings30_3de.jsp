<%-- 
    Document   : CWC_Meetings30_3de
    Created on : 7 Dec, 2017, 4:58:36 PM
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
       
        <form method="post" action="SimpleReport.jsp">
            <div class="one"><br>
                
         <span style="margin-left: 8%"><b>C.&emsp; Professional/Employment Details (Professional career details for last 5 years):</b></span><br>
             <br>
             <table id="form_detail" style="margin-left: 11%">
                 
                 <tr>
                     
                     <td colspan="4" widdth="800">Foster Father</td>
                     
                 </tr>
                 
                 <tr>
                     
                     <td width="200"><center>Organisation</center></td>
                     <td width="200"><center>Employer Details<br>(Name & Address)</center></td>
                     <td width="200"><center>Job Title</center></td>
                     <td width="200"><center>From &emsp; To</center></td>
                 </tr>
                 
                 <tr>
                     
                     <td height="60"></td>
                     <td height="60"></td>
                     <td height="60"></td>
                     <td height="60"></td>
                     
                 </tr>
                 
             </table>
             
             <br>
             
             <table id="form_detail" style="margin-left: 11%">
                 
                 <tr>
                     
                     <td colspan="4" widdth="800">Foster Mother</td>
                     
                 </tr>
                 
                  <tr>
                     
                     <td width="200"><center>Organisation</center></td>
                     <td width="200"><center>Employer Details<br>(Name & Address)</center></td>
                     <td width="200"><center>Job Title</center></td>
                     <td width="200"><center>From &emsp; To</center></td>
                 </tr>
                 
                 <tr>
                     
                     <td height="60"></td>
                     <td height="60"></td>
                     <td height="60"></td>
                     <td height="60"></td>
                     
                 </tr>
                 
             </table>
             
             <br>
             
              <span style="margin-left: 8%;word-spacing: 7px"><b>D.&emsp; Financial Position:</b>(Give a short description of your income from all sources such as savings,</span><br>
              <span style="margin-left: 12%">investments, expenditures and liabilities and debts along with supporting</span><br>
              <span style="margin-left: 12%">documents)<input type="text" name="fp_doc" class="form"></span><br><br>
              
               <span style="margin-left: 8%;word-spacing: 17px"><b>E.&emsp; Description of Home and Neighbourhood:</b>(Describe the accommodation details and</span><br>
              <span style="margin-left: 13%">neighbourhood relationship)</span><br><br>
              
              <span style="margin-left: 11.5%;word-spacing: 10.4px">(1)&emsp; How many rooms do you have in your home and describe the play area available</span><br>
              <span style="margin-left: 16.8%">for the child<input type="text" name="fp_chil" class="form"></span><br><br>
              
              <span style="margin-left: 11.5%;word-spacing: 13px">(2)&emsp; Please describe the neighbourhood in which you reside, including any aspect that</span><br>
              <span style="margin-left: 16.8%">you believe makes it child-friendly<input type="text" name="fp_friend" class="form"></span><br><br>
              
              
               <span style="margin-left: 8%"><b>F.&emsp; Attitude and Motivation for foster care:</b></span><br>
               <br>
               <span style="margin-left: 8%">(1).&emsp; Please circle the term which best describes the reason why you wish to take a child in foster</span><br>
               <span style="margin-left: 8%">&emsp; &emsp;care, you may circle more than one option, if applicable:</span><br><br>
               
               <span style="margin-left: 8%">a)&emsp; Provide a companion to your other children;</span><br>
               <span style="margin-left: 8%">b)&emsp; Provide a child with a happy home;</span><br>
               <span style="margin-left: 8%">b)&emsp; Other, please specify<input type="text" name="fp_other" class="form"></span><br><br>
               
            <span style="margin-left: 8%">(2).&emsp; Please circle the statement which describes how you think the foster care arrangement will</span><br>
            <span style="margin-left: 8%">&emsp; &emsp;improve the lives of your other children, you may circle more than one, if applicable:</span><br><br>
               
            <span style="margin-left: 8%">a)&emsp; They will be less lonely;</span><br>
            <span style="margin-left: 8%">b)&emsp; They will learn to be more accommodating:</span><br>
            <span style="margin-left: 8%">c)&emsp; They will become more empathetic;</span><br>
            <span style="margin-left: 8%">d)&emsp; Not applicable as I have no other children;</span><br>
            <span style="margin-left: 8%">e)&emsp; Other, please specify<input type="text" name="fp_pls" class="form"></span><br>
            
            <br>
            
            <span style="margin-left: 8%"><b>G.&emsp; Attitude of grandparents/extended family members, other relatives and significant others</b></span><br>
            <span style="margin-left: 8%"><b>  &emsp;&emsp; towards the foster care:</b></span>(Give a short description about the opinion of other important persons towards<br>
            <span style="margin-left: 8%">     &emsp;&emsp; foster care who would have impact in the child rearing process)<input type="text" name="fp_care" class="form"></span><br><br>
            
            
         
         </div>
              
              </form>
        
    </body>
</html>
