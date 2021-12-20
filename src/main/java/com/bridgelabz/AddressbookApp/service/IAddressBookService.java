package com.bridgelabz.AddressbookApp.service;

import java.util.List;

import com.bridgelabz.AddressbookApp.model.AddressBookData;
import com.bridgelabz.AddressbookApp.dto.AddressBookDTO;

public interface IAddressBookService {

	List<AddressBookData> getAddressBookData();

	AddressBookData getAddressBookById(int contId);

	AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

	AddressBookData updateAddressBookData(int contId, AddressBookDTO addressBookDTO);

	void deleteAddressBookData(int contId);

}