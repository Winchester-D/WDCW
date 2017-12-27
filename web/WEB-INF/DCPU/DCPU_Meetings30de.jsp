<%-- 
    Document   : CWC_Meetings30de
    Created on : 7 Dec, 2017, 4:49:52 PM
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
    <center><h4>FORM 30<br/>
    [Rule 23(9)]<br/>
    HOME STUDY REPORT FOR PROSPECTIVE FOSTER PARENTS</h4></center>
    <hr style="display: block; margin-top: 0.5em; margin-bottom: 0.5em; margin-left: 17%; margin-right: 17%; border-style: inset; border-width: 2px; border-color:#737373"/><br/>
    
    <span style="margin-left: 8%"><b>DATE OF REGISTRATION</b></span><br>
    <span style="margin-left: 8%"><b>AADHAR CARD NO of PFP :</b></span><br>
    <span style="margin-left: 8%"><b>NAME OF THE SOCIAL WORKER</b></span><br>
    <span style="margin-left: 8%"><b>DATE OF HOME VISIT</b></span><br>
    <br>
    
    <span style="margin-left: 8%"><b>Part-I</b>of the format shall be filled up by the prospective Foster parents and Part-II of the template shall be</span><br>
    <span style="margin-left: 8%">filled up by the Social Worker to submit an assessment report along with his/her observation about</span><br>
    <span style="margin-left: 8%">suitability of the prospective adoptive/ foster parents.</span><br>
    <br>
    <span style="margin-left: 8%"><b><u>PART-I : SELF ASSESSMENT</u></b></span><br><br>
    
    <span style="margin-left: 8%"><b>A.&emsp;Information about the prospective foster parents and their family background</b></span><br><br>
    
    <table id="form_detail" style="margin-left: 6%" style="margin-left: 5%">
        
        <tr>
            
            <th width="600" height="50">Particulars of the foster parents</th>
            <th width="300"></th>
        </tr>
        
        <tr>
            
            <td width="600">Full Name</td>
            <td width="300"></td>
        </tr>
        
        <tr>
            
            <td width="600">Date of birth & age</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Place of birth</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Complete Address with e-mail ID (Present & Permanent Address)</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Identity Proof</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Religion</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Language(s)</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Date of Marriage</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Present Educational Qualification</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Employment/occupation</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600" height="50">Name & Address of the present Employer/Business concern</td>
            <td width="300" height="50"></td>
        </tr>
        <tr>
            
            <td width="600">Annual Income</td>
            <td width="300"></td>
        </tr>
        <tr>
            
            <td width="600">Health Status</td>
            <td width="300"></td>
        </tr>
        
        
        
        
    </table>
    
    <br><br>
    
    </div>
    
    </body>
</html>
