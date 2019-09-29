<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thtmeleaf.org" >
<head>
    <meta content="text/html;charset=UTF-8">
    <title>Title</title>
    <link th:src="@{bootstrap-3.3.7-dist/css/bootstrap.css}" rel="stylesheet">
    <link th:src="@{bootstrap-3.3.7-dist/css/bootstrap-theme.css}" rel="stylesheet">
</head>
<script th:src="@{js/jquery-1.8.2.min.js}" type="text/javascript"></script>
<script th:src="@{bootstrap-3.3.7-dist/js/bootstrap.js}" type="text/javascript"></script>
<body>
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">访问model</h3>
            </div>
            <div class="panel-body">
                    <span th:text="${singlePerson.name}"></span>
            </div>
        </div>
        <script th:inline="javascript">
            var sinele = [[${singlePerson}]];
            console.log(sinele);
        </script>
</body>

</html>