package ar.edu.unq.po2.tp7.elementosSimilares;

import java.util.ArrayList;
import java.util.List;

public abstract class Filtro {
 
	private List<Page> paginas;
	
	public Filtro() {
		this.paginas = new ArrayList<Page>();
	}
	
	public List<Page> getPaginas() {
		return paginas;
	}
	
	public List<WikipediaPage> getSimilarPages(WikipediaPage page, List<WikipediaPage> wikipedia) {
		List<WikipediaPage> pagesSimilares = new ArrayList<WikipediaPage>();
		
		for (WikipediaPage wikipediaPage : wikipedia) {
			if(esSimilar(page, wikipediaPage))
				pagesSimilares.add(wikipediaPage);
		}
		
		return pagesSimilares;
	}

	public abstract Boolean esSimilar(WikipediaPage pagina, WikipediaPage otraPagina);
	
}
