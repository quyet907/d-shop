package com.dshop.model;

public class FooterInfo {
	String companyName = "Cty Hdd";
	String address;
	String email;
	String phoneNumber;

	public FooterInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FooterInfo(String companyName, String address, String email, String phoneNumber) {
		super();
		this.companyName = companyName;
		this.address = address;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
