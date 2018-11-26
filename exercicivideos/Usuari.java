package exercicivideos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usuari {
    private String nom;
    private String surname;
    private String password;
    private Date dataregistre;
    private List<Video> videos;

    public Usuari()
    {
        videos = new ArrayList<Video>();
    }

    public Usuari(String nom, String surname, String password, Date dataregistre, List<Video> video)
    {
        this.nom = nom;
        this.surname = surname;
        this.password = password;
        this.dataregistre = dataregistre;
        this.videos = video;
    }

    public List<Video> getVideos()
    {
        return videos;
    }

    public void setVideos(List<Video> videos)
    {
        this.videos = videos;
    }

    public void addVideo(Video video) {
        this.videos.add(video);

    }


    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Date getDataregistre()
    {
        return dataregistre;
    }

    public void setDataregistre(Date dataregistre)
    {
        this.dataregistre = dataregistre;
    }


}
