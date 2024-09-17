package main.java.Org.Example.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {


    static double inputCheck(String promt) {
        Scanner input=new Scanner(System.in);
        boolean ok = false;
        double num=0;

        do {
            try {
                System.out.print(promt);
                num = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("wrong input, try again");
            }
        } while (!ok);
        return num;
    }
}
