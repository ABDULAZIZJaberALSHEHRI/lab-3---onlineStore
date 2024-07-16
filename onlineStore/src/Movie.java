import java.util.ArrayList;

public class Movie extends Media{
    private int duration;
    public Movie(String title, String auture,int duration, String isbn, double price) {
        super(title, auture, isbn, price);
        this.duration=duration;
    }

    public void watch(User user){
        System.out.println( user +"are watching" + getMovies());
    }

    private ArrayList<Movie> movies = new ArrayList<>();

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public void setMovies(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }

    @Override
    public String getMediaType() {
        if (duration<120){
            return "Movie";
        }else return "Long Movie";
    }

    @Override
    public String toString() {
        return "\n Movie { " +
                getMediaType() +"\n"+
                "auteur = " + getAuteur() + "\n" +
                "title = " + getTitle() + "\n" +
                "isbn= " + getIsbn() + "\n" +
                "price= " + getPrice() + "\n" +
                "}\n";
    }
}
