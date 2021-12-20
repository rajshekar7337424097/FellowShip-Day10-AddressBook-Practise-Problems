package com.bl.AddressBookUC6;

public class Contacts {
	String firstName; 
	String lastName;
	String houseNumber; 
	String city;
	String state;
	String zipCode;
	String phoneNumber; 
	String emailId;

	public String  getFirstName( ) {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName =  firstName;
	}
	public String  getLastName( ) {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName =  lastName;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipcode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return emailId;
	}
	public void setEmailID(String emailId) {
		this.emailId = emailId;
	}

	public String toString() {
		return ("First Name : "+firstName+ "\n Last Name :" +lastName+ "\n House Number:" +houseNumber+ "\n City :"+city+"\nState :"+state+"\n ZipCode :" +zipCode+"\n Phone Number :"+phoneNumber+"\n EmailID :"+emailId);
	}


}
