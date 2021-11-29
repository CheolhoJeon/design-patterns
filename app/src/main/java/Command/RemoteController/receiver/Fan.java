package Command.RemoteController.receiver;

import static Command.RemoteController.receiver.Fan.Speed.HIGH;
import static Command.RemoteController.receiver.Fan.Speed.LOW;
import static Command.RemoteController.receiver.Fan.Speed.MEDIUM;
import static Command.RemoteController.receiver.Fan.Speed.OFF;

public class Fan {

  private Speed speed = OFF;

  public enum Speed {
    HIGH, MEDIUM, LOW, OFF
  }

  public void high() {
    speed = HIGH;
    System.out.println("속도를 '강'으로 변경합니다.");
  }

  public void medium() {
    speed = MEDIUM;
    System.out.println("속도를 '중'으로 변경합니다.");
  }

  public void low() {
    speed = LOW;
    System.out.println("속도를 '약'으로 변경합니다.");
  }

  public void off() {
    speed = OFF;
    System.out.println("선풍기를 끕니다.");
  }

  public Speed getSpeed() {
    return speed;
  }

}
