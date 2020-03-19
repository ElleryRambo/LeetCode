public class test {
    public static void main(String[] args) {
        String a = new String("aaa");
        String b = a + "b";
        System.out.println(a);
        System.out.println( a+b == b+a);

//        int aa = 1,bb= 2;
//        test t = new test();
//        System.out.println(aa);
//        System.out.println(bb);
//        t.swap(aa,bb);
//        System.out.println(aa);
//        System.out.println(bb);

//        String s = "heima";
//        System.out.println(s);
//        change(s);
//        s = change(s);
//        System.out.println(s);

        int a1 = 1;
        System.out.println(a1);
        change(a1);
        System.out.println(a1);
    }
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public  static String  change(String s) {
        s += "itcast";
        return s;
    }

    public  static int  change(int a) {
        a = 2;
        return a;
    }
}
