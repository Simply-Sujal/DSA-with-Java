
class Circle{
    // First we write the properties and some properties of circle are :
    // radius is the property of the circle
    double radius; // we can also initialize here as well 

    // now we will write the methods 
    // this is the very first method which tells us abut the area of a circle 
    public double area(){
        return Math.PI * radius * radius;
    }
    // this is the second method which will tell us about the perimeter of a circle
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
    // this is the circumference of a circle 
    public double circumference(){
        return perimeter();
    }

}

public class Basic{
    public static void main(String[] args) {
        // now we gonna create the object of class circle
        Circle C1 = new Circle(); // this is the first object we have created 
        // We can create multiple objects 
        Circle C2 = new Circle();
        C1.radius = 4;
        C2.radius = 7;

        System.out.println("The area of a circle is : " + C1.area());
        System.out.println("The circumference of a circle is : " + C1.circumference());
        System.out.println("The perimeter of a circle is : " + C1.perimeter());

        System.out.println();

        System.out.println("The area of a circle is : " + C2.area());
        System.out.println("The circumference of a circle is : " + C2.circumference());
        System.out.println("The perimeter of a circle is : " + C2.perimeter());
    }
}