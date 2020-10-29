/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Oct-20
 *  Time: 3:43 PM
 */
package main;

import java.util.InputMismatchException;
import java.util.Scanner;

//demonstrating exception handling using try catch finally
public class DemoException {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int result = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numerator");
        try {
            numerator = sc.nextInt();
            System.out.println("enter a denominator");
            denominator = sc.nextInt();

            result = numerator / denominator;
        }
        catch (ArithmeticException e){
            System.out.println("Denominator should not be zero");

        }
        catch (InputMismatchException e){
            System.out.println("enter integer value for numerator and denominator");
        }
        System.out.println("result = " + result);
    }
}
