package Strategy.BlueLightRedLight;

public class Application {

    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(new Normal());
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }

}
