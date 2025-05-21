package week_11;

interface MyFunction {
    int func(int x, int y);
}

public class LambdaEx1 {
    public static void main(String[] args) {
        MyFunction add = (x, y) -> { return x + y; };
        MyFunction sub = (a, b) -> a - b;
        System.out.println(add.func(3, 4));
        System.out.println(sub.func(3, 4));
    }
}
