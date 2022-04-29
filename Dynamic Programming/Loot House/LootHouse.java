public class LootHouse{
    public static void main(String[] args) {
        LootHouse lh = new LootHouse();
        // int[] HouseNetWorth = {6,7,1,30,8,2,4};
        // System.out.println(lh.maxMoney(HouseNetWorth));

        int[] houses = {6,7,1,30,8,2,4};
        System.out.println(LootHouse.LootHouseIterative(houses));
    }

    // Recursive solution
    public static int lootHouse(int[] HouseNetWorth , int currentIndex){
        // base case 
        if (HouseNetWorth.length <= currentIndex) {
            return 0;
        }

        int stealCurrentHouse = HouseNetWorth[currentIndex] + lootHouse(HouseNetWorth, currentIndex + 2); 
        int skipCurrentHouse = lootHouse(HouseNetWorth, currentIndex + 1);

        return Math.max(stealCurrentHouse, skipCurrentHouse);
    }

    public int maxMoney(int[] HouseNetWorth){
        return lootHouse(HouseNetWorth, 0);
    }


    // iterative approach to solve problem
    public static int LootHouseIterative(int[] houses){
        int n = houses.length;
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return houses[0];
        }

        int[] maxMoneyCanBeLooted = new int[n];

        maxMoneyCanBeLooted[0] = houses[0];
        maxMoneyCanBeLooted[1] = Math.max(houses[0],houses[1]);

        for (int currHouse = 2; currHouse < n; currHouse++) {
            maxMoneyCanBeLooted[currHouse] = Math.max(maxMoneyCanBeLooted[currHouse - 1],maxMoneyCanBeLooted[currHouse - 2]);
        }

        return maxMoneyCanBeLooted[n-1];
    }
}