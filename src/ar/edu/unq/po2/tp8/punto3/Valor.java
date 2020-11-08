package ar.edu.unq.po2.tp8.punto3;

public enum Valor {
	
	A(1),
	DOS(2),
	TRES(3),
	CUATRO(4),
	CINCO(5),
	SEIS(6),
	SIETE(7),
	OCHO(8),
	NUEVE(9),
	DIEZ(10),
	J(11),
	Q(12),
	K(13);
	
	
	private int valor;
   
    Valor(int valor) {
        this.valor = valor;     
    }
    
	public int getValor() {
		return valor;
	}

}