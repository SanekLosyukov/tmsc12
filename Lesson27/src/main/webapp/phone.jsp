<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Магазин товаров</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div class="container mt-3">
    <h2>Добро пожаловать в магазин товаров</h2>
    <button type="button" class="btn btn-primary active">Гавная</button>
    <button type="button" class="btn btn-primary">Войти</button>
    <button type="button" class="btn btn-primary">Корзина</button>
</div>


<div class="container mt-3">
    <h2>Мобильные телефоны </h2>
    <p>Выберите категорию</p>
    <c:if test="${not empty phones}">
        <table class="table">
            <tbody>
            <tr>
                <c:forEach items="${phones}" var="phone">
                    <div class="card w-25 m-1" type="phone">
                        <div class="card-body">
                            <a>${phone.getName()}</a>
                                <%--                            <a href="${contextPath}/phone?id=${phone.getId()}">${phone.getName()}</a> эта строка необходима
                                                                если требуется ссылка на другой сервлет по нажатию на конкретную модель--%>
                                <%--                        contexPath - обращение к папке webapp--%>
                                <%--                        /phone - обращение к нашему сервлету категории--%>
                            <img class="card-img" style="width:150px;height:120px"
                                 src="${contextPath}/images/${phone.getImageName()}" alt="Card image">
                            <a>Описание: ${phone.getDescription()}</a><br>
                        </div>
                    </div>
                </c:forEach>
            </tr>
            </tbody>
        </table>
    </c:if>
</div>
</body>
</html>