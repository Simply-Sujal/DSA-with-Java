public class ZOKnapSack {
    private int KnapSack(int[] profits , int[] weights , int capacity , int currentIndex){
        // base condtion 
        if(capacity <= 0 || currentIndex <= 0 || currentIndex >= profits.length){
        return 0;
        }

        int profit1 = 0;
        if(weights[currentIndex] <= capacity){
            profit1 = profits[currentIndex] + KnapSack(profits,weights,capacity-weights[currentIndex],currentIndex+1);
        }
        int profit2 = KnapSack(profits,weights,capacity,currentIndex+1);
        return Math.max(profit1,profit2);
    }

    public int KnapSack(int[] profits , int[] weights , int capacity){
        return this.KnapSack(profits , weights , capacity , 0);
    }

    public static void main(String[] args) {
        ZOKnapSack zok = new ZOKnapSack();
        int[] profits = {31,26,17,72};
        int[] weights = {3,1,2,5};
        int maxProfit = zok.KnapSack(profits,weights,10);
        System.out.println(maxProfit);
    }
}
