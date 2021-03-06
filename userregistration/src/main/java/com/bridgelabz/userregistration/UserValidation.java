package com.bridgelabz.userregistration;

/**
 * Hello world!
 *
 */
import java.util.regex.Pattern;

public class UserValidation {
    public static final String namePattern = "^[A-Z][a-z]{2,}";

    public static boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(firstName).matches();
    }
    public static boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(namePattern);
        return pattern.matcher(lastName).matches();
    }
}