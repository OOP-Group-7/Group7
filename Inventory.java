/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

import java.util.ArrayList;

import java.util.ArrayList;

public class Inventory {
    private ArrayList<Product> productList;

    // Constructor
    public Inventory() {
        this.productList = new ArrayList<>();
    }

    // Method to add a product to the inventory
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Method to display the list of products in the inventory and their details
    public void displayProductList() {
        for (Product product : productList) {
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("ID: " + product.getId());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity in Stock: " + product.getQuantityInStock());
        }
    }
}