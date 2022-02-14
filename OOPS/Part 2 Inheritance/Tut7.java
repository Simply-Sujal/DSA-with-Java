
class TV {
    public void SwitchOn(){System.out.println("TV is SwitchedOn");}
    public void changeChannel(){System.out.println("TV channel is changed");}
}

class SmartTv extends TV{
    @Override
    public void SwitchOn(){System.out.println("SmartTV is SwitchedOn");}
    @Override
    public void changeChannel(){System.out.println("SmartTV channel is changed");}
    
    public void browse(){System.out.println("SmartTV is browising something");}
}

public class Tut7 {
    public static void main(String[] args) {
        TV t1 = new TV();
        t1.SwitchOn();
        t1.changeChannel();

        System.out.println();
        
        SmartTv st = new SmartTv();
        st.SwitchOn();
        st.browse();
        st.changeChannel();

        System.out.println();

        TV t2 = new SmartTv();
        // SmartTv st1 = new TV(); // we can do this 
        t2.SwitchOn();
        t2.changeChannel();
        // t2.browse(); // we cant do this as well 
    }
}
