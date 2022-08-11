package za.edu.vcconnect.st10068305;

public class Books {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Harry Potter");
        NonFiction nonFictionBook = new NonFiction("How To Be A Man");

        System.out.println("Book: " + fictionBook.getTitle()
                + "\nPrice: $" + fictionBook.getPrice()
                + "\nType: Fiction\n");

        System.out.println("Book: " + nonFictionBook.getTitle()
                + "\nPrice: $" + nonFictionBook.getPrice()
                + "\nType: Non-Fiction");
    }
}
