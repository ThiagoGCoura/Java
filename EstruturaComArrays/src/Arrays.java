import java.util.Scanner;
//vetores sao usado para armazenar informaçõs a memoria
public class Arrays {
    public static void main(String[] args) {
       /*sinalizando as variaveis e o numero devariaveis a ser armazenadas
        no caso a variavel x e y sao armazenados 2 valores*/
       int[] x = new int[2];
       int[] y = new int[2];
       int soma1=0, soma2=0; 
       Scanner entrada = new Scanner(System.in);
       /*no for e indicado uma nova variavel q n é indicada no inicio esta sera
       o numero de espaçoes na memoria onde i a variavel ira
       iniciar em 0 vai ate o limite mencionado no inicio sendo acrecentado ++
       de um em um*/
       for (int i=0; i<x.length; i++){   
       System.out.println("digite o numero x");
       /* os valores de x serao armazenados de acordo com a posição de i 
       mencionada no for*/
       x[i] = entrada.nextInt();
       System.out.println("digite o numero y");
       y[i] = entrada.nextInt();
       }
       /*usaremos uma nova variavel mencionada apenas neste for a z para somar
       os valore contidos no vetor x*/
       for (int z:x){   
        soma1 += z;
       }
       for (int k:y){
         soma2 += k;
       }
       System.out.println("Soma1 " +soma1);
       System.out.println("soma2 " +soma2);
    }
    
}
