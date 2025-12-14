class Adder {
    // add 2 integers
    int add(int a, int b) {
        return a + b;
    }

    // add 3 integers
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Adder obj = new Adder();

        System.out.println("Sum of 2: " + obj.add(5, 7));
        System.out.println("Sum of 3: " + obj.add(5, 7, 9));
    }
}