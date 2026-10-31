package Metal;
class Adam{
	public void number(int num) {
		int sum = 0;
		int square = num * num;
		int sum1 = 0;
		while(num>0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}
		int sq2 = sum * sum;
		while(sq2>0) {
			int rem = sq2 % 10;
			sum1 = sum1* 10 + rem;
			sq2= sq2 / 10;
		}
		
	if(sum1 == square) {
		System.out.println("Adam Number");
	}
	else {
		System.out.println("not Adam Number");
	}
}
}

public class AdamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		Adam ad = new Adam();
		ad.number(num);

	}

}
