import java.util.Scanner;

public class 汽水瓶 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int a = huan(num);
            System.out.println(a);
        }
    }

    private static int huan(int num) {
        int res = 0;
        while (num >= 3){
            if (num % 3 == 0){
                res += num/3;
                num /= 3;
            }
            if (num % 3 != 0){
                res += num/3;
                int t = num % 3;
                num = num/3 + t;
            }
        }
        if (num == 2){
            res++;
        }
        return res;
    }
}
