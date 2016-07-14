package test;

import java.util.StringTokenizer;

public class SplitVsTokenizer {

	public static void main(String[] args) {

		String str1 = "Welcome,split,Example,Java";
		String str2 = "Welcome,Tokenizer,Example,Java";
		
		String[] str3 = str1.split(",");
		// split gives output in singlke go as string type array and no need to create new objects
		for(int i=0; i<str3.length;i++)
			System.out.println(str3[i]);
		
		StringTokenizer st = new StringTokenizer(str2);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken(","));		
		//token can be changed anytiome within the program
		
	}

}
