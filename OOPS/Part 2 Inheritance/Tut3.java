
class Parent{
    // constructor 
    public Parent(){
        System.out.println("Hey i am Parent Class");
    }
}

class Child extends Parent{
    // constructor 
    public Child(){
        System.out.println("Hey i am child class");
    }
}

class GrandChild extends Child{
    // constructor
    public GrandChild(){
        System.out.println("Hey i am Grand Child class");
    }
}

public class Tut3 {
    public static void main(String[] args) {
        // Parent p1 = new Parent();
        // Child c1 = new Child();
        GrandChild g1 = new GrandChild();
    }
}

// In this we learnt about , the parent constructor execute first then the est condtructor will be executed ok !!!