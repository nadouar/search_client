package Metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;



public class MetierImpl {

	public List<Client>  getClientsParMc(String mc)
	{
		List<Client> clients=new ArrayList<Client>();
		Connection con=SingletonConnection.getConnection();
		try {
			PreparedStatement ps=con.prepareStatement("select * from clients where nom like ?");
			ps.setString(1,"%"+mc+"%");
			ResultSet r=ps.executeQuery();
			while(r.next()) {
				Client cl=new Client();
				cl.setId_cli(r.getLong("id_cli"));
				cl.setNom(r.getString("nom"));
				cl.setEmail(r.getString("email"));
				cl.setVille(r.getString("ville"));
				clients.add(cl);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
	}
}
