<%-- 
    Document   : CWC_MeetingsMinutes
    Created on : Jul 1, 2011, 11:43:49 AM
    Author     : Ramu Parupalli
--%>
<%@page import="com.opensymphony.xwork2.ActionContext" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <style>
        
        .hidden1
        {
            display:none;
        }
        
    </style>
    
        <style>
            
             
            
                       .blink {
  -webkit-animation-name: blink;
     -moz-animation-name: blink;
       -o-animation-name: blink;
          animation-name: blink;
  -webktit-animation-timing-function: linear;
      -moz-animation-timing-function: linear;
        -o-animation-timing-function: linear;
           animation-timing-function: linear;
  -webkit-animation-duration: 1s;
     -moz-animation-duration: 1s;
       -o-animation-duration: 1s;
          animation-duration: 1s;
}

.blink-infinite {
  -webkit-animation-iteration-count: infinite;
     -moz-animation-iteration-count: infinite;
       -o-animation-iteration-count: infinite;
          animation-iteration-count: infinite;
}


.blink-furiously {
  -webkit-animation-duration: 0.7s;
     -moz-animation-duration: 0.7s;
       -o-animation-duration: 0.7s;
          animation-duration: 0.7s;
}

@-webkit-keyframes blink {
  50% {
    opacity: 0;
  }
}
@-moz-keyframes blink {
  50% {
    opacity: 0;
  }
}
@-o-keyframes blink {
  50% {
    opacity: 0;
  }
}
@keyframes blink {
  50% {
    opacity: 0;
  }
}
           
        </style>
        <script>
            <jsp:include page="../../javascripts/CWC_MeetingsMins_Validation.jsp"></jsp:include></script>
                
        
        <script>
            
            
             $(document).ready(function() {
                 
            
    $('#dialog1').on("click", function() {
      
        $('<div>').dialog({
            modal: true,
            open: function ()
            {
                
                 if($("#orderIssued").val()==='Interviewagian')
                 {
                $(this).load('CWC_Meetings19Form',{'profile_id':$('#profile').val()},{'observations':$('#shashank').val()}).css('background-color','#ccffff');

                
        
                 } 
                 else if($("#orderIssued").val()==='sponserShip')
                 {
                    $(this).load('CWC_Meetings36Formde',{'profile_id':$('#profile').val()}).css('background-color','#ccffff');
                 }
                 
                 else if($("#orderIssued").val()==='afterCare')
                 {
                     
                     $(this).load('CWC_Meetings37Formde',{'profile_id':$('#profile').val()}).css('background-color','#ccffff');
                 }
                else if($("#orderIssued").val()==='fosterCare')
                 {
                     
                     $(this).load('CWC_Meetings32Formde',{'profile_id':$('#profile').val()}).css('background-color','#ccffff');
                 }
                  else if($("#orderIssued").val()==='callfordpo')
                 {
                     
                      $(this).load('CWC_Meetings21Formde', {'profile_id':$('#profile').val()}).css('background-color','#ccffff');
                 }
          
          
        },        
        
      
            
            height: 800,
            width: 1100
            
        });
    });
                 
        });
            
    
        </script>

        

    
    <script>
        
        function f()
        {
           
            if($("#orderIssued").val()==='transfer')
            {
              $("#div2").show();
              $("#dialog1").hide();
               $("#div3").hide();
              
            }
           else if($("#orderIssued").val()==='Interviewagian')
           {
               $("#div2").hide();
               $("#dialog1").show();
               $("#div3").hide();
           }
            else if($("#orderIssued").val()==='sponserShip')
           {
               $("#div2").hide();
               $("#dialog1").show();
               $("#div3").hide();
           }
           else if($("#orderIssued").val()==='afterCare')
           {
               $("#div2").hide();
               $("#dialog1").show();
               $("#div3").hide();
           }
            else if($("#orderIssued").val()==='fosterCare')
           {
               $("#div2").hide();
               $("#dialog1").show();
               $("#div3").hide();
           }
            else if($("#orderIssued").val()==='callfordpo')
           {
               $("#div2").hide();
               $("#dialog1").show();
               $("#div3").hide();
           }
            else if($("#orderIssued").val()==='handover')
           {
               $("#div2").show();
               $("#dialog1").hide();
               $("#div3").hide();
           }
            else if($("#orderIssued").val()==='other')
           {
               $("#div2").hide();
               $("#dialog1").hide();
               $("#div3").show();
               
           }
        }
        
    </script>
   
 
            
            
       
    </head>
    <body onload="document.getElementById('dialog-form_CWCMeetingsminutes').style.visibility='hidden'">
        
         
    <% String profile_id = ActionContext.getContext().getSession().get("foundhomeid").toString(); %> 
    <% String observations = ActionContext.getContext().getSession().get("foundhomeid").toString();%>
        <center>
            <b>Profile Id:</b><s:property value="foundchildprofileid"/><br/>
            <CAPTION><font size="3"><b><s:text name="global.heading.CWCMeetMinsReg"/>(Form32)</b></font></CAPTION> 
            
                
            <input type="hidden" id="profile" name="profile" value="<%= profile_id %>"/>
            <input type="hidden" id="shashank" name="shashank" value="<%= observations %>">
            
       


         
        
    
              <s:form action="CWCMeetings-Save" method="POST" name="cwcmeets" id="cwcmeets" theme="css_xhtml"> <!--new action = SICD-Save-->
                                      
       <s:hidden name="formName" value="cwcmeets"/>
                <table cellspacing="0">
                    <tr><td align="right"><s:text name="package.label.CWCMeetMinMeetDate" />:</td><td><s:textfield name="dateofcwcmeeting" id="datepicker" readonly="true" /></td></tr>
                    <tr><td align="right"><s:text name="package.label.CWCMeetMinVenue" />:</td><td><s:textfield name="venue" id="venue" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr>
                    <tr><td align="right"><s:text name="package.label.CWCMeetMinMemNo" />:</td><td><s:textfield name="noOfMembers" id="noOfMembers" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr>
                                <tr><td align="right">CWC District:</td><td><select name="cwcdistrict">
                                            <option value="cwcadilabad">CWC Adilabad</option>
                                            <option value="cwcjagityal">CWC Jagityal</option>
                                            <option value="cwchyderabad">CWC Hyderabad</option>
                                            <option value="cwcvikarabad">CWC Vikarabad</option>
                                            <option value="cwcwarangal">CWC Warangal</option>
                            </select></td></tr>
               <%--     <tr><td align="right"><s:text name="package.label.CWCMeetMinChaPer" />:</td><td><s:textfield name="designation" id="designation" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr> --%>
                </table> 
                <br>
                  <table border="1" id="CWCMeet">
                         <thead>
                          
                         </thead>
                         <tr>
                             
                        <td>
                            <table> 
                                <%--                                     
                       <tr><th><s:text name="package.label.CWCMeetMinChProfId" /></th><td><select name="childProfileId_cwc" id="childProfileId_cwc">
                                   <option value="1">---<s:text name='global.option.headerKey'/>---</option>
                                   <c:forEach items="${childrenListInAHome}" var="obj">
                                       <option value=${obj.childProfileId}>${obj.childName}---->${obj.childProfileId}</option>
                                   </c:forEach>
