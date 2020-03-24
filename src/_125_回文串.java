public class _125_回文串 {
    public static void main(String[] args) {
        boolean a = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(a);
    }
    public static boolean isPalindrome(String s) {
        String ss = new String(s.replace(" ",""));
        System.out.println(ss);
        for(int i = 0; i < ss.length()/2; i++){
            if(ss.charAt(i) != ss.charAt(ss.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
