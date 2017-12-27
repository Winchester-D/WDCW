<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!--new code-->

<div id="accordion">

    <h3><a href="#">DCPU Forms</a></h3>
    <div>
        <table rules="rows" cellpadding="4" cellspacing="4" align="left">

            <tbody>


                <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                    <td><s:a href="javascript:" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green;" onclick="switchContent('monInspFosCare')">MONTHLY INSPECTION OF FOSTER FAMILIES/GROUP FOSTER CARE</s:a></td>
                    </tr>

                </tbody>
            </table>

        </div>  

        <h3><a href="#">DCPU Reports</a></h3>
        <div>
            <table rules="rows" cellpadding="4" cellspacing="4" align="left">

                <tbody>
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green;" onclick="switchContent('getSirde')">Social Investigation Report</s:a></td>
                    </tr>
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green;" onclick="switchContent('homeStudyFostrde')">Home Study Report</s:a></td>
                    </tr>

                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green;" onclick="switchContent('childStudyRep')">CHILD STUDY REPORT</s:a></td>
                    </tr>
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green;" onclick="switchContent('recFosCarede')">RECORD OF A CHILD IN FOSTER CARE</s:a></td>
                </tr>
            </tbody>
        </table>

    </div>  
</div>