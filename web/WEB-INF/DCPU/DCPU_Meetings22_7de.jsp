<%-- 
    Document   : Form 22_7
    Created on : 20 Sep, 2017, 12:56:12 PM
    Author     : VenkatadriReddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>form 22_7</title>
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
        </style>
    </head>
    <body>
        <br>
        <form method="post" action="SimpleReport.jsp">
            
            <span>9.&nbsp;Psycho-social expert’s assessment <input type="text" class="form22"></span><br>
            <span>10.&nbsp; Religious factors <input type="text" class="form22"></span><br>
            <span>11.&nbsp;Risk analysis for the child to be restored to the family <input type="text" class="form22"></span><br>
            <span>12.&nbsp;Previous institutional/case history and individual care plan, if any: <input type="text" class="form22"></span><br>
            <span>13.&nbsp;Recommendation  of  Child  Welfare  Officer/Case  Worker/Social  Worker  regarding  psychological</span><br>
            <span>support, rehabilitation and reintegration of the child and suggested plan<input type="text" class="form22"></span><br>
            <br>
            <h5><span>Signature</span><br/>
            <span>(Of the Person assigned)</span></h5><br><br><br><br><br><br><br><br><br><br>           
             <span style="margin-left: 38%"><button class="button button1" type="submit">SAVE</button>&nbsp;<button class="button button2" type="reset">CLEAR</button></span>    
        </form>      
    </body>
</html>
