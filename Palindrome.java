public class Palindrome {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please provide a number.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }
    }
}
