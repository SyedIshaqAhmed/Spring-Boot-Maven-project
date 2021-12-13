package com.boot.demo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Book {

	@Id // To create primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment 
	@Column(name = "bookid") // adding column
	private int id;
	private String title;
	private int year;
	private double price;
	@OneToOne // maps source entity with the target entity ==> foreign key
	private Author author;

	public Book() {

	}

	public Book(int id, String title, int year, double price, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.price = price;
		this.author = author;
	}
	
	public Book(String title, int year, double price, Author author) {
		super();
		this.title = title;
		this.year = year;
		this.price = price;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", year=" + year + ", price=" + price + ", author=" + author
				+ "]";
	}

}
