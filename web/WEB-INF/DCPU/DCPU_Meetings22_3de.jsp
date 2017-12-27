<%-- 
    Document   : Form 22_3
    Created on : 23 Sep, 2017, 10:23:23 AM
    Author     : VenkatadriReddy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 22_3</title>
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
       
             #form_detail  { margin-left: 18%;
                            border:1px solid black;}
            table,tr,td,th{ border: 1px solid black;
                            border-collapse: collapse;
                            padding:5px; 
                            text-align: left;
            }  
            
            
            
            
        </style>
    </head>
    <body>
        <br>
        <form method="post" action="SimpleReport.jsp">
            
            <table id="form_detail">
                
                <tr>
                    <th>S.No.</th>
                    <th>Relationship</th>
                    <th>Nature of<br> Crime</th>
                    <th>Legal status<br>of the case</th>
                    <th>Arrest if<br>any Made</th>
                    <th>Period of<br>Confident</th>
                    <th>Punishment<br>awarded</th>
                    
                    
                </tr>
                
                <tr>
                    
                    <td>1.</td>
                    <td>Father</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                
                <tr>
                    
                    <td>2.</td>
                    <td>Step father</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                <tr>
                    
                    <td>3.</td>
                    <td>Mother</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                <tr>
                    
                    <td>4.</td>
                    <td>Step mother</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                
                <tr>
                    
                    <td>5.</td>
                    <td>Brother</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                <tr>
                    
                    <td>6.</td>
                    <td>Sister</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
                <tr>
                    
                    <td>7.</td>
                    <td>Others<br> (uncle/<br> aunty/<br> grandparents)</td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    <td></td>
                    
                </tr>
            </table><br>
            
          <span>18.&nbsp;Attitude towards religion<input type="text" class="form22"> </span><br>
          <span>19.&nbsp;Present living conditions<input type="text" class="form22"> </span><br>
          <span>20.&nbsp;Other factors of importance if any<input type="text" class="form22"> </span><br>
                
          <span>21.&nbsp;Habits of the child</span><br> <br>    
                
              <b><span style="margin-left: 40%">A</span></b>   <b><span style="margin-left: 18%">B</span></b>  <br>
              
        <b><span>i)</span></b> <span style="margin-left: 2%">Smoking</span>    <b><span style="margin-left: 15%">i)</span></b> <span style="margin-left: 2%">Watching TV/movies</span><br>
        <b><span>ii)</span></b> <span style="margin-left: 1.6%">Alcohol consumption</span>    <b><span style="margin-left: 6.8%">ii)</span></b> <span style="margin-left: 2%">Playing indoor/outdoor games</span><br> 
        <b><span>iii)</span></b> <span style="margin-left: 1.4%">Drug use (specify)</span>    <b><span style="margin-left: 7.8%">iii)</span></b> <span style="margin-left: 2%">Reading books</span><br>
        <b><span>iv)</span></b> <span style="margin-left: 1.4%">Gambling</span>    <b><span style="margin-left: 14%">iv)</span></b> <span style="margin-left: 2%">Religious activities</span><br>
        <b><span>v)</span></b> <span style="margin-left: 1.6%">Begging</span>    <b><span style="margin-left: 15.5%">v)</span></b> <span style="margin-left: 2%">Drawing/painting/acting/singing</span><br>
        <b><span>vi)</span></b> <span style="margin-left: 1.4%">Any other </span>    <b><span style="margin-left: 14%">vi)</span></b> <span style="margin-left: 2%">Any other</span><br>
   
            <br>
            
          <span>22.&nbsp;Extra-curricular interests<input type="text" class="form22"></span><br>
          <span>23.&nbsp;Outstanding characteristics and personality traits<input type="text" class="form22"></span><br>
          <span>24.&nbsp;The details of education of the child (tick as applicable)</span><br><br>
          
          <span style="margin-left: 12%">(i).</span> <span style="margin-left: 2%">Illiterate</span><br>
          <span style="margin-left: 12%">(ii).</span> <span style="margin-left: 1.7%">Studied up to V Standard</span><br>
          <span style="margin-left: 12%">(iii).</span> <span style="margin-left: 1.5%">Studied above V Standard but below VIII Standard</span><br>
          <span style="margin-left: 12%">(iv).</span> <span style="margin-left: 1.5%">Studied above VIII Standard but below X Standard</span><br>
          <span style="margin-left: 12%">(v).</span> <span style="margin-left: 1.7%">Studied above X Standard</span><br><br>
            
            
            <span>25.&nbsp;The details of the school in which studied last(tick as applicable) : </span><br><br>
            
            <span style="margin-left: 12.8%">a.</span> <span style="margin-left: 1.6%">Corporation/Municipal/Panchayat </span><br>
            <span style="margin-left: 12.8%">b.</span> <span style="margin-left: 1.6%">Government/SC Welfare School/BC Welfare School </span><br>
            <span style="margin-left: 12.8%">c.</span> <span style="margin-left: 1.6%">Government/SC Welfare School/BC Welfare School </span><br>
            <span style="margin-left: 12.8%">d.</span> <span style="margin-left: 1.6%">School under NCLP </span><br>
            
            
            
            
        </form>
    </body>
</html>
