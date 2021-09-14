package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static String Temp= "C";
    public static void main( String[] args )
    {
        //convert temperature
        Scanner scan = new Scanner(System.in);
        String prompt;
        int inTemp, convertTemp;

        System.out.print("Press C for Celsius, F for Fahrenheit\nYour choice: ");
        prompt = scan.next();
        if (prompt.compareTo(Temp) == 0)
        {
            System.out.print("Please enter the temperature in Fahrenheit : ");
            inTemp = scan.nextInt();
            convertTemp = (inTemp - 32) * (5/9);
            System.out.print("The temperature in Celsius is " +convertTemp +"\n");
        }
        else
        {
            System.out.print("Please enter the temperature in Celsuis : ");
            inTemp = scan.nextInt();
            convertTemp = (inTemp * (9/5)) + 32;
            System.out.print("The temperature in Fahrenheit is " +convertTemp +"\n");
        }
    }
}
