import java.util.ArrayList;
import java.util.List;

public class Music extends Media{
    private String artist;

    public Music(String artist, String title, String auture, String isbn, double price) {
        super(title, auture, isbn, price);
        this.artist=artist;
    }

    public void listen(User user){
        System.out.println(user + "listening to: "+ getMusicCatalog());
    }


    public String getArtist() {
        return artist;
    }

    private ArrayList<Music> musicCatalog = new ArrayList<Music>();
    public ArrayList<Music> getMusicCatalog() {
        return musicCatalog;
    }

    public void addMusic(Music music){
        musicCatalog.add(music);
    }
    public void setMusicCatalog(ArrayList<Music> musicCatalog) {
        this.musicCatalog = musicCatalog;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String getMediaType() {
        if (getPrice()<10){
            return "Music";
        }else return "Premium music";
    }

    @Override
    public String toString() {
        return "\n Music { " +
                getMediaType() +
                "\nArtist : " + artist + "\n" +
                "auteur = " + getAuteur() + "\n" +
                "title = " + getTitle() + "\n" +
                "isbn= " + getIsbn() + "\n" +
                "price= " + getPrice() + "\n" +
                "}\n";
    }
}
