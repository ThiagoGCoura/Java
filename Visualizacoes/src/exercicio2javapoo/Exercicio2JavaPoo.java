
package exercicio2javapoo;

public class Exercicio2JavaPoo {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        
        Visualizacao vis[] = new Visualizacao[2];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[1] = new Visualizacao(g[0], v[0]);
        
        
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());

        //System.out.println(v[0].toString());
        System.out.println();
    }
    
}
