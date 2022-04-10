package WeeklyCompetition228.cp6037;

import java.io.FilterOutputStream;
import java.util.*;

public class largestInteger {
    public static void main(String[] args) {
        String s = "1234";
        int i = largestInteger2(123456);
        System.out.println(i);
    }

    //数字分割，转换成char[]数组然后
    public static int largestInteger(int num){
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char n = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if ((n - '0') % 2 == 1 && (arr[j] - '0') % 2 == 1 && arr[j] - '0' > n - '0') {
                    arr[i] = arr[j];
                    arr[j] = n;
                    n = arr[i];
                } else if ((n - '0') % 2 == 0 && (arr[j] - '0') % 2 == 0 && arr[j] - '0' > n - '0') {
                    arr[i] = arr[j];
                    arr[j] = n;
                    n = arr[i];
                }
            }
        }
        return Integer.parseInt(String.copyValueOf(arr));
    }
    public static int largestInteger2(int num){
        String s = String.valueOf(num);
        int n = s.length();
        Queue<Integer> even = new PriorityQueue<>((a, b) -> b - a);
        Queue<Integer> odd = new PriorityQueue<>((a, b) -> b - a);
        boolean[] isEven = new boolean[n];
        for (int i = 0; i < n; i++) {
            int k = s.charAt(i) - '0';
            if (k % 2 == 0) {
                isEven[i] = true;
                even.offer(k);
            } else {
                odd.offer(k);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            res.append(isEven[i] ? even.poll() : odd.poll());
        }

        return Integer.parseInt(res.toString());


    }
}
