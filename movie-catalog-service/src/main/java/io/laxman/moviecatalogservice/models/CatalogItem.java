package io.laxman.moviecatalogservice.models;

public class CatalogItem {
	private String name;
	private String descptn;
	private int rating;
	
	
	public CatalogItem(String name, String descptn, int rating) {
		super();
		this.name = name;
		this.descptn = descptn;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescptn() {
		return descptn;
	}
	public void setDescptn(String descptn) {
		this.descptn = descptn;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
