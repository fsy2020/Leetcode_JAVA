package leetcode3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubString {

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring2(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s){
        int sum =0;
        char[] c =s.toCharArray();
        for(int i=0;i<c.length;i++){
            Set<Character> set = new HashSet<>();
            int maxlen = 0;
            int j = i;
            while(j<c.length && !set.contains(c[j])) {
                    set.add(c[j]);
                    maxlen++;
                    j++;
                }
            sum = Math.max(maxlen,sum);
        }
        return sum;
    }

    public static int lengthOfLongestSubstring2(String s){
        int res = 0;
        int left = 0;
        char[] c = s.toCharArray();
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i = 0;i<c.length;i++){
            if(map.containsKey(c[i])){
                left = Math.max(left,map.get(c[i])+1);
            }
            map.put(c[i],i);
            res = Math.max(res,i-left+1);
        }
        return res;
    }

}
