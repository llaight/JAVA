/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_labact_loro;

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.lang.String;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2. lab act DOB
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("===========================");
//        System.out.println("+ Dollar-Pesos Convertion +");
//        System.out.println("===========================\n");
//        
//        System.out.println("The current dollar convertion is Php 50.50");
//        System.out.print("Input the dollar: $ ");
//        double dollar = scanner.nextDouble();
//        
//        double pesos = dollar * 50.50;
//        
//        System.out.println("\nDollar to Pesos convertion...");
//        System.out.format("$ %.2f = Php %.2f\n\n", dollar, pesos);
        
        //2. lab act WINDOWS
        JOptionPane.showMessageDialog(null, "Hello World! Welcome to "
                + "Dollar-Pesos Convertion");
        JOptionPane.showMessageDialog(null, "The current dollar convertion is Php 50.50");
        
        double dollar = Double.parseDouble(JOptionPane.showInputDialog("Input the dollar: $ ",JOptionPane.QUESTION_MESSAGE));
        
        double pesos = dollar * 50.50;
        
        //TITLE YUNG CONVERSION rESULT 
        JOptionPane.showMessageDialog(null, "Dollar to Pesos convertion...\n" + 
        "$ " + String.format("%.2f", dollar) + " = " + "Php " + String.format("%.2f", pesos), "Convertion Result", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    
}
