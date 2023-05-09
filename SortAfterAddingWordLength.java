import java.util.Arrays;
import java.util.Comparator;

public class SortAfterAddingWordLength {

	public static void main(String [] args) {
		String randomWords [] = {"bbbbb", "ccc", "ddddddddd", "aaa"};

		Arrays.sort(randomWords, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		System.out.println(Arrays.toString(randomWords));

	}
}