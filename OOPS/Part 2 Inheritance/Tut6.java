// here we will discuss about the method overriding and dynamic method dispatch 

class Super{
    public void display(){
        System.out.println("Hello");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Hello Welcome");
    }
}

public class Tut6 {
    public static void main(String[] args) {
        // Super sp = new Super();
        // sp.display();

        // Sub sb = new Sub();
        // sb.display(); // here only sub class display will give us the outpt it will not print the super class method because of concept method overriding , method overiding is redifining method of super class in sub class. so it hides or shadowed the super class method.

        // now lets talk about the dynamic method dispatch 
        Super sp = new Sub();
        sp.display();

        // A super class reference holding an object of sub class and overrided method is called then the method of an object will be called not the method of reference method of object will be called . This is dynamic method dispatch.
    }
}
