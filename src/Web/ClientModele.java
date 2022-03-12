package Web;

import java.util.*;

import Metier.Client;

public class ClientModele {
private String motCle;
private List<Client> clients=new ArrayList<Client>();


public List<Client> getClients() {
	return clients;
}
public void setClients(List<Client> clients) {
	this.clients = clients;
}
public String getMotCle() {
	return motCle;
}
public void setMotCle(String motCle) {
	this.motCle = motCle;
}

}
