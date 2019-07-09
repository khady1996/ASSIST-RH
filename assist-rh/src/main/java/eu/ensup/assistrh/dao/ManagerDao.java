package eu.ensup.assistrh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.assistrh.domaine.Salarie;


public class ManagerDao {
	
	AccesBd bd = new AccesBd();
	
	public void createSalarie(Salarie Salarie) {
		// TODO Auto-generated method stub

		bd.seConnecter();
		try {

			String requete = "INSERT INTO `Salarie` (ìdslr`, `nom`,`prenom`,`email`,`adresse`,`fonction`,`dateembauche`) VALUES ('"
					+ Salarie.getId() + "','" + Salarie.getNom()+ "','" + Salarie.getPrenom() + "','"
					+ Salarie.getEmail() + "','" + Salarie.getAdresse() + "','" + Salarie.getFonction() + "','"
					+ Salarie.getDateEmbauche() + "');";

			bd.st.executeUpdate(requete);

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

	}
	
	public Salarie readSalariebyId(int index) throws DaoException {
		// TODO Auto-generated method stub
		Salarie slr = null;

		bd.seConnecter();
		try {

			String requete = "SELECT * FROM `Salarie` WHERE `idslr` = '" + index + "';";
			ResultSet rs = bd.st.executeQuery(requete);
			

			while (rs.next()) {
				slr= new Salarie(rs.getInt("idslr"), rs.getString("nom"), rs.getString("prenom"), rs.getString("email"), rs.getString("adresse"),
						rs.getString("fonction"), rs.getString("dateembauche"));

			}

		} catch (SQLException e) {

			new DaoException();

		}

		bd.seDeconnecter();

		return etu;
	}

	public String updateSalarie(Salarie slr) {

		int rs = 0;

		bd.seConnecter();

		try {
			String requete = "UPDATE `Salarie` SET `adresse` = '" + slr.getAdresse() + "' WHERE `idslr` = '" + index + "';";

			rs = bd.st.executeUpdate(requete);

			if (rs != 0) {

				bd.seDeconnecter();

				return "OK.Vous avez modifié les informations de ce salarié \n";
			}

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

		return "Modification non prise en compte";
	}

	public void deleteSalariebyId(int index) {

		bd.seConnecter();

		try {
			String requete = "DELETE FROM `Salarie` WHERE `idslr` = '" + index + "';";
			bd.st.executeUpdate(requete);

			System.out.println("Le salarié a été supprimé avec succés !!");

		} catch (SQLException e) {

			new DaoException();
		}

		bd.seDeconnecter();

	}

	public List<Salarie> getAllEmploy() {

		List<Salarie> listslr = new ArrayList<Salarie>();

		bd.seConnecter();
		try {
			String requete = "SELECT * FROM `Salarie`;";
			ResultSet rs = bd.st.executeQuery(requete);

			while (rs.next()) {

				listslr.add(new Salarie());

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		bd.seDeconnecter();

		return listslr;
	}


}
