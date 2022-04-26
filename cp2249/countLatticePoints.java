package cp2249;

public class countLatticePoints {

    //这题很不错，考验代码能力，难点在于如何避免重复计算。  boolean数组初始化时默认为false。
    public static void main(String[] args) {
        boolean [][] booleans = new boolean[500][500];
        System.out.println(booleans[0][0]);
    }

    public static int countLatticePoints(int[][] circles) {
        boolean [][] booleans = new boolean[500][500];
        int sum = 0;
        for(int[] circle:circles){
            int x = circle[0], y= circle[1], r = circle[2];
            for(int i = x-r;i<=x+r;i++){
                for (int j = y-r;j<=y+r;j++){
                    if(!booleans[i][j]){
                        booleans[i][j]= isinCircle(i,j,x,y,r);
                    }
                }
            }
        }

        for(boolean[] b:booleans){
            for(boolean c:b){
                if(c)sum++;
            }
        }
        return sum;
    }

    public static boolean isinCircle(int a,int b,int x,int y,int r){
        double dir = Math.sqrt((a-x)*(a-x)+(b-y)*(b-y));
        if(dir<=(double) r) return true;
        return false;
    }
}
