package com.bridgelabz.mood.analyser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Welcome to Junit Testing");
    }
    public static boolean firstName(String firstname) {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstname);
        return matcher.matches();
    }

}
