/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_labact_loro;
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
        // .3 lab act DOB
//        System.out.println("=================================");
//        System.out.println("+ Worker's Gross Pay Calculator +");
//        System.out.println("=================================");
//        System.out.println("Input the Details:\n");
//        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the worker's name: ");
//        String name = scanner.nextLine();
//        
//        System.out.print("Input the working hours a week: ");
//        double hours = scanner.nextDouble();
//        
//        System.out.print("Input the rate per hour: ");
//        double rate = scanner.nextDouble();
//        
//        
//        //calculate
//        double gross_pay = hours * rate;
//        
//        //print
//        System.out.println("\n\n=======================");
//        System.out.println("+ Worker's Gross Pay: +");
//        System.out.println("=======================");
//        System.out.println("\nName: " + name);
//        System.out.format("Working hours: %.0f\nRate per hour: %.2f\n--------------------\nGross Pay: %.2f\n", hours, rate, gross_pay);
        


        //3. lab act WINDOWS TEH
        JOptionPane.showMessageDialog(null, "Welcome to Worker's Gross Pay Calculator");
        String name = JOptionPane.showInputDialog("Enter the Worker's name: ", JOptionPane.QUESTION_MESSAGE);
        double hours = Double.parseDouble(JOptionPane.showInputDialog("Input the working hours a week: ", JOptionPane.QUESTION_MESSAGE));
        double rate = Double.parseDouble(JOptionPane.showInputDialog("Input the rate per hour: ", JOptionPane.QUESTION_MESSAGE));
        
        double gross_pay = hours * rate;
        
        JOptionPane.showMessageDialog(null, "Worker's Gross Pay: \nName: "+ name +"\nWorking hours: "
                + String.format("%.0f", hours)+ "\nRate per hour: " + String.format("%.2f", rate) + "\n-----------------------------\nGross Pay: " 
                + String.format("%.2f", gross_pay),"Worker's Gross Pay", JOptionPane.INFORMATION_MESSAGE);
        
        
        
        
        
        
    }
    
}
