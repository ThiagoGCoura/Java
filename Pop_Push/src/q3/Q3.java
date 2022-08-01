/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q3;

import java.util.*;
public class Q3 {

    public static void main(String[] args) {
        Stack <Integer> s1 = new Stack();
        Stack <Integer> s2 = new Stack();
        int j;
        for (j=0; j<9; j++){
            s1.push(j);
        }
        System.out.println(s1);
        System.out.println(s2);
        
        while (!s1.isEmpty()){
            j = s1.pop();
            if (j % 2 == 0)
                s2.push(j);
        }
        System.out.println(s1);
        System.out.println(s2);
        
        while (!s2.isEmpty()){
            j = s2.pop();
        }
        System.out.println(s1);
        System.out.println(s2);
        
    }
    
}
