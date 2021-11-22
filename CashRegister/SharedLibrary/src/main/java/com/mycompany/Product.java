/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author saaru
 */
public class Product {
    public String productName;              //String which contains the name of the product
    public double productPrice;              //double for the price of the products
    public int upcCode;                        //int for the upcCode of the products

    public Product(String productName, double productPrice, int upcCode) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.upcCode = upcCode;
    }
    
    public String toString(){
        return("Name: \n "+productName+" Price: "+productPrice+" UPC: "+upcCode);
    }
}
