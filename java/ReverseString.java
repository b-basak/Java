import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to take user input

        System.out.print("Enter a string: "); //the user to enter a string
        String input = scanner.nextLine();

        scanner.close();// Close the scanner to avoid resource leak

        String reversedString = reverseString(input);// Call the reverseString method to reverse the input string

        System.out.println("Reversed String: " + reversedString);  // Print the reversed string
    }

    private static String reverseString(String str) {  // Method to reverse a string

        char[] charArray = str.toCharArray(); // Convert the string to a character array

        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {    // Reverse the character array
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        return new String(charArray);     // Convert the character array back to a string
    }
}
