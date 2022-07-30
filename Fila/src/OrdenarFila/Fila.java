
package OrdenarFila;

import java.util.Scanner;
import java.util.Stack;


public class Fila {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Stack<String> pilhafila = new Stack<>();
        
        int opcao;

        String p0 = pilhafila.push("Joao");
        String p1 = pilhafila.push("Jose");
        String p2 = pilhafila.push("Maria");
        String p3 = pilhafila.push("Helena");
        String p4 = pilhafila.push("Severino");
        
        String[] a = {p0, p1, p2, p3, p4};
        
        System.out.println("Digite 1 para ordem da fila conforme entrada:  ");
        System.out.println("Digite 2 para que os ultimos sejam os primeiros:  ");
        opcao = entrada.nextInt();
        
        switch (opcao) {

            case 1:
                System.out.println("Ordem da fila conforme entrada:  ");
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
                break;
            
            case 2:
                System.out.println("Os ultimos sejam os primeiros:  ");  
                for (int j = a.length - 1; j >= 0; j--) {  
                    System.out.println(a[j]);
                }
                break;
        }
    }
}
        
        
    
        