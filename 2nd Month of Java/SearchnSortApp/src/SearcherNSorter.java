
public class SearcherNSorter {
	static void linearSearch(int arr[],int key) {
		for (int x: arr) {
			if (key == x) {
				System.out.println("Key found by linear search");
				return;
			}
		}
		System.out.println("Key not found by linear search");
	}
	static void binarySearch(int arr[], int key) {
		int low = 0;
		int high = arr.length-1;
		while (low<=high) {
			int mid = (low+high)/2;
			if (arr[mid] == key) {
				System.out.println("Key found by binary search");
				return;
			}
			else if (key>mid) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		System.out.println("key not found by binary search");
	}
	static void bubbleSort(int arr2[]) {
		for (int i=0;i<arr2.length-1;i++) {
			for (int j=0;j<arr2.length-i-1;j++) {
				if (arr2[j]>arr2[j+1]) {
					int help = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = help;
				}
			}
		}
		System.out.print("Array after bubble sorting: ");
		for (int x : arr2) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	static void selectionSort(int arr3[]) {
		for (int i=0; i<arr3.length;i++) {
			int min = arr3[i];
			int pos = i;
			for (int j=i+1;j<arr3.length-1;j++) {
				if (arr3[j]<min) {
					min = arr3[j];
					pos = j;
				}
			}
			arr3[pos] = arr3[i];
			arr3[i] = min;
		}
		System.out.print("Array after selection sorting: ");
		for (int x : arr3) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
	static void insertionSort(int arr4[]) {
		for (int i=1; i<arr4.length;i++) {
			int item = arr4[i];
			int j = i-1;
			while (j>=0 && arr4[j]>item) {
				arr4[j+1] = arr4[j];
				j--;
			}
			arr4[j+1] = item;
		}
		System.out.print("Array after insertion sorting: ");
		for (int x: arr4) {
			System.out.print(x+" ");
		}
		System.out.println();
	}
}
