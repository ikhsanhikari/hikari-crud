<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="en">
<head>
<title>Maruti Admin</title>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
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
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
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
    <!-- <li> <a href="charts.html"><i class="icon icon-signal"></i> <span>Charts &amp; graphs</span></a> </li>
    <li> <a href="widgets.html"><i class="icon icon-inbox"></i> <span>Widgets</span></a> </li> -->
    <!-- <li><a href="tables.html"><i class="icon icon-th"></i> <span>Tables</span></a></li> -->
<!--     <li><a href="grid.html"><i class="icon icon-fullscreen"></i> <span>Full width</span></a></li> -->
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
<!--     <li><a href="buttons.html"><i class="icon icon-tint"></i> <span>Buttons &amp; icons</span></a></li>
    <li><a href="interface.html"><i class="icon icon-pencil"></i> <span>Eelements</span></a></li>
    <li class="submenu"> <a href="#"><i class="icon icon-file"></i> <span>Addons</span> <span class="label label-important">4</span></a>
      <ul>
        <li><a href="index2.html">Dashboard2</a></li>
        <li><a href="gallery.html">Gallery</a></li>
        <li><a href="calendar.html">Calendar</a></li>
        <li><a href="chat.html">Chat option</a></li>
      </ul>
    </li> -->
  </ul>
</div>
<div id="content">
  <div id="content-header">
    <div id="breadcrumb"> <a href="#" title="Go to Home" class="tip-bottom"><i class="icon-home"></i> Home</a> <a href="#" class="current">Tables</a> </div>
    <h1>Tables</h1>
  </div>

  <div class="container-fluid">
    <div class="row-fluid">
      <div class="span12">
        <a class="btn btn-success" href="form">Tambah Data ${judul}</a><br/><br/>
        <div class="widget-box">
          <div class="widget-title">
             <span class="icon"><i class="icon-th"></i></span> 
            <h5>Data table</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered data-table">
              <thead>
                <tr>
                  <c:forEach items="${column}" var="list">
                      <th> ${list.column}</th>
                  </c:forEach>
                  <th>Action Update</th>
                  <th>Action Delete</th>
                </tr>
              </thead>
              <tbody>
                <c:forEach items="${field}" var="list">
                <tr>
                    <td>${list.id_barang}</td>
                    <td>${list.nama_barang}</td>
                    <td>${list.jenis_barang}</td>
                    <td>${list.berat_barang}</td>
                    <td>${list.tgl_exfired}</td>
                    <td><a href="http://localhost:8080/${judul}/view/${list.id_barang}"><button class="btn btn-primary">Update</button></a></td>
                    <td><a href="http://localhost:8080/${judul}/delete/${list.id_barang}"><button class="btn btn-danger">Delete</button></a></td>
                </tr>
         </c:forEach>
                <!-- <tr class="gradeX">
                  <td>Trident</td>
                  <td>Internet
                    Explorer 4.0</td>
                  <td>Win 95+</td>
                  <td class="center">4</td>
                </tr> -->
              </tbody>
            </table>
          </div>
        </div>
        <!-- <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>Static table</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped">
              <thead>
                <tr>
                  <th>Rendering engine</th>
                  <th>Browser</th>
                  <th>Platform(s)</th>
                  <th>Engine version</th>
                  <th>CSS grade</th>
                </tr>
              </thead>
              <tbody>
                <tr class="odd gradeX">
                  <td>Trident</td>
                  <td>Internet
                    Explorer 4.0</td>
                  <td>Win 95+</td>
                  <td class="center"> 4</td>
                  <td class="center">X</td>
                </tr>
                <tr class="even gradeC">
                  <td>Trident</td>
                  <td>Internet
                    Explorer 5.0</td>
                  <td>Win 95+</td>
                  <td class="center">5</td>
                  <td class="center">C</td>
                </tr>
                <tr class="odd gradeA">
                  <td>Trident</td>
                  <td>Internet
                    Explorer 5.5</td>
                  <td>Win 95+</td>
                  <td class="center">5.5</td>
                  <td class="center">A</td>
                </tr>
                <tr class="even gradeA">
                  <td>Trident</td>
                  <td>Internet
                    Explorer 6</td>
                  <td>Win 98+</td>
                  <td class="center">6</td>
                  <td class="center">A</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div> -->
        <!-- <div class="widget-box">
          <div class="widget-title"> <span class="icon">
            <input type="checkbox" id="title-checkbox" name="title-checkbox" />
            </span>
            <h5>Static table with checkboxes</h5>
          </div>
          <div class="widget-content nopadding">
            <table class="table table-bordered table-striped with-check">
              <thead>
                <tr>
                  <th><i class="icon-resize-vertical"></i></th>
                  <th>Rendering engine</th>
                  <th>Browser</th>
                  <th>Platform(s)</th>
                  <th>Engine version</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 4.0</td>
                  <td>Win 95+</td>
                  <td class="center"> 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 5.0</td>
                  <td>Win 95+</td>
                  <td class="center">5</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 4.0</td>
                  <td>Win 95+</td>
                  <td class="center"> 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 5.0</td>
                  <td>Win 95+</td>
                  <td class="center">5</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 5.5</td>
                  <td>Win 95+</td>
                  <td class="center">5.5</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Trident</td>
                  <td>Internet
                    Explorer 6</td>
                  <td>Win 98+</td>
                  <td class="center">6</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div> -->
        <!-- <div class="widget-box">
          <div class="widget-title"> <span class="icon"> <i class="icon-th"></i> </span>
            <h5>Static table with checkboxes in box with padding</h5>
            <span class="label label-info">Featured</span> </div>
          <div class="widget-content">
            <table class="table table-bordered table-striped with-check">
              <thead>
                <tr>
                  <th><input type="checkbox" id="title-table-checkbox" name="title-table-checkbox" /></th>
                  <th>Column name</th>
                  <th>Column name</th>
                  <th>Column name</th>
                  <th>Column name</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
                <tr>
                  <td><input type="checkbox" /></td>
                  <td>Row 1</td>
                  <td>Row 2</td>
                  <td>Row 3</td>
                  <td>Row 4</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div> -->
        
      </div>
    </div>
  </div>
</div>
<div class="row-fluid">
  <div id="footer" class="span12"> 2012 &copy; Marutii Admin. Brought to you by <a href="http://themedesigner.in">Themedesigner.in</a> </div>
</div>
<script src="http://localhost:8080/js/jquery.min.js"></script> 
<script src="http://localhost:8080/js/jquery.ui.custom.js"></script> 
<script src="http://localhost:8080/js/bootstrap.min.js"></script> 
<script src="http://localhost:8080/js/jquery.uniform.js"></script> 
<script src="http://localhost:8080/js/select2.min.js"></script> 
<script src="http://localhost:8080/js/jquery.dataTables.min.js"></script> 
<script src="http://localhost:8080/js/maruti.js"></script> 
<script src="http://localhost:8080/js/maruti.tables.js"></script>
</body>
</html>
