package Metal;
class Majority{
	public void Ele(int[] arr) {
		int max = 0;
		int ele = 0;
		for(int i = 0;i<arr.length;i++) {
			int count =0;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count ++;
				}
			}
			if(count >max) {
				max = count;
				ele = arr[i];
			}
		}
		System.out.println(ele);
		
	}
}
public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,12,2,2,2,2,6,5,5,4};
		Majority mj = new Majority();
		mj.Ele(arr);

	}

}
