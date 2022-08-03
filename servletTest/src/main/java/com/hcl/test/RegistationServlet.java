package com.hcl.test;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/registration")
public class RegistationServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String username = request.getParameter("username");
		String gender = request.getParameter("gender");
		String duration = request.getParameter("duration");
		String[] languages = request.getParameterValues("language");
		
		String selLang = null;
		for(String lang: languages) {
			
			selLang = selLang + lang + " ";
		}
		
		PrintWriter out = response.getWriter();
		
		out.println(username+ " "+gender+ " "+duration+" "+languages);
	}
}
