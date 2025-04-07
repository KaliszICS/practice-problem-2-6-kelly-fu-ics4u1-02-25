public class PracticeProblem {

	//1
	//bubbleSort(double[] nums)
	public static int[] bubbleSort(double[] nums){
		int[] a = {0,0};
		int swaps = 0;
		int count = 0;
		int n = nums.length;
		boolean swapped = true;
		for (int i = 0; i < n - 1; i++){
			swapped = false;
			for (int j = 0; j < n - 1 - i; j++){
				count++;
				if (nums[j]>nums[j+1]){
					double tempNum = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = tempNum;
					swapped = true;
					swaps += 3;
				}
			}
			if (!swapped){
				i = n+1;
			}
		}
		a[0] = swaps;
		a[1] = count;
		return a;
	}

	//selectionSort(double[] nums)
	public static int[] selectionSort(double[] nums){
		int[] b = {0,0};
		int swaps = 0;
		int count = 0;
		int n = nums.length;
		for (int i = 0; i < n; i++){
			int indexOfMin = i;
			swaps++;
			for (int j = i + 1; j < n; j++){
				count++;
				if (nums[j]<nums[indexOfMin]){
					indexOfMin = j;
				}
			}
				double temp = nums[i];
				nums[i]=nums[indexOfMin];
				nums[indexOfMin]= temp;
				swaps +=3;
		}
		b[0] = swaps;
		b[1] = count;
		return b;
	}

	//insertionSort(double[] nums)
	public static int[] insertionSort(double[] nums){
		int[] c ={0,0};
		int swaps = 0;
		int count = 0;
		int n = nums.length;
		for (int i = 1; i < n; i++){
			double currentNums = nums[i];
			swaps++;
			int j = i - 1;
			while (j >= 0 && currentNums < nums[j]){
				nums[j+1] = nums[j];
				j--;
				swaps++;
				count++;
			}
			
			nums[j+1]=currentNums;
			swaps++;
			
		}
		c[0] = swaps;
		c[1] = count;
		return c;
	}

	//2 Create a method called leastSwaps(double[] nums)
	public static String leastSwaps(double[] nums){
		int n = nums.length;
		double[] bubble = new double[n];
		double[] selection = new double[n];
		double[] insert = new double [n];
		for (int i = 0; i < n; i++){
			bubble[i] = nums[i];
			selection[i]=nums[i];
			insert[i]=nums[i];
		}
		int countbubble = bubbleSort(bubble)[0];
        int countselection = selectionSort(selection)[0];
        int countinsert= insertionSort(insert)[0];
		int min = Math.min(countbubble, Math.min(countselection, countinsert));

		if (min == countbubble && min == countinsert && min == countselection) return "Bubble";
        if (min == countbubble && min == countinsert) return "Bubble";
        if (min == countbubble && min == countselection) return "Bubble";
        if (min == countinsert && min == countselection) return "Insertion";
        

        if (min == countbubble) return "Bubble";
        if (min == countinsert) return "Insertion";
        return "Selection";

	}

	//3 Create a method called leastIterations(double[] nums)
	public static String leastIterations(double[] nums){
		int n = nums.length;
		double[] bubble = new double[n];
		double[] selection = new double[n];
		double[] insert = new double [n];
		for (int i = 0; i < n; i++){
			bubble[i] = nums[i];
			selection[i]=nums[i];
			insert[i]=nums[i];
		}
		int countbubble = bubbleSort(bubble)[1];
        int countselection = selectionSort(selection)[1];
        int countinsert= insertionSort(insert)[1];
		int min = Math.min(countbubble, Math.min(countselection, countinsert));

		if (min == countbubble && min == countinsert && min == countselection) return "Bubble";
        if (min == countbubble && min == countinsert) return "Bubble";
        if (min == countbubble && min == countselection) return "Bubble";
        if (min == countinsert && min == countselection) return "Insertion";
        

        if (min == countbubble) return "Bubble";
        if (min == countinsert) return "Insertion";
        return "Selection";

	}

	}

	
	

