package kate;
/*We'll say that a number is "teen"
if it is in the range 13..19 inclusive.
 Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true*/
public class Task {
    public static void main(String[] args) {
        Task task = new Task();

        System.out.println(task.hasTeen(13, 20, 10));
        System.out.println(task.hasTeen(20, 19, 10));
        System.out.println(task.hasTeen(20, 10, 13));
        System.out.println(task.hasTeen(20, 10, 12));
    }
    public boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }

    private boolean isTeen(int n) {
        return n >= 13 && n <= 19;
    }

}
