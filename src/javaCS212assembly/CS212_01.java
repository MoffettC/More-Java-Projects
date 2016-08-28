package javaCS212assembly;

/**
 * @author Christopher Moffett
 * CSCI 212
 * 8/28/16
 */
public class CS212_01 {
	
	private boolean isNeg;
	private int[] bString;
	private int remainder;
	
	public int[] convertInt(int num){
		 bString = new int[32];
		isNeg = false;
		
		if (num < 0){
			isNeg = true;
			num = num * -1; //convert to positive
		}
		
		for(int i = 31; i >= 0; i--){			
			remainder = num % 2;
			if (!isNeg){	//if its positive
				if (remainder == 0){
					bString[i] = 0;
				} else {
					bString[i] = 1;			
				}
			} else {		//if negative flip bits
				if (remainder == 0){
					bString[i] = 1;
				} else {
					bString[i] = 0;
				}
			}
			num = num / 2;
		}
		
		int carry = 1;
		int sum;
		if (isNeg){	//if neg, add 1 to flip to get twos complement 
			for (int j = 31; j >=0; j--){
				sum = bString[j] + carry;
				if (sum == 2){	//if 1 + 1 then 0 and carry 1
					bString[j] = 0;
					carry = 1;
				} else {
					bString[j] = sum;
					carry = 0;
				}
			}
		}
		return bString;
	}
}
