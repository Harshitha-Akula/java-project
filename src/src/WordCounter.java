import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = scanner.nextLine();
        scanner.close();

        // Trim leading and trailing spaces and split by whitespace
        String[] words = paragraph.trim().split("\\s+");

        int wordCount = (paragraph.trim().isEmpty()) ? 0 : words.length;
        System.out.println("Number of words in the paragraph: " + wordCount);
    }
}
