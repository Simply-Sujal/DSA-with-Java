
// here we gonna learn about interfaces

interface Test1{
    void meth1(); // this is abstract without any body
    void meth2(); // this is also abstract without any body 
}

class Test2 implements Test1{
    public void meth1(){
        System.out.println("This is meth1");
    }
    public void meth2(){
        System.out.println("This is meth2");
    }
    public void meth3(){
        System.out.println("This is meth3");
    }
}

public class Problem1{
    public static void main(String[] args) {
        // Test1 t1 = new Test(); // we can create a object of interface class like abstract class so we can only give reference to it .
        Test1 t1 = new Test2();
        t1.meth1();
        t1.meth2();
    }
}