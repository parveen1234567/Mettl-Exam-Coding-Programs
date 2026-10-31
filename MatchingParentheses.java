package Metal;
class Paran{
	public void match(String s) {
		while(s.contains("()")||
				s.contains("[]")||
				s.contains("{}")) {
			s = s.replace("()", "");
			s = s.replace("{}", "");
			s = s.replace("[]", "");
			
		}
		if(s.length() == 0) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
	}
}
public class MatchingParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paran pa = new Paran();
		pa.match("{[(])}");
	}

}
