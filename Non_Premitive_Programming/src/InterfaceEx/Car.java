package InterfaceEx;

public class Car implements Vehicle{
    @Override
    public void start(){
        System.out.println("Start the Car........");
    }

    @Override
    public void playMusic(){
        System.out.println("Play music in car.....");
    }
}
