<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Магазин товаров</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a class="navbar-brand" href="javascript:void(0)">SanekShop</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/eshop?command=home-page">Главная</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/eshop?command=redirect-to-cabinet">Кабинет</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/eshop?command=redirect-to-shopping-cart">Корзина</a>
                </li>
            </ul>
            <form class="d-flex">
                <input class="form-control me-2" id="search" type="text" placeholder="Введите название товара">
                <a href="${contextPath}/eshop?command=redirect-to-search"
                   button class="btn btn-primary" type="submit">Найти</a>
            </form>
        </div>
    </div>
</nav>


<div class="container mt-3">
    <h2>Корзина </h2>

    <c:if test="${not empty cartProducts}">

        <div class="row">
            <c:forEach items="${cartProducts}" var="product">

                <div class="col-sm-2 p-3 ">
                    <img class="card-img" style="width:130px;height:160px"
                         src="${contextPath}/images/${product.getImageName()}" alt="Card image">
                </div>
                <div class="col-sm-6 p-3">
                    <a><h4>Название: ${product.getName()}</h4></a><br>
                    <a><h4>Цена: ${product.getPrice()} руб.</h4></a><br>

                </div>

                <div class="col-sm-3 p-3">
                    <a href="${contextPath}/eshop?command=add-product-to-order&product_id=${product.getId()}" button
                       type="submit"
                       class="btn btn-success">Оформить</a>
                    <br>
                    <a href="${contextPath}/eshop?command=remove-product-from-cart&product_id=${product.getId()}" button
                       type="submit" class="btn btn-success">Удалить</a>
                </div>

            </c:forEach>
        </div>

        Общая сумма добавленных в корзину товаров:  ${totalPrice} руб.

    </c:if>

</div>
</body>
</html>