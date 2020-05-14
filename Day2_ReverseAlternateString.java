package javaClass;

public class Day2_ReverseAlternateString {

	/*
	 * public static void main(String[] args) {
	 * 
	 * // Code to reverse the words in a sentence placed alternatively //Approach1
	 * String str =
	 * "When the world realise its own mistake, corona will dissolve automatically";
	 * 
	 * String[] split = str.split(" ");
	 * 
	 * for (int i = 0; i < split.length; i++) { 
	 * if (i%2 != 0) { 
	 * split[i] = new StringBuilder(split[i]).reverse().toString(); }
	 * }
	 * 
	 * StringBuilder revBuild = new StringBuilder();
	 * 
	 * for (String s : split) { revBuild.append(s + " "); }
	 * 
	 * System.out.println("Reversal: " + revBuild);
	 * 
	 * }
	 * 
	 * }
	 */

//Approach2
public static void main(String[] args) {
	// TODO Auto-generated method stub
	String str = "When the world realise its own mistake, corona will dissolve automatically";
	String[] split = str.split("\\s");
	StringBuffer strbuf = new StringBuffer();
	for (int i = 0; i < split.length; i++) {
		if (i % 2 != 0)
			strbuf.append(" ").append(new StringBuffer(split[i]).reverse());
		else
			strbuf.append(" ").append(new StringBuffer(split[i])).append(" ");
	}
	System.out.println(strbuf);

}

}