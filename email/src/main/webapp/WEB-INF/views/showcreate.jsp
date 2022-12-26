<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 21/12/2022
  Time: 6:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Send Mail</title>
</head>
<body>
<%--@elvariable id="email" type=""--%>
<form:form method="post" modelAttribute="email" action="dosend">
    <label>Languages</label> <form:select path="language">
    <form:options items="${languagerList}"></form:options>
</form:select>
    <label>Page Size</label>
    <p>show <form:select path="pageSize">
        <form:options items="${pageList}"></form:options>
    </form:select>emails per page
    </p>
    <label>Spams Fillter</label>
    <form:checkbox path="spamsFillter"/><br>
    <label>Signature</label>
    <form:textarea path="signature"/>
    <br>
    <button type="submit">Send</button>
</form:form>
<h1>${mess}</h1>
<a href="showlistsend">MailList was send</a>

</body>
</html>
