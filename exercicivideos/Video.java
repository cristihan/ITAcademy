package exercicivideos;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Video {


    private URL url;
    private String titol;
    private List<String> tags;


    public Video() {
    	tags = new ArrayList<String>();
    }

    public Video(URL url, String titol, List<String> tags) {

        this.url = url;
        this.titol = titol;
        this.tags = tags;

    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public List<String> getTags() {
        return tags;
    }
    
    public void addTags(String tags) {
    	this.tags.add(tags);
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
    
    public String toString() {
        String results = "+";
        for(String d : tags) {
            results += d.toString(); 
        }
        return results;
      
    }


}
