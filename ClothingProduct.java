/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author uyser
 */
public class ClothingProduct extends Product {
    private String size;

    // Constructor
    public ClothingProduct(String productName, int id, double price, int quantityInStock, String size) {
        super(productName, id, price, quantityInStock);
        this.size = size;
    }

    // Other specific methods for ClothingProduct
}