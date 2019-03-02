<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
  
<head>
    <title>Maruti Admin</title><meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<!--     <link rel="stylesheet" href="../css/bootstrap.min.css" />
    <link rel="stylesheet" href="../css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="../css/uniform.css" />
    <link rel="stylesheet" href="../css/select2.css" />    
    <link rel="stylesheet" href="../css/maruti-style.css" />
    <link rel="stylesheet" href="../css/maruti-media.css" class="skin-color" />  --> 

    <link rel="stylesheet" href="http://localhost:8080/css/bootstrap.min.css" />
    <link rel="stylesheet" href="http://localhost:8080/css/bootstrap-responsive.min.css" />
    <link rel="stylesheet" href="http://localhost:8080/css/uniform.css" />
    <link rel="stylesheet" href="http://localhost:8080/css/select2.css" />    
    <link rel="stylesheet" href="http://localhost:8080/css/maruti-style.css" />
    <link rel="stylesheet" href="http://localhost:8080/css/maruti-media.css" class="skin-color" /> 
  </head>
  <body>
    
<!--Header-part-->
<div id="header">
  <h1><a href="dashboard.html">Maruti Admin</a></h1>
</div>
<!--close-Header-part--> 

<!--top-Header-messaages-->
<div class="btn-group rightzero"> <a class="top_message tip-left" title="Manage Files"><i class="icon-file"></i></a> <a class="top_message tip-bottom" title="Manage Users"><i class="icon-user"></i></a> <a class="top_message tip-bottom" title="Manage Comments"><i class="icon-comment"></i><span class="label label-important">5</span></a> <a class="top_message tip-bottom" title="Manage Orders"><i class="icon-shopping-cart"></i></a> </div>
<!--close-top-Header-messaages--> 

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse"><ul class="nav">
    <li class="" ><a title="" href="#"><i class="icon icon-user"></i> <span class="text">Profile</span></a></li>
    <li class=" dropdown" id="menu-messages"><a href="#" data-toggle="dropdown" data-target="#menu-messages" class="dropdown-toggle"><i class="icon icon-envelope"></i> <span class="text">Messages</span> <span class="label label-important">5</span> <b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li><a class="sAdd" title="" href="#">new message</a></li>
        <li><a class="sInbox" title="" href="#">inbox</a></li>
        <li><a class="sOutbox" title="" href="#">outbox</a></li>
        <li><a class="sTrash" title="" href="#">trash</a></li>
      </ul>
    </li>
    <li class=""><a title="" href="#"><i class="icon icon-cog"></i> <span class="text">Settings</span></a></li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>
<div id="search">
  <input type="text" placeholder="Search here..."/>
  <button type="submit" class="tip-left" title="Search"><i class="icon-search icon-white"></i></button>
</div>
<!--close-top-Header-menu-->           
 <div id="sidebar"><a href="http://localhost:8080/menu/home" class="visible-phone"><i class="icon icon-home"></i> Dashboard</a><ul>
    <li class="active"><a href="http://localhost:8080/menu/home"><i class="icon icon-home"></i> <span>Dashboard</span></a> </li>
    <li class="submenu"> <a href="#"><i class="icon icon-th-list"></i> <span>Master</span> <span class="label label-important">3</span></a>
      <ul>
        

        <c:forEach items="${global_menu}" var = "list">
            <c:choose>
                <c:when test="${list.is_display=='1'}">

                    
                    <li class="nav-item">
                       <li><a href="${list.menu_url}">${list.menu_name}</a></li>
                    </li>
                </c:when>
                <c:otherwise>
                </c:otherwise>
             </c:choose>


        </c:forEach>
      </ul>
    </li>

  </ul>
</div>
    <div id="content">
      <div id="content-header">
        <div id="breadcrumb">
        <a href="index.html" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a>
        <a href="#">Form elements</a>
        <a href="#" class="current">Validation</a>
        </div>
                <h1>Form validation</h1>
      </div>
      
      <div class="container-fluid">
        <div class="row-fluid">
          <div class="span12">
            <div class="widget-box">
              <div class="widget-title">
                <span class="icon">
                  <i class="icon-info-sign"></i>                  
                </span>
                <h5>Form validation</h5>
              </div>
              <div class="widget-content nopadding">
                <form:form method="POST" class="form-horizontal" action="http://localhost:8080/${judul}/save_data" id="basic_validate" modelAttribute="${judul}">
                  <c:forEach items="${column}" var="list">
                    <c:choose>
                       <c:when test="${list.type=='date'}">
                          <div class="control-group">
                                        <label class="control-label">${list.column}</label>
                                        <div class="controls">
                                            <form:input class="form-control" type="date" path="${list.column}" />
                                        </div>
                                    </div>
                       </c:when>
                       <c:otherwise>
                          <div class="control-group">
                                        <label class="control-label">${list.column}</label>
                                        <div class="controls">
                                            <form:input class="form-control" type="text" path="${list.column}" />
                                        </div>
                                    </div>
                           
                       </c:otherwise>
                    </c:choose>
                  </c:forEach>
                  <div class="form-actions">
                      <input type="submit" value="Save" class="btn btn-success">
                  </div>
                </form:form>
              </div>
            </div>      
          </div>
        </div>
      </div>
    </div> <div class="row-fluid">
      <div id="footer" class="span12"> 2012 &copy; Marutii Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
    </div>
            <script src="http://localhost:8080/js/jquery.min.js"></script>
            <script src="http://localhost:8080/js/jquery.ui.custom.js"></script>
            <script src="http://localhost:8080/js/bootstrap.min.js"></script>
            <script src="http://localhost:8080/js/jquery.uniform.js"></script>
            <script src="http://localhost:8080/js/select2.min.js"></script>
            <script src="http://localhost:8080/js/jquery.validate.js"></script>
            <script src="http://localhost:8080/js/maruti.js"></script>
            <script src="http://localhost:8080/js/maruti.form_validation.js"></script>
  </body>

</html>
