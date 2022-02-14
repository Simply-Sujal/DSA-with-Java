
class Cylinderr{
    // properties of cylinder
    double radius;
    double height;

    // methods 
    public double volume(){
        return Math.PI * radius * height;
    }

    public double surfaceArea(){
        return (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
    }
}

public class Cylinder {
    public static void main(String[] args) {
        // creating an object of class Cylinderr
        Cylinderr c1 = new Cylinderr();
        c1.radius = 3;
        c1.height = 5;

        System.out.println(c1.volume());
        System.out.println(c1.surfaceArea());
    }   
}
