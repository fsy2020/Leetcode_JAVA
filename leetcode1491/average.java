package leetcode1491;

public class average {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        double average = average(salary);
        System.out.println(average);
    }

    public static double average(int[] salary) {
        int max = 0;
        int min = salary[0];
        for(int num:salary){
            if(max < num) max = num;
            if(min > num) min = num;
        }
        double sum = 0.0;
        for(int i = 0;i<salary.length;i++){
            if(salary[i] == min || salary[i] == max)continue;
            sum+=salary[i];
        }
        return (sum/(salary.length-2));
    }
}
