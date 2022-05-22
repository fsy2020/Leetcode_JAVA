package cp6074;

public class percentageLetter {
    public static void main(String[] args) {
        String s = "fooler";
        char letter = 'o';
        int i = percentageLetter(s, letter);
        System.out.println(i);

    }

    public static int percentageLetter(String s, char letter) {
        double sum = 0;
        int len = s.length();
        for(int i = 0;i<len;i++){
            if(letter == s.charAt(i))sum++;
        }
        double res = Math.floor((sum/len)*100);
        return (int)res;

    }
}
