class ShellSort {

	public static void sort(Comparable[] arr){
		int h = 1;
		int n = arr.length;
		while (h < n/3)
			h = h*3 + 1;
		while ( h >= 1) { 
			for (int i = h; i < n; i++) { 
				for (int j = i; j >= h; j = j - h) {
					if (arr[j].compareTo(arr[j - h]) < 0) {
						exch(arr, j, j - h);
					}
				}
			}
			h = h/3;
		}
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	

}