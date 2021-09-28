<%--
  Created by IntelliJ IDEA.
  User: nguye
  Date: 9/28/2021
  Time: 9:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
  <h1>Simple Calculator</h1>
  <fieldset>
    <legend>Calculator</legend>
    <form action="/calculator" method="post">
      <p>First operand : <input type="number" placeholder="Enter number" name="first"></p>
      <p>
        Opera :
        <select name="operator" id="">
          <option value="+">Addition</option>
          <option value="-">Subtraction</option>
          <option value="*">Multiplication</option>
          <option value="/">Division</option>
        </select>
      </p>
      <p>Second operand : <input type="number" placeholder="Enter number" name="second"></p>
      <input type="submit" value="Calculate">
    </form>
  </fieldset>
</body>
</html>
