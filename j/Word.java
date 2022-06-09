package j;

public class Word {
	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(i(1)));
		System.out.println(word.isConsonant(0));
		
	}
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	//i번째 글자가 모음인지 알려주는 메소드	//a,i,u,e,o
	public boolean isVowel(int i) {
		return letters.substring(i, i + 1).equals("a") 
				|| letters.substring(i, i + 1).equals("i")
				|| letters.substring(i, i + 1).equals("u")
				|| letters.substring(i, i + 1).equals("e")
				|| letters.substring(i, i + 1).equals("o");

		// return "aiueo".contains(letters.substring(i, i + 1));

	}

	//i번째 글자가 자음인지  //a,i,u,e,o 제외한 나머지
	public boolean isConsonant(int i) {
		return !"aiueo".contains(letters.substring(i, i + 1));
		
	}
	
}
