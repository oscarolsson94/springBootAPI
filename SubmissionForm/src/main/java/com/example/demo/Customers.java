package com.example.demo;

public class Customers {

	private String cname;
	private String email; 
	private int cid;
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customers [cname=" + cname + ", email=" + email + ", cid=" + cid + "]";
	}
	
}
