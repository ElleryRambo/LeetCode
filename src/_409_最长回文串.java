public class _409_最长回文串 {
    public int longestPalindrome(String s) {
        int ans = 0;
        if (s == null || s.length() == 0)return ans;
        int[] chars = new int[58];
        for (char ch : s.toCharArray()){
            chars[ch - 'A'] ++;
        }
        for (int ch : chars) {
            ans += ch / 2 * 2;
            if (ch % 2 == 1 && ans % 2 == 0)
                ans++;
        }
        return ans;
    }
}
