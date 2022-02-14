
class Cyclinder{
    // properties 
    private int radius;
    private int height;

    // property method i.e. Getter and Setter Method
    // Getter Method
    public int getRadius(){
        return radius;
    }
    public int getHeight(){
        return height; 
    }

    // Setter Method
    public void setRadius(int r){
        if(r>=0){
            radius = r;
        }else{
            radius = 0;
        }
    }
    public void setHeight(int h){
        if (h>=0) {
            height = h;
        }else{
            height = 0;
        }
    }

    // Constructor 
    public Cyclinder(){
        radius = 1;
        height = 1;
    }
    public Cyclinder(int r, int h){
        radius = r;
        height = h;
    }

    public void setDimensions(int h,int r)
    {
        height=h;
        radius=r;
    }

    // Methods 
    public int lidArea(){
        return (int)Math.PI * radius * radius;
    }

    public int perimeter(){
        return 2*(int)Math.PI*radius;
    }

    public double drumArea(){
        return 2*lidArea()+perimeter()*height;
    }

    public double volume(){
        return lidArea() * height;
    }

}

public class Problem1 {
    public static void main(String[] args) {
        Cyclinder c = new Cyclinder();
        c.setRadius(4);
        c.setHeight(10);
        c.setDimensions(2, 4);

        System.out.println("LidArea : " + c.lidArea());
        System.out.println("LidArea : " + c.perimeter());
        System.out.println("LidArea : " + c.drumArea());
        System.out.println("LidArea : " + c.volume());
        System.out.println("Height : " + c.getHeight());
        System.out.println("Radius : " + c.getRadius());
    }
}
