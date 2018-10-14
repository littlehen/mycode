package offer;

//ĳ����ֻ��һ��ʵ������������ʵ�����������������ṩ���ʵ��

public class Singleton {
	private static volatile Singleton singleton;
	
	private Singleton() {}
	
	public synchronized static Singleton getInstance() {
		if(singleton == null) {					//��ֹһֱ�����˷���Դ
			synchronized(Singleton.class) { 
				if(singleton == null) {			//��ֹ���߳��´�������ʵ��
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
