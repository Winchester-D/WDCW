
    <%@taglib  uri="/struts-tags" prefix="s"%>
    <head>
<title></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
    </head>
   

    <nav class="navbar navbar-expand-sm" style="width:300px;border-radius: 9px 9px 0px 0px;">
  <ul class="navbar-nav" style="background-color:gray">
    <li class="nav-item active" style="background-color:aliceblue;">
      <a class="nav-link" href="CWC-Home" ><font style="color:#333"><s:text name="global.link.home"/></font></a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="UM-Logout" onmouseover="this.style.background='aliceblue'" onmouseout="this.style.background='gray'"><font style="color:#333"><s:text name="global.link.logout"/></font></a>
    </li>
  </ul>
</nav>