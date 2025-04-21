package elzar;

/*
* Given a string,
* return true if the string starts with "hi" and false otherwise.


startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/
public class Task {
    public static void main(String[] args) {
        Task task = new Task();

        task.startHi("hi there");
        task.startHi("HI");
        task.startHi("hello hi");
        task.startHi("Hi");
        task.startHi("hI");
        task.startHi("hiiiii");
        task.startHi("hi everybody hi");
        task.startHi("My friend hI! ");
        task.startHi("hello hI");
        task.startHi("hi hello hi hi ");



    }

    public boolean startHi(String str) {

        return str.toLowerCase().startsWith("hi");
    }

}
