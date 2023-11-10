/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex05_muo_aquinopg;

/**
 *
 * @author AquinoPG
 */
import java.util.*;

public class Store {
  private String name;
  private double earnings;
  private ArrayList<Item> itemList;
  private static ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
      this.name = name;
      earnings = 0;
      itemList = new ArrayList();
      storeList.add(this);
    // Initialize name to parameter and earnings to zero
    // Initialize itemList as a new ArrayList
    // add 'this' store to storeList
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
      if (index <= itemList.size()) {
          earnings = earnings + itemList.get(index).getCost();
          System.out.println("Sold: " + itemList.get(index).getName() + " " +
          itemList.get(index).getCost());
      }
      else {
          System.out.println("There are only " + itemList.size() + 
          " items in the store: ");
          for (Item h: itemList) {
              System.out.println(h.getName());
          }
      }
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    // get Item at index from itemList and add its cost to earnings
    // print statement indicating the sale
  }
 
  public void sellItem(String name){
      for (int p=0; p<itemList.size(); p++) {
          if (itemList.get(p).getName().equals(name)) {
              earnings = earnings + itemList.get(p).getCost();
              System.out.println("Item sold: " + name + 
              " Cost: " + itemList.get(p).getCost());
          }
          else {
              System.out.println("The store does not sell " + name + ".");
          }
      }
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    // get Item from itemList and add its cost to earnings
    // print statement indicating the sale
  }
  public void sellItem(Item i){
      if (itemList.contains(i)) {
          earnings = earnings + i.getCost();
          System.out.println("Item sold: " + i.getName() + " Cost: " + i.getCost());
      }
      else {
          System.out.println("Store does not sell " + i.getName() + ".");
      }
  }
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    // get Item i from itemList and add its cost to earnings
    // print statement indicating the sale
 
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for (Item h:itemList) {
        if (h.getName().equals(type)) {
            System.out.println("Item: " + h.getName());
        }
    }
  }
  public void filterCheap(double maxCost){
    // loop over itemList and print all items with a cost lower than or equal to the specified value
    for (Item p:itemList) {
        if (p.getCost() <= maxCost) {
           System.out.println(p.getName());
        }
    }
  }
  public void filterExpensive(double minCost){
      for (Item q:itemList) {
          if (q.getCost() >= minCost) {
              System.out.println(q.getName());
          }
      }
    // loop over itemList and print all items with a cost higher than or equal to the specified value
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings
    storeList.forEach((s) -> System.out.println("Store has sold " +
    s.getName() + " and earned " + s.earnings + "."));
  }
}
