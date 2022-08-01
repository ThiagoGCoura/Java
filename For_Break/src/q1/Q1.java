/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author thiag
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        num = 36;
        
        for(int i=0; i < num; i++) {
            if(i*i >= num) break;
            System.out.print(i +" ");
        }
    }
    
}
