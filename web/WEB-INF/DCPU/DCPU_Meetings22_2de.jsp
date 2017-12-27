<%-- 
    Document   : Form 22 _2
    Created on : 20 Sep, 2017, 11:02:33 AM
    Author     : VenkatadriReddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 22_2</title>
        <style>
            
               span
            {
                margin-left: 11%;
                
            }
            .form22
            {
                border-top-style:none;
                border-left-style:none;
                border-bottom-style:dotted;
                border-right-style: none;
                border-bottom-color:black;
            }
       
             #form_detail  { margin-left: 15%;
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
           
            <span>10.&nbsp; Landmark of the address<input type="text" class="form22"></span><br>
            <span>11.&nbsp; Address of last residence<input type="text" class="form22"></span><br>
            <span>12.&nbsp; Contact no. of father/mother/family member<input type="text" class="form22"></span><br><br>
            
            <span>13.&nbsp;  Whether the child is differently abled:</span> <span style="margin-left:4%">Yes/ No</span><br><br>
            <span style="margin-left:15%">(i)&emsp;Hearing Impairment</span><br>
            <span style="margin-left:15%">(ii)&emsp;Speech Impairment</span><br>
            <span style="margin-left:15%">(iii)&emsp;Physically disabled</span><br>
            <span style="margin-left:15%">(iv)&emsp;Mentally disabled</span><br>
            <span style="margin-left:15%">(v)&emsp;Others (please specify)</span><br><br>
           
            <span>14.&nbsp;Family Details:</span><br><br>
        
            
            <table id="form_detail">
                
                <tr>
                    <th>S.N.<br>(1)</th>
                    <th>Name and <br> relationship<br>(2)</th>
                    <th>Age<br>(3)</th>
                    <th>Sex<br>(4)</th>
                    <th>Education<br>(5)</th>
                    <th>Occupation<br>(6)</th>
                    <th>Income<br>(7)</th>
                    <th>Health<br>Status<br>(8)</th>
                    <th>History<br>of<br>Mental<br>Illness<br>(9)</th>
                    <th>Addiction<br>(10)</th>
                    
                </tr>
                <tr height="100">
                    
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                    
                </tr>
                
            </table>
            <br>
            
            <span>15.&nbsp;Relationship among the family members: </span><br><br>
            
            <table style="margin-left: 16%">
                
                <tr height="50" >
                    
                    <td width="200">i.&nbsp;  Father & mother</td><td width="300">Cordial/ Non cordial/ Not known</td>
                </tr>  
                    
                <tr height="50">
                    <td>ii.&nbsp;  Father & child </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                    
                <tr height="50">
                    <td>iii.&nbsp;  Mother & child </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                <tr height="50">
                    <td>iv.&nbsp;  Father & siblings </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                <tr height="50">
                    <td>v.&nbsp;  Mother & siblings </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                <tr height="50">
                    <td>vi.&nbsp;  Child & siblings </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                <tr height="50">
                    <td>vii.&nbsp;  Child & relative </td><td>Cordial/ Non cordial/ Not known </td>
                    
                </tr>    
                
               </table><br>
            
                
               <span>16.&nbsp;If child is married, name, age and details of spouse and children<input type="text" class="form22" size="25"> </span><br>
               
               <span>17.&nbsp;History of involvement of family members in offences, if any:  </span><br>
                
                
                
            
            
            
        </form>
        
    </body>
</html>
