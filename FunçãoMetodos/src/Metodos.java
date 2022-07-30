import java.util.Scanner;
/*usado para torna publico a todo o programa os metodos formulados*/
public class Metodos {
    /* metodo static com variaveis inteiras com o nome somar*/ 
    static int soma (int x, int y) {
        int s;
        s = x +y;
        return s;
    }
    /* metodo static com variaveis fracionada com o nome divisao*/ 
    static double mutiplicaçao (int x, int y){
        double m;
        m = x * y;
        //retorna o valor quando o metodo for mencionado
        return m;
}
    public static void main(String[] args){
        int x;
        int y;
       Scanner entrada = new Scanner (System.in);
       System.out.println("Digite o valores de x");
       x = entrada.nextInt();
       System.out.println("Digite o valor de Y");
       y = entrada.nextInt();
       //chama os valore pelo nome do metod e suas variaveis
       System.out.println("Resultado" + soma(x,y));
       System.out.println("Mutiplicação" + mutiplicaçao(x,y));
    }
}
