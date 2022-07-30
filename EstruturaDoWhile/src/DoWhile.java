import java.util.Scanner;
public class DoWhile {
    public static void main (String[] args){
    int x,y,soma;
    char resposta; //variavel tipo char é utilizada para armazenar caracteres
    Scanner entrada = new Scanner (System.in);
        /*do e while são estruturas utilizadas para que o programa execute um laço de repetição*/
        do {
        System.out.println("digite um numero:");
        x = entrada.nextInt();
        System.out.println("Digite outro numero:");
        y = entrada.nextInt();
        soma = x + y;
        System.out.println("O valor da soma dos numeros é: " +soma);
        System.out.println("Deseja somar outros numeros:s/n");
        //.next().charAt() é usado para caracterizar o tipo de variavel char
        resposta = entrada.next().charAt(0);
        //caso a resposta esteja ora do padrao do while o programa encerará
        } while (resposta == 's');
    }  
}
