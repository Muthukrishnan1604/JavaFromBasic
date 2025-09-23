package src.main.java.org.example.challenges.string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CamelCaseConverter {

    public static void main(String[] args) {
        List<String> inputList = new ArrayList<>(List.of("Muthu", "", "Muthu Krishnasamy Loves Divi"));
        inputList.forEach(input -> System.out.println(getCamelCase(input)));
        inputList.forEach(input -> System.out.println(getCamelCaseUsingStream(input)));
    }

    private static <T extends String> String getCamelCase(T input) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        for(String value : split(input)) {
            if(value == null || value.isBlank()) {
                result.append("");
            } else {
                value = value.toLowerCase().trim();
                if(index != 0) {
                    value = Character.toUpperCase(value.charAt(0)) + value.substring(1);
                }
                result.append(value);
            }
            index++;
        }
        return result.toString();
    }

    private static String[] split(String input) {
        String[] output;
        String cleansedValue = Optional.ofNullable(input).orElse("");
        if(cleansedValue.isEmpty()) {
            output = new String[0];
            return output;
        } else {
            int i = 0, index = -1, arrayIndex = 0;
            output = new String[cleansedValue.length()];
            while (i < cleansedValue.length()) {
                index = cleansedValue.indexOf(" ", i + 1);
                if(index == -1) {
                    output[arrayIndex] = cleansedValue.substring(i);
                    break;
                } else {
                    output[arrayIndex] = cleansedValue.substring(i, index);
                    arrayIndex++;
                    i = index;
                }
            }
            return output;
        }
    }

    public static String getCamelCaseUsingStream(String input) {
        System.out.println("*".repeat(30));
        return null;
    }

}
