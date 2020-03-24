public class 面试题_17_14_最小K个数 {
    public static void main(String[] args) {
        面试题_17_14_最小K个数 a = new 面试题_17_14_最小K个数();
        int[] nums = new int[]{1,3,5,4,2};
        int k = 2;
        int[] res = new int[]{};
        res = smallestK(nums, k);
        for (int i : res) {
            System.out.println(i);
        }
    }
    public static int[] smallestK(int[] arr, int k) {
        //SelectionSort(arr);
        //BubbleSort(arr);
        //InsertionSort(arr);
        MergeSort(arr);
        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = arr[i];
        }
        return res;
    }
    public static void SelectionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++){
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    public static void BubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = arr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public static void InsertionSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++){
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--){
                swap(arr, j, j + 1);
            }
        }
    }
    public static void MergeSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        MergeSort(arr, 0 ,arr.length - 1);
    }
    public static void MergeSort(int[] arr, int L, int R){
        if (L == R)return;
        int mid = L + ((R - L) >> 1);
        MergeSort(arr, L, mid);
        MergeSort(arr, mid + 1, R);
        Merge(arr, L, mid, R);
    }
    public static void Merge(int[] arr, int L, int mid, int R){
        int[] help = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        while (p1 <= mid && p2 <= R){
            help[i++] = arr[p1] > arr[p2] ? arr[p1++] : arr[p2++];
        }
        while (p1 <= mid){
            help[i++] = arr[p1++];
        }
        while (p2 <= R){
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++){
            arr[L + i] = help[i];
        }
    }
    public static void swap(int[] nums, int i, int j){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
