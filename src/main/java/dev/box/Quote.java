package dev.box;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class Quote {

    String quoteCode;
    String quoteBody;
    String quoteBodyFragment;
    String quoteDictator;
    String quoteMedia;

    public void makeQuoteCode() { // generate the code for the quote
        Date yymmdd = new Date();
        quoteCode = yymmdd.toString().replaceAll("[\\p{Punct}\\s]+", "").toLowerCase().substring(3);
    }

    public void askQuoteCode(String userQuoteCode) {
        if (userQuoteCode != null || userQuoteCode.isBlank()) {
            quoteCode = userQuoteCode;
        }
    }

    public void setQuoteCode(String quoteCode) {
        quoteCode = this.quoteCode;
    }

    public void getQuoteCode() {
        System.out.println(quoteCode);
    }

    public void setQuoteMedia(String media) {
        this.quoteMedia = media;
        System.out.println("media recorded");
    }

    public void getQuoteMedia() {
        System.out.println(quoteMedia);
    }

    public void setQuoteDictator(String dictator) {
        this.quoteDictator = dictator;
        System.out.println("dictator recorded");
    }

    public void getQuoteDictator() {
        System.out.println(quoteDictator);
    }

    public void setQuoteBody(String body) {
        this.quoteBody = body;
        System.out.println("body recorded");
        makeFragment(quoteBody);
        System.out.println("body fragment updated");
    }

    public void getQuoteBody() {
        System.out.println(quoteBody);
    }

    public void makeFragment(String quoteBody) {
        quoteBodyFragment = quoteBody.substring(0, 10);
    }

    public void addQuote() {
        // first generate the name of the txt file for the new quote being stored in the
        // nmanuscript

        // check if the directory for the txt files exists, if not, make a new directory
        String quotePath = "src/main/resources/manuscripts"; // desired directory of the manuscripts
        File quote = new File(quotePath, quoteCode); // adding the quote to the directory
        if (quote.mkdirs()) { // Create the directory if it does not exist
            System.out.println("'manuscripts' successfully initialized");
        } else {
            System.out.println("Failed to create 'manuscripts'");
            return;
        }

        if (!quote.exists()) { // Actually add the quote to manuscripts
            try {
                if (quote.createNewFile()) {
                    System.out.println("success! Virgil has inscribed ths quote");
                } else {
                    System.out.println("this quote already exists");
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
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