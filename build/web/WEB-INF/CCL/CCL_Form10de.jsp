<%-- 
    Document   : Form37
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 37</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <style>
 table,tr,td{ 
              border: 1px solid black;
              border-collapse: collapse;
              text-align: left;
            }
            span { margin-left:11%;}
            .form10{
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }
            
        </style>
    </head>
    <body>
        <br/>
        <form action="form10desave" method="post">   
            <center>
                <h4>FORM 10<br/>
                    [Rules 11(9) and 64 (3) (xiii)]<br/>
                    PERIODIC REPORT BY PROBATION OFFICER WHEN A CHILD IS RELEASED ON PROBATION<br/>
                </h4>
            </center>            
            <span style="word-spacing:4px">FIR No<input type="text" id="cpFirno" name="cpFirno" size="18" class="form10"/>Police Station<input type="text" id="cpPstaion" name="cpPstation" size="18" class="form10"/>U/Sections<input type="text" id="cpUsec" name="cpUsec" size="18" class="form10"/></span><br/>
<span>In the matter of<input type="text" id="cpMatter" name="cpMatter" size="18" class="form10"/> vs<input type="text" id="cpVs" name="cpVs" size="18" class="form10"/></span><br/>
<span style="margin-left:16%">Whereas (name of the child) <input type="text" id="cpName" name="cpName" size="15" class="form10"/>, age<input type="text" id="cpAge" name="cpAge" size="7" class="form10"/>, has on<input type="text" id="cpDate" name="cpDate" size="12" class="form10"/> (date) been found to be a</span><br/>
<span style="word-spacing:7px">child in conflict with law, and has been placed under the care of<input type="text" id="cpCare" name="cpCare" size="18" class="form10"/>(parent/ guardian/ fit</span><br/>
<span>person/fit facility) and under the supervision of<input type="text" id="cpPname" name="cpPname" size="18" class="form10"/>(name of Probation Officer)</span><br/>
          <br/>
          <table style="margin-left:11%">
              <tr><td>Reg. No. :-<input type="text" id="cpRegno" name="cpRegno" size="10" class="form10"/></td><td>Age (approximately) :-<input type="text" id="cpAgeapp" name="cpAgeapp" size="7" class="form10"/></td><td>Sex:- Male / Female /<input type="text" id="cpGender" name="cpGender" size="7" class="form10"/></td></tr>
           <tr><td>Name:-<input type="text" id="cpTname" name="cpTname" size="14" class="form10"/></td><td>Fathers Name:-<input type="text" id="cpTfname" name="cpTfname" size="14" class="form10"/></td><td>Religion:-<input type="text" id="cpTreligion" name="cpTreligion" size="10" class="form10"/></td></tr>    
          <tr><td>Education: -<input type="text" id="cpTeducation" name="cpTeducation" size="10" class="form10"/></td><td>Vocational Training, if any<input type="text" id="cpTvt" name="cpTvt" size="15" class="form10"/></td><td>Language(s) known:-<input type="text" id="cpTlk" name="cpTlk" size="14" class="form10"/></td></tr> 
           <tr><td>Next court date:-<input type="text" id="cpTncd" name="cpTncd" size="15" class="form10"/></td><td>Employment, if any<input type="text" id="cpTemp" name="cpTemp" size="10" class="form10"/></td><td>Date of admission (in case of fit<br/> person/fit facility)<input type="text" id="cpTdoa" name="cpTdoa" size="10" class="form10"/></td></tr> 
          </table>
<span> Case details and summary</span><br/>
<span><input type="text" id="cpCds" name="cpCds" size="70" class="form10"/></span><br/>
<span><input type="text" id="cpCds" name="cpCds" size="70" class="form10"/></span><br/>
<span><input type="text" id="cpCds" name="cpCds" size="70" class="form10"/></span><br/>
<span>1. Preliminary details:</span><br/>
<span style="margin-left:13%">(i) &nbsp; Visit Date:<input type="text" id="cpDay" name="cpDay" size="10" class="form10"/>/<input type="text" id="cpMon" name="cpMon" size="10" class="form10"/>/<input type="text" id="cpYr" name="cpYr" size="10" class="form10"/></span><br/>
<span style="margin-left:13%">(ii) &nbsp; Name of Parent / Guardian<input type="text" id="cpParent" name="cpParent" size="38" class="form10"/></span><br/>
<span style="margin-left:13%">(iii) &nbsp; Names of Other Adults Living in the Home and with whom the Probation Officer interacted:</span><br/>
<span>2. Observations:</span><br/>
<span style="margin-left:13%">(i) &nbsp; Child’s behaviors<input type="text" id="cpBehavior" name="cpBehavior" size="48" class="form10"/></span><br/>
<span style="margin-left:13%">(ii) &nbsp; Physical and mental health status/needs of child and family<input type="text" id="cpHstatus" name="cpHstatus" size="10" class="form10"/></span><br/>
<span style="margin-left:13%">(iii) &nbsp; Inter-personal relationship of the child with the family<input type="text" id="cpRelationcf" name="cpRelationcf" size="13" class="form10"/></span><br/>
<span style="margin-left:13%">(iv) &nbsp; Inter-personal relationship with friends<input type="text" id="cpRelationf" name="cpRelationf" size="24" class="form10"/></span><br/>
<span style="margin-left:13%">(v) &nbsp; Safety and supervision in the family<input type="text" id="cpSafety" name="cpSafety" size="28" class="form10"/></span><br/>
<span style="margin-left:13%">(vi) &nbsp; Difficulties faced by the child<input type="text" id="cpCdifficulty" name="cpCdifficulty" size="30" class="form10"/></span><br/>
<span style="margin-left:13%">(vii) &nbsp; Difficulties faced by the family<input type="text" id="cpFdifficulty" name="cpFdifficulty" size="29" class="form10"/></span><br/>
<span style="margin-left:13%">(viii) &nbsp; Changes in the household<input type="text" id="cpHhold" name="cpHhold" size="33" class="form10"/></span><br/>
<span style="margin-left:13%">(ix) &nbsp; Vocational training, if any being undertaken by the child<input type="text" id="cpVT" name="cpVT" size="10" class="form10"/></span><br/>
<span style="margin-left:13%;word-spacing:9px">(x) Engagement of child in any anti-social activities or harmful activities (Examples could be exhibiting</span><br/>
<span style="margin-left:13%;word-spacing:13.5px">bullying behaviour, violent outbursts, destructions, self-harm, lying, defiance, impulsiveness, lack of</span><br/>
<span style="margin-left:13%">empathy, sexually deviant actions etc.)<input type="text" id="cpMiscellaneous" name="cpMiscellaneous" size="70" class="form10"/></span><br/>
<span style="margin-left:13%">(xi) &nbsp; Time elapsed since last engagement in any anti-social behavior or harmful activities<input type="text" id="cpTime" name="cpTime" size="25" class="form10"/></span><br/>      
           
        </form>
    </body>
</html>


