package com.zxd.Service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zxd.Beans.Emp;
import com.zxd.Beans.PageBean;
import com.zxd.Dao.EmpDao;
import com.zxd.Dao.EmpDaoImp;

/**
 * Servlet implementation class LoadServlet
 */
public class LoadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    EmpDao ed = new EmpDaoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageSize = request.getParameter("pageSize");
		String curPage = request.getParameter("curPage");
		PageService ps = new PageServiceImp();
		PageBean pb = ps.getPageBean(pageSize,curPage);
		request.setAttribute("PageBean", pb);
		request.getRequestDispatcher("/list.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
