package test;

import java.io.IOException;
import java.util.Scanner;

public class PrimeFactorsProgram {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//int n;
		System.out.print("Enter a Number : ");
		//n=Integer.parseInt(br.readLine());
		int n;
		Scanner in = new Scanner(System.in);
		n=in.nextInt();
		System.out.print("The Prime Factors of "+n+" are : ");
		 
		int i=2;
		while(n>1)
		  {
		   if(n%i == 0)
		    {
		     System.out.print(i+" ");
		     
		     n=n/i;
		    }
		   else
		    i++;
		  }

	}

}
