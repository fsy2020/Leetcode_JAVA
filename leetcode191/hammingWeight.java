package leetcode191;
/*
    int只能表示2^32-1位，十进制里就是10位。
    <<, >> 符号含义
 */
public class hammingWeight {
    public static void main(String[] args) {
        int i = 0b11111111111111111111111111111101;
        int i1 = hammingWeight(i);

        System.out.println(i1);
    }

    public static int hammingWeight(int n) {
        int sum = 0;
        for(int i = 0;i<32;i++){
            if((n & (1 << i))!=0){
                sum++;
            }
        }
        return sum;
    }
}
