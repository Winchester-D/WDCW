<%-- 
    Document   : CWC_Meetings9de
    Created on : 15 Nov, 2017, 2:25:34 PM
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
        <form method="post" action="SimpleReport.jsp">
            <center><h4>FORM 9<br/>
                    [Rules 11(7)]<br/>
                    PERSONAL BOND BY CHILD</center><br/><br/>

            <span style="margin-left: 16.5%">Whereas I,<input type="text" class="form" name="pb_child" id="pb_child">inhabitant of<input type="text" class="form" name="pb_addr" id="pb_addr">(give full particulars such as house</span><br>
            <span style="word-spacing: 4px">number, road, village/town, tehsil, district, state) have been ordered to be sent back/restored by the Juvenile</span><br>
            <span style="word-spacing: 4.2px">Justice Board <input type="text" class="form" name="pb_jjb" id="pb_jjb" size="15">under section <input type="text" class="form" name="pb_us" id="pb_us" size="14">of the Juvenile Justice (Care and Protection of</span><br>
            <span style="word-spacing: 4px">Children) Act, 2015 on my entering into a personal bond to observe the conditions mentioned here in below.</span><br>
            <span style="word-spacing: 24px">Now, therefore, I do solemnly promise to abide by these conditions during the</span><br>
            <span>period<input type="text" class="form" name="pb_prd" id="pb_prd" size="15"></span>

            <br><br><br>

            <span style="margin-left: 16.5%">I hereby bind myself as follows:</span><br><br><br>

            <span>1.&emsp;That during the period<input type="text" class="form" name="pb_prd2" id="pb_prd2" size="21">I shall not ordinarily leave the village/town/district to which I am</span><br>
            <span style="word-spacing: 3.2px">&emsp;&nbsp;&nbsp;sent and shall not ordinarily return to<input type="text" class="form" name="pb_addr2" id="pb_addr2" size="21">or go anywhere else beyond the said district</span><br>
            <span style="word-spacing: 3.2px">&emsp;&nbsp;&nbsp;without the prior permission of the Board;</span><br><br>

            <span style="word-spacing: 5.1px">2.&emsp;That during the said period I shall attend school/ vocational training in the village/town or in the said</span><br>
            <span style="word-spacing: 3.2px">&emsp;&nbsp;&nbsp;district to which I am sent;</span><br><br>

            <span style="word-spacing: 5.1px">3.&emsp;That in case of my attending school/ vocational training at any other place in the said district I shall</span><br>
            <span style="word-spacing: 3.2px">&emsp;&nbsp;&nbsp;keep the Board informed of my ordinary place of residence.</span><br><br>

            <span style="word-spacing: 14px">&emsp;&emsp;I hereby acknowledge that I am aware of the above conditions which have been read</span><br>
            <span style="word-spacing: 4px">over/explained to me and that I accept the same.</span><br><br><br>

            <span style="margin-left: 56%"><b>(Signature or thumb impression of the child)</b></span><br><br>


            <span style="margin-left: 17%;word-spacing: 4.7px">Certified that the conditions specified in the above order have been read over/explained to (Name</span><br>
            <span style="word-spacing: 5px">of child)<input type="text" class="form" name="pb_child2" id="pb_child2" size="15">and that he has accepted them as the conditions upon non-compliance of which </span><br>
            <span style="word-spacing: 5px">he/she may be placed in safe custody. </span><br><br>

            <span style="margin-left: 16.5%;word-spacing: 6px">Certified accordingly that the said child has been released/ relieved on (date) <input type="text" class="form" name="pb_date" id="pb_date" size="15"></span><br>
            <br><br>

            <span style="margin-left: 82%;word-spacing: 6px"><b>Signature</b></span><br><br>
            <span style="margin-left: 66%;word-spacing: 6px"><b>Principal Magistrate/Members</b></span><br>
            <span style="margin-left: 72.5%;word-spacing: 6px"><b>Juvenile Justice Board</b></span><br><br><br>

            <span style="margin-left: 40%"><input type="submit" value="SAVE">&nbsp;<input type="submit" value="CLEAR"></span>

        </form>

    </body>
</html>
