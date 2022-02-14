import java.util.Scanner;
import java.util.ArrayList;

public class arrrayysss6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(67);
        nums.add(4);
        nums.add(27);
        nums.add(7);
        nums.add(2);
        nums.add(623);


        System.out.println(nums.contains(5766767)); //num.contains(value) -> helps us to check whether the no is exist on that array or not  if the no is presnt then t will say True but if the number is not present then it will say False
        System.out.println(nums.contains(67));
        
        nums.set(0, 9999); // num.set(index,value) - > helps us to remove a value from particlar index and the value what you have given
        System.out.println(nums);

        nums.remove(3); // nums.set(index) -> helps to remove the pariticular index from an aray 
        System.out.print(nums);
        input.close();      
    }
}
