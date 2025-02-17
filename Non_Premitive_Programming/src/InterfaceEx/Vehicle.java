package InterfaceEx;

public interface Vehicle {


    void start();

    default void playMusic(){
        System.out.println("Play the music!!!!");
    }

    static void openSunroof(){
        System.out.println("Open sunroof of Vehicle");
    }

}
