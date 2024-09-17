package main.java.Org.Example.Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double number1;
        double number2;
        char exit;
        double result;
        Scanner input = new Scanner(System.in);

        while (true){
            System.out.println("Velkommen til regnemaskinen");
            System.out.println(" + for addition ");
            System.out.println(" - for substraktion");
            System.out.println(" * for multiplikation");
            System.out.println(" / for division");
            System.out.println(" q for quit");

            exit=input.next().charAt(0);

            if (exit=='q') break;

            number1= Calculator.inputCheck("write first number : ");
            number2= Calculator.inputCheck("write second number : ");

            switch (exit){
                case '+':
                    result=number1+number2;
                    break;
                case '-':
                    result=number1-number2;
                    break;
                case '*':
                    result=number1*number2;
                    break;
                case '/':
                    result=number1/number2;
                    break;
                default:
                    System.out.print("ugyldig oprator (regne tegn)");
                    input.nextLine();
                    continue;
            }
            System.out.print("RESULT = " + result);
            System.out.println();

        }
    }

}
