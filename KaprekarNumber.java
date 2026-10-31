package Metal;
class Kapr{
	public void Number(int num) {
		int org = num;
		int count = 0;
		while(num>0) {
			int rem = num % 10;
			count ++;
			num /= 10;
		}
		int sum = 0;
		int sq = org * org;
		int div = 1;
		int temp = count;

		while(temp > 0) {
		    div *= 10;
		    temp--;
		}

		int right = sq % div;
		int left = sq / div;

		sum = left + right;
		if(sum == org) {
			System.out.println("Kaprekar number");
		}
		else {
			System.out.println("not Kaprekar number");
		}
	}
}
public class KaprekarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kapr ka = new Kapr();
		ka.Number(45);

	}

}
