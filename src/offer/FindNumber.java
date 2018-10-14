package offer;

//��λ�����еĲ���
public class FindNumber {
	public static boolean find(int[][] arg , int target) {
		
		if(arg == null)          //��̺�ϰ�ߣ�null����Ҫ�ж�һ�µ�
			return false;
		
		int row = 0;
		int col = arg[0].length - 1;
		
		while(row < arg.length && col >= 0) {
			 if(arg[row][col] == target) {
				 return true;
			 }else if(arg[row][col] > target) {
				 col--;
			 }else
				 row++;
		}
		return false;
	}
	
	  //����find����
	    public static void main(String[] args) {
	         /*
	34          * 1  2  8  9
	35          * 2  4  9  12
	36          * 4  7  10 13
	37          * 6  8  11 15
	38          */
	         int array[][]=new int[4][4];
	         array[0][0]=1;
	         array[0][1]=2;
        	 array[0][2]=8;
	         array[0][3]=9;
	         array[1][0]=2;
	         array[1][1]=4;
	         array[1][2]=9;
	         array[1][3]=12;
	         array[2][0]=4;
	         array[2][1]=7;
	         array[2][2]=10;
	         array[2][3]=13;
	         array[3][0]=6;
	         array[3][1]=8;
	         array[3][2]=11;
	         array[3][3]=15;
	         System.out.println(find(array, 7));
	         System.out.println(find(array, 5));
	     }
}
