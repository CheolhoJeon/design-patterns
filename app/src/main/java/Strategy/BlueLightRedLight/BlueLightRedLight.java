package Strategy.BlueLightRedLight;

public class BlueLightRedLight {

    private Speed speed;

    public BlueLightRedLight(final Speed speed) {
        this.speed = speed;
    }

    public void blueLight() {
        speed.blueLight();
    }

    public void redLight() {
        speed.redLight();
    }
}
