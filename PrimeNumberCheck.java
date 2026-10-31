package Metal;
class Prime{
	public void Check(int num) {
		int count = 0;
		for(int i =1;i<=num;i++) {
			if(num % i == 0) {
				count ++;
				
			}
		}
		if(count == 2) {
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not Prime Number");
		}
	}
}
public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prime pr = new Prime();
		pr.Check(4);

	}

}
