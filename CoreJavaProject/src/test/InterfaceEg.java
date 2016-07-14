package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

interface a{
int i=10;}

interface b{
int i=5;}

public class InterfaceEg implements a,b{
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Map map = new TreeMap<Integer, Integer>();
		map.put(2, 14);
		map.put(2, 15);
		map.put(1, 15);
		map.put(9, 0);
		map.put(4, 1);
		System.out.println(map);
		
		Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		hashMap.put(5, 12);
		hashMap.put(6, 13);
		hashMap.put(8, 16);
		hashMap.put(2, 1);
		hashMap.put(7, 7);
		
		System.out.println("HashMap" + hashMap);
		
		Iterator itr = hashMap.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Integer, Integer> pair = (Entry<Integer, Integer>) itr.next();
			System.out.println(pair.getKey() +" || "+pair.getValue());
			
		}*/
		//hashMap.put(10, 7);
		
		/*for(Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println("key: " + key + "\n" + "Value: " + val);
		}*/
		
		 int i1 = 3;
		 String[] input2 = {"12#24#32","67#45#54","21#45#32"};
	        String[] output = new String[i1];
	        //int[] retfinal= new int[i1];
	        int[][] testArr = new int[i1][i1];
	        int minSetVal = 0;
	        String[] setSel = new String[5];
	        int setCounter = 0;
	        int k = 0,l = 0;
	        for (int i=0; i<i1; i++)
	        {
	            String str = input2[i];
	            String[] retval = str.split("#");
	            
	            for(int j=0;j<i1; j++ )
	            {
	            //retfinal[j] = Integer.parseInt(retval[j]);
	            testArr[i][j] = Integer.parseInt(retval[j]);
	            }
	            output = retval;
	        }
	        for(k = 0; k<2; k++)
	        for(l = 0; l<2; l++)
	        {
	            if(testArr[k][l]>minSetVal)
	            {
	                minSetVal = testArr[k][l];
	                
	                setSel[setCounter] = k+"#"+l;
	            }
	            else if(testArr[k][l]==minSetVal)
	            {
	                setCounter++;
	                setSel[setCounter] = k+"#"+l;
	            }
	        }
	        for(k = i1-1; k>i1-2; k--)
	        for(l = 0; l<2; l++)
	        {
	            if(testArr[k][l]>minSetVal)
	            {
	                minSetVal = testArr[k][l];
	                
	                setSel[setCounter] = k+"#"+l;
	            }
	            else if(testArr[k][l]==minSetVal)
	            {
	                setCounter++;
	                setSel[setCounter] = k+"#"+l;
	            }
	        }
	        
	        for(k = i1-1; k>i1-2; k--)
	        for(l = i1-1; l>i1-2; l--)
	        {
	            if(testArr[k][l]>minSetVal)
	            {
	                minSetVal = testArr[k][l];
	                
	                setSel[setCounter] = k+"#"+l;
	            }
	            else if(testArr[k][l]==minSetVal)
	            {
	                setCounter++;
	                setSel[setCounter] = k+"#"+l;
	            }
	        }
	        
	        for(k = 0; k<2; k++)
	        for(l = i1-1; l>i1-2; l--)
	        {
	            if(testArr[k][l]>minSetVal)
	            {
	                minSetVal = testArr[k][l];
	                
	                setSel[setCounter] = k+"#"+l;
	            }
	            else if(testArr[k][l]==minSetVal)
	            {
	                setCounter++;
	                setSel[setCounter] = k+"#"+l;
	            }
	        }
	        
	        //return setSel;
	        System.out.println("success");
	        
	    }
		
		
		
	}


