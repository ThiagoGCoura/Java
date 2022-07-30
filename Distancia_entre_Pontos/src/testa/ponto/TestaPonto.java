package testa.ponto;
public class TestaPonto {
    public static void main(String[] args) {
       Ponto p1 = new Ponto(1,2);
       Ponto p2 = new Ponto(1,2);
       System.out.println("p1=>"+p1);
       System.out.println("p1=>"+p2);
       System.out.println("iguais=>"+p1.equals(p2));
       System.out.println("distancias=>"+p1.distancia(p2));//
    }
}
