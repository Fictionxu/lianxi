/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;
import java.util.Scanner;
public class Assignment {

 
    public static void main(String[] args) 
    {
        String name1;
        String name2;
        String name3;
        Scanner reader=new Scanner(System.in);//定义输入的类
        System.out.println("Please input the first name:");
        name1=reader.nextLine();
        char a1 = name1.charAt(0);
        if((a1>='a'&&a1<='z')||(a1>='A'&&a1<='Z'))
        {
            System.out.print(name1);
            System.out.println(" is the first name.");
        }
        else
        System.out.println("Error: The first name was not accepted. ");
        System.out.println("Please input the second name:");
        name2=reader.nextLine();
        char a2 = name2.charAt(0);
        if((a2>='a'&&a2<='z')||(a2>='A'&&a2<='Z'))
        {
            System.out.print(name2);
            System.out.println(" is the second name.");
        }
        else
        System.out.println("Error: The second name was not accepted. ");
        System.out.println("Please input the third name:");
        name3=reader.nextLine();
        char a3 = name3.charAt(0);
        if((a3>='a'&&a3<='z')||(a3>='A'&&a3<='Z'))
        {
            System.out.print(name3);
            System.out.println(" is the third name.");
        }
        else
        System.out.println("Error: The third name was not accepted. ");            
        System.out.println("The names in alphabetical order are:");
        if((a1>='a'&&a1<='z')||(a1>='A'&&a1<='Z'))
        {  
            System.out.print("\"");
            System.out.print(name1);
            System.out.println("\"");
        }
        if((a2>='a'&&a2<='z')||(a2>='A'&&a2<='Z'))
        {   
            System.out.print("\"");
            System.out.print(name2);
            System.out.println("\"");           
        }
        if((a3>='a'&&a3<='z')||(a3>='A'&&a3<='Z'))
        {   System.out.print("\""); 
            System.out.print(name3);
            System.out.println("\"");
        }
       
                    
    }
    
}
