import java.util.ArrayList;
import java.util.List;

public class 组合 {
    List<List<Integer>> lists = new ArrayList<>();
    public static void main(String[] args) {
        组合 a = new 组合();
        List<List<Integer>> test = new ArrayList<>();
        test = a.combine(4,2);
        for (List<Integer> integers : test) {
            System.out.println(integers);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        if(k <= 0 || n <= 0 || k > n){
            return lists;
        }
        List<Integer> list = new ArrayList<>();
        comb(n,k,1,list);
        return lists;
    }

    private void comb(int n, int k,int start, List<Integer> list) {
        if (list.size() == k){
            lists.add(new ArrayList<>(list));
            return;
        }else {
            for (int i =start;i <= n;i++){
                list.add(i);
                comb(n,k,i+1,list);
                list.remove(list.size() - 1);
            }
        }
    }
}
