
public class Mergesort {

    public static Node mergeSort(Node head)
    {
        if(head == null && head.next == null){
            return head;
        }
        
        Node mid = getMid(head);
        Node left = mergeSort(head);
        Node right = mergeSort(mid);
        
        return Merge(left,right);
        
    }
    
    public static Node Merge(Node head1, Node head2) {
    
     Node ans = new Node(0);
     Node tail = ans;
     while(head1 != null && head2 != null){
         if(head1.data <= head2.data){
             tail.next = head1;
             head1 = head1.next;
             tail = tail.next;
         }else{
             tail.next = head2;
             head2 = head2.next;
             tail = tail.next;
         }
    }
        tail.next = (head1 != null) ? head1 : head2;
        return ans.next;
   } 
    
    public static Node getMid(Node head){
        Node midprev = null;
        while(head != null && head.next != null){
            midprev = (midprev == null) ? head : midprev.next;
            head = head.next.next;
        }
        Node mid = midprev.next;
        midprev.next = null;
        return mid;
    }
    public static void main(String[] args) {
        Mergesort list = new Mergesort();
    }
}

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        this.data = key;
        next = null;
    }
}
