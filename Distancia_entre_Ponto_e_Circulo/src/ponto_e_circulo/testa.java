package ponto_e_circulo;

public class testa {

    public static void main(String[] args) {
        Circulo c1 = new Circulo( 0,0, 5);
        Circulo c2 = new Circulo( 0,0, 5);
        
        System.out.println("iguais=>"+c1.igual(c2));
    } 
}
