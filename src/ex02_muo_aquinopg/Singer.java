/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02_muo_aquinopg;

/**
 *
 * @author MUON
 */
public class Singer {
    String name;
    int noOfPerformances;
    double earnings;
    Song favoriteSong;
    Song newSong;
    int audienceNum;
    
    public Singer (String n, int p, double e, Song f) {
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = f;
    }
        
    public void performForAudience() {
        audienceNum = 12;
        noOfPerformances ++;
        earnings = earnings + (100 * audienceNum);
    }
    
    public void changeFavSong(Song changeSong) {
        favoriteSong = changeSong; 
    }
    
}
