package fr.istic.miage.articles;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

@Entity("persons")
public class Person {
	
	@Id
	private int id;
	private String name;
	@Reference
	private List<Address> addresses;
	@Reference
	private List<Article> articles;
	
	public Person() { }

	public Person(String name) {
		super();
		this.id = ObjectId.getCurrentCounter();
		this.name = name;
		this.addresses = new ArrayList<Address>();
		this.articles = new ArrayList<Article>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public int getId() {
		return id;
	}
	
	
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public void addAddress(Address a)
	{
		this.addresses.add(a);
	}
	public void addArticle(Article a)
	{
		this.articles.add(a);
	}
	

}
