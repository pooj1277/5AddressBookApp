package com.bridgelabz.AddressbookApp.model;

import com.bridgelabz.AddressbookApp.dto.AddressBookDTO;

public class AddressBookData {

	private int addressBookId;
	private String firstName;
	private String lastName;

	public AddressBookData() {
	}

	public AddressBookData(int addressBookId, AddressBookDTO addressBookDTO) {
		this.addressBookId = addressBookId;
		this.firstName = addressBookDTO.firstName;
		this.lastName = addressBookDTO.lastName;
	}

	
	public int getAddressBookId() {
		return addressBookId;
	}

	public void setAddressBookId(int addressBookId) {
		this.addressBookId = addressBookId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}