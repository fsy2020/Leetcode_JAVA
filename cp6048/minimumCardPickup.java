package cp6048;
/*
    想法不对，扫描过一遍就是暴力解法。放在while循环里并没有优化。

 */
public class minimumCardPickup {
    public static void main(String[] args) {
        int[] cards = new int[]{95,11,8,65,5,86,30,27,30};

        int i = minimumCardPickup(cards);
        System.out.println(i);
    }
    public static int minimumCardPickup(int[] cards) {
        int left = 0;

        int min = Integer.MAX_VALUE;
        for(int i = left+1;i<cards.length;i++){
            while(cards[i] != cards[left] && i == cards.length-1){
                left++;
            }
            if(cards[i] == cards[left]){
                min = Math.min(i-left+1,min);
            }
        }
        return min == Integer.MAX_VALUE ? -1: min;
    }
}
