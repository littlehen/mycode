package guibingsort;

import java.util.Arrays;

import org.junit.Test;

//归并算法的中心是归并两个已经有序的数组。归并两个有序数组A和B，就生成了第三个有序数组C。数组C包含数组A和B的所有数据项。
//该方法有三个while循环，第一个while比较数组a和数组b的元素，并将较小的赋值到数组c；
//第二个while循环当a数组所有元素都已经赋值到c数组之后，而b数组还有元素，
//那么直接把b数组剩余的元素赋值到c数组；第三个while循环则是b数组所有元素都已经赋值到c数组了，
//而a数组还有剩余元素，那么直接把a数组剩余的元素全部赋值到c数组。

//非递归算法为：
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
