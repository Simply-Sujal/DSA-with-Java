
// Abstarct class 
abstract class Super{
    Super(){
        System.out.println("Super");
    }

    void meth1(){
        System.out.println("METH 1");
    }

    abstract void meth2();
}

class Sub extends Super{
    @Override
    void meth2(){
        System.out.println("METH 2");
    }
}

public class Problem1{
    public static void main(String[] args) {
        // Super s1; //reference of abstract is allowed 
        // Sub sb = new Sub();
        // sb.meth1();

        Super sp2 = new Sub();
        sp2.meth1();
        sp2.meth2();
    }
}