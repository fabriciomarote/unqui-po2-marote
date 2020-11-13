package ar.edu.unq.po2.tp6.clienteEmail;

import java.util.ArrayList;

public class ClienteEmail {

	 private ServidorPop servidor;
	 private String nombreDeUsuario;
	 private String passUsuario;
	 private ArrayList<Correo> inbox;
	 private ArrayList<Correo> borrados;

	 public ClienteEmail(ServidorPop servidor, String nombreUsuario, String pass){
		 this.servidor = servidor;
		 this.nombreDeUsuario = nombreUsuario;
		 this.passUsuario = pass;
		 this.inbox = new ArrayList<Correo>();
		 this.borrados = new ArrayList<Correo>();
		 this.conectar();
     }
	 
	 public ServidorPop getServidor() {
	     return servidor;
	 }

	 public String getNombreDeUsuario() {
		 return nombreDeUsuario;
	 }

	 public String getPassUsuario() {
	  	 return passUsuario;
     }

	 public ArrayList<Correo> getInbox() {
		 return inbox;
	 }

	 public ArrayList<Correo> getBorrados() {
	  	 return borrados;
	 }
		
	 public void conectar(){
	  	 this.servidor.conectar(this.nombreDeUsuario,this.passUsuario);
	 }
		
	public void borrarCorreo(Correo correo){
		 this.inbox.remove(correo);
		 this.borrados.remove(correo);
	}
		
	public Integer contarBorrados(){
		 return this.borrados.size();
	}
		
	public Integer contarInbox(){
		 return this.inbox.size();
	}
		
	public void eliminarBorrado(Correo correo){
		 this.borrados.remove(correo);
	}
		
	public void recibirNuevos(){
		 this.servidor.recibirNuevos(this.nombreDeUsuario, this.passUsuario);
	}
		
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		 Correo correo = new Correo(asunto, destinatario, cuerpo);
		 this.servidor.enviar(correo);
	}
}