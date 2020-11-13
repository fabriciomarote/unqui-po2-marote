package ar.edu.unq.po2.tp7.elementosSimilares;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page implements WikipediaPage{

	private String title;
	private List<WikipediaPage> links;
	private Map<String, WikipediaPage>infobox;

    public Page(String title) {
    	this.title = title;
    	this.links = new ArrayList<WikipediaPage>();
    	this.infobox = new HashMap<String, WikipediaPage>();
    }
	
    public String getTitle() {
    	return title;
    }
    
    public List<WikipediaPage> getLinks() {
    	return links;
    }
    
    public Map<String, WikipediaPage> getInfobox() {
    	return infobox;
    }
}