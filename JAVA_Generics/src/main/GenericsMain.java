package main;

public class GenericsMain {
	public static <T> void printArray(T arr[] ) {
		for(T element: arr) {
			System.out.println(element);
		}
	}
	public static void main(String a[]) {
		Integer intArr[]= {1,2,3};
		Double doubleArr[] = {2.1,4.1,2.11,5.0};
		Character charArr[] = {'c','a','v','g'};
		printArray(intArr);
		printArray(doubleArr);
		printArray(charArr);
	}
}
