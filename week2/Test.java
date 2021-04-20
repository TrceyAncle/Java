package week2;

import java.util.ArrayList;

import javax.swing.event.InternalFrameListener;

public class Test {
	public	static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			intList.add(i);
		}
		for (Integer e : intList) {
			System.out.println(e);
		}
		for (int i = intList.size()-1; i >=0; i--) {
			System.out.println(intList.get(i));
		}
		System.out.println(intList.isEmpty());
		System.out.println(intList.contains(101));
	
	}
}
