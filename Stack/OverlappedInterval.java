package Stack;

import java.util.Arrays;

class OverlappedInterval
{
	public static int[][] overlappedInterval(int[][] interval)
	{
		if(interval == null || interval.length == 0) return interval;

		Arrays.sort(interval, (a,b) -> a[0]-b[0]);

		int size = interval.length;
		int [][] result = new int[size][2];

		int start = interval[0][0];
		int end = interval[0][1];
		int count=0;


		for(int i=0; i<size; i++) {

			if ((interval[i][0] <= end)) {
				start = Math.min(interval[i][0], start);
				end = Math.max(interval[i][1], end);
			} else {
				result[count][0] = start;
				result[count][1] = end;
				start = interval[i][0];
				end = interval[i][1];
				count = count + 1;
			}
		}
		result[count][0] = start;
		result[count][1] = end;
		count = count + 1;

		return Arrays.copyOf(result, count);

	}
	public static void main(String [] args) {
		int [][] interval = {{1,3},{2,4},{6,8},{9,10}};
		int [][] result = overlappedInterval(interval);
		for(int i=0; i<result.length; i++) {
			for(int j=0; j< result[i].length; j++) {
				System.out.println(result[i][j]);
			}
		}
	}
}