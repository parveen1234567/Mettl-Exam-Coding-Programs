package Metal;
class Longest{
	public void Word(String s) {
		String[] s1 = s.split(" ");
		int max = 0;
		String s2 = " ";
		for(int i =0;i<s1.length;i++) {
			if(s1[i].length()>max) {
				max = s1[i].length();
				s2 = s1[i];
			}
			
		}
		System.out.println(s2);
	}
}
public class LongestWordinaSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Longest lon = new Longest();
		lon.Word("Write a programmer");
	}

}
