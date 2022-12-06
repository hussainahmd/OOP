import java.util.ArrayList;
import java.util.Arrays;
public class SortingExm{
	
	public static void main(String[] args) {
		
		//String[] nums = new String[] { "20", "9", "10", "3", "7", "12"};
		String[] nums = new String[] { "1","2","3","Hop","A","4","ASD","Black","5","6","7","8","9","10","1522","11","12","13","14","15","16","17","HelpMe"};
		System.out.println(Arrays.toString(nums));
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		//System.out.println(nums);
		
		/*int[] array = {435, 9865, 463, 754, 34, 45, 54, 754, 234, 4325, 0, 453, 54, 9, 2131, 643, 123};

		int[] arr = {9, 2, 5, 7, 1, 8, 3, 2, 7, 4, 3, 0, 5, 0, 3, 6, 1, 2, 4, 1, 7, 8, 9, 5, 7, 5};

		int[] arr2 = {9, 2, 5, 7, 1, 8, 3, 2, 7, 4, 3, 0, 5, 0, 3, 6, 1, 2, 4, 1, 7, 8, 9, 5, 7, 5};

		int[] arr3 = new int[arr.length];
		arr3 = arr;

		ArrayList<String> items = new ArrayList<>();
		//ArrayList<String>items2 = {"My", "name", "is"};
		items.add("Hussain");
		items.add(0, "Ahmad");

		for(String x : items){
			System.out.printf("%s%n", x);
		}
		System.out.println();
		System.out.println(items.size());
		System.out.println(items.get(1));
		//items.remove(0);
		System.out.println(items.add("Helppp"));
		System.out.println(items.remove(0));
		System.out.println(items.size());
		System.out.println(items.contains("Hussain"));

		for(String x : items){
			System.out.printf("%s%n", x);
		}
		/*Arrays.sort(arr3);
		Arrays.sort(array);

		//System.arraycopy(arr, 4, arr3, 2, 6);
		for(int i : array){
			System.out.printf("%d  ", i);
		}

		System.out.println();
		System.out.println(Arrays.binarySearch(array, 1000));
		System.out.println(Arrays.equals(arr2, arr3));

		System.out.println(arr.length);
		System.out.println(array.length);*/
	}
	
}