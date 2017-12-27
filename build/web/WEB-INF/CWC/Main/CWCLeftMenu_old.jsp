
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $('cwc-data').click(function () {
                $('cwc-data-bg').css({"background": "grey"});
                $('cwc-data').css({"color": "white"});
            });
        });
    </script>
</head>

<s:if test="#session.roleid == -2">
    <div id="accordion">
        <h3><a href="#"><s:text name="leftMenu.head.cwcjjbMem"/></a></h3>
        <div>
            <table rules="rows" cellpadding="4" cellspacing="4" align="left">
                <tbody>
                    <tr align="left" valign="top">
                        <td><s:a href="#" style="text-decoration: none;color: red;"><s:text name="leftMenu.item.cwcjjbMem"/></s:a></td>
                        </tr>                 
                        <tr align="left" valign="top">
                            <td><s:a href="CWCSo-Jasper" style="text-decoration: none;color: red;">Click here</s:a></td>
                        </tr>                     
                        <tr><td>hello</td></tr>
                    </tbody>
                </table>
            </div>
        </div>                       
</s:if>                                         
<s:elseif test="#session.roleid == -3">
    <div id="accordion">
        <h3 style="margin-left: 10%"><a href="#">CWC Meetings</a></h3>
        <div style="margin-left: 10%">
            <table rules="rows" cellpadding="1" cellspacing="1" align="left">

                <tbody >

                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="CW-ViewNewReportFoundChild" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">View Details of Found Child</s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="CW-CWCMeetings" style="text-decoration: none;color: green" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'"><s:text name="global.heading.CWCMeetMinsReg"/></s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="CW-ViewCWCMeetings" style="text-decoration: none;color: green" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'"><s:text name="global.heading.ViewCWCMeetMins"/></s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href='javascript:;' style="text-decoration: none;color: green;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('CWC-ViewCWCOrders')">View CWC Orders</s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'" id="cwc-data-bg">
                            <td><s:a href='javascript:;' style="text-decoration: none;color: green" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('dataEntry')" id="cwc-data">Data Entry</s:a></td>
                        </tr>

                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href='javascript:;' style="text-decoration: none;color: green" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('CWC-Reports')" id="cwc-reports">Reports</s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href='javascript:;' style="text-decoration: none;color: green;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('CWC-Summary')" id="cwc-Summary">Case Summary</s:a></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <h3 style="margin-left: 10%"><a href="#">Surrender Child</a></h3>
            <div style="margin-left: 10%">
                <table rules="rows" cellpadding="1" cellspacing="1" align="left">

                    <tbody>     
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('surrChildde')" style="text-decoration: none;color: green">Application For Surrender</s:a></td>
                        </tr>
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('deedSurde')" style="text-decoration: none;color: green">Deed Of Surrender</s:a></td>
                        </tr>               
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('surrChild')" style="text-decoration: none;color: green">View Application For Surrender</s:a></td>
                        </tr>  
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('deedSur')" style="text-decoration: none;color: green">View Deed Of Surrender</s:a></td>
                        </tr>               
                    </tbody>
                </table>
            </div>
            <h3 style="margin-left: 10%"><a href="#">Adoption</a></h3>      
            <div style="margin-left: 10%">
                <table rules="rows" cellpadding="1" cellspacing="1" align="left">

                    <tbody>     
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('certAdoption25')" style="text-decoration: none;color: green">Certificate Declaring The Child Legally Free For Adoption</s:a></td>
                        </tr>   
                        <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                            <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('getReportFoundChild25')" style="text-decoration: none;color: green">View Certificate Declaring The Child Legally Free For Adoption</s:a></td>
                    </tr>         
                </tbody>
            </table>
        </div>
                    
                    <h3 style="margin-left: 10%"><a href="#">Undertaking</a></h3>
	<div style="margin-left: 10%">
            <table rules="rows" cellpadding="1" cellspacing="1" align="left">
                <tbody>     
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('getHandOverde20')" style="text-decoration: none;color: green">Undertaking By The Parent Or Guardian Or Fit Person</s:a></td>
                    </tr>       
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'"> 
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('getHandOver')" style="text-decoration: none;color: green">View Undertaking By The Parent Or Guardian Or Fit Person</s:a></td>
                    </tr>                   
               </tbody>
            </table>
        </div>
                      <h3 style="margin-left: 10%"><a href="#">Foster Care</a></h3>
	<div style="margin-left: 10%">
            <table rules="rows" cellpadding="1" cellspacing="1" align="left">

                <tbody >    
                 <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('utFosCarede')" style="text-decoration: none;color: green">Undertaking By The Foster Family/Group Foster Care Organization</s:a></td>
                    </tr>       
                         
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'"> 
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('utFosCare')" style="text-decoration: none;color: green">View Undertaking By The Foster Family/Group Foster Care Organization</s:a></td>
                    </tr>    
                     
                 </tbody>
            </table>
         </div>                     
               <h3 style="margin-left: 10%"><a href="#">Others</a></h3>
	<div style="margin-left: 10%">
            <table rules="rows" cellpadding="1" cellspacing="1" align="left">
               <tbody>     
                    <!--tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><a href="CW-ViewNewReportFoundChild" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">Case Monitoring Sheet</a></td>
                    </tr-->
                    
                      <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><a href="CW-ViewNewReportFoundChild" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">Social Investigation Report</a></td>
                    </tr>
                      <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><a href="CW-HomeStudyDE" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">Home Study Report</a></td>
                    </tr>
                     <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'"> 
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('appFFInclde')" style="text-decoration: none;color: green">Application For Fit Facility Including Group Foster Care</s:a></td>
                    </tr> 
                     <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('certFFInclde')" style="text-decoration: none;color: green">Certificate Of Recognition Of Fit Facility Including Group Foster Care</s:a></td>
                    </tr> 
                     <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><a href="CW-ViewHomeStudy" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">View Home Study Report</a></td>
                    </tr>
                    <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><a href="CW-ViewChildStudy" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green">View Child Study Report</a></td>
                    </tr>
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'">
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('appFFIncl')" style="text-decoration: none;color: green">View Application For Fit Facility Including Group Foster Care</s:a></td>
                    </tr>       
                    <tr align="left" valign="top" onmouseover="this.style.background = 'grey'" onmouseout="this.style.background = 'aliceblue'"> 
                        <td><s:a href="javascript:;" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" onclick="switchContent('certFFIncl')" style="text-decoration: none;color: green">View Certificate Of Recognition Of Fit Facility Including Group Foster Care</s:a></td>               
                    </tr>
                 </tbody>
            </table>
         </div>         
                      <h3 style="margin-left: 10%"><a href="#"><s:text name="leftMenu.perAccSet"/></a></h3>
	<div style="margin-left: 10%">
            <table rules="rows" cellpadding="1" cellspacing="1" align="left">
                <tbody>
                    <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><s:a href="CWC-ChangePassword" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green"><s:text name="menuItem.changePass"/></s:a></td>
                    </tr>                 
                    <tr align="left" valign="top" onmouseover="this.style.background='grey'" onmouseout="this.style.background='aliceblue'">
                        <td><s:a href="CWC-ModifyMyDetails" onmouseover="this.style.color='white'" onmouseout="this.style.color='green'" style="text-decoration: none;color: green"><s:text name="menuItem.viewEditDetails"/></s:a></td>
                    </tr>                  
                </tbody>
            </table>
       </div>
    </div>   
                    </s:elseif>