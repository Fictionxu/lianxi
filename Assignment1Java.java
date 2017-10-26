/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1.java;
import java.util.Scanner;

/**
 *
 * @author SWOLLEN
 */
public class Assignment1Java {

     
    public static void main(String[] args) {
       int feet;//定义身高的英尺;
       int inches;//定义身高的英寸;
       double weight;//定义体重;
       double BIM;//定于身体质量指数;
       Scanner reader=new Scanner(System.in);//定义输入的类;
       System.out.println("What is your weight?");
       weight=reader.nextDouble();
       System.out.println("What is your height?");
       System.out.println("Feet;");
       feet=reader.nextInt();
       System.out.println("Inch;");
       inches=reader.nextInt();
       System.out.println("Your current BMI is:");
       BIM=weight*703/(feet*12+inches)/(feet*12+inches);
       System.out.println(String.format("%.2f", BIM));//控制输出的小数位数;
       
            
    }
    
}
          