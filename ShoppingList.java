/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.shoppinglist;

/**
 *
 * @author llujan2027
 */
import java.util.Scanner;
import java.util.ArrayList;
public class ShoppingList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList list = new ArrayList();
        boolean programRun = true;
        System.out.println("""
                           Hello! Welcome to your shopping list!
                           Please type in items to add to your list
                           or type the letter 'r' to choose an item to take off.
                           Type the letter 'l' to view your full list.
                           Please type the letter 'n' to end the program.
                           """);
        while(programRun==true){
            String item = scan.nextLine();
            
            switch(item){
                case "n":
                    //System.out.println("Case 'n' is running.");
                    programRun = false;
                    System.out.println("Thank you for using this shopping list!");
                    break;
                case "r":
                    //System.out.println("Case 'r' is running.");
                    System.out.println("Please select a number to take off.");
                    int number = scan.nextInt();
                
                    if(number<=list.size()){
                        int index =(number-1);
                        list.remove(index);
                        index = 0;
                        while(index < list.size()){
                            System.out.println((index+1)+" - "+list.get(index));
                            index++;
                        }
                        System.out.println("Done!\n");
                    }else{
                        System.out.println("Sorry, that number is not on the list.\n");
                    }
                    break;
                case "l":
                    //System.out.println("Case 'l' is running.");
                    int index = 0;
                    while(index < list.size()){
                        System.out.println((index+1)+" - "+list.get(index));
                        index++;
                    }
                    System.out.println("Done!\n");
                    break;
                default:
                    //System.out.println("The Default is running.");
                    if (!"".equals(item)){
                        System.out.println("Your item is - " + item);
                        list.add(item);
                        index = 0;
                        while(index < list.size()){
                            System.out.println((index+1)+" - "+list.get(index));
                            index++;
                        }
                        System.out.println("Done!\n");
                    }
                    break;
            }
        }
    }
}
