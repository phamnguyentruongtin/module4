<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 16/12/2022
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Tu Dien</h1>
<form method="post" action="/ketqua">
<input type="text" name="word">
<input type="submit">
  </form>
<h6>Ket Qua</h6>
<P>${result}</P>
</body>
</html>
