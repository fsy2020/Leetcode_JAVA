package WeeklyCompetition228.cp6037;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class largestInteger {
    public static void main(String[] args) {
        largestInteger(123456);
    }
    public static int largestInteger(int num){
        int res = 0;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int k1 = num,k2=num;
        while(k1 >10){
            list1.add(k1%10);
            k1 = k1 /100;
        }
        list1.add(k1);
        k2 = k2/10;
        while(k2 >10){
            list2.add(k2%10);
            k2 = k2 /100;
        }
        list2.add(k2);
        Collections.sort(list1);
        Collections.sort(list2);
        for(int i=0;i<list1.size();i++){
            res +=Math.pow(10,i)*list1.get(i);
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(res);
        return 0;
    }
}
