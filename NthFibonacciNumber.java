package Metal;
class Nth{
	public void fab(int num) {
		int count = 1;
		int a =0;
		int b = 1;
		if(num ==1) {
			System.out.println(a+" ");
			return;
		}
		for(int i = 1;i<=num;i++) {
			int c = a+b;
			count++;
			a=b;
			b = c;
			if(count == num) {
				System.out.println(a);
				break;
			}
		}
	}
}
public class NthFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nth nt = new Nth();
		nt.fab(5);

	}

}
