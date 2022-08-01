
package ponto_e_circulo;

class Circulo extends Ponto_e_circulo{
    private int x, y;
    private float raio;

public Circulo(int x, int y, float raio){
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    
    @Override
    public boolean igual(Ponto_e_circulo obj) {
        Circulo c = (Circulo) obj;
        return this.x == c.x && this.y == c.y && c.raio == this.raio;
    }
}
 
