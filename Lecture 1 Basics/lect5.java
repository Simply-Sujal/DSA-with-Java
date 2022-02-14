public class lect5 {
    public static void main(String[] args) {
        
        
        // syntax for if Statement
        // if(boolean expression fot T or F){
        //     body
        // }
        // else{
        //     do this
        // }

        // example
        int salary = 2500;
        // if (salary > 2000 ) {
        //     salary = salary + 500;
        // }

        // else{
        //     salary = salary + 1000;
        // }

        // System.out.println("The total salary is going to be : " + salary);

        // multiple if-else

        if (salary > 5000) {
            salary += 500;
        }

        else if(salary < 1000){
            salary += 1200;
        }

        System.out.println(salary);
    }
}
