/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.menuloop;

/**
 *
 * @author mdewlok
 */

import java.util.Scanner;
public class MenuLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        
        // loop until the user exits
        while (choice != 4) {
            // display menu
            System.out.println("Menu");
            System.out.println("1. Say Hello");
            System.out.println("2. Add numbers");
            System.out.println("3. Show message");
            System.out.println("4. Exit");
            
            //get users choice
             System.out.println("Enter your choice");
             choice = input.nextInt();
             
             // process choice
             if (choice == 1){
                 System.out.println("Hello user");
             }
             else if (choice == 2) {
                 System.out.println("Enter first number");
                 int num1 = input.nextInt();
                 
                 System.out.println("Enter second number");
                 int num2 = input.nextInt();
                 
                 System.out.println("The sum is" + (num1 + num2));
             }
             else if (choice == 3){
                 System.out.println("Have a great day");
             }
             else if (choice == 4){
                 System.out.println("Goodbye");
             }
             else {
                 System.out.println("Invalid choice. Try again");
             }
        }
        
        input.close();   
    }
}
