package Metal;
class  Sum{
	public void Digit(int num) {
		int sum =0;
		while(num>0) {
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;
			
		}
		if(sum >0 && sum <=9) {
			System.out.println(sum);
		}
		else {
			num = sum;
			Digit(num);
		}
	}
}
public class SumofDigitsUntilSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum su = new Sum();
		su.Digit(9875);
		

	}

}
