package cp6047;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class removeDigit {
    public static void main(String[] args) {
        String s = removeDigit2("1231", '1');
        String s2 = s.substring(0, 1) + s.substring(2, 4);
        System.out.println(s2);

    }
    public static String removeDigit(String number, char digit) {
        char[] c = number.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = c.length-1;i>=0;i--){
            if(digit != c[i]){
                sb.append(c[i]);
            }else{
                digit = 0;
            }
        }
        return sb.reverse().toString();
    }

    public static String removeDigit2(String number, char digit) {
        int n = number.length();
        List<String> list = new ArrayList<>();
        char []c = number.toCharArray();
        for(int i = 0;i<c.length;i++) {
            if (c[i] == digit) {
                String s = number.substring(0, i) + number.substring(i + 1, n);
                list.add(s);
            }
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}

