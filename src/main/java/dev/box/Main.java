package dev.box;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public boolean callsVirgil;

    public static String[] getArgumentsAfterCommand(String input) {
        if (input == null || input.isEmpty()) {
            return new String[0]; // Return an empty array if the input is null or empty
        }

        String[] parts = input.trim().split("\\s+");
        if (parts.length <= 1) {
            return new String[0]; // Return an empty array if there are no arguments
        }

        return Arrays.copyOfRange(parts, 1, parts.length);
    }

    public static Boolean isCallingVirgil(String input) {
        int firstSpaceIndex = input.indexOf(' ');
        if (firstSpaceIndex == 0 && input.substring(0, firstSpaceIndex).equalsIgnoreCase("virgil")) {
            return true; // If there is no space, the whole input is the first word
        }
        // if (input == null || input.isEmpty()) {
        // return false; // Return an empty string if the input is null or empty
        // }

        else if
        return false; // Return an empty string if the input is null or empty
    }

    public Boolean callsVirgil(String input) {
        int firstSpaceIndex = input.indexOf(' ');
        if (callsVirgil && firstSpaceIndex == 0 && input.substring(0, firstSpaceIndex).equalsIgnoreCase("virgil")) {
            return true; // If there is no space, the whole input is the first word
        }
        // if (input == null || input.isEmpty()) {
        // return false; // Return an empty string if the input is null or empty
        // }

        else if
        return false; // Return an empty string if the input is null or empty
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Boolean run = true;
        String[] arguments = getArgumentsAfterCommand(input);
        System.out.println("virgil started. awaiting input...");

        while (run) {
            System.out.print("> ");
            input = scanner.nextLine(); // open scanner and wait for inputs
            System.out.println(Arrays.toString(arguments)); // Output: [arg1, arg2, arg3]

            if (input.equalsIgnoreCase("virgil add")) {
                Quote currQuote = new Quote();
                System.out.println("who's it by?");
                currQuote.getQuoteDictator(scanner.nextLine()); // get the actual text body of the quote TEST PRINT
                currQuote.addQuote();
            }

            // else if (input.equalsIgnoreCase("virgil add"))

            else if (input.equalsIgnoreCase("end")) {
                run = false;
            }

            else {
                System.out.format("invalid command '%s'. try again\n", input);
            }

        }
        scanner.close();

    }
}