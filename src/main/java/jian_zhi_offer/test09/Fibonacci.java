package jian_zhi_offer.test09;

/**
 * @author wangzhenya
 * 大家都知道斐波那契数列， 现在要求输入一个整数n， 请你输出斐波那契数列的第n项。
 */
public class Fibonacci {

	public static void main(String[] args) {

//		System.out.println(getFibonacci(3));
		
		System.out.println(getRecursionFibonacci(5));

	}
	
	public static long getRecursionFibonacci(int num) {
		
		if(num == 0) {
			return 0;
		}
		if(num == 1) {
			return 1;
		}
		
		return getRecursionFibonacci (num-1) + getRecursionFibonacci (num-2);
		
	}
	public static long getFibonacci(int n) {
		long result[] = {0, 1};
		
		if(n < 2) {
			return result[n];
		}
		
		long fibonacciOne = 1;
		long fibonacciTwo = 0;
		long fibonacciN = 0;
		
		for(int i =2; i<=n; i++) {
			fibonacciN = fibonacciOne + fibonacciTwo;
			fibonacciOne = fibonacciN;
			fibonacciTwo = fibonacciOne;
		}
		
	
		return fibonacciN;
	}

}
