class Student{
    // properties 
    String name;
    int rollNumber;

    // public Student(){
    //     rollNumber = 100;
    // }

    public Student(String n){
        name = n;
    }

    // constructors
    public Student(String nam, int roll){
        name = nam;
        rollNumber = roll;
    }

    public void print(){
        System.out.println(name + " : " + rollNumber);
    }
}

public class Student1{
    public static void main(String[] args) {
        Student s1 = new Student("Varun", 56);
        Student s2 = new Student("Sujal", 60);
        s1.print();
        s2.print();
    }
}