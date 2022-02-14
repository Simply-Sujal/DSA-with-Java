// import javax.security.auth.Subject;

class Subject{
    // Properties 
    private String subID;
    private String name;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID , String name , int maxMarks){
        this.subID = subID;
        this.name = name;
        this.maxMarks = maxMarks;
    }

    public String getSubID(){return subID;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksObtained(){return marksObtained;}
    
    public void setMaxMarks(int mm){
        maxMarks = mm;
    }

    public void setMarksObtained(int m){
        marksObtained = m;
    }

    boolean isQualified(int m){
        return maxMarks>=maxMarks/10*4;         
    }

    public String toString(){
        return "\nSubject ID : " + subID + "\nName : " + name + "\nMarksObtained : " + marksObtained;
    }
}

public class Problem3 {
    public static void main(String[] args) {
    Subject sub[] = new Subject[3];
    sub[0] = new Subject("490A" , "Data Structure" , 100);
    sub[1] = new Subject("420B" , "Algorithm" , 99);
    sub[2] = new Subject("450C" , "Operating System" , 98);
    
    
    for(Subject s : sub){
        System.out.println(s);
    }
}
}
