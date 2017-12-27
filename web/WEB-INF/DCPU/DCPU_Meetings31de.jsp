<%-- 
    Document   : CWC_Meetings31de
    Created on : 7 Dec, 2017, 2:50:26 PM
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
                      <center><img src="images/govt.png" alt="Smiley face" height="80" width="80"></center>
                      <center><h4>FORM 31<br/>
    [Rule 23(4)]<br/>
    CHILD STUDY REPORT</h4></center>
    <hr style="display: block;margin-top: 0.5em;margin-bottom: 0.5em; margin-left: 39%; margin-right: 39%; border-style: inset;border-width: 2px;  border-color:#737373"/><br><br>
    
    <table id="form_detail" style="margin-left: 6%">
        
            <tr>
                
                <th colspan="3" width="800"><u>CHILD STUDY REPORT</u></th>
                
            </tr>
            
            <tr>
                
                <th width="54">S. No.</th>
                <th width="300">Item</th>
                <th width="50">Response</th>
                
            </tr>
            
            <tr>
                
                <td width="54">1</td>
                <td width="300">Date of Assessment</td>
                <td width="50"></td>
                
            </tr>
            
            <tr>
                
                <td width="54">2</td>
                <td width="300">Source of Referral</td>
                <td width="50"></td>
                
            </tr>
            
            <tr>
                
                <td width="54">3</td>
                <td width="50">Photograph of the Child to be refreshed<br>periodically</td>
                <td width="50">  
         <svg width="450" height="180"  >
         <rect x="50" y="20" rx="20" ry="25" width="200" height="155" 
               style="fill:white;stroke:black;stroke-width:2;opacity:0.5" />
   
         </svg>           
     
                
            </tr>
            
            <tr>
                
                <th colspan="3" width="800" height="50">Profile of the Child</th>
                
            </tr>
            
            <tr>
                
                <td width="54">4</td>
                <td width="400" height="50">Name of the Child</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">5</td>
                <td width="400" height="50">Date of Birth</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">6</td>
                <td width="400" height="50">Place of Birth</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">7</td>
                <td width="400">Age</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">8</td>
                <td width="400">Nationality</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">9</td>
                <td width="400">Religion</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">10</td>
                <td width="400">Education</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">11</td>
                <td width="400">Mother Tongue</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">12</td>
                <td width="400">Present Address</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">13</td>
                <td width="400" height="50">Aadhaar Card Number</td>
                <td width="50"></td>
                
                
            </tr>
            
             <tr>
                
                <td width="54">14</td>
                <td width="400">Contact Details<br>
                &emsp;&emsp;a) Landline<br>
                &emsp;&emsp;b) Mobile
                </td>
                <td width="50"></td>
                
                
            </tr>
            
          </table> 
    
    <br><br>
   </div>
        
    </body>
</html>
