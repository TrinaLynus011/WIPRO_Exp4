package ex4;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char target = sc.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try {
            FileReader file = new FileReader(fileName);
            int ch;

            while ((ch = file.read()) != -1) {

                char currentChar = Character.toLowerCase((char) ch);

                if (currentChar == target) {
                    count++;
                }
            }

            file.close();

            System.out.println(
                "File '" + fileName + "' has "
                + count
                + " instances of letter '" + target + "'."
            );

        } catch (IOException e) {

            System.out.println(
                "File not found or cannot be read."
            );
        }

        sc.close();
    }
}
