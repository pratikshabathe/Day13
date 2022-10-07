package bl.com.day13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FindMaximum<E extends Comparable> {
	private E p, q, r;
	public FindMaximum(E p, E q, E r) {
		this.p =p;
		this.q = q;
		this.r = r;
	}
	public E testMaximum(String option) {
		E max = FindMaximum.testMaximum(p, q, r, option);
		return max;
	}

	public static void main (String[] args) {
		//maximum int at 1st position
		FindMaximum<Integer> intIns = new FindMaximum<>(10, 2, 3);
		intIns.testMaximum("desc");
	
	//maximum float number at 2nd position
	FindMaximum<Float> floatIns = new FindMaximum(10f, 20f, 3f);
	floatIns.testMaximum("asc");
	
	//max string at 3rd position
	FindMaximum<String> stringIns = new FindMaximum<>("patric", "Chase", "Ryan");
	stringIns.testMaximum("desc");
}
	@SuppressWarnings({"unchecked", "rawtypes"})
	public static <E extends Comparable> E testMaximum(E p, E q, E r, String option) {
		E max;
		
		ArrayList<E> aList = new ArrayList<>();
		aList.add(p);
		aList.add(q);
		aList.add(r);
		
		if(p.compareTo(q) > 0) {
			if(p.compareTo(r) > 0) max = p;
			else max = r;
		} else if(q.compareTo(r) > 0) max = q;
		else max = r;
		
		switch (option) {
		case "asc" :
			System.out.println("before soting:" +aList);
			Collections.sort(aList);
			System.out.println("after sorting (asc):" +aList);
			break;
			
		case"desc":
			System.out.println("before sorting:" +aList);
			Collections.sort(aList, Collections.reverseOrder());
			System.out.println("after sorting (desc):" +aList);
			break;
			
			default:
				System.out.println("that option does not exist");
		}
		printMax(aList, max);
		return max;
	}
	public static <E> void printMax(ArrayList<E> list, E max) {
		System.out.println("the max among ");
		for (E I  : list) System.out.println(I + " ");
		System.out.println("is:" + max );
		
	}
}
