
// Method Overriding is acheived by Inheritance that means by super and sub class 
class Super{
    protected void display(){
        System.out.println("HEY THIS IS SUPER CLASS");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Hey this is sub class");
    }
}

public class Problem2 {
    public static void main(String[] args) {
        // Super s1 = new Super();
        // s1.display();   
        
        Super s2 = new Sub();
        s2.display();
    }
}
