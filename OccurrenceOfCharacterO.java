package javaClassDay1;

import org.apache.commons.collections4.map.HashedMap;

public class OccurrenceOfCharacterO {

	//Approach1
/*	public static void main(String[] args) {
			String sentance = "You have no choice other than following me!";
			HashedMap<Character, Integer> map = new HashedMap<Character, Integer>();
			char[] array = sentance.toCharArray();
			for (char occurance : array) {
				if(map.containsKey(occurance)) {
				map.put(occurance, map.get(occurance)+1);
				}
				else
				{
					map.put(occurance, 1);
				}
			
			}
			System.out.println("Occurance of O:" +map.get('o'));
		}

	}*/

	//Approach2

/*	public static void main(String[] args) {
		String sentance = "You have no choice other than following me!";
		int count = 0;
		char[] array = sentance.toCharArray();
		for (int i = 0; i < array.length; i++) {
			if(array[i] == 'o') {
				count=count+1;
				
			}
			System.out.println("Occurance of O:"+count);
			}
			}
}*/

	//Approach3
/*	public static void main(String[] args) {
	String sen = "You have no choice other than following me!";
	int count = 0;
	char[] array = sen.toCharArray();
	for (int i = 0; i < array.length; i++) {
	if(sen.charAt(i) == 'o') {
			count++;
		}
		System.out.println("Occurance of O:"+count);
		}
		}
}
*/
	//Approach4
	public static void main(String[] args) {
		String sen = "You have no choice other than following me!";
		String replacedsen = sen.replaceAll("[^o]", "");
		System.out.println("Occurance of O:"+replacedsen.length());
			}
			}
