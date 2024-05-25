package dev.box;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[] inputAsArray(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("empty or null input");
            inputAsArray(input);
        }
        String[] parts = input.trim().split("\\s+"); // splits up the string at 'one or more linebreakers'
        return Arrays.copyOfRange(parts, 0, parts.length);
    }

    public static Boolean isCallingVirgil(String[] arguments) {
        if (arguments[0].equalsIgnoreCase("virgil")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean run = true;
        System.out.println("virgil started. awaiting input...");

        while (run) {
            System.out.print("> ");
            String input = scanner.nextLine(); // open scanner and wait for inputs
            String[] arguments = inputAsArray(input);
            String arg1 = arguments[1];
            System.out.println(Arrays.toString(arguments)); // Output: [arg1, arg2, arg3]

            if (isCallingVirgil(arguments) && arg1.equalsIgnoreCase("add")) {
                Quote currQuote = new Quote();
                System.out.println("who's it by?");
                currQuote.getQuoteDictator(scanner.nextLine()); // get the actual text body of the quote TEST PRINT
                currQuote.addQuote();
                // lexicon.
            }

            // else if (input.equalsIgnoreCase("virgil add"))

            else if (isCallingVirgil(arguments) && arg1.equalsIgnoreCase("end")) {
                run = false;
            }

            else {
                System.out.format("invalid command '%s'. try again\n", input);
            }

        }
        scanner.close();

    }
}