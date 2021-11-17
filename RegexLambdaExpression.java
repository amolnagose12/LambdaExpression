package com.bridgelabz.lambdaexpression;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface firstname {
    void validUser(String name);
}

public class RegexLambdaExpression {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration program");
        firstname function = (name)->{
            boolean check = Pattern.matches("([A-Z][a-z]{3,})",name);
            if (check == true) {
                System.out.println("Firstname is Valid");
            }else
                System.out.println("Enter valid name");
        };
        function.validUser("Amol");
    }
}