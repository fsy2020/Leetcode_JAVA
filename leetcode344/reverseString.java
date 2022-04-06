package leetcode344;

public class reverseString {
    public static void main(String[] args) {
        char[] c ={'a','v','c'};
        reverseString(c);
        System.out.println(c);
        String s = "Let's take LeetCode contest";
        String s1 = reverseWords(s);
        System.out.println(s1);
    }

    public static void reverseString(char[] c ){
        char [] temp = new char[c.length];
        for(int i =0;i<=c.length-1;i++){
            temp[i] = c[c.length-i-1];
        }
        for(int i =0;i<temp.length;i++){
            c[i] = temp[i];
        }
    }

    public static String reverseWords(String s){
        String[] str = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(String word:str){
            sb.append(" "+new StringBuilder(word).reverse());

        }
        sb.delete(0,1);
        return sb.toString();
    }
}
