
interface My{
    public void show();
}

class Outer{
    public void display(){
        My a = new My() {
            public void show(){
                System.out.println("Hey this is Sujal here!");
            }
        };
        a.show();
        // we can also define like 
        // new My(){public void show(){System.out.println("This is your brother>");}}.show();
    }
}


public class Interfaceinnerclass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}

