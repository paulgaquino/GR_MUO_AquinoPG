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
public class Song {
    private String title;
    private float length;
    private int yearReleased;
    
    public Song (String t, float l, int year) {
        title = t;
        length = l;
        yearReleased = year; 
    }

    public String getTitle() {
        return title;
    }
}
