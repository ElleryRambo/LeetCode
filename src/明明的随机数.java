import java.util.Arrays;
import java.util.Scanner;

public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] nums = new int[n];
            int i = 0;
            while (n-- != 0){
                nums[i++] = sc.nextInt();
            }
            Arrays.sort(nums);
            int[] arr = removeDuplicates(nums);
            for (int ar : arr) {
                System.out.println(ar);
            }
        }
    }

    static int[] removeDuplicates(int[] nums){
        int len = nums.length;
        int slow = 0;
        int fast = 1;
        while (fast < len){
            if (nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return Arrays.copyOfRange(nums, 0, slow + 1);
    }
}
