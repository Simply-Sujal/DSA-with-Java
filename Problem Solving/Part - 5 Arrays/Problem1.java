
public class Problem1{
    public static void main(String[] args) {
        
        //Practise Problem 1
        //Q1. Create an array of 5 floats and calculate their sums.

        float[] myfloat = {5.43f,7.23f,8.65f,2.23f,10.98f};

        // System.out.println(myfloat[0] + myfloat[1] + myfloat[2] + myfloat[3] + myfloat[4]);

        float sum = 0;
        for (float elements : myfloat) {
            sum += elements;
        }
        System.out.println("The value of sum is : " + sum);
    }
}