
package conversor_de_temperatura;

import java.util.Scanner;

public class Conversor_de_temperatura {

    public static void main(String[] args) {

        double c,f;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma temperatura em Celsius: ");
        c = entrada.nextInt();
        f = 9 * (c/5) + 32;
        System.out.println("A temperatuta " +c +"°C corresponde a " +(String.format("%.1f", f)) +" graus Fahrenheit.");
        
    }        
}
