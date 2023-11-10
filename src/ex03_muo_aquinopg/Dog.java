/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex03_muo_aquinopg;

/**
 *
 * @author user
 */
public class Dog {
    private String name;
    private int age;
    private char aliveStatus;
   
    public Dog (String n, int a, char status) {
        name = n;
        age = a;
        aliveStatus = status;
    }

    public String getName() {
        return name;
    }
}