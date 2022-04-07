package cp2217;

import java.util.ArrayList;
import java.util.List;

public class kthPalindrome {

    public static void main(String[] args) {
        int[] q = {1,2,3,4,5,90};
        kthPalindrome(q,3);
    }

    public static long[] kthPalindrome(int[] queries, int intLength) {
        List<Integer> list = new ArrayList<>();
        long[] ans = new long[queries.length];
        int min = (int) Math.pow(10,intLength-1);
        int max = (int) Math.pow(10,intLength);
        for(int i = min;i<max;i++){
            if(isPalindrome(i))list.add(i);
        }
        for(int i = 0;i<queries.length;i++){
           ans[i] = list.get((queries[i]));
        }
        return ans;
    }

    public static boolean isPalindrome(int k){
        int reverse = reverse(k);
        if(k == reverse){
            return true;
        }
        return false;
    }

    public static int reverse(int j){
        int s =0;
        int k = j;
        while(k!=0){
            s = s*10 + k%10;
            k = k/10;
        }
        return s;
    }
}
