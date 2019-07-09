package eu.ensup.assistrh.service;

import java.util.List;

import eu.ensup.assistrh.domaine.Formation;
import eu.ensup.assistrh.dao.SalarieDao;

public class SalarieService {

	SalarieDao slrdao = new SalarieDao();

	public List<Formation> listerFormations() {

		return slrdao.getAllForm();

	}
	
	public List<Formation> listerFormationsDemandees(int idslr) {

		return slrdao.getAllFormReq(idslr);

	}

}
