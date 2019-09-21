package Question3;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        final Scanner=new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0)
            System.out.println("N/A");
        else {
            Book[] books = new Book[n];
            in.nextLine().trim();
            for (int i = 0; i < n; i++) {
                String bookName = in.nextLine().trim();
                String isbn = in.nextLine().trim();
                books[i] = new Book(bookName, authorName, isbn);
            }
            for (int j = 0; j < books.length; j++) {
                System.out.println(books[j]);

            }
        }
        in.close();
    }
}
class Book{
    private String bookName;
    private String authorName;
    private String isbn;
}
