package 剑指offer;

public class 斐波那契数列 {
    public int Fibonacci(int n) {
        if(n == 1)return 1;
        if(n == 0)return 0;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
