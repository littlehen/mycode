package guibingsort;

import java.util.Arrays;

import org.junit.Test;

public class MyGuiBingSort {
	
	public static int[] mergeSort(int[] c,int start,int last){
	   if(last > start) {
		   //Ҳ������(start+last)/2������д��Ϊ�˷�ֹ���鳤�Ⱥܴ����������ӳ���int��Χ���������
		   int mid = start + (last - start)/2;
		   mergeSort(c,start,mid);//���������
		   mergeSort(c,mid+1,last);//��������� 
		   merge(c,start,mid,last);//��������ϲ�
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
