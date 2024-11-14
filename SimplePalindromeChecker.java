import java.util.Scanner;

public class SimplePalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word or a phrase: ");
        String input = sc.nextLine();

        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        String reversed = "";
        for (int i = cleanInput.length() - 1; i >= 0; i--) {
            reversed = reversed + cleanInput.charAt(i);
        }

        if (cleanInput.equals(reversed)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        sc.close();
    }
}
