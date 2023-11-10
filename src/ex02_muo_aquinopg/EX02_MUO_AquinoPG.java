/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02_muo_aquinopg;

/**
 *
 * @author user
 */
public class EX02_MUO_AquinoPG {
    public static void main(String[] args) {
        //Dog class
        Dog Queen = new Dog("Queen", 1, 'N');
        Dog Yumi = new Dog("Yumi", 12, 'N');
        Dog Chip = new Dog("Chip", 10, 'Y');
         
        //Song class
        Song Franchesca = new Song("Franchesca", (float) 4.50, 2023);   
        Song firstLight = new Song("First Light", (float) 4.87, 2023);
       
        //Singer class
        Singer Hozier = new Singer("Hozier", 1, 1200, Franchesca);
        
        Hozier.performForAudience();
        Hozier.changeFavSong(firstLight);
        
        System.out.println(
            "Hozier performed for " + Hozier.noOfPerformances + " audiences." +
            "\n" + "Hozier's favorite song is changed to " + firstLight.title +
            "."
            
        );
        
    }
       
}
