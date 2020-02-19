/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;

/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * date 02/19
 */
import java.util.Scanner;

public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("This program will do different mathematical operations to 1 and 2 depending on your choice of operations\nEnter an arithmatic operation");
        String s= sc.next();
        ArithmeticBase r= new ArithmeticBase();
        double result = r.calculate(1,2,s);
        
        System.out.println("result :" +result); 
    
    }





}

