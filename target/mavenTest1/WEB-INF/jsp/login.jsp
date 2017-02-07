<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="rec/jQuery/jquery-2.1.4.js"></script>
    <script src="rec/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="rec/bootstrap/css/bootstrap.css" type="text/css"/>
</head>
<body>
<%--<form action="loginCheck.do" method="post">--%>
<form class="form-horizontal" role="form" action="../html/login.html" method="post">
    <div class="form-group">
        <label for="firstname" class="col-sm-2 control-label">用户名</label>

        <div class="col-sm-5">
            <input type="text" class="form-control" id="firstname" placeholder="请输入名字"/>
        </div>
    </div>
    <div class="form-group">
        <label for="password" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-5">
            <input type="password" class="form-control" id="password" placeholder="请输入密码"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <input class="btn btn-default" type="submit" value="登录" />
            <input class="btn btn-default" type="reset" value="重置" />
        </div>
    </div>
</form>
</body>
</html>