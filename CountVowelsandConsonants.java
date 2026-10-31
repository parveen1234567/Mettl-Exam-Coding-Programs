package Metal;
class Vowel{
	public void Consonent(String s) {
		int count1 =0;
		int count2 = 0;
		String s1 = s.toLowerCase();
		for(int i =0;i<s1.length();i++) {
			if(s1.charAt(i) == 'a'||s1.charAt(i) == 'e'||s1.charAt(i) == 'i'||s1.charAt(i) == 'o'||s1.charAt(i) == 'u') {
				count1 ++;
			}
			else {
				count2 ++;
			}
		}
		System.out.println("Vowels:"+count1);
		System.out.println("Consonents:"+count2);
	}
}
public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vowel vo = new Vowel();
		vo.Consonent("Hello");

	}

}
