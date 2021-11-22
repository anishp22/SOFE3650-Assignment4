/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author saaru
 */
public class Scanner {
    public int scannedUPCCode(int upcCode){
        if(upcCode > 114 || upcCode < 111){
            return 0;
        }
        else {
            return upcCode;
        }
    }
}
