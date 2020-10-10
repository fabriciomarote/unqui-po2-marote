package ar.edu.unq.po2.tp3;

public class Rectangulo {
     
	private Integer alto;
	private Integer base;
	private Punto origen;
	private Punto esquinaSuperiorDerecha;
	private Punto esquinaSuperiorIzquierda;
	private Punto esquinaInferiorDerecha;
	
	public Rectangulo(Punto origen, Integer base, Integer alto) {
		this.origen = origen;
		this.esquinaSuperiorDerecha = new Punto(origen.getX(), alto);
		this.esquinaInferiorDerecha = new Punto(base, origen.getY());
		this.esquinaSuperiorIzquierda =  new Punto(base, alto);
		this.base = base;
		this.alto = alto;
	}
	
	public Integer getAlto() {
		return alto;
	}
	
	public Integer getBase() {
		return base;
	}
	
	public Punto getOrigen() {
		return origen;
	}
	
	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}
	
	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}
	
	public Punto getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}
	
	public void validateMedidas(Integer base, Integer alto) throws Exception {
		if (base <= 0) {throw new Exception("La base no puede ser negativa ni cero"); }
		if (alto <= 0) {throw new Exception("La altura no puede ser negativa ni cero");}
	}
	
	public Integer area() {
		return getAlto() * getBase();
	}
	
	public Integer perimetro() {
		return 2*(getAlto()) + 2*(getBase());
	}
	
	public Boolean esHorizontal() {
		return getBase()>= getAlto();
	}
	
	public Boolean esVertical() {
		return getBase()<=getAlto();
	}
}