</select>--%><%--s:select name="childProfileId_cwc" id="childProfileId_cwc" labelposition="left" headerKey="1" headerValue="--Please Select--" list="childrenListInAHome" listKey="childProfileId" listValue="%{childName+'-->'+childProfileId}"/--%>
                                <%--   </td></tr>
                                --%>
                       
                       <tr><th><s:text name="package.label.CWCMeetMinObser" /></th><td><s:textarea id="observations" name="observations" rows="2" cols="15" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr>
                       <tr><th><s:text name="package.label.CWCMeetMinActTake" /></th><td><s:textarea id="actiontobeTaken" name="actiontobeTaken" rows="2" cols="15" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr>
                     <%--   <tr><th><s:text name="package.label.CWCMeetMinFollUp" /></th><td><s:textarea id="followUp" name="followUp" rows="2" cols="15" onfocus='VirtualKeyboard.attachInput(this);currentTB=this.id;'/></td></tr> --%>
                        <!-- order issued -->           <tr><th><s:text name="package.label.CWCMeetMinOrdIssu" /></th><td><select id="orderIssued" name="orderIssued" onchange="f()" > <!--  onchange="execDiv(this)"   -->
                            
                                    <option value="1">--<s:text name='global.option.headerKey'/>--</option> 
                              <option value="<s:text name='Interviewagian'/>"><s:text name='Interview the child again'  /></option>
                              <option value="<s:text name='transfer'/>"><s:text name='Transfer to the Other home' /></option>
                              <option value="<s:text name='handover' />"><s:text name='Hand Over to Parents'/></option>
                              <option value="<s:text name='callfordpo'/>"><s:text name='Call for DPO Report'/></option>
                              <option value="<s:text name='fosterCare' />"><s:text name='Foster Care Placement' /></option>
                              <option value="<s:text name='sponserShip'/>"><s:text name='Sponser Ship Placement'/></option>
                              <option value="<s:text name='afterCare'/>"><s:text name='After Care Placement'/></option>
                              <option value="<s:text name='other' />"><s:text name='Other'/></option>
                             
                              
                                </select><%--s:select id="orderIssued" name="orderIssued" headerKey="1" headerValue="---Please select----" list="#{'Interviewagian':'Interview the child again','transfer':'Transfer to other home','handover':'Hand over to parents','otherstate':'Transfer to other State','callfordpo':'Call for DPO Report'}"/--%></td></tr>
                            
                                
                                
                                
                                


                  <!--       <center><button id="dialog1" class="button button1" type="submit" onclick="execDiv(this)">Fill The Form</button></center>-->
                            </table>       
                         
                
                            
                        <table border="0" id="CWCMeet"> <br>
                            <div class="blink blink-furiously blink-infinite" style="color:red;margin-left: 36%">
                            <div id="div2" class="hidden1" ><b>< NO FORM FROM THE ACT ></b>
                                    
                                    
                                </div>
                                </div>
                            
                            <div id="div3" class="hidden1">
                                    
                                <textarea rows="2" cols="15" style="margin-left:40%"></textarea>
                                <br>
                                    <input type="submit" value="submit" style="margin-left:40%">
                                    
                                </div>
                            <center>    <input style="margin-left:20%" id="dialog1"  type="button" value="Fill Order Details"/></center>
                   <!--    <tr><td colspan="2">Signature</td></tr>
                       <tr><td>Signed before Child Welfare Committee</td></tr>  -->
                            </table>
                       </td>
                     </tr>
                 </table>
                            
                   <!--         
                     <INPUT type="button" value="<s:text name="global.button.AddRow"/>" onclick="addRow('CWCMeet')" />&nbsp;&nbsp;<INPUT type="button" value="<s:text name="global.button.DeleteRow"/>" onclick="deleteRow('CWCMeet')"/>
              
                     
                     
                             <center> <input type="submit" value="<s:text name="global.button.submit"/>"/><input type="reset" value="<s:text name="global.button.clear"/>"/></center> -->
              </s:form>
                      
                 
                             
                    <div id="dialog-form_CWCMeetingsminutes" title="<s:text name="global.heading.CWCMeetMinsReg"/> <s:text name="global.heading.preview"/>">
	<form name="CWCMeetingsminutes_prevwindow">
              <s:text name="package.label.CWCMeetMinMeetDate" />:<span id="dateofcwcmeeting_span"></span><br>
              <s:text name="package.label.CWCMeetMinVenue" />:<span id="venue_span"></span><br>
              <s:text name="package.label.CWCMeetMinMemNo" />:<span id="noOfMembers_span"></span><br>
              <s:text name="package.label.CWCMeetMinChaPer" />:<span id="designation_span"></span>
	<table border="1" id="cwcmeetings_span">
            <thead>
             <tr>
                 <th><s:text name="package.label.CWCMeetMinSNO" /></th>
                <th><s:text name="package.label.CWCMeetMinChProfId" /></th>
                <th><s:text name="package.label.CWCMeetMinObser" /></th>
                <th><s:text name="package.label.CWCMeetMinActTake" /></th>
                <th><s:text name="package.label.CWCMeetMinFollUp" /></th>
                <th><s:text name="package.label.CWCMeetMinOrdIssu" /></th>
                <th><s:text name="package.label.CWCMeetMinOrderNo" /></th>
                 <th><s:text name="package.label.CWCMeetMinRemarks" /></th>
              </tr>
            </thead>
            <tbody>
             <tr>
             </tr>
            </tbody>
        </table>
	</form>
        </div>          
                             
         
                             
                             
        </center>
    </body>
</html>

