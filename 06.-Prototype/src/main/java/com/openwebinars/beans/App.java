package com.openwebinars.beans;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");

		IEmailService emailService1 = appContext.getBean(IEmailService.class);
		emailService1.setDestinatarioPorDefecto("jfmora@audifilm.com");
		emailService1.enviarEmailSaludo();
		
		System.out.println("");
		IEmailService emailService2 = appContext.getBean(IEmailService.class);
		emailService2.enviarEmailSaludo();
		

		((ClassPathXmlApplicationContext) appContext).close();
	}

}
