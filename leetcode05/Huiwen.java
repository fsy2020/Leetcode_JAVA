//±©Á¦½â·¨
package leetcode05;

public class Huiwen {

	public static void main(String[] args) {
		String s= "avsvsasfdfs";		

		int max = 0;
		int len = s.length();
		int start = 0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(isSubPalindrome(s,i,j) && j-i+1>max ) {
					max =j-i+1;
					start = i;					
				}				
			}			
		}
		System.out.println(s.substring(start,start+max));
		
		
	}
	
	
	public static void longestPalindrome(String s) {
		int len = s.length();
		String sub = "";
		for(int i=0;i<len;i++) {
			for(int j=i;j<len;j++) {
				sub = s.substring(i,j);
				System.out.println(sub);
			}
		}
	}
	
	
	public static boolean isPalindrome(String s) {
		int len = s.length();
		int n = len/2+1;
		for (int i=0;i<n;i++) {
			if(s.charAt(i)!= s.charAt(len-i-1))return false;
		}
		return true;
	}

	public static boolean isSubPalindrome(String s,int l,int r) {
		while(l<r) {
			if(s.charAt(l)!=s.charAt(r)) {
				return false;
			}
			l++;
			r--;
		}
		return true;
	}
}
