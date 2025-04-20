package zukhra;

/*
Given an array of ints,
return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3 */


public class Task {
    public static void main(String[] args) {
        Task task = new Task();
        int[] nums = {1, 2, 9, 9, 3, 9};
        System.out.println("Number of 9's: " + task.arrayCount9(nums));

// palindrome
        System.out.println(isPalindrome("Aziza"));  // Expected: true
        System.out.println(isPalindrome("Hello"));



=======
        int n = 10;
        task.getFibonacci(n);
// main
    }


    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

// palindrome
    public static boolean isPalindrome(String word) {
        String reverse = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a palindrome");
            return true;
        } else {
            System.out.println(word + " is not a palindrome");
            return false;
        }
    }

//
    public int getFibonacci(int n) {

        int number = 10;
        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " "); // Print first two numbers

        for (int i = 2; i < n; i++) {
            int next = first + second;
            System.out.print(next + " "); // Print the next Fibonacci number
            first = second;
            second = next;
        }
        return number;
    }
// main
}

