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
		<legend>修改员工个人信息</legend>
		<form method="post"
			action="/EmpSys/update.modify">
			员工编号：<input type="text" name="empno" value="${emp.empno }"><br /> 员工姓名：<input
				type="text" name="ename" value="${emp.name }"><br /> 员工年龄：<input type="text"
				name="age" value="${emp.age }"><br /> 员工薪资：<input type="text" name="salary" value="${emp.salary }"><br />
			入职时间：<input type="text" name="hiredate" value="${emp.hiredate }"><br /> <input
				type="submit" value="保存修改">
		</form>
	</fieldset>
</body>
</html>