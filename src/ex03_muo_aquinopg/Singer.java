/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03_muo_aquinopg;

/**
 *
 * @author MUON
 */
public class Singer {
    private String name;
    private int noOfPerformances;
    private double earnings;
    private Song favoriteSong;
    private Song newSong;
    private int audienceNum;
    private static int totalPerformances;
    
    public Singer (String n, int p, double e, Song f) {
        name = n;
        noOfPerformances = p;
        earnings = e;
        favoriteSong = f;
    }
        
    public void performForAudience() {
        noOfPerformances++;
        earnings = earnings + (100 * 12);
    }
    
    public void changeFavSong(Song changeSong) {
        favoriteSong = changeSong; 
    }

    public void setNoOfPerformances(int noOfPerformances) {
        this.noOfPerformances = noOfPerformances;
    }

    public Song getFavoriteSong() {
        return favoriteSong;
    }

    public Song getNewSong() {
        return newSong;
    }
    
    public int getPerformances() {
        return noOfPerformances;
    }

    public void setAudienceNum(int audienceNum) {
        this.audienceNum = 12;
    }

    public static void setTotalPerformances(int aTotalPerformances) {
        totalPerformances = aTotalPerformances;
    }
    
    public void performForAudience(Singer x, Singer y) {
      x.noOfPerformances++;
      x.earnings = earnings + (100 * 12);

      y.noOfPerformances++;
      y.earnings = earnings + (100 * 12);

      double splitEarnings = earnings / 2; 
      x.earnings = earnings;
      y.earnings = earnings; 
    }
    
}
