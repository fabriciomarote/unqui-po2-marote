package ar.edu.unq.po2.tp7.ayudandoAlSoberano;

public class CajaDeAhorro extends CuentaBancaria {
	
	private Integer limite;

	public CajaDeAhorro(String titular, Integer limite) {
		super(titular);
		this.limite = limite;
	}

	public Integer getLimite() {
		return this.limite;
	}

	/**
	 *Definicion de operacion primitiva definida como abstracta en la super clase.
	 */
	@Override
	protected Boolean esExtraccionPermitida(Integer monto) {
		return this.getSaldo() >= monto && this.getLimite() >= monto;
	}

}

