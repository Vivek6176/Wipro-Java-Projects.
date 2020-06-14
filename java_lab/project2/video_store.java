/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab.project2;

import java.util.*;
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
