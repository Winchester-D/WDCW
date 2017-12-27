<%-- 
    Document   : CWC_Meetings45de
    Created on : 15 Nov, 2017, 12:30:14 PM
    Author     : Rajat
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Form 45</title>
             <style>
            span { margin-left:11%;}
            .form45{
                border-top-style:none;
                border-left-style:none;
                border-right-style:none;
                border-bottom-style: dotted;
                border-bottom-color: black;
            }
        </style>
    </head>
    <body>
        <form action="form45desave" method="post"> 
            <center>
                <h4>FORM 45<br/>
                    [Rules 82(4)]<br/>
                   ESCORT ORDER<br/>
                </h4>
            </center>   
<span>Case No<input type="text" id="cpCaseno" name="cpCaseno" size="10" class="form45"/>. &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; In the matter of Boy/Girl Child</span><br/>
<span style="margin-left:53%"><input type="text" id="cpMgvb" name="cpMgb" size="22" class="form45"/>.</span><br/>
<span style="margin-left:52%">Aged about<input type="text" id="cpYear" name="cpYear" size="5" class="form45"/>year taken</span><br/>
<span>The Parents of the boy/girl child are reported to be residing at<input type="text" id="cpReside" name="cpReside" size="10" class="form45"/>..</span><br/>
<span style="margin-left:16%;word-spacing:8px">He/She therefore be sent under supervision of a proper police / recognized non governmental</span><br/>
<span>organization escort to the<input type="text" id="cpEscort" name="cpEscort" size="12" class="form45"/></span><br/>
<span style="margin-left:16%;word-spacing:5px">For tracing and for handing over to the parents or close relatives of the said Boy Child/Girl Child</span><br/>
<span style="word-spacing:3.5px">residing at the aforesaid address or at other Place which may be shown by the Child, if no such parents or</span><br/>
<span style="word-spacing:2.5px">relative are traced or if traced but they are unwilling to take charge of the boy/girl be kept in the custody of</span><br/>
<span style="word-spacing:4.5px">the Superintendent<input type="text" id="cpSupritendent" name="cpSupritendent" size="30" class="form45"/>.Children’s Home/ Place of Safety/ Observation Homes</span><br/>
<span style="word-spacing:4px">of the said district and the said Boy/Girl child be produced before the concerned Child Welfare Committee/</span><br/>
<span>Juvenile Justice Board for further orders.</span><br/>
<span>Orders</span><br/>
<span style="margin-left:16%;word-spacing:10px">Pending Escort, the said Boy/Girl Child shall remain in Children’s Home/ Place of Safety/</span><br/>
<span style="word-spacing:10px">Observation Homes, residing at present at<input type="text" id="cpResiding" name="cpResiding" size="10" class="form45"/> The State/District Child Protection Unit, or</span><br/>
<span style="word-spacing:12px">Police Department and recognized Non-governmental organization/ Childline shall positively make</span><br/>
<span style="word-spacing:3px">immediate arrangement not less than 15 days from the date of receipt of this order by him and send the</span><br/>
<span>said Boy Child/Girl Child at his/her aforesaid place of residence.</span><br/>
<span>Dated this<input type="text" id="cpDateday" name="cpDateday" size="10" class="form45"/>.day of<input type="text" id="cpDatemon" name="cpDatemon" size="10" class="form45"/>.20</span><br/>
<span style="margin-left:75%">Chairperson/Member</span><br/>
<span style="margin-left:72%">Child Welfare Committee</span><br/>
<span style="margin-left:73.5%">Juvenile Justice Board</span><br/>
<span>CC to:</span><br/>
<span>1.The Person in charge, Child Care Institution.</span><br/>
<span>2.The District Child Protection Unit or non-governmental organization or Childline</span><br/>
<span>Ref.: 1. Order of admission of minor<input type="text" id="cpOrderAdmission" name="cpOrderAdmission" size="8" class="form45"/>born on<input type="text" id="cpBornon" name="cpBornon" size="7" class="form45"/>.Profile No<input type="text" id="cpProfile" name="cpProfile" size="8" class="form45"/></span><br/><br/>
  <span style="margin-left: 45%"><input type="submit" name="save" value="Save"/><input type="reset" name="clear" Value="Clear"/></span>
</form>
    </body>
</html>
