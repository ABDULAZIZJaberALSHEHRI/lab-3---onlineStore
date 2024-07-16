public class Novel extends Book{
    private String genre;
    public Novel(String genre,String title, String auture, String isbn, double price, int stock) {
        super(title, auture, isbn, price, stock);
        this.genre=genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()<4.5){
            return "book";
        }else return "best selling book";
    }

    @Override
    public String toString() {
        return "\n Novel { " +
                getMediaType() +
                "\ngenre = " + genre + "\n" +
                "auteur = " + getAuteur() + "\n" +
                "title = " + getTitle() + "\n" +
                "isbn= " + getIsbn() + "\n" +
                "price= " + getPrice() + "\n" +
                "stock= " + getStock()+ "\n"+
                "Reviews: "+getAverageRating()+
                "}\n";
    }
}
