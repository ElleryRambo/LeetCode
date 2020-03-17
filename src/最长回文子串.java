public class 最长回文子串 {
    public boolean isPalindromic(String s){
         for (int i = 0;i<s.length()/2;i++){
             if (s.charAt(i) != s.charAt(s.length() - i -1))
                 return false;
         }
         return true;
    }

    public String longestPalindrome(String s){
        String ans = "";
        int max = 0;
        int len = s.length();
        for (int i = 0;i < len;i++)
            for (int j = i+1;j<=len;j++){
                String test = s.substring(i,j);
                if (isPalindromic(test) && test.length()>max){
                    ans = test;
                    max = test.length();
                }
            }
        return ans;
    }
}
