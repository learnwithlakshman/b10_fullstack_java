package com.careerit.iplstat;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.iplstat.dao.TeamStatDao;
import com.careerit.iplstat.domain.Team;

/**
 * Servlet implementation class TeamServlet
 */
@WebServlet("/teams")
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TeamStatDao teamStatDao;
	public TeamServlet() {
		teamStatDao = new TeamStatDao();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Team> teamList = teamStatDao.getAllTeamDetails();
		PrintWriter out = response.getWriter();

		StringBuilder sb = new StringBuilder();

		sb.append("<html>");
		sb.append("<head><title>IPL team information</title></head>");
		sb.append("<body>");
		sb.append("<h3 style='text-align: center;'>IPL Stat Information</h3>");
		sb.append("<table  width='80%' style= 'margin-left: auto;  margin-right: auto' border='1'>");
		sb.append("<thead><tr><th>#</th><th>Name</th><th>Home</th><th>City</th><th>Coach</th><th>Label</th><th>More</th></tr>");
		sb.append("<tbody>");
		int i=1;
		for(Team team:teamList) {
			sb.append("<tr>");
			sb.append("<td>"+i+++"</td>");
			sb.append("<td>"+team.getName()+"</td>");
			sb.append("<td>"+team.getHome()+"</td>");
			sb.append("<td>"+team.getCity()+"</td>");
			sb.append("<td>"+team.getCoach()+"</td>");
			sb.append("<td>"+team.getLabel()+"</td>");
			sb.append("<td><a href=teamstat?teamname="+team.getLabel()+">"+team.getLabel()+"</a></td>");
			sb.append("</tr>");
		}
		sb.append("<tbody>");

		sb.append("</body>");
		sb.append("</html>");
		
		out.write(sb.toString());

	}

}
