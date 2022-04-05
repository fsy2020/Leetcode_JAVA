package revision;

import java.util.HashMap;
import java.util.Map;

// “12：34：43”转换成秒
public class time2num {
    public static void main(String[] args) {
        String s = "12:23:23";
        int i = time2num(s);
        System.out.println(i);

        Map<Integer,Integer> map = new HashMap<>();

        //哈希表存数字并计数。
        int have = 0;
        int i1 = map.getOrDefault(have, 0) + 1;

        //十进制转二进制
        String s1 = Integer.toBinaryString(5);
        System.out.println("十进制转二进制"+s1);

        //字符串转数字
        int i2 = Integer.parseInt("23");
        System.out.println("字符串转数字"+i2);

        //StringBuilder用法
        StringBuilder sb = new StringBuilder();
        sb.insert(0,'5');
        sb.insert(1,'6');
        //取元素
        char c = sb.charAt(0);
        String s2 = sb.toString();
        System.out.println(s2);

    }

    public static  int time2num(String s){
        String[] split = s.split(":");
        return Integer.parseInt(split[0])*3600+Integer.parseInt(split[1])*60+Integer.parseInt(split[2]);

    }
    
    
}
