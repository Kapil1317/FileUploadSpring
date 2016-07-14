package test;

public class NewTechTest {
	
	public static void main(String[] args) {
		
		long y = 81;
		long x = 3;
		if (x <= 1)
			System.out.println("x<=1");
		while (y>1) {
		    // Find maximum x^(2^n) <= y
		    long xp = x;   // x to some maximum power
		    long xp2;      // experimental value of xp
		    while ((xp2 = xp*xp) <= y)
		      xp = xp2;
		    if (y%xp != 0) 
		    	System.out.println("reject");// reject
		    y /= xp;
		}
		System.out.println("y==1");
	
	}

}
