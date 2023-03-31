// Pairs in an array problem and counting the total pairs

public class PairsinArray {
    public static void printPairs(int arr[]) {
        int countPairs = 0;
        System.out.println("Below are the Pairs : ");
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                countPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are : " + countPairs);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 15 };
        printPairs(arr);

    }
}
