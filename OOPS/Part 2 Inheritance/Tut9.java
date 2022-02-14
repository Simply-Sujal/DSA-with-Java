
// Dynamic Method Dispatch 

class Super{
    public void meth1(){System.out.println("This is meth 1");}
    public void meth2(){System.out.println("This is meth 2");}
}

class Sub extends Super{
    @Override
    public void meth2(){System.out.println("This is meth 2.0");}
    public void meth3(){System.out.println("This is meth 3");}
}


public class Tut9{
    public static void main(String[] args) {
        // Super s1 = new Super();
        // s1.meth1();
        // s1.meth2();

        // System.out.println();

        // Sub sb = new Sub();
        // sb.meth1();
        // sb.meth2();
        // sb.meth3();

        Super sup = new Sub();
        sup.meth1();
        sup.meth2();
    }
}