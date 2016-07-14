package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a Number : ");
		Scanner in = new Scanner(System.in);
		in.useDelimiter(" ");
		String s = in.nextLine();
		String[] s1 = s.split(" ");
		
		List<Integer> A = new ArrayList<Integer>();
		for(int i = 0; i<s1.length; i++)
		{
			int k = Integer.parseInt(s1[i]);
			A.add(k);
			
		}
		System.out.println("delimited array " + A);
		
		//int[] A = {-2,1,-3,4,-5,2,1,-5,4,6,9};
		/*while(in.hasNext())
		{
			A.add(in.nextInt());
			System.out.println("list "+A);
		}*/
		//int[] A = {-2,1,-3,4,-5,2,1,-5,4,6,9};
		/*int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
		System.out.println(max);*/
		System.out.println("outside loop");
		int max = A.get(0);
		int[] sum = new int[A.size()];
		sum[0] = A.get(0);
 
		for (int i = 1; i < A.size(); i++) {
			sum[i] = Math.max(A.get(i), sum[i - 1] + A.get(i));
			max = Math.max(max, sum[i]);
		}
		System.out.println(max);
	}

}
