package Metal;
class Miss{
	public void Number(int[] arr) {
		for(int i =0;i<arr.length-1;i++) {
			if(arr[i+1]!=arr[i]+1) {
				System.out.print(arr[i]+1+" ");
			}
		}
	}
}
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {1,2,4,6};
		Miss mi = new Miss();
		mi.Number(arr);
	}

}
