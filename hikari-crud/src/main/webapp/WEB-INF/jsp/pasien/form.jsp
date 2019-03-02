<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html lang="en">
<head>

</head>
<body>
    <h1>Form Tambah Data ${judul}</h1>
    <form:form method="POST" action="http://localhost:8080/${judul}/save_data" modelAttribute="${judul}">
        <c:forEach items="${column}" var="list">
           <p> ${list.column}</p>
           <c:choose>
              <c:when test="${list.type=='date'}">
                    <form:input type="date" path="${list.column}" required="true" />
              </c:when>
              <c:otherwise>
                    <form:input type="text" path="${list.column}" required="true" />
              </c:otherwise>
            </c:choose>

        </c:forEach>
        <input type="submit" value="save"/>
    </form:form>
    <h2><a href="http://localhost:8080/menu/home">Back To Menu</a></h2>
</body>

</html>
