import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanStr = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = "";
        for (int i = cleanStr.length() - 1; i >= 0; i--) {
            reversed += cleanStr.charAt(i);
        }

        if (cleanStr.equals(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is NOT a palindrome.");
        }

        scanner.close();
    }
}
