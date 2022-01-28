<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="input" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改</title>
</head>
<body  style="background: beige">
<div align="center" style="margin-top: 100px">
<s:form action="doUpdate" method="POST" theme="simple">
    用户名：<s:textfield name="username" readonly="true" value="%{user.username}"/><br><br>
    年&nbsp;&nbsp;龄：<s:textfield name="age" value="%{user.age}"></s:textfield><br><br>
    性&nbsp;别：<s:radio list="#{'男':'男','女':'女'}" value="男" name="user.gender"></s:radio><br><br>
    电&nbsp;话：<s:textfield name="user.phone" value="%{user.phone}" ></s:textfield><br><br>
    生&nbsp;日：<s:textfield name="user.birthday" value="%{user.birthday}"></s:textfield><br><br>
    <s:submit value="提交"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/><br>
</s:form>
<input type="button" value="返回" onclick="window.location.href='menu.jsp'">
</div>
</body>
</html>