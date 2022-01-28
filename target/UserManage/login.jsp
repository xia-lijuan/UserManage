<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body style="background: beige">
<div align="center" style="margin-top: 100px">
<%--    加入theme="simple"后，label标签失效--%>
    <s:form method="POST" action="login" theme="simple">
        用户名：<s:textfield name="username"/><br><br>
        密&nbsp;&nbsp;码：<s:password name="password"/><br><br>
        <s:submit value="提交" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<s:reset value="重置"/>
    </s:form>&nbsp;
    <s:fielderror>
        <s:param>error</s:param>
    </s:fielderror>
</div>
</body>
</html>
