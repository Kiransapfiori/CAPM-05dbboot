package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="VENDOR")

public class Vendor {
	
	@Id
	@Column(nullable = false,name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	@Column(nullable = false,name = "companyName")
	public String companyName;
	@Column(nullable = false,name =  "contactName")
	public String contactName ;
	@Column(nullable = false,name = "lastName")
	public String lastName;
	@Column(nullable = false,name = "website")
	public String website;
	@Column(nullable = false,name = "email")
	public String email;
	@Column(nullable = false,name = "status")
	public String status;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="Vendor",referencedColumnName = "Id")
	private List<address> address = new ArrayList<>();
	
	public List<address> getAddress() {
		return address;
	}

	public void setAddress(List<address> address) {
		this.address = address;
	}

	public Vendor() {
		
	}
	
	public Vendor(long id, String companyName, String contactName, String lastName, String website, String email,
			String status) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.contactName = contactName;
		this.lastName = lastName;
		this.website = website;
		this.email = email;
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
	this.contactName = contactName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	



}
