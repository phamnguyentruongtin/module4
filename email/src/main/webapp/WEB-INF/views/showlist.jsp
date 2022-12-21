<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 21/12/2022
  Time: 6:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Languages</th>
        <th>Page Size</th>
        <th>Spams fillter</th>
        <th>Signature</th>
    </tr>
    <c:forEach items="${mailList}" var="mail">
        <tr>
            <td>${mail.getLanguage()}</td>
            <td>${mail.getPageSize()}</td>
            <td>${mail.isSpamsFillter()}</td>
            <td>${mail.getSignature()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
