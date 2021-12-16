package leetcode13;

public class Leetcode13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] strs = new String [] {"reflower","flow","flight"};
		
		String res = strs[0];
		for(int i=0;i<strs.length-1;i++) {

			String s = compare(res,strs[i+1]);
			res = s;
			
		}
		
//		String s = compare(strs[0],strs[1]);
		System.out.println(res);
		
	}
	
	public static String compare(String s1, String s2) {
		int len = Math.min(s1.length(), s2.length());
		for (int i=0;i<len;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.substring(0,i);
			}
		}
		return s1.substring(0,len);
	}

}
