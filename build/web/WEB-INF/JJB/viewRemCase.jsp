<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<s:if test="%{remCaseDia==null}">
   
</s:if>

<s:else>
<hr/>
     <table border="1">
         <tr><td>Enter Remand Date:</td><td><s:date name="remCaseDia.remandCdDate" format="dd/MM/yyyy"/></td></tr>
         <tr><td>Fir Number:</td><td><s:property value="remCaseDia.accusedId.fir.firPK.firNo"/></td></tr>
         <tr><td>Accused Name:</td><td><s:property value="remCaseDia.accusedId.accuName"/></td></tr>
         <tr><td>Police Station:</td><td><s:property value="remCaseDia.accusedId.fir.firPK.policeStation"/></td></tr>
         <tr><td>DOB Certificate Type:</td><td>
                 <s:if test="%{remCaseDia.dobCertificateType==1}">
                     Matriculation Certificate
                 </s:if>
                     <s:elseif  test="%{remCaseDia.dobCertificateType==2}">
                         Date Of Birth Certificate from School
                     </s:elseif>       
                     <s:elseif test="%{remCaseDia.dobCertificateType==3}">  
                         Date Of Birth Certificate from Municipal Corporation
                     </s:elseif>    
                         <s:elseif test="%{remCaseDia.dobCertificateType==4}">
                             Ossification/Age Determination
                         </s:elseif>
                    <s:else>
                        <b>Not Submitted</b>
                    </s:else>    
                </td></tr>
         <tr><td>Examined Witness Details:</td><td><s:property value="remCaseDia.examinedWitnessDetails"/></td>
         </tr>
     </table>
</s:else>
