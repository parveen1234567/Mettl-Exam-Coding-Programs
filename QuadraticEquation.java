package Metal;
class Quadratic{
	public void Eq(int a,int b,int c) {
		double Discri = Math.sqrt((b * b) - (4 * a * c));
		int r1 = ((-b) + (int)Discri)/(2*a);
		int r2 = ((-b) - (int)Discri)/(2*a);
		System.out.println(r1 +","+r2);
		
		
	}
}
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadratic  qr = new Quadratic();
		qr.Eq(1, -5, 6);

	}

}
