public class oddandeven {
    public static void main(String[] args) {
        int n = 67;
        System.out.println(Isodd(n));
    }

    static boolean Isodd(int n){
        return (n & 1) == 1;
    }
}
