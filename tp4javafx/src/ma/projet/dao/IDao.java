package ma.projet.dao;
import java.util.List;

import ma.projet.beans.Client;

public interface IDao {
	

	
	    boolean create(Client o);
	    boolean delete(Client o);
	    boolean update(Client o);
	    Client findById(int id);
	    List<Client> findAll();
	}

