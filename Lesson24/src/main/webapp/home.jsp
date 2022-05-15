<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>My Presentation</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<div class="container">
    <c:if test="${not empty myCard}">
        <h2>Presentation </h2>
        <p>My image:</p>
        <div class="card" style="width:400px">
            <img class="card-img-top" src="${contextPath}/images/${myCard.getImageName()}" alt="Card image"
                 style="width:100%">
            <div class="card-body">
                <h4 class="card-title"> ${myCard.getName()} </h4>
                <p class="card-text">Warranty Engineer at Atlant-M Company</p>
                <a href="#" class="btn btn-primary">See Profile</a>
            </div>
        </div>
    </c:if>
</div>
<br>
</body>
</html>

