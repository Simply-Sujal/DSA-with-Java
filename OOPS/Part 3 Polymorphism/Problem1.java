
// Polymorphism : here poly means many and morphism means ways to represent or forms.
// One name but different actions.
// In JAVA , polymorphism is acheived by using method overloading as well as method overriding. 

// this example is of Method Overloading 
// Overloading is acheived by same class as well and it can be acrosses the classes also means in the child class also .
class Test{
    public int max(int a , int b){
        return a>b?a:b;
    }
    public int max(int a , int b , int c){
        if(a > b && a > c){
            return a;
        }
        else if(b>c){
            return b;
        }
        else{
            return c;
        }
    }
}

// Method Overloading 
public class Problem1{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.max(4, 10);
        t1.max(6, 4, 88);
    }
}