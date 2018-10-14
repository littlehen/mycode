package sort;

public class MySort {
	
	public void printMulti() {
		for(int i = 1; i < 10; i++) {
			for(int j = 1; j <= i;j++) {
				System.out.println(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("\t\n");
		}
		System.out.println("\n\n\n");
	}
	
    //冒泡排序 
	//8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897
	//每一轮都是从开头开始每相邻两个比较，最大或者最小放在最后面，最大或最小即是从大到小排序还是从小到大排序：由if(in[j] >(<) in[j+1])里面的>或<决定
	//in .length - 1-i，-1 是因为in[j] > in[j+1]
	//in .length - 1-i 后面的已经确定，所以不用再次比较了，则 -i
    public void efferArray(int[] in ) {  
    	int temp = 0;
        for (int i = 0; i < in.length; i++) {  
            for (int j = 0; j < in.length - 1-i; j++) {  
               if(in[j] > in[j+1]) {
            	   temp = in[j];
            	   in[j] = in[j+1];
            	   in[j+1] = temp;
               }
            }  
        }  
        for (int i = 0; i < in .length; i++) {  
            System.out.print( in [i]);  
            if (i < in .length - 1) {  
                System.out.print(",");  
            }  
        }  
    }
    
    //选择排序
    public void selectSort(int[] in) {
    	for(int i = 0 ;i < in.length-1;i++) {
    		int k = i;
    		for(int j = i;j < in.length;j++) {
    			if(in[j] < in[k]) { //这里一定是in[k],不是int[i]，因为in[i]在这层循环中是不变的.而in[k]是可能会变，因为他是这层循环的最小值。
    				k = j;
    			}
    		}
    		if(i != k) {
    			int temp;
    			temp = in[i];
    			in[i] = in[k];
    			in[k] = temp;
    		}
    	}
        for (int i = 0; i < in .length; i++) {  
            System.out.print( in [i]);  
            if (i < in .length - 1) {  
                System.out.print(",");  
            }  
        }
    }
    
    //插入排序
    public void insertSort(int[] in) {
    	for(int i = 1;i < in.length; i++) {
    		for(int j = i; j > 0;j--) {
    			if(in[j] < in[j-1]) {
    				int temp;
    				temp = in[j];
    				in[j] = in[j-1];
    				in[j-1] = temp;
    			}
    		}
    	}
    	  for (int i = 0; i < in .length; i++) {  
              System.out.print( in [i]);  
              if (i < in .length - 1) {  
                  System.out.print(",");  
              }  
          }
    }
    
    public void quickSort(int[] in,int low,int hight) {
    	int i,j,temp,t;
    	if(low > hight)
    		return;
    	i = low;
    	j = hight;
    	t = in[low];//基准位
    	
    	while(i < j){ //这里进行while循环之后，i和j一定是相等的。将数组分成两个部分，左边部分比基准位大，右边部分比基准位小。这里的基准位选的是数组的第一位
    		while(t <= in[j]&&i < j)
    			j--;
    		while(t >= in[i]&&i < j)
    			i++;
    		if(i<j) {
    			temp = in[j];
    			in[j] = in[i];
    			in[i] = temp;
       		}
    	}
    	
    	in[low] = in[i];
    	in[i] = t;
    	
    	quickSort(in, low, j-1);
    	quickSort(in, j+1, hight);
    	
    	
    }
	
	public static void main(String[] args) {
		MySort mysort = new MySort();
		
//		mysort.printMulti();
		
		int [] in = new int[] {
			8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897
		};
		
		mysort.efferArray(in);
		
//		mysort.quickSort(in,0,in.length-1);
//		 for (int k = 0; k < in .length; k++) {  
//	         System.out.print( in [k]);  
//	         if (k < in .length - 1) {  
//	             System.out.print(",");  
//	         }  
//	     } 
		 
		 //mysort.selectSort(in);
//		mysort.insertSort(in);
	}

}
