package cp6067;

public class waysToSplitArray {
    public static void main(String[] args) {

    }

    public static int waysToSplitArray(int[] nums) {
        long sum = 0;
        long max = 0;
        int res = 0;
        for(int i =0;i<nums.length;i++){
            max+=nums[i];
        }
        for(int i =0;i<nums.length-1;i++){
            sum+=nums[i];
            if(sum>=max-sum)res++;
        }
        return res;
    }
}
