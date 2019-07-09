package eu.ensup.assistrh.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.assistrh.service.SalarieService;
import eu.ensup.assistrh.domaine.Formation;

	/**
	 * Servlet implementation class FormationServlet
	 */
	@WebServlet("/FormationDemandeeServlet")
	public class FormationServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;

		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public FormationDemandeeServlet() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			System.out.println("servlet formation demandee");
			String id = request.getParameter("id");
			System.out.println("id est : " + id);

			SalarieService slrserv = new SalarieService();
			List<Formation> reponse = SalarieService.listerFormationsDemandees(id);

			if (reponse.size() > 0) {
				request.setAttribute("listeFormationdemandee", reponse);
				RequestDispatcher rs = request.getRequestDispatcher("formationsdemandees.jsp");
				rs.forward(request, response);

			} else {
				RequestDispatcher rs = request.getRequestDispatcher("404.jsp");
				rs.forward(request, response);
			}
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
		 *      response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}

}
