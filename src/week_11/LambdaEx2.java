package week_11;

interface MyFunction2 {
    int func(int a);
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction2 f = x -> x * x;
        System.out.println(f.func(5));
    }
}
