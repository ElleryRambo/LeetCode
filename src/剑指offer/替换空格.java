package 剑指offer;

public class 替换空格 {
    public static void main(String[] args) {

        替换空格 a = new 替换空格();
        StringBuffer sbf = new StringBuffer("We Are Happy");
        String string = a.replaceSpace(sbf);
        System.out.println(string);
    }
    public String replaceSpace(StringBuffer str) {
        String s = new String("");
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' '){
                s += "%20";
            }else{
                s += str.charAt(i);
            }
        }
        return s;
    }
}
