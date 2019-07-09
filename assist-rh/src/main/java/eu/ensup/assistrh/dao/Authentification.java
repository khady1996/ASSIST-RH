package eu.ensup.assistrh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import eu.ensup.assistrh.dao.AccesBd;
import eu.ensup.assistrh.domaine.Personne;

public class Authentification {

	public static List<Personne> seConnecter(String login, String pwd) {

		List<Personne> listepers = new ArrayList();
		// take a list to store the values which are in db
		try {
			Connection con = AccesBd.seConnecter();
			PreparedStatement ps = con.prepareStatement("select * from personne where login=? and pwd=?");

			ps.setString(2, login);
			ps.setString(1, pwd);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				// Attention : SQL compte de la droite vers la gauche
				Personne pers = new Personne();
				//conseiller.setId(rs.getString("idPersonne")); // ou encore conseiller.setId(rs.getString(4))
				pers.setLogin(rs.getString("login"));
				pers.setPwd(rs.getString("pwd"));
				listpers.add(pers);
			}
			con.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return listpers;

	}

}
