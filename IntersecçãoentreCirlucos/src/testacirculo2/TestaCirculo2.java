
package testacirculo2;

public class TestaCirculo2 {

    public static void main(String[] args) {
        Circulo2 c1 = new Circulo2( 0,0, 5, "00FF00");
        Circulo2 c2 = new Circulo2( 11,11, 5, "00FF00");
        
        System.out.println("iguais=>"+c1.compare(c2));
        System.out.println("area=>"+c1.Area());
        System.out.println("perimetro=>"+c1.Perimetro());
        System.out.println("interseccao=>"+c1.interseccao(c2));
    } 
}
