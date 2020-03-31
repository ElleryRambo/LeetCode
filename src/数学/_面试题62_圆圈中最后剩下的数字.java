package 数学;

import java.util.ArrayList;
import java.util.List;

public class _面试题62_圆圈中最后剩下的数字 {
    public int lastRemaining(int n, int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(i);
        }
        int index = 0;
        while (n > 1){
            index = (index + m - 1) % n;
            list.remove(index);
            n--;
        }
        return list.get(0);
    }
}
