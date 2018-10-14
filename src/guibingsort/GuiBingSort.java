package guibingsort;

import java.util.Arrays;

import org.junit.Test;

//�鲢�㷨�������ǹ鲢�����Ѿ���������顣�鲢������������A��B���������˵�������������C������C��������A��B�����������
//�÷���������whileѭ������һ��while�Ƚ�����a������b��Ԫ�أ�������С�ĸ�ֵ������c��
//�ڶ���whileѭ����a��������Ԫ�ض��Ѿ���ֵ��c����֮�󣬶�b���黹��Ԫ�أ�
//��ôֱ�Ӱ�b����ʣ���Ԫ�ظ�ֵ��c���飻������whileѭ������b��������Ԫ�ض��Ѿ���ֵ��c�����ˣ�
//��a���黹��ʣ��Ԫ�أ���ôֱ�Ӱ�a����ʣ���Ԫ��ȫ����ֵ��c���顣

//�ǵݹ��㷨Ϊ��
public class GuiBingSort {
	public static int[] mysort(int[] a,int[] b) {
		int[] c = new int[a.length+b.length];
		int anum = 0;
		int bnum = 0;
		int cnum = 0;
		while(anum < a.length && bnum < b.length) {
			if(a[anum] >= b[bnum]) {
				c[cnum++] = b[bnum++];
			}else {
				c[cnum++] = a[anum++];
			}
		}
		while(anum == a.length && bnum < b.length) {
			c[cnum++] = b[bnum++];
		}
		while(bnum == b.length && anum < a.length) {
			c[cnum++] = a[anum++];
		}
		return c;
	}
	
	@Test
	public void testGuiBingSort() {
		int[] a = new int[]{1,3,5,7,9};
		int[] b = new int[]{2,4,6,8};
		int[] c = mysort(a,b);
		System.out.println(Arrays.toString(c));
	}

}
