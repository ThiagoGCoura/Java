import java.util.Scanner;
public class ControleFor {
    public static void main(String[] args) {
    //na estrutura controle é necessario informa onde as operaçoes iniciam
    int x,soma=0;
    double media=0;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite um numero;");
    /*na esturuta for e necessario informa uma nova variavel que não se deve indicar
    nas variaveis do programa ela ira percorrer apenas a estrutura de contabilização 
    usada no for isso é nescessario indicar seu inicio seu fim e como sera contabilizada*/
    for (int i=0; i<5; i++){
        x = entrada.nextInt();
        soma += x;
        media = soma/5;
    }
    System.out.println("valor da soma:" +soma);
    System.out.println("media= " +media);
    }
}
