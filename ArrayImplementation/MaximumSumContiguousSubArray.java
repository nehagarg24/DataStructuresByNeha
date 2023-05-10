package ArrayImplementation;
import java.lang.*;
public class MaximumSumContiguousSubArray {
	public static void main(String [] args){
		int arr [] = {4,-3,-2 ,2, 3,1,-2, -3,4, 2, -6, -3, -1, 3, 1, 2};
		//int arr [] = {-1, 2, 3, 4, -10};
		int maxx = 0;
		int totalSumm = Integer.MIN_VALUE;
		int end=0, temp=0;

		for (int i=0; i<arr.length; i++) {

			maxx = Math.max(0, maxx);
			temp=maxx;
			maxx = maxx + arr[i];

			if(totalSumm < maxx) {
				end = i; // 4, 5, 9,
			}

			totalSumm = Math.max(totalSumm, maxx);
		}
		System.out.println(totalSumm);
		System.out.println("end index: " + end);
	}
}
