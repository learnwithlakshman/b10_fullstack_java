package com.careerit.iplstat;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.careerit.iplstat.dao.TeamStatDao;
import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.dto.PlayerDTO;

/**
 * Servlet implementation class TeamStatServlet
 */
@WebServlet("/teamstat")
public class TeamStatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TeamStatDao teamStatDao = new TeamStatDao();
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String teamName = request.getParameter("teamname");
		List<Player> list = teamStatDao.getPlayersByTeam(teamName);
		
		List<PlayerDTO> players = list.stream().map(p->
												PlayerDTO.builder()
												.name(p.getName())
												.label(p.getLabel())
												.price(String.format("%.2f", p.getPrice()))
												.role(p.getRole()).build())
												.collect(Collectors.toList());
		
		request.setAttribute("players",players);
		RequestDispatcher rd = request.getRequestDispatcher("players.jsp");
    	rd.forward(request, response);
	}

}
