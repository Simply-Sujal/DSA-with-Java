
// Steps to perform heap sort :
// 1. Inserting an element in the binary heap
// 2. Extracting the element from the binary heap

public class HeapSort {
    
    int[] arr = null;

    public HeapSort(int[] arr){
        this.arr = arr;
    }

    public void sort(){
        BinaryHeap bh = new BinaryHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            bh.insert(arr[i]);
        } 
    }


    public void printArray(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
