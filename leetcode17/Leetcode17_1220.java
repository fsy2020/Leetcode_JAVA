package leetcode17;

import java.awt.List;
import java.util.ArrayList;

public class Leetcode17_1220 {

	public static void main(String[] args) {
		ArrayList<String> res= letterCombinations("2332");
		for(String s:res) {
			System.out.println(s);
		}
		
	}

    public static ArrayList<String> letterCombinations(String digits) {
    	
        String digitletter[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> result = new ArrayList<String>();

        if (digits.length()==0) return result;
        
        result.add("");
        for (char c:digits.toCharArray()) 
            result = combine(result,digitletter[c-'0']);
        return result;
    }
    
	public static ArrayList<String> combine(ArrayList<String> res,String digit){
		ArrayList<String> list = new ArrayList<>();
		for(String s:res) {
			for(char c:digit.toCharArray()) {
					list.add(s + c +"");
				}
		}
		return list;
	}
}
