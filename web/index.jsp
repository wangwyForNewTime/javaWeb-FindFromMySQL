<%--
  Created by IntelliJ IDEA.
  User: 大喵喵
  Date: 2023/2/28
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>管理员</title>
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <link rel="stylesheet" href="css/index.css">
</head>
  <body>
  <div class="mainbac">
    <h1>Atmospheric Turbulent Video Restoration System </h1>
    <div class="lii">欢迎你，管理员</div>
    <div class="duzii">


      <form class="form-inline"  action="index">
        <div class="form-group has-success has-feedback">
          <label class="control-label">ID:</label>
          <input  class="form-control" style="margin-left: 20px;" name="test">
          <button type="submit" class="btn btn-default">查&nbsp;&nbsp;&nbsp;&nbsp;询</button>
         <button type="button" class="btn btn-link">返回首页</button>
        </div>
      </form>

      <table class="table table-striped" style="margin-top: 50px;">
        <thead>
        <tr >
          <th>ID</th>
          <th>密码</th>
          <th>身份</th>
          <th>操作</th>
        </tr>
        </thead>

        <tbody>
        <tr>
          <td>Wen</td>
          <td>123456</td>
          <td>管理员</td>
          <td><a href="#">设置</a> | <a href="#">删除</a></td>
        </tr>

        <c:forEach var="e" items="${list}">
          <tr>

            <td>${e.username}</td>
            <td>${e.password}</td>
            <td>管理员</td>
            <td><a href="#">设置</a> | <a href="#">删除</a></td>

          </tr>
        </c:forEach>


<%--        <tr>--%>
<%--          <td>Te</td>--%>
<%--          <td>12</td>--%>
<%--          <td>普通用户</td>--%>
<%--          <td><a href="#">设置</a> | <a href="#">删除</a></td>--%>
<%--        </tr>--%>
        </tbody>

      </table>

    </div>
  </div>
  </body>
</html>
