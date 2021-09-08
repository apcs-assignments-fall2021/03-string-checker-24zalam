import java.util.Scanner;

public class MyMain {

    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || (str.charAt(i) == 'b') || (str.charAt(i) == 'c')) {
                count++;
            }


        }


        return count;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        //for (int i = 0; i < str.length(); i++) {
        //if (str.substring(i, i + 3).equals("the") || str.substring(i, i + 3).equals("The")) {
        //return true;
        // }
        // }
        //return false;
        String a = "The";
        if (str.toLowerCase().contains(a.toLowerCase())) {
            return true;
        } else {
            return false;

        }
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        if (reverse.equals(str)) {

            return true;
        } else {

            return false;
        }
    }



    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // YOUR CODE HERE
    }
}
