package com.User.com.user.Entity;


import java.util.ArrayList;
import java.util.List;


public class User {
	
private Long user_id;
private String name;
private String mobile;
List <Contact> contacts=new ArrayList<>();

public Long getUser_id() {
	return user_id;
}
public String getName() {
	return name;
}
public String getMobile() {
	return mobile;
}
public List<Contact> getContacts() {
	return contacts;
}
public void setUser_id(Long user_id) {
	this.user_id = user_id;
}
public void setName(String name) {
	this.name = name;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public void setContacts(List<Contact> contacts) {
	this.contacts=contacts;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(Long l, String string, String string2) {
	super();
	// TODO Auto-generated constructor stub
	this.user_id = l;
	this.name = string;
	this.mobile = string2;
	//this.contact = contact;
}


}
