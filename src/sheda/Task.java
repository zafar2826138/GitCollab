package sheda;

/*

Given an array of ints,
return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false */


public class Task {
    public static void main(String[] args) {
        Task task = new Task();

        System.out.println(task.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(task.arrayFront9(new int[]{1, 2, 3, 4, 9}));
        System.out.println(task.arrayFront9(new int[]{1, 2, 3, 4, 5}));
        System.out.println(task.arrayFront9(new int[]{9}));

    }

    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public boolean arrayFront9(int[] nums) {
        int limit = Math.min(nums.length, 4);
        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }


}
