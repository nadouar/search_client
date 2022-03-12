package Metier;

public class Client {
private long id_cli;
private String nom,email,ville;

public void setId_cli(long id_cli) {
	this.id_cli = id_cli;
}
public long getId_cli() {
	return id_cli;
}

public Client() {
	super();
}

public Client(long id_cli, String nom, String email, String ville) {
	super();
	//this.id_cli = id_cli;
	this.nom = nom;
	this.email = email;
	this.ville = ville;
}




public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}


}
