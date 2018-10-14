package digui;

import org.junit.Test;

//在二阶的情况下
//1.在ACB的顺序下执行了一阶
//2.从A->C移动了最大盘
//3.在BAC的顺序下执行了一阶
//在三阶和四阶及其他阶的情况下，都是一样的，将（n-1）看作是一个盘，n看作是一个(大)盘
public class Digui {
	public  void move(int dish,String from,String temp,String to){
	    if(dish == 1){
	        System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
	    }else{
	        move(dish-1,from,to,temp);//A为初始塔座，B为目标塔座，C为中介塔座
	        System.out.println("将盘子"+dish+"从塔座"+from+"移动到目标塔座"+to);
	        move(dish-1,temp,from,to);//B为初始塔座，C为目标塔座，A为中介塔座
	    }
	}
	
	@Test
	public void testdigui() {
		move(4,"A","B","C");
	}


}
