/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 银行系统;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class 银行系统 
{

    static double zhipiao = 0;
    static double chuxu = 0;
    
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
        System.out.println("Welcome to CS110 BANK ");
        System.out.println("请创建一个用户");
        System.out.println("请输入初始账号");
        final String bankid=reader.nextLine();
        System.out.println("请输入初始密码");
        final String mima=reader.nextLine();
        System.out.println("初步存入储蓄金额");
        chuxu=reader.nextDouble();
        while(true)
        {
            System.out.print("请输入用户名：");
            String user_name = reader.nextLine();
	    System.out.print("请输入密码：");
	    String password = reader.nextLine();
            if (user_name != null && user_name.equals(bankid)
		&& password != null && password.equals(mima)) 
            {
		System.out.println("登陆成功！你要干什么？");
            }
            else
            {
                if(user_name!=bankid)
                {
                    System.out.println("账户不存在");
                }
                if(password!=mima)
                {
                    System.out.println("密码错误");
                }
                System.out.println("您可以选择重新输入或者退出该程序");
                System.out.println("输入1表示选择重新输入");
                System.out.println("输入任意键表示放弃输入，退出该程序");
                String x=reader.nextLine();
                if(x.equals("1"))
                {
                    System.out.println("请重新输入");
                    password = reader.nextLine();
                    break;    
                }
                
                continue;
            }
        while(true)
        {
            System.out.println("a：存款");
	    System.out.println("b：取款");
	    System.out.println("c：查询余额");
	    System.out.println("?：再次显示页面");
            System.out.println("q:退出");
            String 选择 = reader.nextLine();
            int xuanze=0;
            if(选择!=null&&选择.equals("a"))
            {
                xuanze=1;
            }
            else if(选择!=null&&选择.equals("b"))
            {
                xuanze=2;
            }
            else if(选择!=null&&选择.equals("c"))
            {
                xuanze=3;
            }
            else if(选择!=null&&选择.equals("?"))
            {
                xuanze=4;
            }
            else if(选择!=null&&选择.equals("q"))
            {
                xuanze=5;
            }
            else
            {
                System.out.println("输入错误，请重新输入");
                continue;
            }
            switch(xuanze)
            {
                case 1:
                {
                    double add=0;
                    System.out.println("请输入你想要存款的金额");
                    add=reader.nextDouble();
                    chuxu=chuxu+add;		 
                    System.out.println("你存入的金额为"+add+ "\r\n请选择你要的操作：");
                    break;
                }
                case 2:
                {
                    double draw=0;
                    System.out.println("请输入你想要取出的金额");
                    draw=reader.nextDouble();
                    if(draw>chuxu)
                    {
                        System.out.println("取出的金额大于现有存款，小伙子你想多了！重新输入吧");
                        continue;  
                    }
                    chuxu=chuxu-draw;
                    System.out.println("你取出的金额为"+draw+ "\r\n请选择你要的操作：");
                    break;
                    
                }
                case 3:
                {
                    System.out.println("你的余额为"+chuxu+ "\r\n请选择你要的操作：");
                    break;
                }
                case 4:
                {
                    System.out.println("a：存款");
	            System.out.println("b：取款");
	            System.out.println("c：查询余额");
	            System.out.println("?：再次显示页面");
                    System.out.println("q:退出");
                    System.out.print("请选择：");
                    break;
                }
                case 5:
                {
                    System.out.println("交易完成，请收好您的银行卡");
                    return;
                }
                
                   }
            
        }
            
    }
    }}

    

