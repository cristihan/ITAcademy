package exercicivideos;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException {


        Video video1 = new Video();
        video1.setTitol("video1");        
        video1.setUrl(new URL("http://provaurl"));
        
        String tags = new String("tag1, tag2, tag3");        
        video1.addTags(tags);
        
        
        Video video2 = new Video();
        video2.setTitol("video2");


        Usuari user1 = new Usuari();
        user1.setNom("Maria");
        user1.addVideo(video1);
        user1.addVideo(video2);
        //user1.addVideo(videos);

        for (Video v : user1.getVideos()) {
            System.out.println("El usuario " + user1.getNom() + " tiene los videos " + v.getTitol() + " la URL " + v.getUrl()
             + " mostrar tags del usuario " + v.getTags());
        }
    }
}
