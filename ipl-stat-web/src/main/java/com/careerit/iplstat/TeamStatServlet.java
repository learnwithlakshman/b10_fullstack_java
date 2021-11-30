package com.careerit.iplstat;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeamStatServlet
 */
@WebServlet("/teamstat")
public class TeamStatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String teamName = request.getParameter("teamname");
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<head><title>IPL team information</title></head>");
		sb.append("<body>");
     	sb.append("<a href='teams'>Teams</a>");
		sb.append("<p>The detailed information :<strong>"+teamName+"</strong></p>");
		//Logic 
		sb.append("</body>");
		sb.append("</html>");
		out.write(sb.toString());
	}

}
