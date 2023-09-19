
class Sorter {
	void selectionSorter(int[] arr) {
		for (int i=0;i<arr.length-1;i++) {
				int min = arr[i];
				int pos = i;
			for (int j=i+1;j<arr.length;j++) {
				if (min>arr[j]) {
					min = arr[j];
					pos = j;
				}
			}
			arr[pos] = arr[i];
			arr[i] = min;
		}
	}
}
