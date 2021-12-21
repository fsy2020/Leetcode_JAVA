package leetcode53;

public class Violent_solution {

	public static void main(String[] args) {
		int [] a = {-2,1,2,3,4,-1};
		int listmax = listmax(a);
		System.out.println(listmax);

	}
	public static int listmax(int [] list) {
		int max = 0;
		for(int i=0;i<list.length;i++) {
			int sum = 0;
			for(int j =i;j<list.length;j++) {
				sum +=list[j];
				max = Math.max(max, sum);
			}
		}
		return max;
	}
}
