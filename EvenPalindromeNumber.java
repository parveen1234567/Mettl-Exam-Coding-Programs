package Metal;
class Even{
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
		if(rev == org  && count % 2 == 0) {
			System.out.println("Even Palindrome");
		}
		else {
			System.out.println("not Even Palindrome");
		}
	}
}
public class EvenPalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Even ev = new Even();
		ev.Palin(121);

	}

}
