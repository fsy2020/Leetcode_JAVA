package leetcode733;

import java.util.Arrays;
import java.util.List;

public class floodFill {

    public static void main(String[] args) {
        int[][]image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1, sc = 1, newColor = 2;
        int[][] ints = floodFill(image, sr, sc, newColor);
        for(int i =0;i<3;i++){
            for (int j = 0;j<3;j++){
                System.out.println(ints[i][j]);
            }
        }
        System.out.println(ints);
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }

    public static void dfs(int[][] image,int sr,int sc,int newColor,int oldColor){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=oldColor||image[sr][sc]==newColor)return;
        image[sr][sc] = newColor;

        dfs( image, sr-1, sc,newColor, oldColor);
        dfs( image, sr, sc+1,newColor, oldColor);
        dfs( image, sr+1, sc,newColor, oldColor);
        dfs( image, sr, sc-1,newColor, oldColor);
    }
}
