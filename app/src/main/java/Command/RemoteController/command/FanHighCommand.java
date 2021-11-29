package Command.RemoteController.command;

import Command.RemoteController.receiver.Fan;
import Command.RemoteController.receiver.Fan.Speed;

public class FanHighCommand implements Command {

  private Fan fan;
  private Speed prevSpeed;

  public FanHighCommand(final Fan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    prevSpeed = fan.getSpeed();
    fan.high();
  }

  @Override
  public void undo() {
    switch (prevSpeed) {
      case HIGH: fan.high(); break;
      case MEDIUM: fan.medium(); break;
      case LOW: fan.low(); break;
      case OFF: fan.off(); break;
    }
  }

}
