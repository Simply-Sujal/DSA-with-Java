import java.util.HashSet;

public class Intersection {
    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        HashSet<Integer> set1 = new HashSet<>();

        // union of two array
        // for (int i = 0; i < arr1.length; i++) {
        // set1.add(arr1[i]);
        // }
        // for (int i = 0; i < arr2.length; i++) {
        // set1.add(arr2[i]);
        // }
        // System.out.println("The size of union is : " + set1.size());

        // Intersection of two array
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            set1.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (set1.contains(arr2[i])) {
                count++;
                set1.remove(arr2[i]);
            }
        }
        System.out.println("Total intersection of element : " + count);
    }
}
