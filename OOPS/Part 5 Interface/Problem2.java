
class phone{
    public void call(){System.out.println("Phone Call");} 
    public void sms(){System.out.println("Phone sending SMS");} 
}

interface ICamera{
    void click();
    void record();
}

interface IMusicPlayer{
    void play();
    void stop();
}

class SmartPhone extends phone implements ICamera , IMusicPlayer{
    public void videocall(){System.out.println("Smart Phone Video Calling");}
    public void click(){System.out.println("Smart Phone Clicking Photo");}
    public void record(){System.out.println("Smart Phone is recording");}
    public void play(){System.out.println("Smart Phone is playing");}
    public void stop(){System.out.println("Smart Phone is stopped working");}
}
public class Problem2 {
    public static void main(String[] args) {
        // SmartPhone s = new SmartPhone();
        // s.call();
        // s.click();
        // s.play();

        // phone sp = new SmartPhone();
        // sp.call();
        // sp.sms();

        // ICamera ic = new SmartPhone();
        // ic.click();
        // ic.record();

        IMusicPlayer im = new SmartPhone();
        im.stop();
        im.play();
    }
}
