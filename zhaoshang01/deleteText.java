package zhaoshang01;

public class deleteText {
    public static void main(String[] args) {
        String article = "Singing dancing in the rain";
        int index = 10;
        String s = deleteText(article, index);
        System.out.println(s);
    }
    public static String deleteText(String article, int index) {
        char[] res = article.toCharArray();
        if(res[index]==' ')return article;

        String[] split = article.split(" ");
        StringBuilder sb = new StringBuilder(article);
        int i = 0;
        int sum = 0;
        while(index>split[i].length()){
            index -= split[i].length()+1;
            sum+=split[i].length()+1;
            i++;

        }
        sb.delete(sum-1,sum+split[i].length());
        //删除最后的空格
        String text = sb.toString();
        text = text.replaceAll("\\s+$", "");
        return sb.toString();
    }
}
