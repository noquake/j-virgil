package dev.box;

import dev.box.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String[] inputAsArray(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("empty or null input\n");
            inputAsArray(input);
        }
        String[] parts = input.trim().split("\\s+"); // splits up the string at 'one or more linebreakers'
        return Arrays.copyOfRange(parts, 0, parts.length);
    }

    public static Boolean isCallingVirgil(String[] arguments) {
        if (arguments[0].equalsIgnoreCase("jvir")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("virgil started! \n");
        boolean run;

        while ((run = true)) {
            System.out.print("> ");
            String input = scanner.nextLine();
            // open scanner and wait for inputs
            String[] arguments = inputAsArray(input);
            String arg1 = arguments[arguments.length - 1];
            // System.out.println(Arrays.toString(arguments)); // Output: [arg1, arg2, arg3]

            if (isCallingVirgil(arguments) && arg1.equalsIgnoreCase("add")) {
                // ADD a new quote
                // QUOTE CODE
                Quote currQuote = new Quote();
                currQuote.makeQuoteCode();
                // System.out.println(
                // "would you like to make a custom nickname for this quote (recommended) to
                // keep track of it or use the default generator? y/n \nfor example,
                // 'breakingbad1' or 'westernfront2'\n");
                // input = scanner.nextLine();
                // if (input.equalsIgnoreCase("yes") || input.equalsIgnoreCase("y")) {
                // System.out.println("what would you like to nickname this quote?\n");
                // currQuote.quoteCode = scanner.nextLine();
                // } else if (input.equalsIgnoreCase("no") || input.equalsIgnoreCase("n")) {
                // currQuote.makeQuoteCode();
                // } else {
                // System.out.format("invalid command input. try again");
                // input = scanner.nextLine();
                // }
                // code to append it to lexicon
                currQuote.getQuoteCode();

                // QUOTE DICTATOR
                System.out.println("who's it by?\n");
                input = scanner.nextLine(); // get the actual text body of the quote TEST PRINT
                currQuote.setQuoteDictator(input);
                // code to append it to lexicon
                currQuote.getQuoteDictator();

                // QUOTE MEDIA
                System.out.println(
                        "from what media did you get this quote from? if no media, leave blank, here are some examples \nmovie, year: The Godfather, 1972 \nshow S#, E#: Better Call Saul, S1 E4 \nsong (album) artist: I Just Died (All I Have) Amerie \nbook, author year: Dune Messiah, Frank Herbert (1969)\n");
                input = scanner.nextLine();
                currQuote.setQuoteMedia(input);

                // code to append it to lexicon
                currQuote.getQuoteMedia();

                // QUOTE BODY
                System.out.println("write what you want virgil to record\n");
                input = scanner.nextLine();
                currQuote.setQuoteBody(input);
                currQuote.getQuoteBody();

                // ADD QUOTE
                currQuote.addQuote();
                System.out.println("quote recorded\n");
            }

            if (isCallingVirgil(arguments) && arg1.equalsIgnoreCase("rm")) {
                // DELETE QUOTE
                // print the contents of lexicon
                System.out.println("enter the code of the quote you want to delete\n");
                input = scanner.nextLine();
            }

            if (isCallingVirgil(arguments) && arg1.equalsIgnoreCase("man")) {
                // PRINT MAN PAGE
                LexiconEditor.printMan();
            }

            else if (arg1.equalsIgnoreCase("end") || arg1.equalsIgnoreCase("kill")) { // Close the program
                break;
            }

            else {
                System.out.format("invalid command '%s'. try again\n", input);
            }

        }
        scanner.close();

    }
}