package ar.edu.unq.po2.tp7.elementosSimilares;

import java.util.List;

public class LinkEnComun extends Filtro{

	public LinkEnComun() {
	  super();	
	}

	
	@Override
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
	/**
    * Devuelve true si las paginas poseen aunque sea una pagina linkeada en comun
	*/
        Boolean esSimilar = false;
		
		List<WikipediaPage> linksPagina = pagina.getLinks();
		List<WikipediaPage> linksOtraPagina = otraPagina.getLinks();
		
		for (WikipediaPage link : linksPagina) {
			if(linksOtraPagina.contains(link)) {
				esSimilar = true;
			}
		}
		return esSimilar;
     }
}
