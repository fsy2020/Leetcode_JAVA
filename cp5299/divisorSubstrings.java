package cp5299;

public class divisorSubstrings {
    public static void main(String[] args) {

        int num =  430043,k=2;
        int i = divisorSubstrings(num, k);
        System.out.println(i);
    }

    public static int divisorSubstrings(int num, int k) {
        int sum = 0;
        String s = String.valueOf(num);
        for(int i = 0;i<=s.length()-k;i++){
            int sub = Integer.parseInt(s.substring(i, i + k));
            if(sub==0)continue;
            if(num%sub==0)sum++;
        }
        return sum;

    }
}
