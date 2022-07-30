import java.util.Scanner;
public class Praticandoaula1 {
    public static void main(String[] args) {
    double n1,n2;
    int op;
    Scanner entrada = new Scanner (System.in);
    while (true){
        System.out.println("1 Média entre os números digitados 2 Diferença do maior pelo menor 3 Multiplicação dos números digitados 4 Divisão do primeiro pelo segundo 5 Sair");
        op = entrada.nextInt ();
        if (op==5)
            break;
        if (op<1 || op>6){
            System.out.println("Opção invàlida");
            continue;
        }
        System.out.println("Digite 2 numeros: ");
        n1 = entrada.nextDouble();
        n2 = entrada.nextDouble();
        switch ( op ) {
            case 1 : 
                System.out.println ("Média = "+ ((n1+n2)/2));
                    break;
            case 2 : 
                System.out.println ("Diferença = "+ Math.abs(n1-n2));
                    break;        
            case 3 : 
                System.out.println ("Multiplicação = "+ (n1*n2));
                    break;
            case 4 : 
                System.out.println ("Divisão = "+ (n1/n2));
                if (n2==0)
                System.out.println("Não foi possivel realizar a operação");
                    break;
        }
        }
        } 
        }
