package testa.ponto;
public class Ponto {
    private int x, y;
       
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    void mover (int dx, int dy) {
        x+=dx; 
        y+=dy;
     }
    
    @Override
    public String toString(){
        return "Ponto{" + "x=" + x + ", y=" + y + "}";
    }
    
    @Override
    public boolean equals(Object obj) { 
        Ponto p = (Ponto) obj;
        return (this.x == p.x) && (this.y == p.y);
    }
    
    public double distancia(Ponto p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
}