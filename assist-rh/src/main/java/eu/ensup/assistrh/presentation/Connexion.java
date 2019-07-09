package eu.ensup.assistrh.presentation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import eu.ensup.assistrh.dao.PersonneDao;
import eu.ensup.assistrh.dao.Authentification;
import eu.ensup.assistrh.domaine.Personne;



@WebServlet("/Connexion")
public class Connexion extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(Connexion.class);
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Connexion() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("oui");

		String login = request.getParameter("loginuser");
		String pwd = request.getParameter("mdpuser");

		@SuppressWarnings("unused")
		Personne perso = new Personne();

		List<Personne> listeperso = new ArrayList<Personne>();

		listeperso = Authentification.seConnecter(login, pwd);

		if (!(listeperso.isEmpty())) {
//			request.setAttribute("id", conseillerList.get(0).getId());
//			request.setAttribute("listePersonne", new ConseillerDao().listeDesClients());
			System.out.println("coucou");
			RequestDispatcher rs = request.getRequestDispatcher("success.jsp");
			rs.forward(request, response);
		}
//		} else {
//			
//			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
//			rs.include(request, response);
//		}
	}


}
