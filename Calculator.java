import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner.*;
import java.lang.Math;


interface ICalculator {
/**
* Adds given two numbers
* @param x first number
* @param y second number
* @return the sum of the two numbers
*/
int add(int x, int y);
/**
* Divides two numbers
* @param x first number
* @param y second number
* @return the division result
*/
float divide(int x, int y) throws RuntimeException;
}



public class Calculator implements ICalculator{
  /* Implement your calculator class here*/
     public int add(int x, int y)
     {
        return (x + y);
     }
    
    
    public float divide(int x, int y) {
        if (y == 0) {
            System.out.println("Error");
            System.exit(0);
        }
        return ((float) x / y);
    }
    public static void main(String[] args){
        
        
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        int num_1 = scan.nextInt();
        char op = scan.next().charAt(0);
        int num_2 = scan.nextInt();
        
        
        if( (num_1 > Math.pow(2 , 20)) || (num_1 < (-Math.pow(2 , 20))))
        {
            System.out.println("Error");
        }
        
        else if( (num_2 > Math.pow(2 , 20)) || (num_2 < (-Math.pow(2 , 20))))
        {
            System.out.println("Error");
        }
        
        else
        {
            switch(op)
            {
                case '+':
                    System.out.println(calc.add(num_1 , num_2));
                    break;
            
                case '/':
                    System.out.println(calc.divide(num_1 , num_2));
                    break;
                
                default:
                    System.out.println("Error"); 
            }
            
            
            
        }
    
        
        
    }
        
}


