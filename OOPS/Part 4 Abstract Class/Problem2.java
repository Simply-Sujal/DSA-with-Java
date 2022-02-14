
abstract class Shape{
    abstract public double perimeter();
    abstract public double area();
}

class Circle extends Shape{
    // properties of a circle
    double radius;
    // methods
    public double perimeter(){
        return (2 * Math.PI * radius);
    }
    public double area(){
        return (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape{
    // properties of a circle
    double length;
    double breadth;
    // methods
    public double perimeter(){
        return 2*(length+breadth);
    }
    public double area(){
        return length * breadth;
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 8;
        r1.breadth = 9;
        System.out.println(r1.area());
          
        Shape s = r1;
        System.out.println(r1.perimeter());

        Circle c = new Circle();
        c.radius = 3;
        Shape s1 = c;
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }
}
