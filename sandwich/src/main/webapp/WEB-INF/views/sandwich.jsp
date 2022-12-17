<%--
  Created by IntelliJ IDEA.
  User: LEGION
  Date: 17/12/2022
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="listsandwich">
    <label>Sandwich</label>
    <input type="text" name="name" readonly value="Sandwich" +>
    <label>letturce</label>
    <input type="checkbox" name="condiment" value="letturce">
    <label>tomato</label>
    <input type="checkbox" name="condiment" value="tomato">
    <label>mustard</label>
    <input type="checkbox" name="condiment" value="mustard">
    <label>sprouts</label>
    <input type="checkbox" name="condiment" value="sprouts">
    <button type="submit">save</button>
</form>
<label>List sandwich</label>
<label>${result}</label>
</body>
</html>
