public class Tut2 {
    public static void main(String[] args) {
        int[] arr1d = {1,2,3,4};
        System.out.println(arr1d.length);
        int[][] arr2d = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12}};
        System.out.println(arr2d.length); // gives you the length of 2d array
        System.out.println(arr2d[0].length); //  gives us the value of coloumn
        System.out.println(arr2d[0]);
        System.out.println(arr2d[1]);
        System.out.println(arr2d);
    }
}
