/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_muo_aquinopg;

public class EX01_MUO_AquinoPG {
    public static void main(String[] args) {
        //object 1
        String dogName1 = "Queen";
        int age1 = 1;
        char aliveStatus1 = 'N';

        //object 2
        String dogName2 = "Yumi";
        int age2 = 12;
        char aliveStatus2 = 'N';

        //object 3
        String dogName3 = "Chip";
        int age3 = 10;
        char aliveStatus3 = 'Y';

        int totalAge = age1 + age2 + age3;
        boolean oldest = ((age1 < age3) && (age2 > age3));
        boolean youngest = ((age1 < age3) && (age2 < age3));
        boolean alive = ((aliveStatus1 == 'Y') && (aliveStatus2 == 'Y') &&
        (aliveStatus3 == 'Y'));

        System.out.println("Dog's Name: " + dogName1 + "\n"
        + "Age: " + age1 + " year" + "\n"
        + "Alive? " + aliveStatus1
        + "\n" + "\n"
                
        + "Dog's Name: " + dogName2 + "\n"
        + "Age: " + age2 + " years" + "\n"
        + "Alive? " + aliveStatus2
        + "\n" + "\n"
                
        + "Dog's Name: " + dogName3 + "\n"
        + "Age: " + age3 + " years" + "\n"
        + "Alive? " + aliveStatus3
        + "\n" + "\n"
                
        + "Combined Ages: " + totalAge + "\n"
        + "Yumi is the oldest: " + oldest + "\n"
        + "All of them are alive: " + alive
        );
    }
}
/**
 *
 * @author MUON
 */