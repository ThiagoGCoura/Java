
package testacirculo2;

public class Circulo2 extends FiguraGeometrica2 implements Calcula2 {
    private double raio;
    private Ponto centro;
    private int x,y;
    
    public Circulo2(int x, int y, double raio, String cor){
        super(cor);
        this.centro = new Ponto(x,y);
        this.raio = raio;
    }

    @Override
    public double Area() {
        return this.raio * this.raio * Math.PI;
    }

    @Override
    public double Perimetro() {
        return 2 * Math.PI * this.raio;
    }
    
    @Override
    public boolean compare(FiguraGeometrica2 obj) {
        Circulo2 c = (Circulo2) obj;
        return c.raio == this.raio && getCor().equals(c.getCor());
    }
 
    public boolean interseccao(Circulo2 c) {
        double intersc = (this.centro.distancia(c.centro) - (this.raio + c.raio));
        return intersc <= 0;
    }   
}
