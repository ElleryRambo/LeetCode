package 递归;

import java.util.List;

public class 面试题_08_06_汉诺塔问题 {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        move(A.size(), A, B, C);
    }

    private void move(int n, List<Integer> a, List<Integer> b, List<Integer> c) {
        if (n == 1){
            c.add(a.remove(a.size() - 1));
        }else {
            move(n-1, a, c, b);
            c.add(a.remove(a.size() - 1));
            move(n-1, b, a, c);
        }
    }
}
