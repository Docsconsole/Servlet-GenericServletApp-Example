package com.docsconsole.tutorials.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlet extends GenericServlet {

	public HelloWorldServlet() {
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");

		PrintWriter out = res.getWriter();
		out.print("<html><body>");
		out.print("<b>HelloWorld GenericServlet Example</b>");
		out.print("</body></html>");

	}

	public void init() throws ServletException {
		System.out.println("Servlet Initiated");
	}

	public void destroy() {
		System.out.println("Servlet will be destroyed.");
	}
}