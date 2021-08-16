package com.epam.demo;


import java.util.Arrays;
import java.util.regex.Pattern;

public class Utils {

    private static final String NUMBER_PATTERN = "^[-]?(([1-9]\\d*)|0)(\\.\\d+)?";

    public static boolean isAllPositiveNumbers(String... str) {
        if (str.length == 0) {
            System.out.println("Running without arguments, default values: \"12\", \"79\" will be used.");
            str = new String[]{"12", "79"};
        } else if (!isStringNumber(str)) {
            System.out.println("Input error, not a number entered.");
        } else {
            System.out.println("Run with arguments: " + Arrays.toString(str));
        }
        return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }

    private static boolean isStringNumber(String... str) {
        Pattern numberPattern = Pattern.compile(NUMBER_PATTERN);
        return Arrays.stream(str).allMatch(s -> numberPattern.matcher(s).matches());
    }

}

