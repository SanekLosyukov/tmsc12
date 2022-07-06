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
                    <a class="nav-link" href="${contextPath}/home">Главная</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/cabinet/open">Кабинет</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="${contextPath}/cart/open">Корзина</a>
                </li>
            </ul>
            <form method="post" action="${contextPath}/eshop?command=redirect-to-search" class="d-flex">
                <input class="form-control me-2" id="search" type="text" placeholder="Введите название товара"
                       name="search"
                       required>
                <button class="btn btn-primary" type="button">Найти</button>
            </form>
        </div>
    </div>
</nav>

<script>
    function productAddedToShoppingCartMsg() {
        window.confirm("Продукт добавлен в корзину!");
    }
</script>

<div class="container mt-3">
    <h2>${product.getName()}</h2>


    <div class="row">

            <div class="col-sm-2 p-3 ">
                <img class="card-img" style="width:130px;height:160px"
                     src="${contextPath}/images/${product.getImagePath()}" alt="Card image">
            </div>
            <div class="col-sm-6 p-3">
                <a><h4>Название: ${product.getName()}</h4></a><br>
                <a><h5>Описание:</h5> <h6> ${product.getDescription()}</h6></a><br>
                <a><h4>Цена: ${product.getPrice()} руб.</h4></a><br>
            </div>
            <div class="col-sm-3 p-3">
                <a href="${contextPath}/cart/add?product_id=${product.getId()}">
                    <button id="addProductToCart" type="submit" onclick="productAddedToShoppingCartMsg()">Купить</button>
                </a>

            </div>

    </div>


<%--    <!-- Carousel -->--%>
<%--    <c:if test="${not empty images}">--%>
<%--    <div id="demo" class="carousel slide" data-bs-ride="carousel">--%>

<%--        <c:forEach items="${images}" var="image">--%>
<%--            <!-- Indicators/dots -->--%>
<%--            <div class="carousel-indicators">--%>
<%--                <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>--%>
<%--                <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>--%>
<%--                <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>--%>
<%--            </div>--%>

<%--            <!-- The slideshow/carousel -->--%>
<%--            <div class="carousel-inner">--%>
<%--                <div class="carousel-item active">--%>
<%--                    <img src="${contextPath}/images/${image.getImageName()}" alt="Photo" class="d-block"--%>
<%--                         style="width:10%">--%>
<%--                </div>--%>
<%--                    &lt;%&ndash;                <div class="carousel-item">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;                    <img src="${contextPath}/images/${image.getImageName()}" alt="Photo" class="d-block"&ndash;%&gt;--%>
<%--                    &lt;%&ndash;                </div>&ndash;%&gt;--%>
<%--                    &lt;%&ndash;                <div class="carousel-item">&ndash;%&gt;--%>
<%--                    &lt;%&ndash;                    <img src="${contextPath}/images/${image.getImageName()}" alt="Photo" class="d-block"&ndash;%&gt;--%>
<%--                    &lt;%&ndash;                </div>&ndash;%&gt;--%>
<%--            </div>--%>
<%--        </c:forEach>--%>
<%--        <!-- Left and right controls/icons -->--%>
<%--        <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">--%>
<%--            <span class="carousel-control-prev-icon"></span>--%>
<%--        </button>--%>
<%--        <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">--%>
<%--            <span class="carousel-control-next-icon"></span>--%>
<%--        </button>--%>

<%--        <div class="container-fluid mt-3">--%>
<%--            <p>Все изображения продукта</p>--%>
<%--        </div>--%>

<%--        </c:if>--%>
<%--    </div>--%>
</body>
</html>