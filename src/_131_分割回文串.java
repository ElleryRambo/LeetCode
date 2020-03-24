import java.util.ArrayList;
import java.util.List;

public class _131_分割回文串 {
    List<List<String>> lists = new ArrayList<>();
    public static void main(String[] args) {
        _131_分割回文串 a = new _131_分割回文串();
        List<List<String>> test = new ArrayList<>();
        test = a.partition(new String("aab"));
        for (List<String> list : test) {
            System.out.println(list);
        }
    }
    public List<List<String>> partition(String s) {
        String ss = new String();
        List<String> list = new ArrayList<>();
        if(s == null || s.length() == 0)
            return lists;
        fenge(s,0,list);
        return lists;
    }

    private void fenge(String s, int start, List<String> list) {
        if (start == s.length()){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = start + 1;i <= s.length();i++){
            String str = s.substring(start,i);
            if(huiwen(str)){
                list.add(str);
                fenge(s,i,list);
                list.remove(list.size()-1);
            }
        }
    }

    private boolean huiwen(String s){
        for (int i = 0;i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
