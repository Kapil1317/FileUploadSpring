package test;

public class NumberOfSequence {

	public static void main(String[] args) {

		int[] a = {1,2,3,5,6,7,8,9,16,17,18,20,21,24};
		int c = 0, r = 0, seqCnt = 0, totalSequences = 0;
		for(int i=0,j=1;j<a.length;i++,j++){
			c = a[j] - a[i];
			if(c != r){
				r = c;
				if(0 != seqCnt){
					totalSequences++;
					seqCnt=0;
				}
			}
			else{
				seqCnt++;
			}
		}
		System.out.println("total no of sequences: " + totalSequences);
		
	}

}
