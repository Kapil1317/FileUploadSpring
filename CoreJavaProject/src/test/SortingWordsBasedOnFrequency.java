package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class SortingWordsBasedOnFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Hi this is Java Program Java is an object Oriented language Java can run on any OS";
		
		StringTokenizer st = new StringTokenizer(str," ");
		String[] arr = new String[str.length()];
		int j=0;
		while(st.hasMoreTokens())
		{
			arr[j] = st.nextToken().trim();
			j++;
		}
		//Arrays.sort(arr);
		//String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i<j; i++){
			arr[i]=arr[i].trim();
			if(map.containsKey(arr[i])){
			map.put(arr[i].trim(), map.get(arr[i]) + 1);
			}
			else
				map.put(arr[i].trim(), 1);
		}
		ValueComparator comparator = new ValueComparator(map);
		
		
		//Map<String, Integer> sortedMap = new TreeMap<String, Integer>();
		List<String> sortedList = new ArrayList<String>();
		sortedList.addAll(map.keySet());
		Collections.sort(sortedList);
		System.out.println(sortedList);
		Collections.sort(sortedList, comparator.ValueCompare);
		/*sortedMap.putAll(map);
		System.out.println(sortedMap);*/
		System.out.println(sortedList);
		System.out.println(map);

	}
	
	

}

class ValueComparator implements Comparator<String>{
	 Map<String, Integer> base;
	ValueComparator(Map<String,Integer> map){
		this.base = map;
	}
	public  Comparator<String> ValueCompare = new Comparator<String>() {
	@Override
	public int compare(String o1, String o2) {

		return base.get(o1).compareTo(base.get(o2));
	}
	};
	
	public  Comparator<String> NameComparator = new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {

			return o1.compareTo(o2);
		}
	};
	@Override
	public int compare(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	}