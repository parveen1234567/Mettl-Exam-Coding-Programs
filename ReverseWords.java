package Metal;
class Reverse{
	public void Word(String s) {
		String[] arr = s.split(" ");
		for(int i =arr.length-1;i>=00;i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "technical assessment session";
		Reverse re = new Reverse();
		re.Word(s);
				

	}

}
