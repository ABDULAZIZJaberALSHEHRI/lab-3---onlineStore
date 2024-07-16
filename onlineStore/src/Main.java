//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //novel books initialize
        Novel novel1=new Novel("Classic","don't be sad","dr. Aid al=Qarni","3788828",40,2);
        Novel novel2 = new Novel(" Fantasy","one cursed rose","Rebecca zenatti","974368963",
                40.88,3);
        Novel novel3 = new Novel("Adventure","Born of Gilded Mountains","Amanda Dykes","381546963",
                34.65,2);
        //Academic books initialize
        AcademicBook academicBook1 =new AcademicBook("Computer Science","java","Y. Daniel Liang",
                "375638284",62.28,5 );
        AcademicBook academicBook2  =new AcademicBook("language learn","How to successfully learn English",
                "Anthony kelleher", "643269884",70.5,7 );

        Store store1 = new Store();
        //Add books to media list
        System.out.println("============== Media ==============");
        store1.addMedia(novel1);
        store1.addMedia(novel2);
        store1.addMedia(novel3);
        store1.addMedia(academicBook1);
        store1.addMedia(academicBook2);
        store1.displayMedia();

        //Music-----------------------------
        Music music1=new Music("Mohammed Abdu","Sayk Alkhair","Khalid Al-faisal",
                "893766593", 100);
        Music music2=new Music("Abadi Al-joher","Dokhoon","Abdulrhman bin mosaad",
                "307632568", 9);
        //add music to play list
        music1.addMusic(music1);
        music2.addMusic(music2);
        //add music to media list
        store1.addMedia(music1);
        store1.addMedia(music2);

        //Movies----------------------------
        Movie movie1 = new Movie("Django","Quentin Tarantino",165,"987654567",150);
        Movie movie2 = new Movie("The relevant", "Alejandro G", 110, "837465920",100);
        Movie movie3 = new Movie("hateful eight", "Quentin Tarantino",107,"8773249576",78);
        //add movies to recommend list
        movie3.addMovie(movie3);
        movie2.addMovie(movie2);
        movie1.addMovie(movie1);
        //add movies to media list
        store1.addMedia(movie1);
        store1.addMedia(movie2);
        store1.addMedia(movie3);



        //========================================================================

        //user initialize
        User user1 = new User("Abdulaziz","az998@gmail.com");
        User user2 = new User("Ahmed","Ahmed122@hotmail.com");
        User user3 = new User("Ali", "Ali677@gmail.com");

        //Add users to users list
        System.out.println("============= users =============");
        Store store3 = new Store();
        store3.addUser(user1);
        store3.addUser(user2);
        store3.addUser(user3);
        store3.displayUsers();

        System.out.println("\n=================================================================================");
        System.out.println("===============================  USER ' 1 '  ====================================");
        //case user 1 add to shopping cart
        System.out.println("================ Case'1' user1 add to shopping cart =================");

        user1.addtoCart(novel3);
        user1.addtoCart(academicBook1);
        user1.addtoCart(movie1);
        user1.addtoCart(music2);
        System.out.println(" User 1: "+ user1.toString());

        System.out.println("============= Case'2' user1 remove from shopping cart =============");
        user1.removeFromCart(music2);
        System.out.println(" User 1 : "+ user1.toString());
        System.out.println("============= Case'3' user1 checkout =============");
        user1.checkOut();//the items will move to Purchased Media list cart
        System.out.println(" User 1 : "+ user1.toString());
        movie1.watch(user1);
        // user make reviews
        novel3.addReview(3);
        academicBook1.addReview(4);

        System.out.println("\n=================================================================================");
        System.out.println("===============================  USER ' 2 '  ====================================");
        // user 2 -----------
        System.out.println("================ Case'1' user2 add to shopping cart =================");

        user2.addtoCart(novel1);
        user2.addtoCart(academicBook2);
        user2.addtoCart(movie3);
        user2.addtoCart(music1);
        System.out.println(" User 2: "+ user2.toString());

        System.out.println("============= Case'2' user2 remove from shopping cart =============");
        user2.removeFromCart(academicBook2);
        System.out.println(" User 2 : "+ user2.toString());
        System.out.println("============= Case'3' user2 checkout =============");
        user2.checkOut();//the items will move to Purchased Media list cart
        System.out.println(" User 2 : "+ user2.toString());
        movie3.watch(user2);
        music1.listen(user2);
        //user reviews
        novel1.addReview(1);
        academicBook2.addReview(5);


        System.out.println("\n=================================================================================");
        System.out.println("===============================  USER ' 3 '  ====================================");
        //case user '3' adding to the cart
        System.out.println("================ Case'1' user 3 add to shopping cart =================");

        user3.addtoCart(novel2);
        user3.addtoCart(music2);
        System.out.println(" User 3: "+ user3.toString());

        System.out.println("============= Case'2' user 3 remove from shopping cart =============");
        user3.removeFromCart(music2);
        System.out.println(" User 3 : "+ user3.toString());
        System.out.println("============= Case'3' user3 checkout =============");
        user1.checkOut();//the items will move to Purchased Media list cart
        System.out.println(" User 3 : "+ user3.toString());

        novel3.addReview(3);
        academicBook1.addReview(4);
    }
}