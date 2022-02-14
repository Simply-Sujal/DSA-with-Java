
class Rectangle{
    int length;
    int breadth;

    public Rectangle(){
        length = breadth = 1;
    }
    public Rectangle(int l,int b){
        length = l;
        breadth = b;
    }
}

class Cuboid extends Rectangle{
    int height;
    public Cuboid(){
        height = 1;
    }
    public Cuboid(int h){
        height = h;
    }

    public Cuboid(int l,int b,int h){
        super(l,b);
        height = h;
    }

    public int volume(){
        return length * breadth * height;
    }

}

public class Tut5 {
public static void main(String[] args) {
    // Cuboid c1 = new Cuboid(); // this will pass the non parametrised constructor 
    // System.out.println(c1.volume());

    // Cuboid c2 = new Cuboid(5);
    // System.out.println(c2.volume());

    Cuboid c3 = new Cuboid(5,3,8);
    System.out.println(c3.volume());

}   
}
