package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class address {
	@Id
	@Column(nullable = false,name = "Id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long addressId;
	@Column(nullable =false,name="type")
	private String addressType;
	@Column(nullable =false,name="street")
	private String street;
	@Column(nullable =false,name="City")
	private String city;
	@Column(nullable =false,name="country")
	private String country;
	public address() {
		
	}
	public address(long addressId, String addressType, String street, String city, String country) {
		super();
		this.addressId = addressId;
		this.addressType = addressType;
		this.street = street;
		this.city = city;
		this.country = country;
	}
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	public String getAddressType() {
		return addressType;
	}
	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
