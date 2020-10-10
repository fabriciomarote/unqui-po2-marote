package ar.edu.unq.po2.tp5;

public abstract class Factura implements Producto{

	public Factura() {
	}
	
	@Override
	public void registrarEn(Agencia agencia) {
		agencia.registrarPago(this);
	}

}
