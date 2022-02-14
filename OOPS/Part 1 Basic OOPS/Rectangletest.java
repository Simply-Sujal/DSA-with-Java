
class Rectangle{
    // properties of rectangle
    private int length;
    private int breadth;

    // Constructors 
    public Rectangle(){
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b){
        length = l;
        breadth = b;
    }

    public Rectangle(int s){
        length = breadth=s;
    }

    public int area(){
        return length * breadth;
    }
}

public class Rectangletest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(); // for Non Pramaterised 
        Rectangle r1 = new Rectangle(10,5); // for paramaterised Construtor 
        Rectangle r2 = new Rectangle(10);

        System.out.println(r1.area());
        System.out.println(r.area());
        System.out.println(r2.area());
    }    
}
