<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加</title>
</head>
<body  style="background: beige">
<div align="center" style="margin-top: 100px">
<s:form action="add" method="POST" theme="simple">
    用户名：<s:textfield name="username"/><br><br>
    年&nbsp;&nbsp;龄：<s:textfield name="age"/><br><br>
    性&nbsp;&nbsp;别：<s:radio list="#{'男':'男','女':'女'}" value="男" name="gender"/><br><br>
    密&nbsp;&nbsp;码：<s:password name="password"/><br><br>
    确认密码：<s:password name="pass2"/><br><br>
    电&nbsp;&nbsp;话：<s:textfield name="phone"/><br><br>
    生&nbsp;&nbsp;日：<s:textfield name="birthday"/><br><br>
    <s:submit value="添加"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <s:reset value="重置"/>
</s:form>
<s:fielderror>
    <s:param>error</s:param>
</s:fielderror>
<input type="button" value="返回" onclick="window.location.href='menu.jsp'">
</div>
</body>
</html>