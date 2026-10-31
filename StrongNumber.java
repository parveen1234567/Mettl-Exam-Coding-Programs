package Metal;
class Strong{
	public void Number(int num) {
		int sum =0;
		int org = num;
		while(num>0) {
			int add = 1;
			int rem = num % 10;
			for(int i =1;i<=rem;i++) {
				add = add * i;
				
			}
			sum = sum + add;
			num = num / 10;
		}
		if(sum == org) {
			System.out.println("Strong number");
		}
		else {
			System.out.println("Not Strong number");
		}
	}
}
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strong st = new Strong();
		st.Number(123);

	}

}
