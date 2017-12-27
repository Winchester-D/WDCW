<%-- 
    Document   : CWC_Meetings31_2de
    Created on : 8 Dec, 2017, 2:22:10 PM
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
                
                
                    <table id="form_detail" style="margin-left: 6%">
                    
                            <tr>
                
                <td width="54">15</td>
                <td width="400">Placement history if the child is from institution<br>
                &emsp;&emsp;a) Date of Placement<br>
                &emsp;&emsp;b) Name and Permanent details of the<br>
                &emsp;&emsp;&emsp;&nbsp;child<br>
                &emsp;&emsp;b) Reason for leaving the family
                </td>
                <td width="400">The child has not been placed in adoption</td>
                
                
            </tr>
            
            <tr>
                
                <td width="54">16</td>
                <td width="400">Reason for placement if the child is from<br>
                community
                </td>
                <td width="400">Mother or both parents in prison <input type="checkbox"  style="zoom:2.5;margin-left: 25%" ><br>
                Parents are suffering from long term<input type="checkbox"  style="zoom:2.5;margin-left: 18.3%" ><br>
                illness<br>
                Dysfunctional family(eg substance abuse,<input type="checkbox"  style="zoom:2.5;margin-left: 9%" ><br>
                domestic violence etc)<br>
                Parents in process of separation<input type="checkbox"  style="zoom:2.5;margin-left: 27%" ><br>
                Parents in process of legal custody dispute<input type="checkbox"  style="zoom:2.5;margin-left: 7%" ><br>
                Natural disaster<input type="checkbox"  style="zoom:2.5;margin-left: 56.3%" ><br>
                Others<input type="checkbox"  style="zoom:2.5;margin-left: 73.3%" >
                
                
                </td>
                
                
            </tr>
            
            
    </table>
    
    <br><br>
    
    <span style="word-spacing: 4px">I<input type="text" name="cw_i" class="form">Social Worker hereby certify that the information given in this form about child</span><br>
    <span><input type="text" name="cw_i" class="form">is correct.</span><br><br>
    
    <span style="margin-left: 64%">Signature:</span><br>
    <span>Place :</span> <span style="margin-left: 48%">Name:</span><br>
    <span>Date :</span>  <span style="margin-left: 48%">Designation:</span>
    
    <br><br>
        
          <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>
   <br><br>
   
   </div>
              
              </form>
        
    </body>
</html>
