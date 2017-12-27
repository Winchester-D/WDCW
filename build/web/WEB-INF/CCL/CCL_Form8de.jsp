<%-- 
    Document   : CWC_Meetings8de
    Created on : 15 Nov, 2017, 10:48:34 AM
    Author     : Shashank
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
        
            
            
        </style>
    </head>
    <body>
        
         <br><br>
                  <form method="post" action="CCL_Form8desave">
                      <center><h4>FORM 8<br/>
    [Rule 11(6)]<br/>
    UNDERTAKING/ BOND TO BE EXECUTED BY A PARENT/ GUARDIAN/ /FIT PERSON IN WHOSE CARE<br/>
    A CHILD IN CONFLICT WITH LAW IS PLACED</center><br/><br/>
    
    <span style="margin-left: 16.5%;word-spacing: 8px">Whereas I,<input type="text" class="form" name="ut_cname" id="ut_cname" size="19">being the parent, guardian, relative or fit person under whose</span><br>
    <span style="word-spacing: 8.3px">care<input type="text" class="form" name="ut_child" id="ut_child" >(name of the child) has been ordered to be placed by the Juvenile Justice</span><br>
    <span style="word-spacing: 8.9px">Board<input type="text" class="form" name="ut_jjb" id="ut_jjb"  size="15">having been directed by the said Board to execute an undertaking/ bond with</span><br>
    <span style="word-spacing: 9.2px">surety in the sum of Rs<input type="text" class="form" name="ut_sum" id="ut_sum"  size="5">/- (Rupees<input type="text" class="form" name="ut_rsw" id="ut_rsw"  size="23">)or without surety, I hereby bind</span><br>
    <span style="word-spacing: 7.9px">myself to be responsible for the good behavior and well-being of the said<input type="text" class="form" name="ut_child2" id="ut_child2"  size="10">and to observe</span><br>
    <span style="word-spacing: 8px">the following conditions for a period of<input type="text" class="form" name="ut_year" id="ut_year"  size="15">years with effect from<input type="text" class="form" name="ut_date" id="ut_date"  size="19"></span><br>
    <br><br>
    <span style="word-spacing: 7.4px">1.&emsp;That I shall not change my place of residence without giving previous intimation in writing to the</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;Juvenile Justice Board through the Probation Officer;</span><br><br>
    <span style="word-spacing: 5.5px">2.&emsp;That I shall not remove the said child from the limits of the jurisdiction of the Juvenile Justice Board</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;without previously obtaining the written permission of the Board;</span><br><br>
    <span style="word-spacing: 6.3px">3.&emsp;That I shall send the said child daily to school/to such vocation as is approved by the Board unless</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;prevented from so doing by circumstances beyond control;</span><br><br>
    <span style="word-spacing: 6.9px">4.&emsp;That I shall sincerely give effect to the Individual Care Plan with the help of the Probation Officer;</span><br>
    <br>
    <span style="word-spacing: 6.5px">5.&emsp;That I shall report immediately to the Board whenever so required by it and also produce the child</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;before the Board as and when directed to do so;</span><br><br>
    <span style="word-spacing: 4.3px">6.&emsp;That I shall produce the said child in my care before the Board, if he/she does not follow the orders of</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;Board or his/her behavior is beyond my control;</span><br><br>
    <span style="word-spacing: 5px">7.&emsp;That I shall report to the Board if the child goes out of my control or charge;</span><br>
    <br>  
    <span style="word-spacing: 7px">8.&emsp;That I shall render all necessary assistance to the Probation Officer to enable him to carry out the</span><br>
    <span style="word-spacing: 6px">&emsp;&nbsp;duties of supervision;</span><br><br>
    <span style="word-spacing: 3.8px">In the event of my making default herein, I undertake to appear before the Board and bind myself to pay to</span><br>
    <span style="word-spacing: 6px">Government the sum of Rs<input type="text" class="form" name="ut_sum2" id="ut_sum2"  size="5">(Rupees<input type="text" class="form" name="ut_rsw2" id="ut_rsw2"  size="5">).</span><br><br>  
    <span style="word-spacing: 6px">Dated this<input type="text" class="form" name="ut_date2" id="ut_date2"  size="15">day of<input type="text" class="form" name="ut_month" id="ut_month"  size="15">20<input type="text" class="form" name="ut_year1" id="ut_year1"  size="14">.</span><br><br>
    <span style="margin-left: 57%"><b>Signature of person executing the Undertaking/Bond.</b></span><br><br>
    <span style="margin-left: 84.4%">(Signed before me)</span><br><br>
    <span style="margin-left: 57.2%"><b>Principal Magistrate/ Member Juvenile Justice Board</b></span><br><br>
    <span style="word-spacing: 6px">Additional conditions, if any, by the Juvenile Justice Board may be entered numbering them properly;</span><br><br>
    <span style="margin-left: 12.2%;word-spacing: 6px">(Where a bond with sureties is to executed add)</span><br><br>
    <span style="word-spacing: 10.8px">I/We<input type="text" class="form" name="ut_cname2" id="ut_cname2"  size="18">of<input type="text" class="form" name="ut_place" id="ut_place"  size="18">(place of residence with full particulars) hereby declare</span><br>
    <span style="word-spacing: 8px">myself/ourselves as surety/sureties for the aforesaid<input type="text" class="form" name="ut_person" id="ut_person" size="15">(name of the person executing the</span><br>
    <span style="word-spacing: 13.5px">undertaking/bond) to adhere to the terms and conditions of this undertaking/bond. In case of</span><br>
    <span style="word-spacing: 13.9px"><input type="text" class="form" name="ut_cname3" id="ut_cname3"  size="10">(name of the person executing the bond) making fault therein, I/We hereby bind</span><br>
    <span style="word-spacing: 13px">myself/ourselves jointly or severally to forfeit to government the sum of Rs<input type="text" class="form" name="ut_sum3" id="ut_sum3"  size="16"></span><br>
    <span style="word-spacing: 14px"><input type="text" class="form" name="ut_rsw3" id="ut_rsw3"  size="14">)dated this the<input type="text" class="form" name="ut_date3" id="ut_date3"  size="10">day of<input type="text" class="form" name="ut_month2" id="ut_month2"  size="10">20<input type="text" class="form" name="ut_year2" id="ut_year2"  size="14">in the presence of</span><br>
    <span style="word-spacing: 13px"><input type="text" class="form" name="ut_cust" id="ut_cust"  size="20"></span><br><br> 
    <span style="margin-left: 78.4%"><b>Signature of Surety(ties)</b></span><br><br>
     <span style="margin-left: 84.4%">(Signed before me)</span><br><br>
    <span style="margin-left: 57.2%"><b>Principal Magistrate/ Member, Juvenile Justice Board</b></span><br><br><br>  
     <span style="margin-left: 46%"><input type="submit" value="SAVE">&nbsp;<input type="submit" value="CLEAR"></span>
    </form>   
    </body>
</html>
