
class Student{
    // properties of an students 
    int roll;
    String name;
    String course;
    int m1 , m2, m3;

    // methods 
    public int total(){
        return (m1 + m2 + m3);
    }

    public int average(){
        return total()/3;
    }

    public void grade(){
        if(average() >= 60){
            System.out.println("Grade A");
        }else{
            System.out.println("Grade B");
        }
    }

    public String toString(){
        return "Roll no : " + roll + " "+ "Name : " + name + " "+ "Course : " + course;  
    }
}

public class Students {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 21053362;
        s1.name = "SUJAL";
        s1.course = "COMPUTER SCIENCE AND ENGINERING";
        s1.m1 = 90;
        s1.m2 = 44;
        s1.m3 = 67;

        System.out.println("My Roll no. is : " + s1.roll);
        System.out.println("My name is : " + s1.name);
        System.out.println("I have choosen : " + s1.course);
        s1.grade();
        System.out.println("Details:\n" + s1);
    }
}
