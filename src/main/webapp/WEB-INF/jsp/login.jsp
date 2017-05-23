<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>login.jsp</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="rec/jQuery/jquery-2.1.4.js"></script>
    <script src="rec/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="rec/bootstrap/css/bootstrap.css" type="text/css"/>
    <style type="text/css">
        form{
            height: 150px;
            width: 400px;
            margin:20px auto;
        }
    </style>
</head>
<body>
<form class="form-horizontal" action="loginCheck.do" method="post">
    <%--<form class="form-horizontal" role="form" action="../html/login.html" method="post">--%>
    <div class="form-group">
        <label for="firstname" class="col-sm-3 control-label">用户名</label>
        <div class="col-sm-9">
            <input type="text" class="form-control" id="firstname" name="userName" placeholder="请输入名字"/>
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-3 control-label">密&nbsp;&nbsp;&nbsp;&nbsp;码</label>
        <div class="col-sm-9">
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-3 col-sm-4 text-center">
            <input class="btn btn-default" type="submit" value="登录"/>
        </div>
        <div class="col-sm-1">
        </div>
        <div class="col-sm-4 text-center">
            <input class="btn btn-default" type="reset" value="重置"/>
        </div>
    </div>
</form>
</body>
</html>