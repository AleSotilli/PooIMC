
package calculoimc;

import javax.swing.JFrame;
import telas.PainelPrincipal;


public class CalculoIMC {

    public static void main(String[] args) {
        JFrame janela = new JFrame ("Cálculo IMC");
        PainelPrincipal painel = new PainelPrincipal();
        
        
        //Define atributos da tela
        
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        janela.setSize(300, 550);
        janela.add(painel);
        janela.setVisible(true);
        
        
        
        
    }
    
}
