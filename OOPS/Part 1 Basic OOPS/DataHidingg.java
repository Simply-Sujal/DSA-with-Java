
// in this we gonna learn about getter and setter method for accesing the data and for modifying the data 
// Getter : is used to accessing the private data 
// Setter : is used to modify the private data only for authentication

class Rectangle{
    // Private keyword is used to hide data from the other users 
    private int length;
    private int breadth;

    // Getter and Setter method will be use to access and modify the data 
    // Getter methods
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    // Setter methods
    public void setLength(int l){
        if(l >= 0)
        length = l;
        else length = 0;
    }
    public void setBreadth(int b){
        if(b >= 0)
        breadth = b;
        else breadth = 0;
    }


    public int area(){
        // we can also write like this 
        return getLength() * getBreadth();
        // return length * breadth;
    }
    public int perimeter(){
        return 2*(length + breadth);
    }
}



public class DataHidingg {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(-5);
        r1.setBreadth(10);

        System.out.println(r1.area());
        System.out.println(r1.perimeter());

        System.out.println();

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
