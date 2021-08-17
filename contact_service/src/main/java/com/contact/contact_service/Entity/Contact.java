package com.contact.contact_service.Entity;

public class Contact {
private long cid;
private String email;
private String contactname;

private Long user_id;

public Contact(long cid, String email, String contactname, Long user_id) {
	super();
	this.cid = cid;
	this.email = email;
	this.contactname = contactname;
	this.user_id = user_id;
}

public long getCid() {
	return cid;
}

public String getEmail() {
	return email;
}

public String getContactname() {
	return contactname;
}

public void setCid(long cid) {
	this.cid = cid;
}

public void setEmail(String email) {
	this.email = email;
}

public void setContactname(String contactname) {
	this.contactname = contactname;
}

public Long getUser_id() {
	return user_id;
}

public void setUser_id(Long user_id) {
	this.user_id = user_id;
}

public Contact() {
	super();
	// TODO Auto-generated constructor stub
}

}
