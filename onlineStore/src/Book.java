import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Integer> reviews = new ArrayList<>();

    public Book(String title, String auteur, String isbn, double price, int stock) {
        super(title,auteur, isbn, price);
        this.stock=stock;
    }

    public ArrayList<Integer> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Integer> reviews) {
        this.reviews = reviews;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

        public void addReview(int r){
        reviews.add(r);
    }

    public double getAverageRating(){
        double sum =0;
        double avr=0;
        for (int i = 0; i < reviews.size(); i++) {
            sum += reviews.get(i);
            avr = sum/reviews.size();
            return avr;
        }

        return avr;
    }

    public void purchase(User user){
        user.addtoCart(this);
        stock --;
    }

    public boolean isBestseller(){
        if (getAverageRating()<4.5){
            return false;
        }else return true;
    }

    public void reStock(int quantity){
        System.out.println("book quantity is: "+quantity);
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()<4.5){
            return "book";
        }else return "best selling book";
    }

    @Override
    public String toString() {
        return "Book{" +
                "auteur=' " + getAuteur() + '\'' +
                ", title=' " + getTitle() + '\'' +
                ", isbn=' " + getIsbn() + '\'' +
                ", price= " + getPrice() + '\'' +
                ",stock= " + stock+
                '}';
    }
}
