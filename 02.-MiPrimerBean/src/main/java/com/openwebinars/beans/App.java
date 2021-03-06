package com.openwebinars.beans;

// crtl + shift + o para hacer imports automaticamente
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
		
		Saludator saludador = null;
		
		// 1. getBean con Id y casting
		//saludador = (Saludator) appContext.getBean("saludator");
		
		// 2. getBean con ID y tipo. para ejecutar o comrobar esta forma descomentar <constructor-arg en el bean del archivo beans.xml
		saludador = appContext.getBean("saludator",Saludator.class);
		
		// 3. getBean con tipo, sabiendo que el bean no esta repetido
		//saludador = appContext.getBean(Saludator.class);
		System.out.println(saludador.saludo() + "\n\n");
		
		
		((ClassPathXmlApplicationContext) appContext).close();
	}

}