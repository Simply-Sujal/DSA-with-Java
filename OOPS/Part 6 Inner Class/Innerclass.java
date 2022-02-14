
// Inner Class Concept 

class Outer {
    int x = 10;
    // Inner i = new Inner();  

    class Inner{
        int y = 6;
        void innerdisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerdisplay(){
        Inner i = new Inner();
        i.innerdisplay();
        System.out.println(i.y);
    }
}

class Innerclass{
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerdisplay();

        Outer.Inner i = new Outer().new Inner(); // this is how we can create the object of inner class
        i.innerdisplay();
        
    }
}