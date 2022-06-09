<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register Form</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<div class="container">
    <%--    Put elements in the center of page
    offset-md-4 - смещение на 4 колонки вправо--%>
    <div class="col-md-8 offset-md-4">
        <h2>Register</h2>
        <p>Please, enter your credentials</p>
        <form method="post" action="/register" class="needs-validation" novalidate>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control w-25" id="name" placeholder="Enter name" name="name"
                       required>
                <div class="invalid-feedback">Name should be entered!</div>
            </div>
            <div class="form-group">
                <label for="surname">Surname:</label>
                <input type="text" class="form-control w-25" id="surname" placeholder="Enter surname" name="surname"
                       required>
                <div class="invalid-feedback">Surname should be entered!</div>
                <div class="form-group">
                    <label for="email">Email:</label>
                    <input type="text" class="form-control w-25" id="email" placeholder="Enter email" name="email"
                           required>
                    <div class="invalid-feedback">Email should be entered!</div>
                </div>
                <div class="form-group">
                    <label for="date">Date:</label>
                    <input type="text" class="form-control w-25" id="date" placeholder="Enter your birthday" name="date"
                           required>
                    <div class="invalid-feedback">Date should be entered!</div>
                </div>
                <button type="submit" class="btn btn-primary">Save credentials</button>
                <br>
                <a href="${contextPath}/eshop?command=sign-in" button type="submit" class="btn btn-primary">I'm already
                    registered</a>
            </div>
        </form>
    </div>
</div>
<script>
    // Disable form submissions if there are invalid fields
    (function () {
        'use strict';
        window.addEventListener('load', function () {
            // Get the forms we want to add validation styles to
            var forms = document.getElementsByClassName('needs-validation');
            // Loop over them and prevent submission
            var validation = Array.prototype.filter.call(forms, function (form) {
                form.addEventListener('submit', function (event) {
                    if (form.checkValidity() === false) {
                        event.preventDefault();
                        event.stopPropagation();
                    }
                    form.classList.add('was-validated');
                }, false);
            });
        }, false);
    })();
</script>
</body>
</html>

