import java.util.ArrayList;

public class Store {

    //users array
   private ArrayList<User> users = new ArrayList<User>();
    //media array
    private ArrayList<Media> medias = new ArrayList<Media>();


    public ArrayList<Media> getMedias() {
        return medias;
    }

    public void setMedias(ArrayList<Media> medias) {
        this.medias = medias;}


    public ArrayList<User> getusers() {
        return users;
    }

    public void setusers(ArrayList<User> users) {
        this.users = users;
    }

    public void addUser(User newuser){
        users.add(newuser);
    }


    public void displayUsers(){

        System.out.println("users: "+ users);
    }
    public void addMedia(Media media){
        medias.add(media);
    }
    public void displayMedia(){
        System.out.println("Media: "+medias);
    }

}
