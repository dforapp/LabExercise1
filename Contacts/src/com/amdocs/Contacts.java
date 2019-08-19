package com.amdocs;

import java.util.HashMap;

public class Contacts {

	private HashMap<String, String> contacts;
	
	public Contacts() {
		super();
		this.contacts = new HashMap<String, String>();
	}

	public void addContact(String name, String mobileNo) {
		contacts.put(mobileNo, name);
	}
	
	public String findContactNameByMobileNo(String mobileNo) {
		String name = contacts.get(mobileNo);
		if(name == null)
			return mobileNo;
		return name;
	}

	public static void main(String[] args) {
		Contacts contacts = new Contacts();
		contacts.addContact("Rishi", "9999254178");
		contacts.addContact("ABC", "9017245367");
		
		String name= contacts.findContactNameByMobileNo("9999254178");
		System.out.println(name);
		
		name= contacts.findContactNameByMobileNo("9996478212");
		System.out.println(name);

	}

	

}
