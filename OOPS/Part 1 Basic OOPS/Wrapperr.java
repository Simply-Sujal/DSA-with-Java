public class Wrapperr {
    public static void main(String[] args) {
        
        Integer a = 10;
        Integer b = 20;

        swap(a, b);
        System.out.println(a + " " + b);

        // final int money = 50000; // final keyword say that the value assign to the reference variable is not you can change this is fix now
        // money = 15000; // so thats why here we cant change the value of money


        final A hemlo = new A("Varun");
        hemlo.name = "Keta";

        // when a non primitive is final , then we cant reassign it 
        // hemlo = new A("Other name");
     
        A obj;
        for (int i = 0; i < 1000000000; i++) {
            obj = new A("Hemlo World");
        }
    }

    static void swap(int first , int second){
        int temp = first;
        first = second;
        first = temp;
    }
}

class A{
    final int bonus = 100;
    String name;

    // constructors
    public A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Sujal");
    }
}
