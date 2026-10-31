package Metal;
import java.util.*;
class Move{
	public void Zeros(int[] arr) {
		int[] arr1 = new int[arr.length];
		int j =0;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr1[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr1));
	}
}
public class MoveAllZerostoEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,3,0,5,0};
		Move mv = new Move();
		mv.Zeros(arr);
	}

}
