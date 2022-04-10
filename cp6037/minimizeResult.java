package cp6037;

public class minimizeResult {

    public static void main(String[] args) {
        int a = Integer.valueOf(0)+Integer.valueOf(5);
        String expression = "247+38";
        String s = minimizeResult(expression);
        System.out.println(s);
    }

    public static String minimizeResult(String expression) {
        String[] spilt = expression.split("\\+");
        String s1 = spilt[0],s2 = spilt[1];
        int len1 = s1.length(),len2 = s2.length();
        String res = "";
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<s1.length();i++){
            for(int j = s2.length();j>0;j--){
                String a = s1.substring(0,i);
                String b = s1.substring(i,len1);
                String c = s2.substring(0,j);
                String d = s2.substring(j,len2);
                int sum = Integer.parseInt(b)+Integer.parseInt(c);
                if(!"".equals(a)){
                    sum*= Integer.parseInt(a);
                }
                if(!"".equals(d)){
                    sum*= Integer.parseInt(d);
                }
                if(sum>0 && sum<min){
                    min = sum;
                    res = getString(a,b,c,d);
                }

            }
        }
        return res;
    }

    private static String getString(String a, String b, String c, String d) {
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("(").append(b).append("+").append(c).append(")").append(d);
        return sb.toString();

    }
}
