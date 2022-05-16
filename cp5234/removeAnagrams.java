package cp5234;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeAnagrams {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bca";
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);


        boolean anagrams = isAnagrams(s1, s2);
        System.out.println(anagrams);

    }


    public static List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        for(String s : words){
            res.add(s);
        }

        for(int i= 1;i<words.length;i++){
            if(isAnagrams(words[i-1],words[i])){
                res.remove(words[i]);
            }
        }
        return res;
    }


    public static boolean isAnagrams(String s1, String s2){
        char[] c1 = s1.toCharArray();
        Arrays.sort(c1);
        String s3 = String.valueOf(c1);
        char[] c2 = s2.toCharArray();
        Arrays.sort(c2);
        String s4 = String.valueOf(c2);
        if(s3.equals(s4) ){
            return true;
        }
        return false;
    }
}
