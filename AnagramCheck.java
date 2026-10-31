package Metal;
class Anargam{
	public void Check(String s1,String s2) {
		for(int i =0;i<s1.length();i++) {
			for(int j =0;j<s2.length();j++){
				 if(s2.contains(s1.charAt(i) + "")) {
			            s2 = s2.replaceFirst(s1.charAt(i) + "", "");
			        }
			}
		}
		if(s2.length() == 0) {
			System.out.println("Anargam");
		}
		else {
			System.out.println("Not Anargam");
		}
		
	}
	
}
public class AnagramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anargam an = new Anargam();
		an.Check("anagram", "nagairam");

	}

}
