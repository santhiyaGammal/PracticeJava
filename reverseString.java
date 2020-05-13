package javaClassDay1;

public class reverseString {

	//Approach1
	/*
	 * public static void main(String[] args) { String str = "malayalam"; String rev
	 * = ""; for (int i = str.length()-1; i >= 0; i--) { rev+= str.charAt(i); }
	 * System.out.println(str.equals(rev)? "Yes, Palindrome":
	 * "No, Not a Palindrome"); } }
	 */

	//Approach2
	public static void main(String[] args) {
	String str = "malayalam";
	StringBuffer stb = new StringBuffer(str);
	String rev = stb.reverse().toString();
	if (rev.equals(str)) {
		System.out.println("Yes, Palindrome");
	}
	else {
		System.out.println("No, Not a Palindrome");
	}
	}
}