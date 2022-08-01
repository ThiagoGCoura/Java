package Leitortxt;
        
import java.io.*;
import java.util.*;

public class LeitorTxt {

    public static void main(String[] args) { 
        
        ArrayList<Aluno> lista = new ArrayList();

        String linha = new String();
        String nomeArquivo = "F:\\arquivo alunos.txt";
        File arq = new File(nomeArquivo);
        
        if (arq.exists()){
            try{
                //leitorDeArquivo = Arquivo
                FileReader leitorDeArquivo = new FileReader(nomeArquivo);
                //BufferDeArquivo = linha
                BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
                String aux = bufferDeArquivo.readLine();
                
                while(aux != null){
                    //vetString = dados
                    String[] vetString = aux.split(";");
                    int id = Integer.parseInt(vetString[0]);
                    double nota = Double.parseDouble(vetString[2]);
                    lista.add(new Aluno(id, vetString[1], nota));
                    aux = bufferDeArquivo.readLine();

                        if (linha == null){
                        break;
                        }  
                    }
                
                imprimirMedia(lista);
                imprimirNota(lista);
                System.out.println("fim de programa.");
                
                bufferDeArquivo.close();
                
            }catch(FileNotFoundException e){
                System.out.println("Erro na abretura do arquivo. " +e);
            }catch (IOException e) {
                System.out.println("Falha de leitura. " +e);
            }    
        } 
    }

    static double verMedia(ArrayList<Aluno> lista){
        int total = 0;
        double media = 0;
        double soma = 0;
        double nota;
        
        for (int i=0; i<lista.size(); i++){
            soma += lista.get(i).nota;
            total = lista.size();
        }
      
         media = soma / total;
    
        return media;
    }
    
    static void imprimirMedia(ArrayList<Aluno> lista){
        double media_notas = verMedia(lista);

        System.out.println("Media das notas => " +media_notas);
    }
    
    static void imprimirNota(ArrayList<Aluno> lista){
        double mediaSala = verMedia(lista);
        
        for (int i=0; i<lista.size(); i++){
            if (lista.get(i).nota >= mediaSala){
            System.out.println("Nota maior que a media => " +lista.get(i).nota);
            }
        }
    }
}

        

