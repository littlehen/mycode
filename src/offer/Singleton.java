package offer;

//某个类只有一个实例，而且自行实例化并向整个程序提供这个实例

public class Singleton {
	private static volatile Singleton singleton;
	
	private Singleton() {}
	
	public synchronized static Singleton getInstance() {
		if(singleton == null) {					//防止一直加锁浪费资源
			synchronized(Singleton.class) { 
				if(singleton == null) {			//防止多线程下创建两次实例
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

}
