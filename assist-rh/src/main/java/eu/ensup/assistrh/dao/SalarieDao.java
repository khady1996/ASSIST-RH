package eu.ensup.assistrh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalarieDao {

	AccesBd bd = new AccesBd();
	
	public List<Formation> getAllForm() {

		List<Formation> listslr = new ArrayList<Formation>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Formation`;";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {

				listslr.add(new Formation());

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		bd.seDeconnecter();

		return listslr;
	}
	
	public List<Formation> getAllFormReq(int idslr) {

		List<Formation> listslr = new ArrayList<Formation>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Formation` where idslr = "+idslr+";";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {

				listslr.add(new Formation());

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		bd.seDeconnecter();

		return listslr;
	}
}
