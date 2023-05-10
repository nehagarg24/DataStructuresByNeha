package ArrayImplementation;

public class Merge2SortedArraysIntoThirdSortedArray {
	public static void main(String [] args) {
		int [] arr1 = {1,3,5,7,9,12,14};
		int [] arr2 = {0,2,4,6,8,10,11};
		int res [] = new int[arr1.length+arr2.length];

		int i = 0;
		int j = 0;
		int temp = 0;

		while (i<arr1.length && j<arr2.length) {

			if(arr1[i] > arr2[j]) {
				res[temp] = arr2[j];
				j++; temp++;
			} else {
				res[temp] = arr1[i];
				i++; temp++;
			}
		}

		while( i < arr1.length) {
			res[temp++] = arr1[i++];
			//i++; temp++;
		}

		while ( j < arr2.length) {
			res[temp++] = arr2[j++];
			//j++; temp++;
		}
		for(int result : res) {
			System.out.print(result + " ");
		}
	}


}
