package cp6056;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestGoodInteger {
    public static void main(String[] args) {
        String s = "6777133339";
        String s1 = largestGoodInteger(s);
        System.out.println(s1);
    }

    public static String largestGoodInteger(String num) {
        List<String> list = new ArrayList<>();
        for(int i=0;i<num.length()-2;i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2) && num.charAt(i+1)==num.charAt(i+2)){
                String s = num.substring(i,i+3);
                list.add(s);
            }
        }
        Collections.sort(list);
        if(list.size()==0)return "";
        return list.get(list.size()-1);
    }
}
