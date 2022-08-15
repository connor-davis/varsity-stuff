import java.util.Scanner;

public class DebugNine2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Movie[] movies = new Movie[8];
        // Removed unnecessary code.
        String message, entry;

        /*
          Changed the Movie[] index value assignments so the movies would be correctly
          inserted into the Movie[].

          Also created a Movie class to support the requirements.
         */
        movies[0] = new Movie("The Godfather", 1972);
        movies[1] = new Movie("The Good, the Bad, and the Ugly", 1966);
        movies[2] = new Movie("Pulp Fiction", 1994);
        movies[3] = new Movie("Shindler's List", 1993);
        movies[4] = new Movie("Casablanca", 1942);
        movies[5] = new Movie("Wizard of Oz", 1939);
        movies[6] = new Movie("Citizen Kane", 1941);
        movies[7] = new Movie("Some Like It Hot", 1959);

        System.out.println("Sort Movies by\n(N)ame, or (Y)ear");

        entry = input.next();

        if (entry.charAt(0) != 'Y') { // Changed to != 'Y' as this is how it will decide whether we sort by name or year.
            nameSort(movies);
            message = "Sorted by Name\n";
        } else {
            yearSort(movies);
            message = "Sorted by Year\n";
        }

        display(movies, message);
    }

    public static void nameSort(Movie[] array) {
        int a, b;
        Movie temp;
        int highSub = array.length - 1; // Added the "- 1" to fix the index out of bounds error.

        for (a = 0; a < highSub; ++a) {
            for (b = 0; b < highSub; ++b) {
                String first = array[b].getName();
                String second = array[b + 1].getName();

                if (first.compareTo(second) > 0) { // Added a ")" and moved the "> 0" out side of the first "()"
                    temp = array[b];
                    array[b] = array[b + 1]; // Changed the assignment to be "+ 1" of an index instead of assigning itself.
                    array[b + 1] = temp;
                }
            }
        }
    }

    public static void yearSort(Movie[] array) {
        int a, b;
        Movie temp;
        int highSub = array.length - 1;

        for (a = 0; a < highSub; ++a) {
            for (b = 0; b < highSub; ++b)
                if (array[b].getYear() > array[b + 1].getYear()) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
        }
    }

    public static void display(Movie[] s, String msg) {
        // Removed unnecessary code
        for (Movie movie : s) msg = msg + movie.getName() + ", " + movie.getYear() + "\n";

        System.out.println(msg);
    }
}
