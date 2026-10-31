package Metal;
class Odd{
	public void Palin(int num) {
		int org = num;
		int count = 0;
		int rev =0;
		while(num >0) {
			int rem = num % 10;
			count ++;
			rev = rev * 10 + rem;
			num /=10;
	
		}
		if(rev == org  && count % 2 != 0) {
			System.out.println("Odd Palindrome");
		}
		else {
			System.out.println("not odd Palindrome");
		}
	}
}
public class OddPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
		Odd od = new Odd();
		od.Palin(1211);

	}

}
