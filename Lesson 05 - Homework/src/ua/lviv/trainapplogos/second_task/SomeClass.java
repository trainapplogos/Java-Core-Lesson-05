package ua.lviv.trainapplogos.second_task;

public class SomeClass {
	private int x;
	private int y;
	
	SomeClass(int x) {
		this.x = x;
	}
	
	SomeClass(int x, int y) {
		this(x);
		this.y = y;
	}
	
}
