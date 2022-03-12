package Metier;

import java.util.List;

public class TestMetier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MetierImpl metier=new MetierImpl();
		List<Client> clients=metier.getClientsParMc("HP");
		for(Client c:clients)
		{
			System.out.println(c.getNom());
		}
	}

}
