
// here we learn about the getter and setter methods.
// and we learned about the access modifiers 1. Defalut 2. Public 3. Private

class StudentDetails{
    // properties
    String name;
    private int rollNumber;

    // setter method
    public void setrollNumber(int rn){
        if(rn > 0){
            return;
        }
        rollNumber = rn;
    }

    //get method
    public int getrollNumber(){
        return rollNumber;
    }
}

public class Student{
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.name = "Sujal";
        // s1.setrollNumber(49);

        System.out.println(s1.name);
        System.out.print(s1.getrollNumber());
    }
}