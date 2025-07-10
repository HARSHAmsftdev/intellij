package demo;

public class numberOfVowels {
	public static void main(String[] args) {
		String str = "i am harsha";
		String[] vowels = {"a","e","i","o","u","A","E","I","O","U"};
		int count = 0;
		char[] ch = str.toCharArray();
		System.out.println(ch);
	
		for(int i=0;i<ch.length;i++) {
			for(String vowel:vowels) {
				if(ch[i] == vowel.charAt(0)) {
					count = count + 1;
				}
			}
		}
		System.out.println(count);
	}

}
