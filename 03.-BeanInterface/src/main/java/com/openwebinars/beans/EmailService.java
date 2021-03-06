package com.openwebinars.beans;

public class EmailService implements IEmailService {
	
	private Saludator saludator;
	
	public void setSaludator(Saludator saludator) {
		this.saludator = saludator;
	}
	
	public void enviarEmailSaludo(String destinatario) {
		System.out.println("enviando email a  " + destinatario);
		System.out.println("mensaje: " + saludator.saludo());
	}
}
