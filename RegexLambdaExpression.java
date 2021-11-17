package com.bridgelabz.lambdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * User registration program using lambda expression.
 */
@FunctionalInterface
interface Lastname {
    void validUser(String name);
}

public class RegexLambdaExpression {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        Lastname function = (name)->{
            boolean check = Pattern.matches("(^[A-Z]{1}[a-z]{2,})",name);
            if (check == true) {
                System.out.println("Lastname is Valid");
            }else
                System.out.println("Enter valid name");
            	
        };
        function.validUser("Nagose");
    }
}