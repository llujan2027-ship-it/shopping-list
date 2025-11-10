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
        //list of shopping items
        ArrayList list = new ArrayList();
        //keeps while loop running
        boolean programRun = true;
        System.out.println("""
                           Hello! Welcome to your shopping list!
                           Please type in items to add to your list
                           or type the letter 'r' to choose an item to take off.
                           Type the letter 'l' to view your full list.
                           Please type the letter 'n' to end the program.
                           """);
        //while loop
        while(programRun==true){
            //user inputs item
            String item = scan.nextLine();
            
            switch(item){
                //closes program
                case "n":
                    //System.out.println("Case 'n' is running.");
                    programRun = false;
                    System.out.println("Thank you for using this shopping list!");
                    break; //yaaaay we love clean code
                //asks a user to input an item number
                case "r":
                    //System.out.println("Case 'r' is running.");
                    System.out.println("Please select a number to take off.");
                    int number = scan.nextInt();
                    
                    //checks if number is bigger than the list size
                    if(number<=list.size()){
                        //if not, remove item @ number
                        int index =(number-1);
                        list.remove(index);
                        index = 0;
                        while(index < list.size()){
                            System.out.println((index+1)+" - "+list.get(index));
                            index++;
                        }
                        System.out.println("Done!\n");
                    //if yes, do nothing
                    }else{
                        System.out.println("Sorry, that number is not on the list.\n");
                    }
                    break; //this one didn't want to work for some reason
                //prints out the list without altering it at all, helpful.
                case "l":
                    //System.out.println("Case 'l' is running.");
                    int index = 0;
                    while(index < list.size()){
                        System.out.println((index+1)+" - "+list.get(index));
                        index++;
                    }
                    System.out.println("Done!\n");
                    break; //but this one did work fine
                //adds the item to the list
                default:
                    //System.out.println("The Default is running.");
                    /*failsafe that actually works to not add an empty spot after
                    removing an item because it ran after case "r" for some reason*/
                    if (!"".equals(item)){
                        System.out.println("Your item is - " + item);
                        list.add(item);
                        //this variable seems connected to the one in case "l"... huh.
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
