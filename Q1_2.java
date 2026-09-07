package ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FileWordCount {

    public static void main(String[] args) {

        String inputFile = "Input.txt";
        String outputFile = "outputFile.txt";

        Map<String, Integer> wordCount = new TreeMap<>();

        try {

            Scanner fileScanner = new Scanner(
                new File(inputFile)
            );

            while (fileScanner.hasNext()) {

                String word = fileScanner.next();

                if (wordCount.containsKey(word)) {

                    wordCount.put(
                        word,
                        wordCount.get(word) + 1
                    );

                } else {

                    wordCount.put(word, 1);
                }
            }

            fileScanner.close();

            PrintWriter writer =
                new PrintWriter(outputFile);

            for (
                Map.Entry<String, Integer> entry
                    : wordCount.entrySet()
            ) {

                writer.println(
                    entry.getKey()
                    + " : "
                    + entry.getValue()
                );
            }

            writer.close();

            System.out.println(
                "Word count written to "
                + outputFile
            );

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");
        }
    }
}
