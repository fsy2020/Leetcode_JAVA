package leetcode167;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {1,3,4,6,8};
        int[] twosum = twosum(nums, 14);
        System.out.println(twosum[0]);
    }

    public static int[] twosum(int[] numbers,int target){
        int[] res = new int[2];
        int left =0;
        int right =numbers.length-1;
        while (left<=right){
            if(target==numbers[left]+numbers[right]){
                res[0] = left+1;
                res[1] = right+1;
                return res;
            }
            else if(target>numbers[left]+numbers[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return res;

    }
}
