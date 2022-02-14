public class Method2 {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);


        myMethod("Sujal");
        myMethod("Varun");
        myMethod("Keta");

        int answer = sum(45, 5);
        System.out.println("The addition of two number is : " + answer);
    }

    // pass the value by numbers when you calling method in main()
    static void myMethod(String fname){
        System.out.println(fname + " is a good guy");
    }
    static int sum(int a , int b){
        int addition = a + b ;
        return addition;
    }

    // When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Sujal, Varun and Keta are arguments.

    // static String greet(){
    //     String greeting = "Hey can you help me ?";
    //     return greeting;
    // }
}
