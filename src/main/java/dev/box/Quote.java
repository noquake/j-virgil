package dev.box;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Quote {

    String quoteCode;
    String quoteBody;
    String quoteDictator;
    String quoteMedia;

    public void makeQuoteCode() { // generate the code for the quote
        Date yymmdd = new Date();
        quoteCode = yymmdd.toString().replaceAll("[\\p{Punct}\\s]+", "").toLowerCase().substring(3);
    }

    public void askQuoteCode(String userQuoteCode) {
        if (userQuoteCode != null || userQuoteCode.isEmpty() || userQuoteCode.isBlank()) {
            quoteCode = userQuoteCode;
        }
    }

    public void getQuoteMedia(String media) {
        this.quoteMedia = media;
        System.out.println("media recorded");
    }

    public void getQuoteDictator(String dictator) {
        this.quoteDictator = dictator;
        System.out.println("dictator recorded");
    }

    public void getQuoteBody(String body) {
        this.quoteBody = body;
        System.out.println("body recorded");
    }

    public void addQuote() {
        // first generate the name of the txt file for the new quote being stored in the
        // nmanuscript
        makeQuoteCode();

        // check if the directory for the txt files exists, if not, make a new directory
        String quotePath = "src/main/resources/manuscripts";
        File quote = new File(quotePath);
        if (!quote.exists()) { // Check if the directory exists
            if (quote.mkdirs()) { // Create the directory if it does not exist
                System.out.println("'manuscripts' successfully initialized");
            } else {
                System.out.println("Failed to create 'manuscripts'");
                return;
            }
        }

        // Actually add the quote to manuscripts
        File thing = new File(quote, quoteCode);
        try {
            if (quote.createNewFile()) {
                System.out.println("Success! Virgil's manuscripts have been updated");
            } else {
                System.out.println("This quote already exists");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }

        String lexiconPath = "src/main/resources";
        File lexicon = new File(lexiconPath, "lexicon.txt");
        if (!lexicon.exists()) {
            System.out.println("virgils 'lexicon' doesn't exist yet. trying to create it now...");
            try {
                if (lexicon.createNewFile()) {
                    System.out.println("success! the 'lexicon' has been created");
                } else {
                    System.out.println("failed to create lexicon");
                    return;
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }

    }

}