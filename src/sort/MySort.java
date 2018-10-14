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
	
    //ð������ 
	//8, 89, 5, 84, 3, 45, 12, 33, 77, 98, 456, 878, 654, 213, 897
	//ÿһ�ֶ��Ǵӿ�ͷ��ʼÿ���������Ƚϣ���������С��������棬������С���ǴӴ�С�����Ǵ�С����������if(in[j] >(<) in[j+1])�����>��<����
	//in .length - 1-i��-1 ����Ϊin[j] > in[j+1]
	//in .length - 1-i ������Ѿ�ȷ�������Բ����ٴαȽ��ˣ��� -i
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
    
    //ѡ������
    public void selectSort(int[] in) {
    	for(int i = 0 ;i < in.length-1;i++) {
    		int k = i;
    		for(int j = i;j < in.length;j++) {
    			if(in[j] < in[k]) { //����һ����in[k],����int[i]����Ϊin[i]�����ѭ�����ǲ����.��in[k]�ǿ��ܻ�䣬��Ϊ�������ѭ������Сֵ��
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
    
    //��������
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
    	t = in[low];//��׼λ
    	
    	while(i < j){ //�������whileѭ��֮��i��jһ������ȵġ�������ֳ��������֣���߲��ֱȻ�׼λ���ұ߲��ֱȻ�׼λС������Ļ�׼λѡ��������ĵ�һλ
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
