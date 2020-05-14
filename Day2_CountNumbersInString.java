package javaClass;

public class Day2_CountNumbersInString {

	public static void main(String[] args) {
		//Code to get the sum of digits from a given string
		//Approach1
		String str = "asdf1qwer9as8d7";
		String num = str.replaceAll("\\D", "");
		int number = Integer.parseInt(num);
		System.out.println("Filtered Number:" +number);
		int sum = 0;
		while (number != 0) {
			sum = sum+number%10;
			number = number/10;
		}
		System.out.println("Sum of digits:" +sum);
	}

}
