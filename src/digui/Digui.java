package digui;

import org.junit.Test;

//�ڶ��׵������
//1.��ACB��˳����ִ����һ��
//2.��A->C�ƶ��������
//3.��BAC��˳����ִ����һ��
//�����׺��Ľ׼������׵�����£�����һ���ģ�����n-1��������һ���̣�n������һ��(��)��
public class Digui {
	public  void move(int dish,String from,String temp,String to){
	    if(dish == 1){
	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
	    }else{
	        move(dish-1,from,to,temp);//AΪ��ʼ������BΪĿ��������CΪ�н�����
	        System.out.println("������"+dish+"������"+from+"�ƶ���Ŀ������"+to);
	        move(dish-1,temp,from,to);//BΪ��ʼ������CΪĿ��������AΪ�н�����
	    }
	}
	
	@Test
	public void testdigui() {
		move(4,"A","B","C");
	}


}
