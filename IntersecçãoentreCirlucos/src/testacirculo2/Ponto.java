
package testacirculo2;

class Ponto {
    public int x, y;
       
    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distancia(Ponto centro) {
        int dx = this.x - centro.x;
        int dy = this.y - centro.y;
        return Math.sqrt(dx*dx + dy*dy);
    }
    
}
