package javaCS212assembly;

public class test {
	
	public static void main(String args[]){
		int[] bString;
		CS212_01 test = new CS212_01();

		bString = test.convertInt(100);
		display(bString);
		bString = test.convertInt(-100);
		display(bString);
		bString = test.convertInt(0);
		display(bString);
		bString = test.convertInt(1);
		display(bString);
		bString = test.convertInt(-1);
		display(bString);

	}
	
	public static void display(int[] display){
		for (int i = 0; i< 32; i++){
			if (i % 4 == 0){
				System.out.print(" ");
			}
			System.out.print(display[i]);
		}
		System.out.println("");
	}
	
}
