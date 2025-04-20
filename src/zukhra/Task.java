package zukhra;

/*
Given an array of ints,
return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3 */


public class Task {
    public static void main(String[] args) {

        System.out.println(isPalindrome("Aziza"));  // Expected: true
        System.out.println(isPalindrome("Hello"));



    }
    public int arrayCount9(int[] nums) {

       int count = 0;
       for (int num : nums){
           if (num == 9){
               count++;
           }
       }
       return count;

    }

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

}
