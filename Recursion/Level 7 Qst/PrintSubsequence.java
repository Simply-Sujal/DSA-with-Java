public class PrintSubsequence {
    public static void main(String[] args) {
        printSubsequence("xyz");
    }

    public static void printSubsequence(String input, String outputSoFar){
        // base case
        if (input.length() == 0) {
            System.out.println(outputSoFar);
            return;
        }

        // we choose not include the first character
        printSubsequence(input.substring(1), outputSoFar);

        // we choose include the first character 
        printSubsequence(input.substring(1), outputSoFar + input.charAt(0));
    }

    public static void printSubsequence(String input){
        printSubsequence(input," ");
    }
}
