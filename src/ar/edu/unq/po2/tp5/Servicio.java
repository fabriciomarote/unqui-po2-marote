package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {

	private Double costoPorUnidadConsumida;
	private Integer cantUnidadesConsumidas;
	
	public Servicio(Double costo, Integer cantidad) {
		this.costoPorUnidadConsumida = costo;
		this.cantUnidadesConsumidas = cantidad;
	}
	
	public Double getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}
	
	public Integer getCantUnidadesConsumidas() {
		return cantUnidadesConsumidas;
	}
	
	@Override
	public Double getPrecioTotal() {
		return this.costoPorUnidadConsumida * this.cantUnidadesConsumidas;
	}

}
