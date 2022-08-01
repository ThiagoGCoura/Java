
public class Carro {
    String Marca;
    String Modelo;
    int Cargamaxima;
    int Kminicial=0;
    int Kmrodados;
    int Kmatualiza;
    
    public int Km() {
        int Kmatualiza;
        Kmatualiza = Kminicial + Kmrodados;
        return Kmatualiza;
    }
}
