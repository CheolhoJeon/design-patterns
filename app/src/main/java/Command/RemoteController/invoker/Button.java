package Command.RemoteController.invoker;

import Command.RemoteController.command.Command;

public class Button {

  private Command command;

  public Button(final Command command) {
    this.command = command;
  }

  public Command press() {
    command.execute();
    return command;
  }

}
