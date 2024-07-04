package summer_8;
import java.util.*;
public class Hashing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			HashSet<Integer> map=new	HashSet<>();
		//union is a having only single no. with not reapeat
		int[] ar= {1,2,3,4,5,8};
		int arr[]=new int[7];
		System.out.println("add the number in array");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int j=0;j<ar.length;j++) {
			map.add(ar[j]);
			for(int k=0;k<arr.length;k++) {
				map.add(arr[k]);
			}
		}
		System.out.println("our union array is "+map);
//		
//		
		System.out.println(map.size());
		
	}

}
