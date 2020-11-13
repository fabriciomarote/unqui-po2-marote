package ar.edu.unq.po2.tp6;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.bancoYPrestamos.Banco;
import ar.edu.unq.po2.tp6.bancoYPrestamos.Cliente;
import ar.edu.unq.po2.tp6.bancoYPrestamos.CreditoHipotecario;
import ar.edu.unq.po2.tp6.bancoYPrestamos.CreditoPersonal;
import ar.edu.unq.po2.tp6.bancoYPrestamos.Propiedad;
import ar.edu.unq.po2.tp6.bancoYPrestamos.SolicitudDeCredito;

class BancoTestCase {

	private Banco banco;
	private Cliente cliente1;
	private Cliente cliente2;
	private Cliente cliente3;
	private Cliente cliente4;
	private Cliente cliente5;
	private SolicitudDeCredito creditoPersonal1;
	private SolicitudDeCredito creditoHipotecario1;
	private SolicitudDeCredito creditoPersonal2;
	private SolicitudDeCredito creditoHipotecario2;
	private ArrayList<Cliente> clientes;
	private Propiedad casa1;
	private Propiedad casa2;

	@BeforeEach
	public void setUp() {
		banco = new Banco();
		
		casa1 = new Propiedad("hogar","direccion10", 400000d);
		casa2 = new Propiedad("casa", "direccion7",500000d);
		
		cliente1 = new Cliente("Carlos", "Lopez", "direccion 1", 40, 50000d);
        cliente2 = new Cliente("Maria", "Martinez", "direccion 2", 50, 60000d);
        cliente3 = new Cliente("Jose", "Perez", "direccion 3", 35, 40000d);
        cliente4 = new Cliente("Patricia", "Gonzalez", "direccion 4", 40, 45000d);
        cliente5 = new Cliente("Graciela", "Torrico", "direccion 5", 30, 40000d); 
        
        creditoPersonal1 = new CreditoPersonal(cliente3, 15000d, 12);
        creditoHipotecario1 = new CreditoHipotecario(cliente1, 50000d, 24, casa2); 
        creditoPersonal2 = new CreditoPersonal(cliente2, 10000d, 5);
        creditoHipotecario2 = new CreditoHipotecario(cliente4, 100000d, 36, casa1);
        
        banco.agregarCliente(cliente1);
        banco.agregarCliente(cliente2);
        banco.agregarCliente(cliente3);
        banco.registrar(creditoPersonal1);
        banco.registrar(creditoHipotecario1);
        
        clientes = new ArrayList<Cliente>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        
	}
	
	@Test
	public void testAgregarClientes() {
		banco.agregarCliente(cliente4);
		banco.agregarCliente(cliente5);
		assertEquals(5, banco.getClientes().size());
	}
	
	@Test
	public void testRegistarSolicitud() {
		banco.registrar(creditoPersonal2);
		banco.registrar(creditoHipotecario2);
		assertEquals(4, banco.getSolicitudes().size());
	}

	@Test
	public void testMontoDesembolsao() {
		assertEquals(10000d, banco.getMontoDesembolsado());
	}
	
}

