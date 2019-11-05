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
public class vipulsBubbleSort{
	
	
	private static int[] a;
	static int cpr=0;
	static long f=0;
	static int pss;
	static long s;
	static int swp=0;
	static int gg=0;
	static long g=0;
	
	public vipulsBubbleSort(int []arr){
		bb(arr);
		
	}
	
public static void bb(int []arr){
	
	int n=arr.length;
	a=arr;
	int x=n/2;
	int v= x-1;
	int i=0;
	int j=n-1;
	s= System.nanoTime();
// modified bubble sort
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
//System.out.println("after vipuls modified bubble sort");	
	//pArray(a);
	nbb(a);
}

public static void nbb(int array[]){
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
   pss++;
  }
  f=System.nanoTime()-s;
  System.out.println("vipuls");
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
	int []arr={5,7,3,8,4,2,1,6};
	//bb(arr);
	
	
}

}
