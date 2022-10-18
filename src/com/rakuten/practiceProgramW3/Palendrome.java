package com.rakuten.practiceProgramW3;

public class Palendrome {
public static void main(String[] args) {
	
	String s = "nitin";  // n i t i n
	                     // 0 1 2 3 4
	String reverse = "";
	
	for(int i= s.length()-1;  i>=0; i--){
	
		reverse = reverse+s.charAt(i);

		
	}
	System.out.println(reverse);

}

}
