
class Super{
    public void display(){
        System.out.println("This is super display");
    }
}

class Sub extends Super{
    @Override
    public void display(){
        System.out.println("This is sub display");
    }
}

public class Tut10 {
    public static void main(String[] args) {
        Sub sb = new Sub();
        sb.display();
    }
}
