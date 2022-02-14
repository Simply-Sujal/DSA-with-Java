public class swap {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        // Swapping a number 
        // int temp = a;
        // a = b;
        // b = temp;
        
        swap(a, b);
        System.out.println(a + " " + b );

        String name = "Sujal";
        changename(name);
        System.out.println(name);
    }


    static void changename(String name){
        name = "varun";
    }
    static void swap (int a , int b){
         int temp = a;
        a = b;
        b = temp;
    }
}
