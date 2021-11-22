/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author saaru
 */
public class ProductDatabase {
    Product milk = new Product("Milk", 4.49, 111);
    Product cookies = new Product("Cookies", 4.99, 112);
    Product brownies = new Product("Brownies", 2.99, 113);
    Product apples = new Product("Gala Apples", 1.69, 114);

    public Product getProductInfo(int upcCode) {

        if(upcCode == 111) {
            return milk;
        }
        else if(upcCode == 112){
            return cookies;
        }
        else if(upcCode == 113){
            return brownies;
        }
        else if(upcCode == 114){
            return apples;
        }
        else {
            return null;
        }
    }

}