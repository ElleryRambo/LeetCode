public class _14_最长公共前缀 {
    public static void main(String[] args) {
        String[] strs = new String[]{"dog","racecar","car"};
        _14_最长公共前缀 a = new _14_最长公共前缀();
        String s = a.longestCommonPrefix(strs);
        System.out.println(s);
    }
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int length = 999999;
        if(strs.length == 0 || strs == null)return "";
        for(int k = 0; k < strs.length; k++){
            length = Math.min(length, strs[k].length());
        }
        int i = 0;
        for (int j = 0; j < length; j++){
            char c = strs[i].charAt(j);
            for (; i < strs.length; i++){
                if (c != strs[i].charAt(j)){
                    return sb.toString();
                }
            }
            sb.append(c);
            i = 0;
        }
        return sb.toString();
    }
}
