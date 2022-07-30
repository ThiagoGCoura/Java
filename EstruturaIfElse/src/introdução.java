//package ; //usado para determinar o pacote de informações a ser utilizada
import java.util.Scanner; // informando ao programa que teremos entrada de dados
public class introdução {
    public static void main(String[] args) {
        // informar variaveis que seram utilizadas 
        int x; // tipo de variavel seguida da sigla da variavel a ser urilizada
        int y;
        int soma;
        // informa ao sistema a utilização de dados de entrada
        /* obs. informasse uma nova variavel (entrada) n mencionada no campo
         de variaveis */ 
        Scanner entrada = new Scanner (System.in);
        // Campo de interação com o usuário
        System.out.println("Digite o valor de x:");
        /* Informa ao sistema que o valor digitado pelo usuario será o valor de 
        x
        x = a variavel mencionada em Scanner + o tipo (int,Double)*/
        x = entrada.nextInt();
        System.out.println("Digite o valor de Y =");
        y = entrada.nextInt();
        /* Uma vez informado, pelo ususario, os valores das variaveis utilizadas
        pelo sistema, podemos iniciar as funçoes utilizadas*/
        soma = x + y;
        /*Agora vamos mostrar o valor da soma ao usuário*/
        System.out.println ("Condição If e else");
        System.out.println("O valor da soma de x e y é = " +soma);
        /*introduzindo condiçoes ao sistema: 
        OBS: 
        if e else é sempre uma instrução: Boolean
        if é acompanhado por uma condição q fica em parenteses
        o else não possui condição, ele será a exclução das demais condiçoes
        impostas no if.
        */
            if (soma == 10) {
            System.out.println("Parabens!");
            } 
            if (soma < 10) {
            System.out.println("Cuidado!");
            }
            else { 
            System.out.println("Show!");
            }
        }
    }

