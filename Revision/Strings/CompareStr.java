
// for a given set of string print the largest string 
// we have to check string in lexicographical order

public class CompareStr {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" };

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
