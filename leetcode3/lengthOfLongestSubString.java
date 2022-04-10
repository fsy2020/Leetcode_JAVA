package leetcode3;

public class lengthOfLongestSubString {

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);
        System.out.println(i);
    }

    public static int lengthOfLongestSubstring(String s){
        int left =0;
        int right = 1;
        if(s.charAt(left)==s.charAt(right )&& right==left+1){
            left++;
            right++;
        }else if(s.charAt(left)==s.charAt(right) && right!=left+1){
            left++;

        }else{
            while(s.charAt(left)!=s.charAt(right)){
                right++;
            }
        }


        return right-left;

    }
}
