<%-- 
    Document   : CWC_Meetings10_1de
    Created on : 14 Nov, 2017, 4:49:26 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            span { margin-left:11%;}
              .form10{
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }
            </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
 <span>3. Visit to school/ vocational training centre </span><br/>
<span> (i) Name of the school/centre<input type="text" id="cpSname" name="cSname" size="50" class="form10"></span><br/>
<span> (ii) Name of the Teacher / Principal met<input type="text" id="cpTpmet" name="cpTpmet" size="40" class="form10"></span><br/>
<span>(iii) Any unusual behavior observed<input type="text" id="cpUnusual" name="cpUnusual" size="40" class="form10"></span><br/>
<span>(iv) Feedback received on the progress of the child<input type="text" id="cpFeed" name="cpFeed" size="30" class="form10"></span><br/>
<span>(v) Attitude of the peers towards the child<input type="text" id="cpPeerAtt" name="cpPeerAtt" size="40" class="form10"></span><br/>
<span>(vi) Attitude of the child towards the peers<input type="text" id="cpChildAtt" name="cpChildAtt" size="40" class="form10"></span><br/>
<span>4. Visit to place of employment:</span><br/>
<span>(i) Nature of work<input type="text" id="cpWork" name="cpWork" class="form10" size="40"></span><br/>
<span>(ii) Working hours<input type="text" id="cpHours" name="cpHours" class="form10" size="40"></span><br/>
<span>(iii) Attitude of the child towards work<input type="text" id="cpChattw" name="cpChattw" class="form10" size="40"></span><br/>
<span>(iv) Violation of any labour laws, Low wages or wages being withheld, if observed and action</span><br/>
<span>taken against employer<input type="text" id="cpViolation" name="cpViolation" class="form10" size="40"></span><br/>
<span>5. Did you spend time speaking privately with the child Yes  No </span><br/>
<span>If no, give reasons<input type="text" id="cpNreason" name="cpNreason" class="form10" size="40"></span><br/>
<span>6. Progress made as per Rehabilitation and Restoration Plan under the Individual Care Plan (refer point 14</span><br/>
<span>of form 7)<input type="text" id="cpRehab" name="cpRehab" class="form10" size="40"></span><br/>
<span><input type="text" id="cName" name="cName" class="form10" size="60"></span><br/>
<span>7. Recommendations for modifications in Rehabilitation and Restoration Plan under the Individual Care Plan</span><br/>
<span>, if any:</span><br/>
<span>Prepared by:<input type="text" id="cpPrepare" name="cpPrepare" class="form10" size="40"></span><br/>
<span>(Probation Officer <input type="text" id="cpProbationD" name="cpProbationD" class="form10" size="5">/<input type="text" id="cpProbationM" name="cpProbationM" class="form10" size="5">/<input type="text" id="cpProbationY" name="cpProbationY" class="form10" size="5">(date)</span><br/>
<span>Plan: Date of next visit:<input type="text" id="cpDonv" name="cpDonv" class="form10" size="40"></span><br/>
<span>Action point if any: <input type="text" id="cpAp" name="cpAp" class="form10" size="40"></span><br/>
<span style="margin-left:75%">Signature</span><br/>
<span style="margin-left:75%">(Probation Officer)</span><br/><br/>
         <span style="margin-left: 45%"><input type="submit" name="save" value="Save"/><input type="reset" name="clear" Value="Clear"/></span>
   </form>
        </body>
</html>
