package com.careerit.cj.day28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.careerit.cj.day25.Player;

class Sample<T extends Number> {

	private List<T> list = new ArrayList<>();

	public void add(T t) {
		list.add(t);
	}

	public void show() {
		for (T t : list) {
			System.out.println(t);
		}
	}

}

public class GenericsExample {

	public static void main(String[] args) {

		Sample<Float> obj = new Sample<>();
		obj.add(1001.89f);
		obj.add(1002.90f);
		obj.show();

		List<Integer> list1 = new ArrayList<>();
		list1.add(1002);
		list1.add(1005);

		List<Float> list2 = new ArrayList<>();
		list2.add(1002.0f);
		list2.add(1005.5f);

	}

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
	    for (T o : a) {
	        c.add(o); // Correct
	    }
	}

	private static void showElements(List<? extends Player> list) {

	}
}
