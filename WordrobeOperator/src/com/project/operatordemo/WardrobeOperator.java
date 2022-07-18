package com.project.operatordemo;

import java.util.Arrays;

//CRUD Operations
public class WardrobeOperator {
	String[] store = new String[6];
	int count = 0;

	@Override
	public String toString() {
		return "WardrobeOperator [store=" + Arrays.toString(store) + ", count=" + count + "]";
	}

	public boolean add(String thing) {
		if (thing != null && this.count < this.store.length) {
			System.out.println("invoked add".concat(thing));
			this.store[count] = thing;
			count++;
			return true;
		} else {
			System.err.println("thing is not added, count is empty");
		}
		return false;
	}

	public boolean update(int index, String newThing) {
		System.out.println("invoked update");
		if (newThing != null && index < this.store.length) {
			System.out.println(" Updated wardrobe");
			this.store[index] = newThing;
			String whichDress = store[index];
			System.out.println(whichDress);
			return true;
		} else {
			System.err.println("thing is not updated");
		}
		return false;
	}

	public boolean match(String thing) {
		System.out.println("invoked match");
		for (int dress = 0; dress < this.store.length; dress++) {
			String tempThing = this.store[dress];
			if (tempThing != null) {
				if (tempThing.equals(thing)) {
					System.out.println("thing is matched ".concat(thing));
					return true;
				}

			}

		}

		return false;
	}

	public boolean delete(int index) {
		if (index < this.store.length) {
			this.store[index] = null;
			return true;
		} else {
			System.err.println("Thing is not pointing to null");
		}
		return false;

	}
}
