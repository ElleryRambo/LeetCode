package 排序;

public class _493_翻转对 {
    public static void main(String[] args) {
        int[] nums = new int[]{5,4,3,2,1};
        int a = reversePairs(nums);
        System.out.println(a);
    }
    public static int reversePairs(int[] nums) {
        if(nums == null || nums.length == 0)return 0;
        mergeSort(nums, 0, nums.length - 1);
        return mergeSort(nums, 0, nums.length - 1);
    }
    private static int mergeSort(int[] nums, int l, int r) {
        if (l == r)return 0;
        int mid = l + ((r - l) >> 1);
        return mergeSort(nums, l, mid) + mergeSort(nums, mid + 1, r) +merge(nums, l, mid, r);
    }
    public static int merge(int[] arr, int l, int m, int r) {
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        int res = 0;
        while (p1 <= m && p2 <= r) {
            res += arr[p1] > 2 * arr[p2] ? (r - p2 + 1) : 0;
            help[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= m) {
            help[i++] = arr[p1++];
        }
        while (p2 <= r) {
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
        return res;
    }
}
