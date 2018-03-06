package fr.istic.miage.articles;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Reference;

import java.util.ArrayList;

@Entity("articles")
public class Article {
	
	@Id
	private int id;
	private String name;
	private int stars;
	@Reference
	private List<Person> buyers;
	
	public Article() {}

	public Article(String name, int stars) {
		super();
		this.id = ObjectId.getCurrentCounter();
		this.name = name;
		this.stars = stars;
		this.buyers = new ArrayList<Person>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public List<Person> getBuyers() {
		return buyers;
	}

	public void setBuyers(List<Person> buyers) {
		this.buyers = buyers;
	}

	public int getId() {
		return id;
	}
	
	public void addBuyer(Person p)
	{
		this.buyers.add(p);
	}
	
	

}
