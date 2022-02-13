package testingproject;

public interface Intr1 {
	
	void get();
	void alpha();
	static void WDH() {
		System.out.println("static method");
		
	}
	default void fun() {
		System.out.println("default method");
	}



}
