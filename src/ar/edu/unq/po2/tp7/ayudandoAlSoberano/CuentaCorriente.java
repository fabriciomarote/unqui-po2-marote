package ar.edu.unq.po2.tp7.ayudandoAlSoberano;

public class CuentaCorriente extends CuentaBancaria {
	
	private Integer descubierto;

	public CuentaCorriente(String titular, Integer descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	public Integer getDescubierto() {
		return this.descubierto;
	}
	
	/**
	 *Definicion de operacion primitiva definida como abstracta en la super clase.
	 */
	@Override
	protected Boolean esExtraccionPermitida(Integer monto) {
		return this.getSaldo() + this.getDescubierto() >= monto;
	}

}