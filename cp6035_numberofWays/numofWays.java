package cp6035_numberofWays;
//题目：在一个字符串中寻找010或者101的子序列有多少个。



public class numofWays {
    public static void main(String[] args) {
        String s = "001101";
        long i  = numberOfWays(s);
        System.out.println(i);

    }
    public static long numberOfWays(String s) {
        long ans=0, n0=0, n1=0, n10=0, n01=0;
        for(char c : s.toCharArray()) {
            if(c=='1'){
                n01 += n0;
                n1 ++;
                ans += n10;
            } else {
                n10 += n1;
                n0 ++;
                ans += n01;
            }
        }
        return ans;
    }

}
