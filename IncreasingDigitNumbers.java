package Metal;

import java.util.Arrays;

class Inc{
	public void Digit(int[] num) {
		int j =0;
		int[] arr = new int[num.length];
		for(int i =0;i<num.length;i++) {
			int org = num[i];
			int place = 1;
			int min = 10;
			int sum = 0;
			while(num[i]>0) {
				int rem = num[i] % 10;
				if(rem <min) {
					sum = sum+place*rem;
					place = place * 10;
					min = rem;
				}
				else {
	                break;
	            }
				num[i] /= 10;
			}
			if(sum == org) {
				arr[j++] = org;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, j)));
	}
}
public class IncreasingDigitNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inc in = new Inc();
		int[] arr = {123,234,543,345};
		in.Digit(arr);

	}

}
