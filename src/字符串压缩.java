public class 字符串压缩 {
    public static void main(String[] args) {
        字符串压缩 a = new 字符串压缩();
        String s = new String();
        String test = new String("aabcccccaaaba");
        s = a.compressString(test);
        System.out.println(s);
    }
    public String compressString(String S) {
        StringBuilder sb = new StringBuilder();
        int cnt = 1;
        if(S.length() == 0)return S;
        if(S.length() == 1)return sb.append(S.charAt(0)).toString();
        for (int i = 0; i < S.length(); i++){
            if (i == S.length() - 1){
                if (S.charAt(i - 1) != S.charAt(i)){
                    sb.append(S.charAt(i)).append(cnt);
                    break;
                }else {
                    sb.append(S.charAt(i)).append(cnt);
                    break;
                }
            }
            if (S.charAt(i + 1) != S.charAt(i)){
                sb.append(S.charAt(i)).append(cnt);
                cnt = 1;
            }else {
                cnt++;
            }
        }
        if (S.length() <= sb.length())return S;
        else return sb.toString();
    }
}
