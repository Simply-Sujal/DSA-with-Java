class Circle{
    // properties 
    public double radius;

    // methods
    public double area(){
        return Math.PI * radius * radius;
    }
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Cylinder extends Circle{ // this extends means every single property of circle will be available to the cylinder class 

    public double height;

    public double volume(){
        return area() * height;
    }
}

class Tut1{
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        
        c1.radius = 5.4;
        c1.height = 7.2;

        System.out.println("Volume is : " + c1.volume());
        System.out.println("Area is : " + c1.area());
     
    }
    
}