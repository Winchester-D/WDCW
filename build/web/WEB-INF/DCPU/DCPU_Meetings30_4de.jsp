<%-- 
    Document   : CWC_Meetings30_4de
    Created on : 7 Dec, 2017, 4:58:52 PM
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
                
                 <span style="margin-left: 8%"><b>H.&emsp; Anticipated Plans of the prospective foster parents for the child and rearing in the Family:</b></span><br>
                 <br>
                 
                  <span style="margin-left: 8%;word-spacing: 4px">&emsp;(1) Please describe how you will manage caring for the child and other life commitments such as</span><br>
                  <span style="margin-left: 8%">&emsp;&emsp;&emsp;work.</span><br><br>
                  
                  <span style="margin-left: 8%;word-spacing:2px">&emsp;(2) Who will be responsible for caring for the child when you are at work, or absent from the familial</span><br>
                  <span style="margin-left: 8%">&emsp;&emsp;&emsp;home (domestic help, grandparents, spouse).</span><br>
                  <br>
                  <span style="margin-left: 8%">&emsp;(3) Please describe your disciplinary approach to parenting.</span><br>
                  <br>
                  
                  <span style="margin-left: 8%;word-spacing:3px">&emsp;(4) In case the foster child demonstrates adjustment difficulties, please describe the steps that you</span><br>
                  <span style="margin-left: 8%">&emsp;&emsp;&emsp;plan to take to ease his/her transition into the family?</span><br>
                  <br>
                  <span style="margin-left: 8%;word-spacing:5px">&emsp;(5) Would you be prepared to utilize family counseling if the child continues to have difficulties</span><br>
                  <span style="margin-left: 8%">&emsp;&emsp;&emsp;adjusting?</span><br><br>
                  
                  <span style="margin-left: 20%">a)&emsp;&emsp;&emsp;Yes</span><br>
                  <span style="margin-left: 20%">a)&emsp;&emsp;&emsp;No</span><br><br>
                  
                  <span style="margin-left: 8%">&emsp;(6) Would you be willing to support financially higher professional studies of the foster child</span><br>
              <br>
                 <span style="margin-left: 20%">a)&emsp;&emsp;&emsp;Yes</span><br>
                 <span style="margin-left: 20%">a)&emsp;&emsp;&emsp;No</span><br><br>
                 
                 
                 
            <span style="margin-left: 8%;word-spacing:6px"><b>L.&emsp; Preparation and Training:</b>(Give details about the counseling sessions the prospective foster</span><br>     
            <span style="margin-left: 7%;word-spacing:3px">&emsp;&emsp;&emsp;parent(s) have undergone on foster care, child care, handling of needs of children, etc. and their</span><br>    
            <span style="margin-left: 7%;word-spacing:5px">&emsp;&emsp;&emsp;capacity, training and/or experiences in parenting children with their special need, if any)</span><br>  <br>
            
             <span style="margin-left: 8%;word-spacing:5px"><b>J.&emsp; Health Status (Emotional and Physical):</b>(Give details of the state of emotional and physical</span><br>     
            <span style="margin-left: 6.5%">&emsp;&emsp;&emsp;health status of the applicant(s), if any. If a family member suffers from a particular disease, condition or</span><br>    
            <span style="margin-left: 6.5%">&emsp;&emsp;&emsp;syndrome, describe how the family copes with it and how this might affect any proposed foster care.)</span><br>  <br>
              
            <span style="margin-left: 8%;word-spacing:3px">(1)&emsp;Do you or your spouse suffer from any medical condition? If so, would you please provide details?</span><br>
            <span style="margin-left: 8%">(2)&emsp;Are you or your spouse currently being treated by a psychologist or psychiatrist?</span><br>    
            <span style="margin-left: 8%">(3)&emsp;Are you currently taking any prescribed medication?</span><br>    
            <span style="margin-left: 8%">(4)&emsp;Are there currently any child/ren in your house being treated for a medical condition?</span><br>    
            <span style="margin-left: 8%;word-spacing:15px">(5)&emsp;Does your family have health and hospitalization insurance coverage for all family</span><br>
            <span style="margin-left: 8%">   &emsp;&emsp;&nbsp;members?</span><br>    <br>
            
            <h5><span style="margin-left:50%">Signature of the Prospective Foster Parents</span><br>
            <span style="margin-left:80%">Date</span></h5><br><br>
            
            <span style="margin-left: 8%"><b><u>PART-II: ASSESSMENT REPORT OF THE SOCIAL WORKER</u></b></span><br><br>
            
            <span style="margin-left: 8%">&emsp;(To be used by the Social Worker to prepare the assessment report)</span><br>
            <span style="margin-left: 8%">&emsp;(The information/facts filled in the template shall be kept confidential by the agencies /authorities.)</span><br><br>
            
            <span style="margin-left: 8%"><b>1.&emsp;Factual Assessment</b></span><br>
            <span style="margin-left: 8%">  (i)&emsp;Have you verified the contents of the facts mentioned in Part I of the template?</span><br><br>
            
            <span style="margin-left:62%">Yes/No</span><br><br>
            
            <span style="margin-left: 8%;word-spacing:9px">  (ii)&emsp;Are you satisfied about the facts mentioned in the documents vis-à-vis observation during</span><br><br>
             <span style="margin-left:62%">Yes/No</span>
             <br><br>
                 </div>
              
              </form>
    </body>
</html>
