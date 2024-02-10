/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoragui;

import javax.swing.ImageIcon;

/**
 *
 * @author andre
 */
public class CalculadoraGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calculadora c = new Calculadora();
        
        c.setTitle("Calculadora");
        c.setIconImage(new ImageIcon(CalculadoraGUI.class.getResource("/calculadora.png")).getImage());
        c.setLocationRelativeTo(null);
        c.setVisible(true);
        
    }
    
}
