
package ponto_e_circulo;

public class Ponto extends Ponto_e_circulo {
    private int x, y;
       
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
     @Override
    public boolean igual(Ponto_e_circulo obj){
         Ponto p = (Ponto) obj;
        return this.x == p.x && this.y == p.y;
    }
}
