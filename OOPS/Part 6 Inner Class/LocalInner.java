
class Outer{
    public void display(){
        class Inner{
            public void show(){
                System.out.println("Hello World");
            }
        }
        // Inner i = new Inner();
        // i.show();
        new Inner().show();
    }
}

public class LocalInner {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
