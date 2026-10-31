package Metal;
class Second{
	public void Largest(int[] arr) {
		int max = 0;
		int second =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
			second = max;
			max = arr[i];
			}
		}
		System.out.println(second);
		
	}
}
public class SecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {22,21,4,3,5,32,32};
		Second sc = new Second();
		sc.Largest(ar);

	}

}
