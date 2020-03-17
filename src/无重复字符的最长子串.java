import java.util.HashMap;
import java.util.Map;

public class 无重复字符的最长子串 {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            int ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int end = 0, start = 0; end < s.length(); end++) {
                char alpha = s.charAt(end);
                if (map.containsKey(alpha)) {
                    start = Math.max(map.get(alpha), start);
                }
                ans = Math.max(ans, end - start + 1);
                map.put(s.charAt(end), end + 1);
            }
            return ans;
        }
    }
}
