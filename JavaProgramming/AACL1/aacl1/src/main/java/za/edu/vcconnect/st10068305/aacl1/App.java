package za.edu.vcconnect.st10068305.aacl1;

/**
 * Hello world!
 *
 */
public class App {
    private static int[] numbers = new int[] { 57, 92, 78, 15, 26, 52, 51, 50, 84, 65, 96, 48, 85, 21, 76, 86, 55, 23,
            44, 90, 89, 40, 36, 30, 69, 63, 8, 31, 24, 7, 19, 46, 4, 87, 56, 12, 32, 6, 61, 34, 13, 39, 59, 82, 62, 53,
            11, 18, 27, 66, 14, 38, 74, 91, 42, 45, 94, 25, 28, 71, 98, 72, 20, 60, 33, 17, 29, 99, 97, 80, 64, 100, 41,
            77, 79, 75, 68, 73, 22, 43, 49, 81, 58, 35, 2, 1, 67, 9, 95, 88, 54, 83, 16, 70, 93, 37, 5, 47, 3, 10 };

    private static long timeStart, timeEnd, timeTaken;

    public static void main(String[] args) {
        System.out.println("Starting Bubble sort.");

        timeStart = System.currentTimeMillis();
        int[] bubbleSorted = performBubbleSort(numbers);
        timeEnd = System.currentTimeMillis();

        timeTaken = timeEnd - timeStart;

        System.out.println("Bubble sort took " + timeTaken + " ms");

        System.out.println("Starting Insertion sort.");

        timeStart = System.currentTimeMillis();
        int[] insertionSorted = performInsertionSort(numbers);
        timeEnd = System.currentTimeMillis();

        timeTaken = timeEnd - timeStart;

        System.out.println("Insertion sort took " + timeTaken + " ms");
    }

    /**
     * This method will use the bubble sort algorithm to sort an int[] of numbers.
     * 
     * @param numbers
     * 
     * @return int[]
     */
    public static int[] performBubbleSort(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int a = numbers[i];
                    int b = numbers[i + 1];

                    numbers[i] = b;
                    numbers[i + 1] = a;
                }
            }
        }

        return numbers;
    }

    /**
     * This method will use the insertion sort algorithm to sort an int[] of
     * numbers.
     * 
     * @param numbers
     * 
     * @return int[]
     */
    public static int[] performInsertionSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            int el = numbers[i];
            int x = i - 1;

            while (x >= 0 && numbers[x] > el) {
                numbers[x + 1] = numbers[x];
                x = x - 1;
            }

            numbers[x + 1] = el;
        }

        return numbers;
    }
}
