package za.edu.vcconnect.st10068305;

/**
 * 1 August 2022
 */
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] books = new String[6][2];

        books[0][0] = "Ulysses";
        books[0][1] = "James Joyce";
        books[1][0] = "Lolita"; // Added semicolon
        books[1][1] = "Vladimir Nabokov";
        books[2][0] = "Huckleberry Finn"; // Changed indexes
        books[2][1] = "Mark Twain";
        books[3][0] = "Great Gatsby";
        books[3][1] = "F. Scott Fitzgerald"; // Changed indexes
        books[4][0] = "1984";
        books[4][1] = "George Orwell";
        books[5][0] = "Sound and the Fury"; // Changed indexes
        books[5][1] = "William Faulkner";

        String entry,
                shortEntry,
                message = "Enter the first three characters of a book title omitting \"A\" or \"The\" ";
        int x;
        boolean isFound = false; // Changed to false otherwise the application did not run

        while (!isFound) {
            System.out.println(message);

            entry = input.next();

            if (entry.length() < 3) // Made sure they actually entered 3 characters at least
                System.out.println("Please enter the first three characters.");
            else {
                shortEntry = entry.substring(0, 1); // Fixed the ending index

                for (x = 0; x < books.length; ++x)
                    if (books[x][0].startsWith(shortEntry)) {
                        isFound = true;
                        System.out.println(books[x][0] + " was written by " + books[x][1]); // Fixed the index
                        x = books.length;
                    }

                if (!isFound) // Changed the boolean check
                    System.out.println("Sorry - no such book in our database");
            }
        }
    }
}
