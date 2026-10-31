package Metal;

import java.util.Arrays;

class Remove{
	public void Dupli(int[] arr) {
		int[] a= new int[arr.length];
		int j =0;
		for(int i =0;i<arr.length;i++) {
			for(int z = i+1;z<arr.length;z++) {
				if(arr[i] == arr[z]) {
					arr[z]=0;
				}
			}
		}
		for(int k =0;k<arr.length;k++) {
			if(arr[k] != 0) {
				a[j++] = arr[k];
			}
			
		}
		System.out.println(Arrays.toString(Arrays.copyOf(a, j)));

	}
}
public class RemoveDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,3,2,4,5};
		Remove re = new Remove();
		re.Dupli(arr);
	}

}
