<%-- 
    Document   : logout
    Created on : May 27, 2011, 5:53:00 PM
    Author     : trainee
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%--
session.removeAttribute("homeid");
session.removeAttribute("userid");

response.setHeader("Pragma", "no-cache");
response.setHeader("Cache-Control", "no-store");
session.invalidate();
--%>
<html>
    <head>
        <script>

            function deleteAllCookies() {
                var cookies = document.cookie.split(";");

                for (var i = 0; i < cookies.length; i++) {
                    var cookie = cookies[i];
                    var eqPos = cookie.indexOf("=");
                    var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
                    document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
                    //alert("---->"+document.cookie);
                }
                //alert(document.cookie);
            }


        </script>  
    </head>
<body onload="return deleteAllCookies()">   
          <font color="green">
        <h2>
            <p><s:text name="global.msg.logoutSucc"/>.</p>
            <p><a href="startup.jsp"><s:text name="global.msg.clickHere"/></a> <s:text name="global.msg.logAgain"/>.</p>
        </h2>
        </font>
</body>
</html>