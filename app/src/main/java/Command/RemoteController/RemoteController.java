package Command.RemoteController;

import Command.RemoteController.command.Command;
import Command.RemoteController.command.FanHighCommand;
import Command.RemoteController.command.FanLowCommand;
import Command.RemoteController.command.FanMediumCommand;
import Command.RemoteController.command.FanOffCommand;
import Command.RemoteController.command.GameEndCommand;
import Command.RemoteController.command.GameStartCommand;
import Command.RemoteController.command.LightOffCommand;
import Command.RemoteController.command.LightOnCommand;
import Command.RemoteController.invoker.Button;
import Command.RemoteController.receiver.Fan;
import Command.RemoteController.receiver.Game;
import Command.RemoteController.receiver.Light;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoteController {

  private Stack<Command> commands = new Stack<>();
  private List<Button> buttons;

  public RemoteController() {
    buttons = new ArrayList<>();
    buttons.add(new Button(new LightOnCommand(new Light())));
    buttons.add(new Button(new LightOffCommand(new Light())));
    buttons.add(new Button(new GameStartCommand(new Game())));
    buttons.add(new Button(new GameEndCommand(new Game())));

    Fan fan = new Fan();
    buttons.add(new Button(new FanOffCommand(fan)));
    buttons.add(new Button(new FanLowCommand(fan)));
    buttons.add(new Button(new FanMediumCommand(fan)));
    buttons.add(new Button(new FanHighCommand(fan)));
  }

  public void pressButton(int buttonNumber) {
    commands.push(buttons.get(buttonNumber).press());
  }

  public void undo() {
    if (commands.isEmpty()) return;
    commands.pop().undo();
  }

}
