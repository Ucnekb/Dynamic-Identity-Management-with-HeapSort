package _20010310038_Kubilay_Karakaya_;

public class HeapSort {
	int heap_size;
	long array[];
	
	
	public HeapSort(long array[]) {
		this.array=array;
	this.heap_size=array.length;
	}
	public int Left(int i) {
		return 2*i+1;
	}
	public int Right(int i) {
		return 2*i+2;
	}
	public int Parent(int i) {
		return (i-1)/2;
		}
	public void Build_Max_Heap() {
		for (int i = (array.length)/2-1; i >=0; i--) {
			Max_heapify(i);
		
		}
	}
	public void Max_heapify(int i) {
		int largest=i;
		int left =Left(i);
		int right=Right(i);
		if(left<heap_size && array[left]>array[largest])
			largest=left;
		if(right<heap_size && array[right]>array[largest])
			largest=right;
		if(largest != i) {
			long temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
		
			Max_heapify(largest);
		}
	}
	public void Heap_Sort() {
		Build_Max_Heap();
		for (int i = array.length-1; i>=0; i--) {
			long temp=array[i];
			array[i]=array[0];
			array[0]=temp;
			heap_size--;
			Max_heapify(0);
			
		}
	}
	public void yazdir() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+ " ");
		}
		System.out.println();
	}
	public void kayit_sayisi() {
		System.out.println("kayit sayisi :" + heap_size);
	}
	public long [] dondur() {
		return this.array;
	}
	public int seviyeler() {
		return heap_size;
	}
	public long extractMax() {
        long max = array[0];
        this.heap_size=heap_size-1;
         array [0] = array[heap_size];
     
         Build_Max_Heap();
         return max;
     }
	public   long deleteRoot(int index) {
		if(index> heap_size){
			return (Long) null;	
		}
		else {
			long element= array[index];
			long max = array[0];
			array[0]= element;
			array[index]= max;
			 this.heap_size=heap_size-1;
			 array [0] = array[heap_size];
			 Build_Max_Heap();
			   return element;
		}		
}
}
