package fr.istic.miage.main;

import java.net.UnknownHostException;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import com.mongodb.MongoClient;
import fr.istic.miage.articles.*;

public class Prog {

	public static void main( String[] args ) throws UnknownHostException
	{
		Morphia morphia = new Morphia();	
		MongoClient mongo = new MongoClient();
		morphia.map(Person.class).map(Address.class);
		Datastore ds = morphia.createDatastore(mongo, "my_database");
		
		Person p = new Person("Tintin");

		Address address = new Address("123 Some street","Some city", "123 456", "Some country" );
		address.setPerson(p);
		//set address
		p.addAddress(address);
		// Save the POJO
		ds.save(address);
		ds.save(p);
		for (Person e : ds.find(Person.class))
			 System.out.println(e);
	}
}
