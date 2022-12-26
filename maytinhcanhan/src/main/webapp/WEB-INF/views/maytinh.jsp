
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="result" method="post">
    <label>Number1</label>
    <input type="number" name="num1">
    <select name="opetator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <label>Number2</label>
    <input type="number" name="num2">
    <button type="submit">Tinh</button>
</form>
<label>Ket Qua</label>
${result}
</body>
</html>
