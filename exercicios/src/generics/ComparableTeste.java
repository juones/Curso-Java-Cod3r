package generics;

import java.util.TreeSet;

public class ComparableTeste {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		nums.add(10);
		nums.add(1);
		nums.add(3);
		nums.add(6);
		nums.add(8);
		nums.add(9);
		nums.add(123);
		nums.add(-13);
		
		//como o Integer é uma classe que implementa comparable
		// os valores são ordenados de forma crescente e não em ordem de inclusão
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}
