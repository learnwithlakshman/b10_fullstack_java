package com.careerit.iplstat;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
@WebServlet(urlPatterns = {"/teams","/"})
public class TeamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private TeamStatDao teamStatDao;
	public TeamServlet() {
		teamStatDao = new TeamStatDao();
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Team> teamList = teamStatDao.getAllTeamDetails();
		request.setAttribute("teams", teamList);
		RequestDispatcher rd = request.getRequestDispatcher("teams.jsp");
		rd.forward(request, response);
		

	}

}
