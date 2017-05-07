package jian_zhi_offer.test33;

public class SubString implements Comparable<SubString>{

	private String s;
	
	public SubString(String s) {
		super();
		this.s = s;
	}
	@Override
	public int compareTo(SubString o) {
		
		String s2 = o.s + this.s ;
		String s1 = this.s + o.s;
		return s1.compareTo(s2);
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

}
