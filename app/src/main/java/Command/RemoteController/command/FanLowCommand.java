package Command.RemoteController.command;

import Command.RemoteController.receiver.Fan;
import Command.RemoteController.receiver.Fan.Speed;

public class FanLowCommand implements Command {

  private Fan fan;
  private Speed prevSpeed;

  public FanLowCommand(final Fan fan) {
    this.fan = fan;
  }

  @Override
  public void execute() {
    prevSpeed = fan.getSpeed();
    fan.low();
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
