package com.zxd.Service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.IFNULL;
import com.zxd.Beans.User;
import com.zxd.Dao.UserDao;
import com.zxd.Dao.UserDaoImp;

public class LoginServlet extends HttpServlet {
	UserDao ud = new UserDaoImp();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("username");
		String psw = request.getParameter("password");
		User usr = ud.loginByUname_Psw(uname, psw);
		if (usr == null) {
			response.sendRedirect("/EmpSys/login.html");
		}else 
			response.sendRedirect("/EmpSys/LoadServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
