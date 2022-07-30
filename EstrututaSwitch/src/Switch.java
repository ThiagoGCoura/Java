import java.util.Scanner;
public class Switch {
    public static void main (String[] args) {
        //Identificação das variaveis 
        int x;
        //variavel do tipo letras são igual ao conteudo q estará entre ""
        String y = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Você ira sair hj? 1=Sim;2=Não;3=Talvez;4=Medo");
        x = entrada.nextInt();
        /*Estrutura de condição switch tornam o codigo mais legivel alem de
        poder associar funçoes(ex case 3 e 4)*/
        //ápos o switch no parentes estará a variavel q será analisada
        switch (x){
            case 1:// usa-se dois pontos
                x = 1;
                y = "Cuidado, use mascara!";//nova variavel n mencionada fora do switch 
                break; //quebra a execução indo ao fim desta
            case 2:
                x = 2;
                y = "Otimo!";
                break; 
            case 3://associasão de cases
            case 4:
                x = 3;
                y = "Se sair Use mascara!";
                break;                         
        }
        //impressao da variavel analisada 
        System.out.println("" + y);
    }
}
