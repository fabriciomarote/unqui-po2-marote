package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;
    private ArrayList<SolicitudDeCredito> solicitudes;
	
	public Banco() {
		this.clientes = new ArrayList<Cliente>();
		this.solicitudes = new ArrayList<SolicitudDeCredito>();
	}
	
	public ArrayList<Cliente> getClientes() {
    	return clientes;
    }
    
    public ArrayList<SolicitudDeCredito> getSolicitudes() {
    	return solicitudes;
    }

    public void agregarCliente(Cliente cliente) {
    	clientes.add(cliente);
    }

    public void registrar(SolicitudDeCredito solicitud) {
   	 solicitudes.add(solicitud);
    }
   
    public void evaluar(SolicitudDeCredito solicitud) {
   	   if (solicitud.realizarChequeo()) {
   	      this.otorgarCredito(solicitud);
       }
    }
   
    public void otorgarCredito(SolicitudDeCredito credito) {
		 solicitud.getCliente().cobrarCredito();
	}
}
