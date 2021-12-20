package leetcode05;

public class Palindromic {

	public static void main(String[] args) {
		String s = "asdsasadasd";
		int max = 1;
		int start =0;
		for(int i=0;i<s.length()-1;i++) {
			int odd = isPalindromic(s,i,i);
			int even = isPalindromic(s, i, i+1);
			int maxlen = Math.max(odd, even);
			if(maxlen>max) {
				max = maxlen;
				start = i-(maxlen-1)/2;
			}

		}
		String res = s.substring(start,start+max);
		System.out.println(res);
	}
	
	public static int isPalindromic(String s,int l,int r) {

		while(l>=0 && r<s.length()) {
			if(s.charAt(l) == s.charAt(r)) {  //这样就可以不用写在for循环中
				l--;
				r++;
			}
			else {
				break;
			}
		}
		return r-l-1;
	}

}
