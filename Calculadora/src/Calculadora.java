import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner (System.in);
        
        while (true){
         op = entrada.nextInt();
            if (op==5)                                          
                break;
            if (op<1 || op>6){                                 
                System.out.println("Opção do menu inválida"); 
                continue;
            }
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            switch (op){
                case 1:                
                 System.out.println("Média = "+ ((n1+n2)/2));
                break;
            case 2:
                if(n1>n2)
                 System.out.println("Diferença = "+(n1-n2));
                else
                 System.out.println("Diferença = "+ (n2-n1));
                break;
            case 3:
                 System.out.println ("Multiplicação = "+ (n1*n2));
                break;
            case 4:
                if (n2==0)
                 System.out.println("Não foi possivel realizar a operação");
                else
                 System.out.println ("Divisão = "+ (n1/n2));
                break;
            default:
                 System.out.println();
            }
        }
    
}
     }

