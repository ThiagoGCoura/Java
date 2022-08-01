import java.util.Scanner; 
public class KmCarro {
    public static void main(String[] args) {
        Carro n1 = new Carro();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Parâmetro Marca Modelo: ");
        n1.Modelo = entrada.nextLine();
        System.out.println("Digite o Parâmetro Carga Maxima: ");
        n1.Cargamaxima = entrada.nextInt();
        System.out.println("Digite o Parâmetro Kilometros rodados: ");
        n1.Kmrodados = entrada.nextInt();
        n1.Km();
        System.out.println("Marca Modelo: " +n1.Modelo);
        System.out.println("Marca Cargamaxima: " +n1.Cargamaxima);
        System.out.println("Marca Kilometros Rodados: " +n1.Km());
    }  
}
