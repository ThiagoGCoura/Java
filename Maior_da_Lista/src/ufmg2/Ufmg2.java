/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufmg2;

import java.util.Scanner;

/**
 *
 * @author thiag
 */
public class Ufmg2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        double v[]= {1, 5, 7, 9.8, 34.2, 12, 5, 9.8, 11, 12}; 
        int p = 0; double m = v[0];
        for(int i= 1; i < v.length; i++){
            if (v[i] > m){
                m = v[i];
                p = i;
            }
            
        }
        System.out.println(p);
   }
} 


