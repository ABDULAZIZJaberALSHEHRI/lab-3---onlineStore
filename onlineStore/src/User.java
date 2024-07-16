import java.util.ArrayList;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchasedMedialist = new ArrayList<Media>();
    private ArrayList<Media> shoopingcart = new ArrayList<Media>();

    public User(String username, String email){
        this.username=username;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }



    public ArrayList<Media> getShoopingcart() {
        return shoopingcart;
    }

    public void setShoopingcart(ArrayList<Media> shoopingcart) {
        this.shoopingcart = shoopingcart;
    }

    public void setPurchasedMedialist(ArrayList<Media> purchasedMedialist) {
        this.purchasedMedialist = purchasedMedialist;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addtoCart(Media media){
        shoopingcart.add(media);
    }
    public void removeFromCart(Media media){
        shoopingcart.remove(media);
    }
    public void checkOut(){
        purchasedMedialist.addAll(getShoopingcart());
        getShoopingcart().removeAll(getShoopingcart());
        //System.out.println("Purchased Media list cart: "+purchasedMedialist);
    }
    public ArrayList<Media> getPurchasedMedialist() {
        return purchasedMedialist;
    }

    @Override
    public String toString() {
        return " \n{ " +
                "email: " + email + "\n" +
                "username: " + username + "\n" +
                "shopping cart: " + getShoopingcart() + "\n" +
                "Purchased Media list cart: " + getPurchasedMedialist() + "\n" +
                '}';
    }
}
