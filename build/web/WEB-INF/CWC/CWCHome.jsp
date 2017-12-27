<%-- 
    Document   : CWCHome
    Created on : 7 Jul, 2011, 10:20:41 AM
    Author     : ANUPAM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script>
            function selLangCWC(thisf)
        {
           
                  var e = document.getElementById("sel_lan_cwc");
                 
                  var strUser = e.options[e.selectedIndex].value;
  
  
              
                
                if(strUser!='sel')
                    {
                     document.lanSelectCWC.action="Select-Language-CWC?request_locale="+e.value;
                     document.lanSelectCWC.submit();
                    }
                    else
                        {
                            alert("Select Language");
                        }
        }
        
       
        </script>
    </head>
    <body>
        <h1>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:text name="global.heading.welcomeCWCJJBMember"/></h1>
        <p style="text-align: right">
          <s:form action="Select-Language-ActionCWC" name="lanSelectCWC" theme="css_xhtml" style="margin-left:10%">
       <p>
The Child Welfare Committee  (CWC)  is a body constituted by the State Government under the JJ Act to discharge all the responsibilities in relation to children in need of care and protection. It works along with the JJB.
</p>
<p>
CWC functions like a court and has the powers of a Metropolitan Magistrate/Judicial Magistrate First Class. It has exclusive power to deal with children in need of care. Wide-ranging functions and responsibilities are conferred on the CWC to carry out this mandate.
</p>
         <!--  <select id="sel_lan_cwc" onchange="selLangCWC(this);" name="">
                    <option value="sel"></option>
                    <option value="en">English</option>
                    <option value="hi">&#2361;&#2367;&#2306;&#2342;&#2368;</option>
                    <option value="te">&#3108;&#3142;&#3122;&#3137;&#3095;&#3137;</option>
                </select>-->
          
<ol type="1"><li>
<p> Taking cognizance of and receiving the children produced before it;</p>
</li>
<li>
<p> conducting inquiry on all issues relating to and affecting the safety and well being of the children under this Act;</p>
</li>
<li>
<p> directing the Child Welfare Officers or probation officers or District Child Protection Unit or non-governmental organizations to conduct social investigation and submit a report before the Committee;</p>
</li>
</ol>
          </s:form> 
     
      
    </body>
</html>
