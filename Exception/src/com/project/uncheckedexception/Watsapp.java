package com.project.uncheckedexception;

public class Watsapp {
	void createGroup(String[] names) throws WatsappException1  {
		if (names.length > 5) {
			throw new WatsappException1("Cant create group more than 5 members");

		} else {
			System.out.println("Group is created,,,,,,,,,");
		}
	}

	void shareFile(File file) throws WatsappException1  {
		if (file.size > 1000) {
			throw new WatsappException1("file cannot upload");
		} else {
			System.out.println("File is uploaded sucessfully,,,,,,,,,,");
		}
	}

}
