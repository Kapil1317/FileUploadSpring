package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayAsFrequency {
	public static void main(String[] args) {
	int[] arr = {2,1,2,1,2,1,2,1,1,2,1,2,5,1,1};
	int[] cnt = new int[12];
	int index=0;
	int count=0;
	int len=arr.length;
	int maxOccurrence = 0;
	List<Integer> arrRaw = new ArrayList<Integer>();
	Map<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
	for (int i=0;i< len ; i++)
	{
		for(int j=i+1; j<len; j++){
		if(arr[i]==arr[j])
		{
			count++;
			for(int k = j;k<len-1;k++)
			arr[k]= arr[k+1];
			len = len - 1;
			j--;
		}
		}
		count++;
		arrRaw.add(arr[i]);
		arrRaw.add(count);
		System.out.println(count);
		
		
		count = 0;
	}
	for(int i=0; i<arrRaw.size(); i++)
		arrRaw.get(i);
	for(int i=0;i<len;i++)
		System.out.print(arr[i]);
	}
	
}
