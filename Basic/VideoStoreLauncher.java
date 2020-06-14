
import java.util.*;



class Video {
    String m_title;
    boolean m_flag;
    double m_rating, m_total_rate;
    int m_rate_count;

    Video(String title){
        m_title = title;
        m_flag = true;
        m_rating = 0.0;
        m_rate_count = 0;
        m_total_rate = 0.0;
    }

    void beingCheckedOut(){
        if(m_flag){
            System.out.println(m_title + " is checked out!");
            m_flag = false;
        }
        else
            System.out.println("Sorry! " + m_title + " is currently not available!");
    }

    void beingReturned(){
        if(!m_flag){
            System.out.println(m_title + " returned!");
            m_flag = true;
        }
        else
            System.out.println("Video is already in inventory!");
    }

    void recieveRating(double rate){
        System.out.println("Thank you for your feedback on " + m_title);
        m_rate_count++;
        m_rating = (m_total_rate + rate)/m_rate_count;
        m_total_rate += rate;
    }
}

class VideoStore {
    ArrayList<Video> library = new ArrayList<>();
    void addVideo(String title){
        Video entity = new Video(title);
        library.add(entity);
        System.out.println("Added " + title + " to inventory.");
    }

    void CheckOut(String title){
        for(int i = 0; i < library.size(); i++){
            Video e = library.get(i);
            if(e.m_title == title){
                e.beingCheckedOut();
                return;
            }
        }

        System.out.println("Video not found!");
    }

    void returnVideo(String title){
        for(int i = 0; i < library.size(); i++){
            Video e = library.get(i);
            if(e.m_title == title){
                e.beingReturned();
                return;
            }
        }
        System.out.println("Video not found!");
    }

    void Rate(String title, double rate){
        for(int i = 0; i < library.size(); i++){
            Video e = library.get(i);
            if(e.m_title == title){
                e.recieveRating(rate);
                return;
            }
        }
        System.out.println("Video not found!");
    }

    void listInventory(){
        for(int i = 0; i < library.size(); i++){
            Video e = library.get(i);
            System.out.println("\n\nTitle: " + e.m_title);
            String status;
            if(e.m_flag)
                status = "Available";
            else
                status = "Not available";
            System.out.println("Status: " + status);
            System.out.println("Rating: " + e.m_rating);
        }
    }

}

public class VideoStoreLauncher {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VideoStore v = new VideoStore();
        
        //Add to inventory
        v.addVideo("The Matrix");
        v.addVideo("The Godfather II");
        v.addVideo("Star Wars Episode IV: A New Hope");
        
        //Rate
        v.Rate("The Matrix", 4.8);
        v.Rate("The Godfather II", 3.8);
        v.Rate("Star Wars Episode IV: A New Hope", 5.6);
        v.Rate("The Matrix", 10);
        v.Rate("The Godfather II", 8);
        v.Rate("Star Wars Episode IV: A New Hope", 6);
        //Renting
        v.CheckOut("The Matrix");
        v.CheckOut("The Godfather II");
        v.returnVideo("The Matrix");
        v.CheckOut("Star Wars Episode IV: A New Hope");
        v.returnVideo("The Matrix");
        v.CheckOut("Star Wars Episode IV: A New Hope");
        v.returnVideo("Star Wars Episode IV: A New Hope");
        
        //List Inventory
        v.listInventory();

        sc.close();
    }
}