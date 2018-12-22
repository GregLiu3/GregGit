package com.lgy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lgy.Service.UserService;
import com.lgy.entity.User;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		UserService us = new UserService();
		User user = new User();
		user.setName(name);
		user.setPwd(pwd);
		User userInfo = us.login(user);
		if(userInfo==null){
			request.getRequestDispatcher("").forward(request, response);
		} else {
			request.getSession().setAttribute("userInfo", userInfo);
			response.sendRedirect(request.getContextPath()+"/index.jsp");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
