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
    <h2>Выберите категорию</h2>
    <button type="button" class="btn btn-primary active">Гавная</button>
    <button type="button" class="btn btn-primary">Войти</button>
    <button type="button" class="btn btn-primary">Корзина</button>
</div>


<div class="container mt-3">

    <c:if test="${not empty productList}">
        <table class="table">
            <tbody>
            <tr>
                <c:forEach items="${productList}" var="product">
                    <div class="card w-25 m-1" type="product">
                        <div class="card-body">

                            <img class="card-img" style="width:150px;height:120px"
                                 src="${contextPath}/images/${product.getImageName()}" alt="Card image"> <br>
                            <a>${product.getName()}</a><br>
                            <a>Описание: ${product.getDescription()}</a><br>
                            <a>Цена: ${product.getPrice()}</a><br>
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