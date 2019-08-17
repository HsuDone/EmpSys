package com.zxd.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zxd.Beans.Emp;
import com.zxd.Dao.EmpDao;
import com.zxd.Dao.EmpDaoImp;

/**
 * Servlet implementation class ControllerServlet
 */
public class AddEmpServlet extends HttpServlet {
	private EmpDao ed = new EmpDaoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String empno = request.getParameter("empno");
		String ename = request.getParameter("ename");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		String hiredate = request.getParameter("hiredate");
		Emp e = new Emp(empno, ename, Integer.parseInt(age), Integer.parseInt(salary), hiredate);
		ed.insertEmp(e);
		response.sendRedirect(request.getContextPath()+"/LoadServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	

}
