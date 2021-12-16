package leetcode17;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Leetcode17 {
	//错误想法，把数字转化成字符串再进行处理。事实上是不用放在哈希表里。直接用数组下标就能表示。
	public static void main(String[] args) {
		String digits = "asasc";
		ArrayList<String> l = new ArrayList<String>();
		ArrayList<String> combine = combine(digits, l);
		
		ArrayList<String> letterCombinations = letterCombinations(digits);
		
		for(int i =0;i<combine.size();i++) {
			System.out.println(combine.get(i));
		}
	}
	
	 public static ArrayList<String> letterCombinations(String digits) {
	        Map<String,String> map = new HashMap<>();
	        map.put("2","abc");
	        map.put("3","def");
	        map.put("4","ghi");
	        map.put("5","jkl");
	        map.put("6","mno");
	        map.put("7","pqrs");
	        map.put("8","tuv");
	        map.put("9","wxyz");
	        
	        int len = digits.length();
	        ArrayList<String> arraylist = new ArrayList<>();
	 
	        for(int i=0;i<len;i++){
	            String s = map.get(digits.substring(i,i+1));
	            arraylist.add(s);
	           
	        }
	        
	        return arraylist;
	    }
	 
	 	public static ArrayList<String> combinations(ArrayList<String> array) {
	 		String s = array.get(0);
	 		
	 		for(int i=0;i<array.size();i++) {
	 			for(int j=0;j<s.length();j++) {
	 				array.get(i);
	 			}
	 		}
	 		
	 		return null;
	 	}
	 	
	 	 public static  ArrayList<String> combine(String digit,  ArrayList<String> l) {
	 		 ArrayList<String> result = new ArrayList<String>();
	            
	            for (int i=0; i<digit.length(); i++) 
	                for (String x : l) 
	                    result.add(x+digit.charAt(i));
	    
	            return result;
	        }
	 

}
