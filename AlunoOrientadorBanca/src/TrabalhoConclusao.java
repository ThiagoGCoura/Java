
public class TrabalhoConclusao {
    private String orientador;
    private String titulo;
    private double nota;
    private String banca1;
    private String banca2;
    private String banca3;
    private String banca4;
    
    public TrabalhoConclusao(String orientador, String titulo, double nota, String banca1, String banca2, String banca3, String banca4){
        this.orientador = orientador;
        this.titulo = titulo;
        this.nota = nota;
        this.banca1 = banca1;
        this.banca2 = banca2;
        this.banca3 = banca3;
        this.banca4 = banca4;    
    }
    
    public String getOrientador(){
        return this.orientador;
    }
     
    public String getTitulo(){
        return this.titulo;
    }
    
    public double getNota(){
        return this.nota;
    }
     
    public String getBanca1(){
        return this.banca1;
    }
    
    public String getBanca2(){
        return this.banca2;
    }
     
    public String getBanca3(){
        return this.banca3;
    }
    
    public String getBanca4(){
        return this.banca4;
    }
}
     
     
     
     
     
