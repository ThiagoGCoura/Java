
package javaex2;

import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;

public class JavaEx2 {

    public static void main(String[] args) {
        
        Date relogio = new Date();
        System.out.print("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.print("O idioma do sistema é: ");
        System.out.println (idioma.getDisplayLanguage()); // imprime “Português”
        
        Toolkit tela = Toolkit.getDefaultToolkit();
        Dimension d = tela.getScreenSize();
        System.out.println("A resolução do seu sistema é: " + d.width + " X " + d.height);
        
    }
    
}
