package guibingsort;

import java.util.Arrays;

import org.junit.Test;

public class MyGuiBingSort {
	
	public static int[] mergeSort(int[] c,int start,int last){
	   if(last > start) {
		   //也可以是(start+last)/2，这样写是为了防止数组长度很大造成两者相加超过int范围，导致溢出
		   int mid = start + (last - start)/2;
		   mergeSort(c,start,mid);//左数组分组
		   mergeSort(c,mid+1,last);//右数组分组 
		   merge(c,start,mid,last);//左右数组合并
	   }
	   return c;
	}
	 
	public static void merge(int[] c,int start,int mid,int last){
	   int temp[] = new int[last - start + 1];
	   int i = start;
	   int j = mid +1;
	   int k = 0;
	   while(i <= mid && j <= last) {
		   if(c[i] < c[j])
			   temp[k++] = c[i++];
		   else {
			   temp[k++] = c[j++];
		   }
	   }
	   while(i <= mid) {
		   temp[k++] = c[i++];
	   }
	   while(j <= last) {
		   temp[k++] = c[j++];
	   }
	   for(int h = 0; h < temp.length; h++) {
		   c[start+h] = temp[h];
	   }
	}
	
	@Test
	public void test() {

		int[] c = {2,7,8,3,1,6,9,0,5,4};
		c = mergeSort(c,0,c.length-1);
		System.out.println(Arrays.toString(c));
	}

}
