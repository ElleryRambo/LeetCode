package 回溯;

import java.util.ArrayList;
import java.util.List;

public class _17_电话号码的字母组合 {
    List<String> lists = new ArrayList<>();
    String[] map = {"","","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        _17_电话号码的字母组合 a = new _17_电话号码的字母组合();
        List<String> test = new ArrayList<>();
        test = a.letterCombinations(new String("23"));
        for (String s : test) {
            System.out.println(s);
        }
    }
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0){
            return lists;
        }
        combination(digits,0,"");
        return lists;
    }

    private void combination(String digits, int start, String s) {
        if (start == digits.length()){
            lists.add(s);
            return;
        }
        Character c = digits.charAt(start);
        String letter = map[c - '0'];
        for (int i = 0;i < letter.length();i++){
            //string类型的s传过去本身的值没有改变，
            combination(digits,start + 1, s + letter.charAt(i));
        }
    }
}
