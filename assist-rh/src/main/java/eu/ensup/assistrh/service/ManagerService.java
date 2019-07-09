package eu.ensup.assistrh.service;

import java.util.List;

import eu.ensup.assistrh.domaine.Formation;
import eu.ensup.assistrh.domaine.Salarie;

public class ManagerService {

	ManagerDao mngr = new ManagerDao();

	public Boolean validerDemandeFormation(Formation frm, Salarie slr) {

		String statut_demande;

		if (statut_demande = "validé")
			return true;
		else if (statut_demande = "refusé")
			return false;

	}

	public List<Salarie> listerEmployes() {
		
		return mngr.getAllEmploy();

	}
	 

}
