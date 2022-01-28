<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
<div align="center" style="margin-top: 10px">
<table border="2">
    <tr style="background: antiquewhite" align="center">
        <td>ID</td>
        <td>用户名</td>
        <td>年龄</td>
        <td>性别</td>
        <td>电话</td>
        <td>生日</td>
        <td></td>
    </tr>
    <s:iterator value="users" var="user">
        <tr align="center">
            <td><s:property value="#user.id"/></td>
            <td><s:property value="#user.username"/></td>
            <td><s:property value="#user.age"/></td>
            <td><s:property value="#user.gender"/></td>
            <td><s:property value="#user.phone"/></td>
            <td><s:property value="#user.birthday"/></td>
            <td><a href="doUpdate?username=<s:property value="#user.username"/>">修改</a></td>
        </tr>
    </s:iterator>
</table>
<input type="button" value="返回" onclick="window.location.href='menu.jsp'">
</div>
</body>
</html>