
public class Minpattern {
    static int height = 5;
    static int width = (2 * height) - 1;
    public static void main(String[] args) {
        printZ();
    } 
    static void printZ()
    {
    int row, col, counter = height - 1;
    for (row = 0; row < height; row++)
    {
        for (col = 0; col < height; col++)
        {
            if (row == 0 || row == height - 1
                || col == counter)
                System.out.printf("*");
            else
                System.out.printf(" ");
        }
        counter--;
        System.out.printf("\n");
    }
}
    
}
