package com.openwebinars.beans;

public class Saludator {
	
	private String mensaje;
	
	public Saludator() {
		
	}
	//inyeccion via constructor
	public Saludator(String str) {
		this.mensaje = str;
	}
	//injeccion via setter
	public void setMensaje (String str) {
		this.mensaje = str;
	}
	
	public String saludo() {
		return (mensaje == null) ? "hola mundo" : mensaje;
	}

}
