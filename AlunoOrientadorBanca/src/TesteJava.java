class Teste {
	public static void main (String args[]){
		TrabalhoConclusao trabalho_Conclusao1 = new TrabalhoConclusao("xico", "coura", 10.0, null, null, null, null);
                Curso curso1 = new Curso("ADS", "Graduação", 920.50);
		Aluno aluno1 = new Aluno("Martin Fowler", 11223344, true, true, true, 2020, 20.5, trabalho_Conclusao1, curso1);
 
		TrabalhoConclusao trabalho_Conclusao2 = new TrabalhoConclusao("Peter Coad", "Impacto da Refatoração", 0, "Grady Booch", "Erich Gamma", null, null);
		Curso curso2 = new Curso("Computação Aplicada", "Mestrado", 2150.45);
                Aluno aluno2 = new Aluno("Kent Beck", 22334455, false, true, true, 2019, 0, trabalho_Conclusao2, curso2);
		System.out.println(aluno1.getDados());
		System.out.println(aluno2.getDados());
	}
}
