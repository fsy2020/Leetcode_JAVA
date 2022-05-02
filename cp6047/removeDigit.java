package cp6047;

public class removeDigit {
    public static void main(String[] args) {
        String s = removeDigit("1231", '1');
        System.out.println(s);

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
}

