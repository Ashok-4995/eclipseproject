package collection;

import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList<Integer>nums=new ArrayList<>();
		nums.add(1998);
		nums.add(1999);
		nums.add(1997);
		nums.add(1996);
		nums.add(1995);
		nums.add(1998);
		nums.set(1,19999);
		nums.remove(3);
		System.out.println(nums);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
		for(Integer x:nums) {
			System.out.println(x);
		}
		nums.forEach(a->System.out.println(a));
		nums.forEach(a->{if(a%2==0) {System.out.println(a);}});
	}

}
