/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package icons;

/**
 *
 * @author AD0KW3
 */
public class ModidfiedBubbleSort {
	
	
	private static int[] a;
	static int cpr=0;
	static long f=0;
	static int pss;
	static long s;
	static int swp=0;
	static int gg=0;
	static int g=0;
	
public static void bb(int []arr){
	
	int n=arr.length;
	a=arr;
	int x=n/2;
	int v= x-1;
	int i=0;
	int j=n-1;
// modified bubble sort
s= System.nanoTime();
	while(i<j){
		cpr++;
		if(a[i]>a[j]){
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp; 
			swp++;
		}
		i++;
		j--;
		pss=1;
	}
//System.out.println("after bubble sort");	
	//pArray(a);
	merge(a);
}
public static void merge(int[]a){
	int n=a.length;
	int x=n/2;
	int v= x-1;
	int i=0;
	int j=n-1;
	
	// modified bubble sort on the first half
	while(i<v){
		cpr++;
		if(a[i]>a[v]){
		int tmp = a[i];
		a[i] = a[v];
		a[v] = tmp; 
			swp++;
		}
		i++;
		v--;
	}
// modified bubble sort on the second half
	while(x<j){
		cpr++;
		if(a[x]>a[j]){
		int tmp = a[x];
		a[x] = a[j];
		a[j] = tmp; 
			swp++;
		}
		x++;
		j--;
	} pss++;
	
	//System.out.println("after modified merge sort");
	//pArray(a);
	//System.out.println();
	bidirection(a);
}
public static void bidirection(int array[]){
  int n=array.length;
	int j;
  
	 boolean isSorted = false; // Initially array is unsorted 
  
  while (!isSorted) { 
        isSorted = true; 
  for (j = 0; j < n-1; j++) {
	 cpr++;
  if (array[j] > array[j + 1]) {
  int T = array[j];
  array[j] = array[j + 1];
  array[j + 1] = T;
  swp++;
  isSorted = false;
  }
  }
 
  if(!isSorted){
	  for (j =  n-2; j>=0; j--) {
	  cpr++;
  if (array[j] > array[j + 1]) {
  int T = array[j];
  array[j] = array[j + 1];
  array[j + 1] = T;
  swp++;
  isSorted = false;
  }
  }
	  
  }
  pss++;
  }
  f=System.nanoTime()-s;
  System.out.println("nmbs");
  pArray(array);
 
  }
public static void pArray(int[] ar){
	int i=0;
	while(i<ar.length){
		System.out.print(ar[i]+" ");
		if ((i+1) % 20 == 0)
			System.out.println();
		
		i++;
	}
	System.out.println();
	System.out.println("swp= "+swp);
	System.out.println("cpr= "+cpr);
	System.out.println("pss= "+pss);
	System.out.println("Time Taken= "+f);
	System.out.println();
	
}

public static void main(String [] args){
	int LEN = 100;
	int[] unsorted = new int[LEN];
	for (int i = 0; i<LEN; i++)
		unsorted[i] = (int)(Math.random() * LEN) + 1;
	System.out.println("Unsorted array:");
	
	while(g<LEN){
		System.out.print(unsorted[g]+" ");
		if ((g+1) % 20 == 0)
			System.out.println();
		
		g++;
	}
	System.out.println();

	int []ar={12, 60, 95, 3, 95, 86, 62, 64, 31, 26, 48, 93, 80, 7, 100, 24, 78, 3, 91, 27, 
			99, 22, 63, 99, 35, 68, 33, 1, 44, 32, 56, 11, 63, 47, 2, 47, 63, 92, 45, 92, 
			59, 38, 78, 71, 56, 42, 56, 55, 27, 55, 30, 45, 2, 19, 15, 100, 36, 68, 16, 53, 
			64, 82, 84, 76, 9, 9, 32, 57, 73, 78, 96, 59, 79, 93, 6, 38, 66, 60, 87, 30, 
			81, 31, 67, 9, 65, 17, 92, 59, 88, 77, 45, 23, 1, 73, 46, 18, 9, 12, 76, 20}; 
		
	/*
	//50 elements
			{4, 34, 16, 38, 2, 50, 18, 38, 38, 18, 11, 18, 43, 21, 47, 45, 2, 13, 44, 23, 
			4, 49, 13, 42, 4, 39, 18, 14, 30, 8, 38, 34, 34, 14, 1, 36, 47, 24, 20, 36, 
			11, 11, 1, 7, 25, 14, 40, 28, 35, 24};
	*/
	new oyelamiBubbleSort(ar);
	int []arv={12, 60, 95, 3, 95, 86, 62, 64, 31, 26, 48, 93, 80, 7, 100, 24, 78, 3, 91, 27, 
			99, 22, 63, 99, 35, 68, 33, 1, 44, 32, 56, 11, 63, 47, 2, 47, 63, 92, 45, 92, 
			59, 38, 78, 71, 56, 42, 56, 55, 27, 55, 30, 45, 2, 19, 15, 100, 36, 68, 16, 53, 
			64, 82, 84, 76, 9, 9, 32, 57, 73, 78, 96, 59, 79, 93, 6, 38, 66, 60, 87, 30, 
			81, 31, 67, 9, 65, 17, 92, 59, 88, 77, 45, 23, 1, 73, 46, 18, 9, 12, 76, 20}; 
	
	new vipulsBubbleSort(arv);
	int []arr={12, 60, 95, 3, 95, 86, 62, 64, 31, 26, 48, 93, 80, 7, 100, 24, 78, 3, 91, 27, 
			99, 22, 63, 99, 35, 68, 33, 1, 44, 32, 56, 11, 63, 47, 2, 47, 63, 92, 45, 92, 
			59, 38, 78, 71, 56, 42, 56, 55, 27, 55, 30, 45, 2, 19, 15, 100, 36, 68, 16, 53, 
			64, 82, 84, 76, 9, 9, 32, 57, 73, 78, 96, 59, 79, 93, 6, 38, 66, 60, 87, 30, 
			81, 31, 67, 9, 65, 17, 92, 59, 88, 77, 45, 23, 1, 73, 46, 18, 9, 12, 76, 20}; 
	bb(arr);
	
}

}
