package eu.ensup.assistrh.domaine;

public class Formation {
	
	private int idfrm;
	private String theme;
	private String datedebut;
	private int duree;
	private String description;
	
	// Constructeurs
	
	public Formation() {
		super();
	}

	public Formation (int idfrm, String theme, String datedebut, int duree, String description) {
		super();
		this.idfrm = idfrm;
		this.theme = theme;
		this.datedebut = datedebut;
		this.duree = duree;
		this.description = description;
	}
	
	// Getters & Setters
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public String getDateDebut() {
		return datedebut;
	}
	public void setDateDebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public int getDuree() {
		return duree;
	}
	public void setDuree(int duree) {
		this.duree = duree;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getId() {
		return idfrm;
	}
	public void setId(int idfrm) {
		this.idfrm = idfrm;
	}

}
