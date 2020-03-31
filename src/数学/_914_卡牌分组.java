package 数学;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _914_卡牌分组 {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count = new int[10000];
        for (int num: deck) {
            count[num]++;
        }
        int x = 0;
        for(int cnt: count) {
            if (cnt > 0) {
                x = gcd(x, cnt);
                if (x == 1) {
                    return false;
                }
            }
        }
        return x >= 2;
    }
    public int gcd(int a,int b) {
        return a == 0 ? b : gcd(b % a, a);
    }
}
