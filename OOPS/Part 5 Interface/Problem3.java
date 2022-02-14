
interface Member{
    public void callback();
}

class Store{
    Member mem[] = new Member[10];
    int count = 0;
    
    void register(Member m){
        mem[count++] = m;
    }
     void inviteSale(){
        for (int i = 0; i < count; i++) {
            mem[i].callback();
        }
     }
}

class Customer implements Member{
    String name;

    Customer(String n){
        name = n;
    }
    public void callback(){
        System.out.println("OK ! I will definetly visit" + " " + name);
    }
}

public class Problem3 {
    public static void main(String[] args) {
        Store s = new Store();
        Customer cs1 = new Customer("Sujal");
        Customer cs2 = new Customer("Aman");

        s.register(cs1);
        s.register(cs2);
        s.inviteSale();
    }
}
