<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

</head>
<body>
    <h1>View ${judul}</h1>

    <a style="text-decoration:none; color : red" href="form">Tambah Data ${judul}</a><br/><br/>
    <table border="1">
        <tr style="background-color:black;color:white">
            <c:forEach items="${column}" var="list">
                <th> ${list.column}</th>
            </c:forEach>
            <th>Action Update</th>
            <th>Action Delete</th>
        </tr>
         <c:forEach items="${field}" var="list">
                <tr>
                    <td>${list.book_id}</td>
                    <td>${list.author}</td>
                    <td>${list.book_name}</td>
                    <td>${list.category}</td>
                    <td>${list.date_release}</td>
                    <td><a href="http://localhost:8080/${judul}/view/${list.book_id}">Update</a></td>
                    <td><a href="http://localhost:8080/${judul}/delete/${list.book_id}">Delete</a></td>
                </tr>
         </c:forEach>
    </table>
    <h2><a href="http://localhost:8080/menu/home">Back To Menu</a></h2>
</body>

</html>
