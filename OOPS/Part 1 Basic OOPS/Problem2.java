
class Product{
    // Properties of a Product class would be 
    private int itemno;
    private String name;
    private int price;
    private int qty;

    // property methods 
    // Getter Methods
    public int getItemno(){
        return itemno;
    }
    public String getName(){
        return name;
    }
    public int getPrice(){
        return price;
    }
    public int getQuantity(){
        return qty;
    }

    // Setter Methods
    // public void setItemno(int I){ // we cant change the item no 
    //     itemno = I;
    // }
    // public void setName(String n){ // we can change the name of the product 
    //     name = n;
    // }
    public void setPrice(int p){
        price = p;
    }
    public void setQuantity(int q){
        qty = q;
    }

    // Constructors 
    public Product(int itemNo){
        itemno = itemNo;
    }
    public Product(String iname){
        name = iname;
    }
    public Product (int itemNo,String name,int price,int qty){
        itemno = itemNo;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }

    // methods
    public String productname(){
        return name;
    }
    public int ItemNumber(){
        return itemno;
    }
    public int PriceofProduct(){
        return price;
    }
    public int quantityofproduct(){
        return qty;
    }
}

public class Problem2 {
    public static void main(String[] args) {
       Product p1 = new Product("Sujal");
       Product p2 = new Product(5);
       Product p3 = new Product(1, "CPU", 150000, 2);

       System.out.println(p1.productname());
       System.out.println(p2.ItemNumber());
       System.out.println(p3.ItemNumber() + " " +  p3.productname() + " " + p3.PriceofProduct() + " " + p3.quantityofproduct());
    }
}
