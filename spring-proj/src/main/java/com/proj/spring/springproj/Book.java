package com.proj.spring.springproj;

public class Book {
int id;
String bookname;
String author;
public Book(int i, String string, String string2) {
	// TODO Auto-generated constructor stub\
	this.id=i;
	this.bookname=string;
	this.author=string2;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}

}
