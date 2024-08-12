package dev.box;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LexiconEditor {
    static String file = "lexicon"; // name of the file to be edited

    public static void appendToFile(String text) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, true);
            fileWriter.write(text);
            fileWriter.write(System.lineSeparator());
        } catch (IOException e) {
            System.err.println("an error occurred, could not write to file: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("an error occurred, could not close file: " + e.getMessage());
            }
        }
    }

    public static void printLexicon() {
        try (Scanner input = new Scanner(new File("lexicon.txt"))) {
            System.out.println("printing current lexicon list... ");
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void printMan() {
        try (Scanner input = new Scanner(new File("man.txt"))) {
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}