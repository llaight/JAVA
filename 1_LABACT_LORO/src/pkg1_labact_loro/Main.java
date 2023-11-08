/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1_labact_loro;
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
        // 1. lab act DOB
//        Scanner scanner = new Scanner(System.in);
//        double[] recit = new double[2];
//        double[] quiz = new double[2];
//        double[] proj = new double[2];
//        double av_recit = 0;
//        double av_quiz = 0;
//        double av_proj = 0;
//        
//        System.out.println("==============================");
//        System.out.println("+ Student's Grade Calculator +");
//        System.out.println("==============================");
//        System.out.println("Input the Details:\n");
//        System.out.print("Enter name: ");
//        String name= scanner.nextLine();
//                
//        System.out.print("Enter Course: ");
//        String course= scanner.nextLine();
//        
//        System.out.println("\nInput the Grades:");
//        
//        System.out.println("\n2 recitation: ");
//        for(int i = 0; i < 2; i++ ){
//            System.out.format("Enter recit grade [%d]: ", i+1);
//            recit[i] = scanner.nextDouble();
//            av_recit += recit[i];
//        }
//        av_recit /= 2;
//        System.out.print("Recit avg: " + av_recit);
//        
//        System.out.println("\n\n2 quiz: ");
//        for(int i = 0; i < 2; i++ ){
//            System.out.format("Enter quiz grade [%d]: ", i+1);
//            quiz[i] = scanner.nextDouble();
//            av_quiz += quiz[i];
//        }
//        av_quiz /= 2;
//        System.out.print("Quiz avg: " + av_quiz);
//        
//        System.out.println("\n\n2 project: ");
//        for(int i = 0; i < 2; i++ ){
//            System.out.format("Enter project grade [%d]: ", i+1);
//            proj[i] = scanner.nextDouble();
//            av_proj += proj[i];
//        }
//        av_proj /= 2;
//        System.out.print("Project avg: " + av_proj);
//        
//        System.out.print("\n\nEnter exam grade: ");
//        double exam_grade = scanner.nextDouble()/100;
//        
//        //class standing computation
//        double total_clStand = (av_recit + av_quiz +av_proj)/3;
//        
//        System.out.format("\n\nClass standing = %.2f\n", total_clStand);
//        
//        //prelim grade
//        double prelim_grade= (total_clStand * 2)+ exam_grade;
//        
//        
//        //print
//        System.out.println("=========================");
//        System.out.println("+ Student's Grade Info: +");
//        System.out.println("=========================\n");
//        System.out.println("Name: " + name);
//        System.out.println("Course: " + course);
//        System.out.format("Midterm grade: %.2f", prelim_grade);
        
        // 1. lab act WINDOWS
        double[] recit = new double[2];
        double[] quiz = new double[2];
        double[] proj = new double[2];
        double av_recit = 0;
        double av_quiz = 0;
        double av_proj = 0;
        
        JOptionPane.showMessageDialog(null, "Welcome to Student's Grade Calculator");
        
        String name = JOptionPane.showInputDialog("Enter name: ", JOptionPane.QUESTION_MESSAGE);
        
        String course = JOptionPane.showInputDialog("Enter course: ", JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Input the Grades:");
        
        for(int i = 0; i < 2; i++){
            recit[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter recit grade [%d]: ", i+1),JOptionPane.QUESTION_MESSAGE));
            av_recit += recit[i];
        }
        av_recit /= 2;
        
        JOptionPane.showMessageDialog(null,String.format("Recit average: %.2f", av_recit));
        
        for(int i = 0; i < 2; i++){
            quiz[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter quiz grade [%d]: ", i+1),JOptionPane.QUESTION_MESSAGE));
            av_quiz += quiz[i];
        }
        av_quiz /= 2;
        
        JOptionPane.showMessageDialog(null,String.format("Quiz average: %.2f", av_quiz));
        
        for(int i = 0; i < 2; i++){
            proj[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Enter project grade [%d]: ", i+1),JOptionPane.QUESTION_MESSAGE));
            av_proj += proj[i];
        }
        av_proj /= 2;
        
        JOptionPane.showMessageDialog(null,String.format("Project average: %.2f", av_proj));
        
        double exam_grade = Double.parseDouble(JOptionPane.showInputDialog("Enter exam grade: ",JOptionPane.QUESTION_MESSAGE));
        
        //class standing computation
        double total_clStand = (av_recit + av_quiz +av_proj)/3;
        
        //prelim grade
         double prelim_grade= (total_clStand * 2)+ exam_grade;
         
        //print
        JOptionPane.showMessageDialog(null, "Student's Grade Info:" + "\n===========================" +
                "\nName: " + name +
                "\nCourse: " + course +
                "\nMidterm Grade: " + String.format("%.2f", prelim_grade), "Student's Grade Information", JOptionPane.INFORMATION_MESSAGE);
                
    }
    
}
