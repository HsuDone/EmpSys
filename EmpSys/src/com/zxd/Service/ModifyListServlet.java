package com.zxd.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zxd.Beans.Emp;
import com.zxd.Dao.EmpDao;
import com.zxd.Dao.EmpDaoImp;

/**
 * Servlet implementation class ModifyListServlet
 */
public class ModifyListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmpDao ed = new EmpDaoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getRequestURI();
		if(action.contains("delete"))
			ed.deleteEmpByNo(request.getParameter("empno"));
		if(action.contains("load"))
		{
			Emp emp = ed.getEmpByNo(request.getParameter("empno"));
			request.setAttribute("emp", emp);
			
			request.getRequestDispatcher("/updateEmp.jsp").forward(request, response);
			return;
		}
		if(action.contains("update")) {
			Emp emp = new Emp();
			emp.setEmpno(request.getParameter("empno"));
			emp.setName(request.getParameter("ename"));
			emp.setAge(Integer.parseInt(request.getParameter("age")));
			emp.setSalary(Integer.parseInt(request.getParameter("salary")));
			emp.setHiredate(request.getParameter("hiredate"));
			ed.updateEmp(emp);
		}
		response.sendRedirect(request.getContextPath()+"/LoadServlet");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
