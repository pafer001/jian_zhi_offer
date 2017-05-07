package jian_zhi_offer.test02;

import java.util.HashMap;
import java.util.Map;

public enum SingletonEnum {
	
	test1(1, "test1"),
	test2(2, "test2");
	
	private static Map<Integer, SingletonEnum> map = new HashMap<Integer, SingletonEnum>();
	
	static {
		map.put(SingletonEnum.test1.id, SingletonEnum.test1);
		map.put(SingletonEnum.test2.id, SingletonEnum.test2);
	}
	
	private int id ;
	private String name;
	
	private SingletonEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
