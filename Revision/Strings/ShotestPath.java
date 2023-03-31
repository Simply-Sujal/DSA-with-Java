import java.util.Scanner;

public class ShotestPath {

    // Time Complexity = O(N)
    public static float CalculateShortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            // South
            if (dir == 'S')
                y--;

            // North
            else if (dir == 'N')
                y++;

            // West
            else if (dir == 'W')
                x++;

            // East
            else
                x--;
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write any string : ");
        String st = sc.nextLine();

        float ans = CalculateShortestpath(st);
        System.out.println(ans);
    }
}
