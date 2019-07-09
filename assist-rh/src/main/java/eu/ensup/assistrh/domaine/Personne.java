package eu.ensup.assistrh.domaine;

public class Personne {
	
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String fonction;
	private String dateembauche;
	private String login;
	private String pwd;
	
	// Constructeurs
	
	public Personne() {
		super();
	}

	public Personne(String nom, String prenom, String email, String adresse,String fonction, String dateembauche, String login, String pwd) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.fonction = fonction;
		this.dateembauche = dateembauche;
		this.login = login;
		this.pwd = pwd;
	}
	
	// Getters & Setters
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public String getFonction() {
		return fonction;
	}
	public void setFonction(String fonction) {
		this.fonction = fonction;
	}
	public String getDateEmbauche() {
		return dateembauche;
	}
	public void setDateEmbauche(String dateembauche) {
		this.dateembauche = dateembauche;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
