<%-- 
    Document   : Form42
    Created on : 18 Sep, 2017, 3:13:07 PM
    Author     : Rajat Bansal
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FORM 42</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.2/angular.min.js"></script>
        <style>


            span { margin-left:11%;}
            .form42{
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
        <form action="form42desave" method="post">   
            <center>
                <h4>FORM 42<br/>
                    [Rules 69 (D) (4)]<br/>
                   OVERNIGHT PROTECTIVE STAY<br/>
                </h4>
            </center>    
            <span style="margin-left:16%;word-spacing:8px"> Whereas (name of the child) <input type="text" id="cpCname" name="cpCname" size="16" class="form42"/>has this day been apprehended/ found to be in</span><br/>
<span style="word-spacing:21px">need of overnight protective stay at the<input type="text" id="cpIname" name="cpIname" size="22" class="form42"/>(Name of the Institution).</span><br/>
            <span style="margin-left:16%;word-spacing:8px">The said child has been produced by<input type="text" id="cpCwpo" name="cpCwpo" size="16" class="form42"/>( Name of the child welfare police officer,</span><br/>
<span style="word-spacing:6px">from <input type="text" id="cpfrom" name="cpfrom" size="16" class="form42"/>Police station , <input type="text" id="cpPstation" name="cpPstation" size="8" class="form42"/>) . The child has been brought along with the required</span><br/>
<span style="word-spacing:5px">application seeking protective stay, medical report stating the general health condition of the child which has</span><br/>
<span>been duly perused by the person in-charge of the Institution.</span><br/>
            <span style="margin-left:16%;word-spacing:3px">The said child has been brought to the Institution at<input type="text" id="cpTime" name="cpTime" size="16" class="form42"/>. (time) and shall be handed over</span><br/>
<span style="word-spacing:11px">on the following day to the concerned jurisdiction of the child welfare police officer on or before</span><br/>
<span><input type="text" id="cpMtime" name="cpMtime" size="10" class="form42"/>(mention time).</span><br/>
            <span style="margin-left:16%;word-spacing:10px">The personal belongings of the child have been thoroughly searched and the following articles</span><br/>
<span style="word-spacing:14px"><input type="text" id="cpArticles" name="cpArticles" size="28" class="form42"/>. (if any) have been handed over to the concerned child welfare</span><br/>
<span>police officer.</span><br/>
           <span style="margin-left:16%;word-spacing:6px">In case the concerned child welfare police officer fails to report in due time to take custody of the</span><br/>
<span style="word-spacing:9px">child, such child shall be produced before the Juvenile Justice Board/ Child Welfare Committee by the</span><br/>
<span>Officer in charge of the Institution at the earliest.</span><br/>
<span>Copy to:</span><br/>
      <span style="margin-left:13%">1. Child Welfare Police Officer</span><br/>
      <span style="margin-left:13%">2. Board / Committee</span><br/>
      <span style="margin-left:13%">3. The Person in charge of the Institution</span><br/>
<span>Dated this <input type="text" id="cpDateday" name="cpDateday" size="16" class="form42"/> day of <input type="text" id="cpDatemon" name="cpDatemon" size="16" class="form42"/>20<input type="text" id="cpDateyr" name="cpDateyr" size="5" class="form42"/><br/>
<span style="word-spacing:320px">(Signature) (Signature) </span><br/>
<span>The Person-in-charge of the Institution &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; Child Welfare Police Officer</span><br/><br/>
         
            <span style="margin-left: 45%"><input type="submit" name="save" value="Save"/><input type="reset" name="clear" Value="Clear"/></span>
        </form>
    </body>
</html>


