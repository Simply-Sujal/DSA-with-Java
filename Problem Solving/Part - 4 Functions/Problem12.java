public class Problem12 {
    static void name(){
        System.out.println("HI"); 
    }

    static String name(String names){
        return "HI " + names; 
    }

    public static void main(String[] args) {
        name(); //HI
        System.out.println(name("SUJAL Kumar Timilsina")); //HI SUJAL KUMAR TIMILSINA
    }
}
