<%-- 
    Document   : CWC_Meetings30_2de
    Created on : 7 Dec, 2017, 4:58:22 PM
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
                
         <span style="margin-left: 8%"><b>B.&emsp; Family background information:</b></span><br>
             
         <span style="margin-left: 11%">(1) Give a short description of social status and background of the prospective foster parents along</span> <br>
         <span style="margin-left: 13.5%">with the following information.</span><br><br>
         
         <table id="form_detail" style="margin-left: 6%">
             
             <tr>
                 
                 <th colspan="3" width="800" ><center>Details about Parents of the Applicants</center></th>
                 
             </tr>
             
             <tr>
                 
                 <td width="300"></td>
                 <td><b>Father</b></td>
                 <td><b>Mother</b></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300" height="50">Name in full</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300">Age</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300">Nationality/Citizenship</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300" height="50">Occupation</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300" height="50">Previous occupation</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             <tr>
                 
                 <td width="300" height="50">Presently residing with</td>
                 <td></td>
                 <td></td>
              
             </tr>
             
             
         </table>
         
               <br>
               
               <span style="margin-left: 11%">(2) Please complete the following table with the names of each of your respective children (adopted</span> <br>
         <span style="margin-left: 13.7%">and biological), their sex, educational status (kindergarten, elementary, etc.) and dates of birth.</span><br><br>
                
                <br>
                
                
                <table id="form_detail" style="margin-left: 6%">
                    
                    <tr>
                        
                        <th  width="300"><center>Name of the Child</center></th>
                        <th width="100"><center>Sex</center></th>
                        <th width="150"><center>Date of Birth</center></th>
                        <th width="250"><center>Educational Status</center></th>
                        
                        
                    </tr>
                    
                    <tr>
                        
                        <td height="35"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    
                    <tr>
                        
                        <td height="35"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    
                    
                </table>    
                
                <br>
               
                <span style="margin-left: 11%">(3) If there are other members residing, please furnish the following information in respect of them.</span> <br>
                <br>
                
                <table id="form_detail" style="margin-left: 15%">
                    
                    <tr>
                        
                        <th width="100"><center>Name</center></th>
                        <th width="150"><center>Nature of
                                       <br>  Relationship</center></th>
                        <th width="100"><center>Age</center></th>
                        <th width="100"><center>Gender</center></th>
                        <th width="200"><center>Occupation</center></th>
                    </tr>
                    
                    
                    <tr>
                        
                        <td height="35"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    
                    <tr>
                        
                        <td height="35"></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                </table>
                
                <br>
               
                <span style="margin-left: 11%">(4) Please describe how you believe the foster care would affect the family members (grand parents,</span> <br>
                 <span style="margin-left: 13.5%">children, relatives and others).</span><br><br>
                </div>
              
              </form>
        
    </body>
</html>
