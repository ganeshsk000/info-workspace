package com.project.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.project.entity.TvRemote;
import com.project.tvermoteDAO.TvRemoteDAO;

public class Tester {
	public static void main(String[] args) {
		String springConfigFIle="applicationContext.xml";
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext(springConfigFIle);
		TvRemoteDAO dao=springContainer.getBean(TvRemoteDAO.class);
		
//		dao.saveTvRemoteEntity(new TvRemote("LG", "lg", "black", 150, 1, false));
//		dao.getTvRemoteEntityById(1);
//		dao.readAllEntity();
		dao.deleteTvRemoteEntity(3);
		ClassPathXmlApplicationContext classPathXmlApplicationContext=(ClassPathXmlApplicationContext) springContainer;
		classPathXmlApplicationContext.close();
	}

}
