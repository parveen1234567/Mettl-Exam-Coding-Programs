package Metal;
class Arm{
	public void Number(int num) {
		int sum =0;
		int org = num;
		while(num>0) {
			int rem = num % 10;
			sum = sum +(rem * rem * rem);
			num /= 10;
		}
		if(sum == org) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}
	}
}
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arm ar = new Arm();
		ar.Number(153);

	}

}
