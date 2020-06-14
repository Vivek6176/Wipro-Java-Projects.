/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab.project2;
import java.util.*;

/**
 * Video
 */

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
