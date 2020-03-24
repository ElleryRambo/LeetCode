public class _4_寻找两个有序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] nums;
        int n = nums1.length;
        int m = nums2.length;
        nums = new int[n+m];
        if (m == 0){
            if (n % 2 == 0){
                return (nums1[n/2-1]+nums1[n/2])/2.0;
            }
            else return nums1[n/2];
        }
        if (n == 0){
            if (m % 2 == 0){
                return (nums2[m/2-1]+nums2[m/2])/2.0;
            }
            else return nums2[m/2];
        }
        int i=0,j=0,k=0;
        while (k != (m+n)){
            if (i == n){
                while (j != m){
                    nums[k++] = nums2[j++];
                }
                break;
            }
            if (j == m){
                while (i != n){
                    nums[k++] = nums1[i++];
                }
                break;
            }

            if(nums1[i] < nums2[j]){
                nums[k++] = nums1[i++];
            }else {
                nums[k++] = nums2[j++];
            }
        }
        if (k % 2 == 0){
            return (nums[k/2]+nums[k/2 - 1])/2.0;
        }else {
            return nums[k/2];
        }

    }
}

