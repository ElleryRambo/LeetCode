public class _392_判断子序列 {
    public boolean isSubsequence(String s, String t) {
        if (s == null || t == null )return false;
//        int i = 0,j = 0;
//        while (i < s.length() && j < t.length()){
//            if (s.charAt(i) == t.charAt(j)){
//                i++;
//                j++;
//            }else {
//                j++;
//            }
//        }
        int i = 0;
        for (int j = 0;j < t.length();j ++){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
        }
        return i == s.length();
    }
}
