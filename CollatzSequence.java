package Metal;
class Collatz {
	public void Seq(int num) {
		System.out.print(num + "->");
		while(num>1) {
			if(num %2 == 0) {
				num = num / 2;
			}
			else {
				num = num * 3 +1;
			}
			System.out.print(num +"->");
		}
		
	}
}
public class CollatzSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collatz co = new Collatz();
		co.Seq(6);

	}

}
