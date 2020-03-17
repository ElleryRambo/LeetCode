public class 将数组分成和相等的三个部分 {
    public static void main(String[] args) {
        将数组分成和相等的三个部分 a = new 将数组分成和相等的三个部分();
        System.out.println(a.canThreePartsEqualSum(new int[]{1,-1,1,-1}));
    }
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++){
            sum += A[i];
        }
        if (sum % 3 != 0)return false;
        sum /= 3;
        int cnt = 0,flag = 0;
        for (int i = 0; i < A.length; i++){
            cnt += A[i];
            if (cnt == sum){
                flag++;
                cnt = 0;
            }
        }
        return flag >= 3;
    }
}
