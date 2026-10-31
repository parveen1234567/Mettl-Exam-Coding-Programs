package Metal;
class Palin{
	public void Drome(int num) {
		int org = num;
		int rev =0;
		while(num >0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
			
		}
		if(rev == org) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palin pa = new Palin();
		pa.Drome(12522);

	}

}
