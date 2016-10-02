<%--
  Created by IntelliJ IDEA.
  User: Orion
  Date: 2016/10/2
  Time: 15:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="cn.com.meng.base.datahelp.DataHelp" %>

<%@ page import="java.sql.ResultSet" %>
<html>
<head>
    <title>日程</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="resources\bootstrap\css\bootstrap.min.css">

    <!-- 可选的Bootstrap主题文件（一般不用引入） -->
    <link rel="stylesheet" href="resources\bootstrap\css\bootstrap-theme.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="resources\bootstrap\js\bootstrap.min.js"></script>
</head>
<body>
<% DataHelp dh = new DataHelp();
    dh.conn();
    String sql = "select * from t_sys_schedule";
    ResultSet rs = dh.getRS(sql);%>
<table class="table table-striped">
    <tr>
        <th>编号</th>
        <th>用户</th>
        <th>创建时间</th>
        <th>提醒时间</th>
        <th>事项</th>
    </tr>
    <% while (rs.next()) { %>
    <tr>
        <td><%=rs.getString("id") %>
        <td><%=rs.getString("user") %>
        </td>
        <td><%=rs.getString("createdate") %>
        </td>
        <td><%=rs.getString("reminddate") %>
        </td>
        <td><%=rs.getString("info") %>
        </td>
            <% } %>
</table>
<button type="button" class="btn btn-default" >注册</button>
</body>
</html>

