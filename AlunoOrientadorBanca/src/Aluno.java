
class Aluno{
	private String nome;
	private int cod_matricula, ano_finalizacao;
	private boolean e_bolsista, curso_finalizado, tem_trabalho;
	private double desconto;
        private TrabalhoConclusao trabalho_Conclusao;
        private Curso curso;       
	public Aluno(String nome, int cód_matrícula, boolean é_bolsista, boolean curso_finalizado, boolean tem_trabalho, int ano_finalização, double desconto, TrabalhoConclusao trabalho_Conclusao, Curso curso) {
            this.nome = nome;
            this.cod_matricula = cód_matrícula;
            this.e_bolsista = é_bolsista;
            this.curso_finalizado = curso_finalizado;
            this.tem_trabalho = tem_trabalho;
            this.ano_finalizacao = ano_finalização;
            this.desconto = desconto;
            this.trabalho_Conclusao = trabalho_Conclusao;
            this.curso = curso;
	}
        
        public String getAlunoMensalidade(){
            String resp="";
            double mensalidade = 1;
            
            if (this.e_bolsista){
		resp += "Bolsista com desconto de: " + this.desconto + "%\n";
		mensalidade = this.curso.getCursoMensalidade() * (1-this.desconto/100);
            }
            
            resp += "Mensalidade: R$ " + mensalidade + "\n";
            return resp;
	}

	public String getDados(){
            String resp = "Aluno: "+ this.nome +"\n";
            resp += this.curso.toStringCurso();
            resp += this.getAlunoMensalidade();
                    
            if (this.curso_finalizado){
                resp += "Curso finalizado em " +ano_finalizacao + "\n";
                         
                if (this.tem_trabalho){
                    resp += "Título " + curso.nivelCurso();
                    resp += this.trabalho_Conclusao.getTitulo()+ "\n";
                    resp += "Orientador(a): Prof. " + this.trabalho_Conclusao.getOrientador() + "\n";
                                 
                    if (this.curso.getNivel().equals("Graduação"))
			resp += "Nota: " + this.trabalho_Conclusao.getNota();
                                
                    else if (this.curso.getNivel().equals("Mestrado") || this.curso.getNivel().equals("Doutorado")){
			resp += "Banca: " + this.trabalho_Conclusao.getBanca1() + " - " + this.trabalho_Conclusao.getBanca2();
                                
                        if (this.curso.getNivel().equals("Doutorado")){
			resp += this.trabalho_Conclusao.getBanca1() + " - " + this.trabalho_Conclusao.getBanca2() + " - " + this.trabalho_Conclusao.getBanca3() + " - " + this.trabalho_Conclusao.getBanca4();
                        }
                    }
                }
            }
            return resp;
	}
}
 