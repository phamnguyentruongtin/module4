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
    <title>Title</title>
</head>
<body>
<%--@elvariable id="email" type=""--%>
<form:form method="post" modelAttribute="email" action="dosend">
      <label>Languages</label> <form:select path="language">
        <option value="en">EN</option>
        <option value="vn">VN</option>
        <option value="cn">CN</option>
        <option value="jp">JP</option>
      </form:select>
      <label>Page Size</label>
      <p>show <form:select path="pageSize">
        <option value="5">5</option>
        <option value="10">10</option>
        <option value="15">15</option>
        <option value="25">25</option>
        <option value="50">50</option>
        <option value="100">100</option>
      </form:select>emails per page</p>
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
