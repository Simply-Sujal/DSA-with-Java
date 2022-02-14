class Rectanglee{
    // properties
    int length;
    int breadth;

    // Methods
    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * (length + breadth);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        // create an object of class Rectanglee
        Rectanglee a1 = new Rectanglee();
        a1.length = 5;
        a1.breadth = 10;

        System.out.println("The area of rectangle is : " + a1.area());
        System.out.println("The perimeter of a rectangle : "+a1.perimeter());
    }   
}
