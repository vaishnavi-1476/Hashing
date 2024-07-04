package summer_8;
import java.util.*;
public class Haashing {

	public static void main(String[] args) {
		HashSet<Integer> map=new HashSet<>();
		int count=0;
		int[] arr1= {7,3,9};
		int[] arr2= {6,3,9,2,9,4};
		for(int i=0;i<arr1.length;i++) {
			map.add(arr1[i]);
		}
			for(int j=0;j<arr2.length;j++) {
				if(map.contains(arr2[j])) {
				
				//match
				count++;
				map.remove(arr2[j]);
				}
			
			}
System.out.println(count);
System.out.println(map);
	}

}
