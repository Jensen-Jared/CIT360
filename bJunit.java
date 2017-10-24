/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Junit;

/**
 *
 * @author J.D.
 */
import java.util.Scanner;

public class bJunit {
    public static void main(String args[]){
        Scanner pay = new Scanner(System.in);
        double num1, num2, num3, answer;
        System.out.println("Hourly pay: ");
        num1 = pay.nextDouble();
        
        System.out.println("Hours per week: ");
        num2 = pay.nextDouble();
        
        System.out.println("Weeks worked in the year: ");
        num3 = pay.nextDouble();
        answer = num1 * num2 * num3;
        System.out.println(answer);
    }
    public int multi(String s1, String s2, String s3){
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);
        int num3 = Integer.parseInt(s3);
        return num1 * num2 * num3;
    }    
}
