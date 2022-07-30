
package testacirculo2;

abstract class FiguraGeometrica2 {
    private double raio;
    double centro;
    private String cor;
    
    public FiguraGeometrica2(String cor) {
        this.cor = cor;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public abstract boolean compare(FiguraGeometrica2 obj);
    
}
