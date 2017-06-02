<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <script src="javascript/jquery-3.2.1.js"></script>
    <script src="javascript/jquery.validate.js"></script>
    <script src="javascript/messages_zh.js"></script>
    <base href="<%=basePath%>">
    <style type="text/css">
        .error {
            color: red;
        }
    </style>
    <script>
        $.validator.setDefaults({
            submitHandler: function () {
                $.ajax({
                    type: "POST",
                    dataType: "json",
                    isAjaxSubmit: true,
                    url: "${pageContext.request.contextPath}/userAction.do",
                    data: {name: $("#cname").val(), age: $("#cage").val(), email: $("#cemail").val()},
                    contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                    success: function (data) {
                        alert(data);
                    }
                });
            }
        });

        $().ready(function () {
            $("#commentForm").validate();
        });
    </script>
    <title>happy-SSM</title>
</head>
<body>
<form class="cmxform" id="commentForm" method="post" action="">
    <fieldset>
        <legend>输入您的姓名,年龄,邮箱</legend>
        <p>
            <label for="cname">用户名:</label>
            <input id="cname" name="name" minlength="2" type="text" required>
        </p>
        <p>
            <label for="cage">用户年龄:</label>
            <input id="cage" type="age" name="age" required>
        </p>
        <p>
            <label for="cemail">E-Mail:</label>
            <input id="cemail" type="email" name="email" email>
        </p>
        <p>
            <input class="submit" type="submit" value="用户注册">
        </p>
    </fieldset>
</form>
</body>


</html>
