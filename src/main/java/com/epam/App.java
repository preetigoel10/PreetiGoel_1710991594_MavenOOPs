package com.epam;

import com.epam.Chocolates.DairyMilk;
import com.epam.Chocolates.Galaxy;
import com.epam.Chocolates.KitKat;
import com.epam.Chocolates.Toblerone;
import com.epam.Gift.Gift;
import com.epam.IndianSweets.Barfi;
import com.epam.IndianSweets.Jalebi;
import com.epam.IndianSweets.Laddoo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       Gift gift = inputGift();

        boolean flag = false;

        while (!flag) {
            menuGuide();
            int choice = sc.nextInt();
            switch (choice) {
                case 0:
                    flag = true;
                    break;
                case 1:
                    gift.showChocolates();
                    break;
                case 2:
                    gift.showSweets();
                    break;
                case 3:
                    gift.mostExpensiveChocolate();
                    gift.mostExpensiveSweet();
                    break;
                case 4:
                    System.out.println("Total Weight of Gifts : " + gift.findTotalWeight()+"g");
                    break;
                case 5:
                    gift.sortChoice(1);
                    break;
                case 6:
                    gift.sortChoice(2);
                default:
                    menuGuide();

            }
        }

    }
    static Gift inputGift(){
        System.out.println("Enter the following details of the gift");
        System.out.println("------------------------------------");
        Gift gift = new Gift();
        inputChocolates(gift);
        System.out.println("\n------------------------\n");
        inputSweets(gift);
        return gift;
    }
    static void inputChocolates(Gift gift){
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of chocolates received: ");
        int numberOfChocolates = sc.nextInt();
        while(numberOfChocolates>0){
            System.out.println("Choose the chocolates received from the following list: \nPress 1 to add KitKat \nPress 2 to add Toblerone \nPress 3 to add DairyMilk \nPress 4 to add Galaxy");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    gift.addChocolates(new KitKat());
                    break;
                case 2:
                    gift.addChocolates((new Toblerone()));
                    break;
                case 3:
                    gift.addChocolates(new DairyMilk());
                    break;
                case 4:
                    gift.addChocolates(new Galaxy());
                    break;
                default:
                    System.out.println("Enter valid input");
                    ++numberOfChocolates;
            }
            gift.showChocolates();
            --numberOfChocolates;
        }
    }
    static void inputSweets(Gift gift){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Indian sweets received: ");
        int numberOfSweets = sc.nextInt();
        while(numberOfSweets>0){
            System.out.println("Choose the sweets received from the following list: \nPress 1 to add Laddoo \nPress 2 to add Barfi \nPress 3 to add Jalebi");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    gift.addSweets(new Laddoo());
                    break;
                case 2:
                    gift.addSweets(new Barfi());
                    break;
                case 3:
                    gift.addSweets(new Jalebi());
                    break;
                default:
                    System.out.println("Enter valid input");
                    ++numberOfSweets;
            }
            gift.showSweets();
            --numberOfSweets;
        }
    }

    static void menuGuide() {
        System.out.println("Press 1: Show chocolates\n" +
                "Press 2: Show sweets\n" + "Press 3: Most expensive chocolate and Indian Sweet\n" + "Press 4: Total weight of gift\nPress 5: Sort the Chocolates by Price\\n\" + \"Press 6: Sort the Indian Sweets by Price" +
                "Press 0: Exit");
    }

}

