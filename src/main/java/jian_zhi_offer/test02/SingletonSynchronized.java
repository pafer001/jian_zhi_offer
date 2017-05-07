package jian_zhi_offer.test02;

public class SingletonSynchronized {
	
	private static SingletonSynchronized instance;
	
	public static synchronized SingletonSynchronized getSingletonSynchronized() {
		
		if(null == instance) {
			instance = new SingletonSynchronized();
		}
		
		return instance;
	}
	
}
