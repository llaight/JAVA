/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4_labact_loro;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 4. lab act DOB
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("===================");
//        System.out.println("+ Bank Calculator +");
//        System.out.println("===================");
//        System.out.println("Input the Details:\n");
//        
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        
//        System.out.print("Enter the money deposited: Php. ");
//        double money = scanner.nextDouble();
//        
//        System.out.print("Enter the days/time: ");
//        double time = scanner.nextDouble();
//        
//        System.out.print("Enter the rate: ");
//        double rate = (scanner.nextDouble()/100);
//        
//        System.out.print("Enter the withholding tax rate: ");
//        double wtrate = (scanner.nextDouble()/100);
//        
//        //withholding tax computation
//        double interest = ((money * rate * time)/365);
//        double withholding_tax = wtrate * interest;
//        
//        //net interest computation
//        double net_int = interest - withholding_tax;
//        
//        
//        //print
//        System.out.println("\n===========================");
//        System.out.println("+ Customer's Bank Details +");
//        System.out.println("===========================");
//        System.out.println("Name: "+ name);
//        System.out.println("--------------------");
//        System.out.format("A. Withholding Tax: Php. %.2f\n", withholding_tax);
//        System.out.format("B. Net Interest: Php. %.2f\n\n", net_int);



    //    4. lab act WINDOWS
          JOptionPane.showMessageDialog(null, "Welcome to the Evil Bank");
          String name = JOptionPane.showInputDialog("Enter your name: ", JOptionPane.QUESTION_MESSAGE);

          double money = Double.parseDouble(JOptionPane.showInputDialog("Enter the money deposited: Php. ",JOptionPane.QUESTION_MESSAGE)); 
          
          double time = Double.parseDouble(JOptionPane.showInputDialog("Enter the days/time: ", JOptionPane.QUESTION_MESSAGE));
         
          double rate = Double.parseDouble(JOptionPane.showInputDialog("Enter the rate: ", JOptionPane.QUESTION_MESSAGE))/100;
          
          double wtrate = Double.parseDouble(JOptionPane.showInputDialog("Enter the withholding tax rate: ", JOptionPane.QUESTION_MESSAGE))/100;
          
          //withholding tax computation
          double interest = ((money * rate * time)/365);
          double withholding_tax = wtrate * interest;
          
          //Net interest
          double net_int = interest - withholding_tax;
          
          //print
          JOptionPane.showMessageDialog(null, "Customer's Bank Details" + "\n==========================="+
                  "\nName: " + name + "\n--------------------" + "\nA. Withholding Tax: Php. " + String.format("%.2f", withholding_tax) + 
                  "\nB. Net Interest: Php. " + String.format("%.2f", net_int), "Bank Details", JOptionPane.INFORMATION_MESSAGE);
          
   
    }
  
  
}
