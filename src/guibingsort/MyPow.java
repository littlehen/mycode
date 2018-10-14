package guibingsort;

import org.junit.Test;

//递归的有趣应用
//求一个数的乘方
public class MyPow {
	public static int pow(int x,int y){
		if(x == 0 || x == 1)
			return x;
		if(y == 1)
			return x;
		else if(y > 1) {
			int a = x*x;
			int b = y/2;
			if(y % 2 == 1) { //奇数
				return pow(a,b)*x;
			}else
				return pow(a,b);
		}else
			return 1;
	}
	
	@Test
	public void testPow() {
		System.out.println(pow(2,7));
	}

}
