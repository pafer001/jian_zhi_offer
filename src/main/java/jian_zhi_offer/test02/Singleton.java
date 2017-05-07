package jian_zhi_offer.test02;

public class Singleton {

	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	public static Singleton getIntance() {
		return SingletonHolder.INSTANCE;
	}

}
