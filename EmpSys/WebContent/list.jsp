<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<style type="text/css">
.btn {
	width: 100px;
	height: 30px;
	font-size: 13pt;
}
</style>
<script type="text/javascript" src="/EmpSys/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
	$(function() {
		$("#selectAll").click(
			function() {
				$("input[type='checkbox']").prop("checked",$("#selectAll").prop("checked"));
		});
	});
</script>
</head>
<body>
	<table align="center" style="font-size: 18pt">
		<caption>员工列表</caption>
		<tr>
			<td>
				<input type="button" value="添加员工" class="btn" onclick="location.href='/EmpSys/addemp.jsp'"> 
				<input type="button" value="批量删除" class="btn">
			<td>
		</tr>
		<tr>
			<td>
				<table border="1" cellpadding="0" cellspacing="0" width="900px" style="font-size: 15pt">
					<thead>
						<tr>
							<th><input type="checkbox" id="selectAll"></th>
							<th>员工编号</th>
							<th>员工姓名</th>
							<th>员工年龄</th>
							<th>员工薪资</th>
							<th>入职时间</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
							<c:forEach var="emp" items="${PageBean.list }">
								<tr align="center">
									<td><input type="checkbox" name="id"></td>
									<td>${emp.empno }</td>
									<td>${emp.name }</td>
									<td>${emp.age }</td>
									<td>${emp.salary }</td>
									<td>${emp.hiredate }</td>
									<td><a href="/EmpSys/delete.modify?empno=${emp.empno }" onclick="return confirm('是否确认删除员工：${emp.name }的所有信息?')">删除</a> <a href="/EmpSys/load.modify?empno=${emp.empno }">修改</a></td>
								</tr>
							</c:forEach>
					</tbody>
				</table>
			</td>
		</tr>
		<tr align="center" style="font-size: 10pt">
			<td >
				共[<B>10</B>]条记录,[<B>2</B>]页 , 
				每页显示 <select name="pageSize">
							<option value="15">15</option>
							<option value="30">30</option>
						</select> 条 
				[<A href="#">前一页</A>] <B>1</B> [<A href="#">后一页</A>] 
				到 <input type="text" size="3" id="page" name="page" /> 页 
					<input type="button" value="Go" />
			</td>
		</tr>
	</table>
</body>
</html>