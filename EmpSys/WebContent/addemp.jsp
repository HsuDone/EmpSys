<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta content="text/html" charset="UTF-8">
<title>添加员工</title>
</head>
<body>
	<fieldset>
		<legend>添加员工</legend>
		<form method="post"
			action="/EmpSys/AddEmpServlet">
			员工编号：<input type="text" name="empno"><br /> 员工姓名：<input
				type="text" name="ename"><br /> 员工年龄：<input type="text"
				name="age"><br /> 员工薪资：<input type="text" name="salary"><br />
			入职时间：<input type="text" name="hiredate"><br /> <input
				type="submit" value="添加">
		</form>
	</fieldset>
</body>
</html>