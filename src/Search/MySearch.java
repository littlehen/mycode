package Search;

import sort.MySort; 

public class MySearch {
	//二分查找  一定要是有序数组
	public static int BinarySearch(int[] in,int des) {
		int low = 0;
		int upper = in.length-1;
		while(low <= upper) {
			int mid = (low+upper)/2;
			if(in[mid] < des)
				low = mid + 1;
			else if(in[mid] > des) 
				upper = mid - 1;
			else
				return mid;
		}
		return -1;
	}
	public static void main(String[] args) {
		int [] in = new int[] {
				3,5,8,12,33,45,77,84,89,98,213,456,654,878,897
			};
		MySort mySort = new MySort();
		mySort.quickSort(in, 0, in.length-1); 
		int find = BinarySearch(in,897);
		if(find != -1)
			System.out.println("找到数值于索引" + find);
		else
			System.out.println("找不到数值"); 
	}

}
