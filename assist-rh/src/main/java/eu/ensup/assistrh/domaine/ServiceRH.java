package eu.ensup.assistrh.domaine;

public class ServiceRH {
	
	private String login;
	private String pwd;
	
	// Constructeurs
	
	public Personne() {
		super();
	}

	public Personne(String login, String pwd) {
		super();
		this.login = login;
		this.pwd = pwd;
	}
	
	// Getters & Setters

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
