package com.titan.GALController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.titan.capstoneuserservice.*;
import com.titan.capstoneuser.*;

public class GALServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userid=request.getParameter("userid");	
		User usr = new User();
		usr = new UserService().getUserdetails(userid);

		String str= "<table border=1><tr><td>User Id</td><td>First Name</td><td>Last Name</td><td>Email</td><td>Phone</td></tr>";
		if(usr.getEmail() != null) {
			str += "<tr><td>"+usr.getUserid()+"</td><td>"+usr.getFirstName()+"</td><td>"+usr.getLastName()+"</td><td>"+usr.getEmail()+"</td><td>"+usr.getPhone()+"</td></tr>";
				}
		str += "</table>";
		request.setAttribute("EmployeeDetails", str); 
		//out.println(str);
		RequestDispatcher rd = request.getRequestDispatcher("/EmployeeDetails.jsp");
		rd.forward(request,response);
	}

}
