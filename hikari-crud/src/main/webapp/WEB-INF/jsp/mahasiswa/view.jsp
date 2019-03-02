<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
        <link href="http://localhost:8080/webjars/bootstrap/4.1.0/css/bootstrap.min.css"
                    rel="stylesheet">
            <script src="http://localhost:8080/webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
            <script src="http://localhost:8080/webjars/jquery/1.9.1/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/webjars/datatables/1.10.12/css/jquery.dataTables.css">
        <link rel="stylesheet" type="text/css" href="http://localhost:8080/webjars/font-awesome/5.5.0/css/fontawesome.min.css">
</head>
<body>
    <div class="alert alert-primary">
    <h1>View ${judul}</h1>
    </div>
    <a class="btn btn-success" href="form">Tambah Data ${judul}</a><br/><br/>
    <table border="1" id="test">
        <thead>
        <tr >
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
                    <td>${list.nim}</td>
                    <td>${list.alamat}</td>
                    <td>${list.email}</td>
                    <td>${list.nama}</td>
                    <td>${list.no_telp}</td>
                    <td><a href="http://localhost:8080/${judul}/view/${list.nim}"><button class="btn btn-primary">Update</button></a></td>
                    <td><a href="http://localhost:8080/${judul}/delete/${list.nim}"><button class="btn btn-danger">Delete</button></a></td>
                </tr>
         </c:forEach>
         </tbody>
    </table>
    <br/>
    <h2><a href="http://localhost:8080/menu/home">Back To Menu</a></h2>
      <script type="text/javascript" charset="utf8" src="http://localhost:8080/webjars/jquery/1.9.1/jquery.min.js"></script>
      <script type="text/javascript" charset="utf8" src="http://localhost:8080/webjars/datatables/1.10.12/js/jquery.dataTables.js"></script>
      <script>
      $(function(){
        $("#test").dataTable();
      })
      </script>

</body>

</html>
