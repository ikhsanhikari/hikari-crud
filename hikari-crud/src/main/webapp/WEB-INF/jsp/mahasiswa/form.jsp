<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>
    <link href="http://localhost:8080/webjars/bootstrap/4.1.0/css/bootstrap.min.css"
            rel="stylesheet">
    <script src="http://localhost:8080/webjars/bootstrap/4.1.0/js/bootstrap.min.js"></script>
    <script src="http://localhost:8080/webjars/jquery/1.9.1/jquery.min.js"></script>
</head>
<body>
<div class="container">
    <div class="alert alert-primary">
    <h1>Form Tambah Data ${judul}</h1>
    </div>
    <div class="row">
        <div class="col-md-5">
        <form:form method="POST" action="http://localhost:8080/${judul}/save_data" modelAttribute="${judul}">
            <c:forEach items="${column}" var="list">
               <div class="form-group">
                   <label>${list.column}</label>
                   <form:input class="form-control" path="${list.column}" />
               </div>
            </c:forEach>
            <input type="submit" class="btn btn-primary" value="save"/>
        </form:form>
        <br/>
        <h2><a href="http://localhost:8080/menu/home">Back To Menu</a></h2>
        </div>
     </div>
</div>
</body>

</html>
