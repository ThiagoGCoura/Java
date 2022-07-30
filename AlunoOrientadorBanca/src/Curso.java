
public class Curso {
    private String nome;
    private String nivel;
    private double mensalidade;
    
    public Curso(String nome, String nivel, double mensalidade){
        this.nome = nome;
        this.nivel = nivel;
        this.mensalidade = mensalidade;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getNivel(){
        return this.nivel;
    }
     
    public double getCursoMensalidade(){
        return this.mensalidade;
    }
     
    public String toStringCurso(){
        return "Curso: " + this.getNivel() + " em " + this.getNome() +"\n";
    }
    
    public String nivelCurso(){
        String nivel_Curso = "";
        
        switch (this.getNivel()){
            case "Graduação": nivel_Curso += "do TCC: "; break;
            case "Lato sensu": nivel_Curso += "da monografia: "; break;
            case "Mestrado": nivel_Curso += "da dissertação: "; break;
            case "Doutorado": nivel_Curso += "da tese: "; break;
        }
        return nivel_Curso;
    }
}
