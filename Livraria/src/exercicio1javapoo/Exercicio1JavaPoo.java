
package exercicio1javapoo;

public class Exercicio1JavaPoo {

    public static void main(String[] args) {
      Pessoa[] p = new Pessoa[2];
      Livro[] l = new Livro[3];
      
      p[0] = new Pessoa("Pedro", 22, "M");
      p[1] = new Pessoa("Maria", 25, "F");
      
      l[0] = new Livro("Aprendendo Java", "Jose", 300, p[0]);
      l[1] = new Livro("Poo java", "Pedro", 500, p[1]);
      l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
      
        System.out.println(l[0].detalhe());
    }
    
}
