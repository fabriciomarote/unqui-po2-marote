package ar.edu.unq.po2.tp7.elementosSimilares;

import java.util.Map;
import java.util.Set;

public class PropiedadEnComun extends Filtro{
    
	public PropiedadEnComun() {
		super();
	}
	
	public Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina) {
	/**
	* Devuelve true si las paginas poseen aunque sea una propiedad del infobox en comun
	*/	
		Boolean esSimilar = false;
		
		Map<String, WikipediaPage> infoboxPagina = pagina.getInfobox();
		Set<String> propiedadesInfoboxPagina = infoboxPagina.keySet();
		
		Map<String, WikipediaPage> infoboxOtraPagina = otraPagina.getInfobox();
		
		for (String propiedad : propiedadesInfoboxPagina) {
			if(infoboxOtraPagina.containsKey(propiedad)) {
				esSimilar = true;
			}
		}
		return esSimilar;
	}
}
