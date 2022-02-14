
class Outer{
    int x = 10;
    static int y = 40;

    static class Inner{
        void display(){
            System.out.println(y);
            // System.out.println(x); // this line of code is not possible coz x is not static
        }
    }
}


public class StaticInnerClass {
    public static void main(String[] args) {
        Outer.Inner m = new Outer.Inner();
        m.display();
    }
}
