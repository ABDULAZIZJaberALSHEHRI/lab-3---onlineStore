public class Review {
    private String username;
    private int rating;
    private String comment;

    public Review(String username, int rating, String comment){
        this.username=username;
        this.rating=rating;
        this.comment=comment;
    }
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
