package com.mantledillusion.vaadin.cotton.demo.model;

import java.util.List;

import com.mantledillusion.data.epiphy.DefiniteModelProperty;
import com.mantledillusion.data.epiphy.ModelProperty;
import com.mantledillusion.data.epiphy.ModelPropertyList;

public interface ModelProperties {

	public static final ModelPropertyList<List<Contact>, Contact> CONTACT_LIST = ModelProperty
			.rootChildList("contactList");

	public static final DefiniteModelProperty<List<Contact>, Contact> CONTACT = CONTACT_LIST
			.defineElementAsChild("contact");

	public static final DefiniteModelProperty<List<Contact>, Person> PERSON = CONTACT.registerChild("person",
			contact -> contact.getPerson(), (contact, person) -> contact.setPerson(person));
	public static final DefiniteModelProperty<List<Contact>, String> FORENAME = PERSON.registerChild("forename",
			person -> person.getForename(), (person, forename) -> person.setForename(forename));
	public static final DefiniteModelProperty<List<Contact>, String> MIDDLENAME = PERSON.registerChild("middlename",
			person -> person.getMiddlename(), (person, middlename) -> person.setMiddlename(middlename));
	public static final DefiniteModelProperty<List<Contact>, String> SURNAME = PERSON.registerChild("surname",
			person -> person.getSurname(), (person, surname) -> person.setSurname(surname));

	public static final DefiniteModelProperty<List<Contact>, Address> ADDRESS = CONTACT.registerChild("address",
			contact -> contact.getAddress(), (contact, address) -> contact.setAddress(address));
	public static final DefiniteModelProperty<List<Contact>, String> STREET = ADDRESS.registerChild("street",
			address -> address.getStreet(), (address, street) -> address.setStreet(street));
	public static final DefiniteModelProperty<List<Contact>, String> HOUSENR = ADDRESS.registerChild("housenr",
			address -> address.getHousenr(), (address, housenr) -> address.setHousenr(housenr));
	public static final DefiniteModelProperty<List<Contact>, String> CITY = ADDRESS.registerChild("city",
			address -> address.getCity(), (address, city) -> address.setCity(city));
}
