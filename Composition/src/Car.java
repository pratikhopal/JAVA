public class Car {
    Engine e1;
    Transmission t1;
    tyre ty1;
    Car(){
        e1=new Engine();
        t1=new Transmission();
        ty1 = new tyre();
    }
    public void startcar(){
        e1.engine();
        t1.transmission();
        ty1.wheelspin();
        System.out.println("The car has started");
    }

}
class Engine{
    public void engine(){
        System.out.println("the engine is running");
    }
}
class Transmission {
    public void transmission(){
        System.out.println("the transmission is shifted");
    }
}
class tyre{
    public void wheelspin(){
        System.out.println("the wheels are spinning");
    }
}