package eu.ensup.assistrh.domaine;
public class Salarie extends Personne{
	
	private int idslr;
	
	// Constructeurs
	public Salarie() {
		super();
	}
	
	public Salarie(int idslr,String nom, String prenom, String email, String adresse,String fonction, String dateembauche, String login, String pwd) {
		super(nom, prenom, email, adresse, fonction, dateembauche, login, pwd);
		this.idslr = idslr;
	}
	
	// Getter & Setter
	
	public int getId() {
		return idslr;
	}
	public void setId(int idslr) {
		this.idslr = idslr;
	}

}
