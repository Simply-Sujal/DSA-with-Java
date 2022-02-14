
class Parent {
    // non parametrised constructor 
    public Parent(){
        System.out.println("Non-param of parent");
    }
    // parametrised constrctor 
    public Parent(int x){
        System.out.println("Param of parent " + x);
    }
}

class Child extends Parent{
    // non parametrised constructor
    public Child(){
        System.out.println("Non-Param of child");
    }
    public Child(int y){
        System.out.println("Param of child");
    }
    public Child(int x , int y){
        super(x); // this will call the super class constructor , super is a keyword which refers to super class constructor and when uh are passing any parameter means you are calling constructor  
        System.out.println("2 param of child" + y);
    }
}

public class Tut4 {
    public static void main(String[] args) {
        Child c1 = new Child(10,20);
    }
}
