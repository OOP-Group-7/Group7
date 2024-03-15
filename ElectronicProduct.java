/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Product;

/**
 *
 * @author uyser
 */
public class ElectronicProduct extends Product {
    private String brand;

    // Constructor
    public ElectronicProduct(String productName, int id, double price, int quantityInStock, String brand) {
        super(productName, id, price, quantityInStock);
        this.brand = brand;
    }

    // Other specific methods for ElectronicProduct
}
