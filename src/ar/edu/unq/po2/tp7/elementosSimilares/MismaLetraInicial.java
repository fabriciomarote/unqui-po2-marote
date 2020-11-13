package ar.edu.unq.po2.tp7.elementosSimilares;

public class MismaLetraInicial extends Filtro{

	public MismaLetraInicial() {
		super();
	}
	
	@Override
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
	/**
	* Devuelve true si ambas paginas empiezan con la misma letra
	*/		
		Boolean esSimilar = false;
		
		String tituloPagina = pagina.getTitle();
		String tituloOtraPagina = otraPagina.getTitle();
		
		if(tituloPagina.charAt(0) == tituloOtraPagina.charAt(0)) {
			esSimilar = true;
		}
		return esSimilar;
	}
}