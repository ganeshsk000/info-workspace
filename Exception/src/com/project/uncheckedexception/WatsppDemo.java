package com.project.uncheckedexception;

public class WatsppDemo {
	public static void main(String[] args) {
		Watsapp watspp=new Watsapp();
		File file=new File();
		String [] names= {"Ganesh","Rakesh","Raghu","Vimal"};
		
		try {
			watspp.createGroup(names);
			watspp.shareFile(file);
		}
		catch(WatsappException1 e) {
			System.out.println(e.getMessage());
		}
	}

}
