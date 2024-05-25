package dev.box;

import java.io.FileWriter;
import java.io.IOException;

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
}