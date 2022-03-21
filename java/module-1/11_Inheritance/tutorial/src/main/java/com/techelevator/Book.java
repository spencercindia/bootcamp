package com.techelevator;

/**
 * Book
 */
public class Book extends MediaItem {

	private String author;
    //private String title;
    //private double price;
    
//	public String getTitle() {
//		return title;
//	}
//	public void setTitle(String title) {
//		this.title = title;
//	}
//	public double getPrice() {
//		return price;
//	}
//	public void setPrice(double price) {
//		this.price = price;
//	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(MediaItem title, String author, MediaItem price) {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	}
	
	public Book() {
	}

	public String bookInfo() {
	    return "Title: " + title + ", Author: " + author + ", Price: $" + price;
	}
}