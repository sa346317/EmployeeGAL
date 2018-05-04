package com.titan.LoginController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.titan.capstoneuser.*;
import com.titan.capstoneuserservice.*;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pout = response.getWriter();
		
		String userid=request.getParameter("userid");
		String pass=request.getParameter("password");
		
		User signUp = new User(userid,"","","",pass,"");
		if(new UserService().isAuthorized(signUp)) {
			pout.write("Login successfull...");
			RequestDispatcher rd = request.getRequestDispatcher("/Home.jsp");
			rd.forward(request,response);
			return;			
		}
		pout.write("Login Failed...");
	}

}
