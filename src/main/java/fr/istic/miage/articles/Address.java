package fr.istic.miage.articles;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;
import org.mongodb.morphia.annotations.Reference;

@Entity("addresses")
public class Address {

	@Id
	private int id;
	private String street;
	private String city;
	@Property("location")
	private String postCode;
	private String Country;
	@Reference
	private Person person;
	
	public Address() {}

	public Address(String street, String city, String postCode, String country) {
		super();
		this.id = ObjectId.getCurrentCounter();
		this.street = street;
		this.city = city;
		this.postCode = postCode;
		Country = country;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public int getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
