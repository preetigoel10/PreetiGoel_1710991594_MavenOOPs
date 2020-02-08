package com.epam.Gift;

import com.epam.Chocolates.brandedChocolates;
import com.epam.IndianSweets.IndianSweets;

import java.util.ArrayList;
import java.util.Collections;

public class Gift {
    private ArrayList<brandedChocolates> chocolates;
    private ArrayList<IndianSweets> sweets;

    public Gift() {
        chocolates = new ArrayList<>();
        sweets = new ArrayList<>();
    }

    public void addChocolates(brandedChocolates chocolates){
        this.chocolates.add(chocolates);
    }
     public void showChocolates() {
         System.out.println("\nCHOCOLATES IN THE GIFT AT PRESENT");
        for (int i = 0; i < chocolates.size(); i++) {
            System.out.println((i + 1) + " " + chocolates.get(i));
        }
         System.out.println();
    }
    public void addSweets(IndianSweets sweet)
    {
        sweets.add(sweet);
    }
     public void showSweets() {
         System.out.println("\nSWEETS IN THE GIFT AT PRESENT");
        for (int i = 0; i < sweets.size(); i++) {
            System.out.println((i + 1) + " " + sweets.get(i));
        }
         System.out.println();
    }
    public int findTotalWeight(){
        int weight=0;

        for(brandedChocolates chocolates: this.chocolates)
            weight+=chocolates.getWeight();
        for(IndianSweets sweets: this.sweets)
            weight+=sweets.getWeight();

        return weight;
    }

    public void mostExpensiveChocolate()
    {
        Collections.sort(chocolates);
        System.out.println("Most Expensive Chocolate: "+chocolates.get(0).toString());
    }

    public void mostExpensiveSweet()
    {
        Collections.sort(sweets);
        System.out.println("Most Expensive Sweet: "+sweets.get(0).toString());
    }

    public void sortChoice(int choice)
    {

        switch(choice)
        {
            case 1:
                Collections.sort(chocolates);
                showChocolates();
                break;
            case 2:
                Collections.sort(sweets);
                showSweets();
                break;
            default:
                System.out.println("Invalid choice");
        }

    }


}
