public class BinaryHeap {
    // Implementation of Binary heap 
    int[] arr;
    int sizeOfTree;

    public BinaryHeap(int size){ 
        arr = new int[size + 1];
        this.sizeOfTree = 0;
        System.out.println("Binary Heap has been created");
    }

    // isEmpty function tell us whether the binary heap tree is empty or not 
    public boolean isEmpty(){ // Timecomplex : O(1)
        return sizeOfTree == 0;
    }

    // peek function will give us the very first element in an array
    public Integer peek(){ // TimeComplex : O(1) and SpaceComplex : O(1)
        if(isEmpty()){
            System.out.println("Binary heap is Empty");
            return 0;
        }
        else{
            return arr[1];
        }
    }

    // tells us the no. of elements in a binary tree
    public int sizeBP(){
        return sizeOfTree;
    }

    //levelorder in binary heap tree
    public void levelOrder(){
        for (int i = 1; i <= sizeOfTree; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // heapify for insert
    public void heapifyBottomtoTop(int index , String heapType){ // Timecomplex : O(LogN) and spacecomplex : O(LogN)
        int parent = index / 2;
        // base condition
        if(index <= 1){
            return;
        }
        if(heapType == "Min"){
            if (arr[index] < arr[parent]) {
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        else if(heapType == "Max"){
            if (arr[index] > arr[parent]) {  
                int temp = arr[index];
                arr[index] = arr[parent];
                arr[parent] = temp;
            }
        }
        heapifyBottomtoTop(parent, heapType);
    }

    // insert an element 
    public void insert(int value , String typeHeap){ // Time complex : O(LogN) ans space complex : O(LogN)
        arr[sizeOfTree + 1] = value;
        sizeOfTree++;
        heapifyBottomtoTop(sizeOfTree, typeHeap);
        System.out.println(value);
    }

    // HeapifyTopToBottom
    public void heapifyTopToBottom(int index , String heapType){
        int left = 2 * index; 
        int right = 2 * index + 1;
        int swapChild = 0;
        if (sizeOfTree < left) {
            return;
        }
        if (heapType == "Max") {
            if (sizeOfTree == left) {
                if (arr[index] < arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp; 
                }
                return;
            } else{
                if (arr[left] > arr[right]) {
                    swapChild = left; 
                }else{
                    swapChild = right;
                }
                if (arr[index] < arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp; 
                }
            }
        }
        else if(heapType == "Min"){
            if (sizeOfTree == left) {
                if (arr[index] > arr[left]) {
                    int temp = arr[index];
                    arr[index] = arr[left];
                    arr[left] = temp; 
                }
                return;
            } else{
                if (arr[left] < arr[right]) {
                    swapChild = left; 
                }else{
                    swapChild = right;
                }
                if (arr[index] > arr[swapChild]) {
                    int temp = arr[index];
                    arr[index] = arr[swapChild];
                    arr[swapChild] = temp; 
                }
            }
        }
        heapifyTopToBottom(swapChild, heapType);
    }

    public int extractHeapOfBP(String heapType){ // time : O(LogN) and space : O(LogN)
        if (isEmpty()) {
            return -1;
        }
        else{
            int extractedValue = arr[1];
            arr[1] = arr[sizeOfTree];
            sizeOfTree--;
            heapifyTopToBottom(1, heapType);
            return extractedValue;
        }
    }
}
        
        
        
        
        
