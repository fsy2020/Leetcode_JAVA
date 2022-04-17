package cp6071;

import java.util.HashMap;

//十五分钟搞定，java中取上限是用Math.ceil(),取下限是用Math.floor()
public class minimumRounds {
    public static void main(String[] args) {
        int[] tasks = {2,3,3,3,2,4,4,4,4,4};
        int i = minimumRounds(tasks);
        System.out.println(i);
    }

    public static int minimumRounds(int[] tasks) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        for(int task:tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return -1;
            }else if(map.get(key)==2 ||map.get(key)==3 ){
                sum+=1;
            }else{
                sum+=Math.ceil(map.get(key)/3.0);
            }
        }
        return sum;
    }
}
