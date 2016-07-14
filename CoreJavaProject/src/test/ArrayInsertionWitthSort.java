package test;

public class ArrayInsertionWitthSort {

	public static void main(String[] args) {

		/*int[] arr1 = {1,2,5,9,12};
		int[] arr2 = {3,7,8};
		int[] arr3 = new int[arr1.length + arr2.length];
		int[] arr3 = new int[100];
		int k=0;
		int length = arr2.length;
		int length1 = arr1.length;
		int max = 0, count = 0;*/
		/*for(int i = 0; i<length; i++){
			count = 0;
			for(int j=0; j<length1;j++)
			{	
				if(arr1[j] < arr2[i])
				{
					if(max < arr1[j]){
					arr3[k] = arr1[j];
					k++;
					//max = arr1[j];
					count++;
					}
				}
				else
				{
					arr3[k] = arr2[i];
					k++;
					//max = arr2[i];
					count++;
					break;
					
				}
			}
			if(count!=0)
			{
				max = arr2[i];
			}
		}
		
		for (int i = length;i<length1; i++)
		{
			arr3[k] = max;
			k++;
		}*/
		
		/*for(int i = 0; i<length; i++){
			count = 0;
			for(int j=0; j<length1;j++)
			{	
				if(arr1[j] < arr2[i])
				{
					if(max < arr1[j]){
					arr3[k] = arr1[j];
					k++;
					//max = arr1[j];
					//count++;
					}
				}
				else
				{
					arr3[k] = arr2[i];
					k++;
					max = arr2[i];
					count++;
					break;
					
				}
			}
			
		}
		
		for (int i = length;i<length1; i++)
		{
			
			arr3[k] = arr1[i];
			k++;
			
		}*/
		
		int[] a = {1,2,5,9,12};
		int[] b = {3,7,13};
		int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k1 = 0;
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])
	        {
	            answer[k1] = a[i];
	            i++;
	        }
	        else
	        {
	            answer[k1] = b[j];
	            j++;
	        }
	        k1++;
	    }

	    while (i < a.length)
	    {
	        answer[k1] = a[i];
	        i++;
	        k1++;
	    }

	    while (j < b.length)
	    {
	        answer[k1] = b[j];
	        j++;
	        k1++;
	    }

	    
	    for(int i1 = 0; i1<k1; i1++)
		{
			System.out.println(answer[i1]);
		}
	    
		/*for(int i = 0; i<k; i++)
		{
			System.out.println(arr3[i]);
		}*/

	}

}
