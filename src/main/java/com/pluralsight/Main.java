package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Product> inventory = getInventory();

        for (int i = 0; i < inventory.size(); i++) {
            
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        inventory.add(new Product(1001, "Iphone", 1199.99));
        inventory.add(new Product(300, "Ipad", 699.99));
        inventory.add(new Product(250, "Apple Watch", 400.00));
        inventory.add(new Product(200, "Macbook", 1299.99));
        inventory.add(new Product(150, "Apple Pen", 99.99));


        return inventory;



    }
}
