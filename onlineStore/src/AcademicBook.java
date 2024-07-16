public class AcademicBook extends Book{
    private String subject;
    public AcademicBook(String subject,String title, String auture, String isbn, double price, int stock) {
        super(title, auture, isbn, price, stock);
        this.subject=subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getMediaType() {
        if (getAverageRating()<4.5){
            return "book";
        }else return "best selling book";
    }

    @Override
    public String toString() {
        return "\n Academic Book { " +
                getMediaType() +
                "\nSubject = " + subject + "\n" +
                "auteur = " + getAuteur() + "\n" +
                "title = " + getTitle() + "\n" +
                "isbn = " + getIsbn() + "\n" +
                "price = " + getPrice() + "\n" +
                "stock = " + getStock()+
                "}\n";
    }
}
