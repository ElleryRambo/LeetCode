public class aaa {
    public static void main(String[] args) {
        System.out.println(f(15));
    }
    static int f(int a){
        if (a == 0 || a == 1)return 1;
        if (a == 2)return 2;
        return f(a - 2) + f(a - 1) + f(a - 3);
    }
}
