package com.ConfigurationParameter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class initParameter
 */
@WebServlet (urlPatterns="/initParameter", initParams = @WebInitParam (name="name", value = "Nitesh"))
//import javax.servlet.annotation.WebInitParam;
public class initParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public initParameter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Defining init parameter using getServletConfig 
		String name = getServletConfig().getInitParameter("name");
		
		// Defining Context parameter using getServletContext
		
		String location = getServletContext().getInitParameter("location");
		PrintWriter out = response .getWriter();
		out.println(name+ "");
		out.println(location );
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
